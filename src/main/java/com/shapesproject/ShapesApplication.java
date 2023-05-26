package com.shapesproject;

import com.shapesproject.model.Shape2D;
import com.shapesproject.model.Shape3D;
import com.shapesproject.service.shapeService.ShapeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShapesApplication implements CommandLineRunner {

	private static final Logger logger= LoggerFactory.getLogger(ShapesApplication.class);

	@Autowired
	private ShapeService shapeService;

	public static void main(String[] args) {
		SpringApplication.run(ShapesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Area of the shape {} is {} ",Shape2D.TRIANGLE,shapeService.calculateArea2D(Shape2D.TRIANGLE,2,3));
		logger.info("Area of the shape {} is {} ",Shape2D.SQUARE,shapeService.calculateArea2D(Shape2D.SQUARE,4));
		logger.info("Area of the shape {} is {} ",Shape2D.RECTANGLE,shapeService.calculateArea2D(Shape2D.RECTANGLE,2,3));
		logger.info("Area of the shape {} is {} ",Shape2D.TRAPEZIUM,shapeService.calculateArea2D(Shape2D.TRAPEZIUM,2,3,7));
		logger.info("Area of the shape {} is {} ",Shape2D.RHOMBUS,shapeService.calculateArea2D(Shape2D.RHOMBUS,4,6));

		logger.info("Perimeter of the shape {} is {} ",Shape2D.RHOMBUS,shapeService.calculatePerimeter2D(Shape2D.RHOMBUS,4,6,7,6));
		logger.info("Perimeter of the shape {} is {} ",Shape2D.TRIANGLE,shapeService.calculatePerimeter2D(Shape2D.TRIANGLE,2,3,9));
		logger.info("Perimeter of the shape {} is {} ",Shape2D.SQUARE,shapeService.calculatePerimeter2D(Shape2D.SQUARE,4));
		logger.info("Perimeter of the shape {} is {} ",Shape2D.RECTANGLE,shapeService.calculatePerimeter2D(Shape2D.RECTANGLE,2,3));
		logger.info("Perimeter of the shape {} is {} ",Shape2D.TRAPEZIUM,shapeService.calculatePerimeter2D(Shape2D.TRAPEZIUM,2,3,7,9));

		logger.info("Area of the shape {} is {} ", Shape3D.CUBE,shapeService.calculateArea3D(Shape3D.CUBE,7));
		logger.info("Area of the shape {} is {} ", Shape3D.CUBOID,shapeService.calculateArea3D(Shape3D.CUBOID,2,3,8));
		logger.info("Area of the shape {} is {} ", Shape3D.CYLINDER,shapeService.calculateArea3D(Shape3D.CYLINDER,3,8));

		logger.info("Volume of the shape {} is {} ", Shape3D.CUBE,shapeService.calculateVolume3D(Shape3D.CUBE,7));
		logger.info("Volume of the shape {} is {} ", Shape3D.CUBOID,shapeService.calculateVolume3D(Shape3D.CUBOID,2,3,8));
		logger.info("Volume of the shape {} is {} ", Shape3D.CYLINDER,shapeService.calculateVolume3D(Shape3D.CYLINDER,8));



	}
}
