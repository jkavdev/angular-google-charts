package br.com.jakvdev.angular.google.charts.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import br.com.jakvdev.angular.google.charts.model.Video;

public class VideoDaoImpl {
	
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public List<Video> getVideosByCategoryId(Long id) {
		Properties properties = new Properties();
		List<Video> videos = new ArrayList<>();

		try {
			properties.load(this.getClass().getResourceAsStream("/mysql/database/properties"));

			Class.forName(properties.getProperty("driver_class"));

			connection = DriverManager.getConnection(
					properties.getProperty("url"), 
					properties.getProperty("username"),
					properties.getProperty("password"));
			
			String sql = "select * from video where categoria_id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setLong(1, id);
			resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				Video video = new Video();
				video.setId(resultSet.getLong("id"));
				video.setName(resultSet.getString("name"));
				video.setCategory(resultSet.getLong("category_id"));
				video.setLikeCount(resultSet.getInt("like_count"));
				video.setDislikeCount(resultSet.getInt("dislike_count"));
				
				videos.add(video);
			}
			
			return videos;
		} catch (IOException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			this.close();
		}
	}
	
	private void close(){
		try {
			if(resultSet != null){
				resultSet.close();
			}
			if(preparedStatement != null){
				preparedStatement.close();
			}				
			if(connection != null){
				connection.close();
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}
	}

}
