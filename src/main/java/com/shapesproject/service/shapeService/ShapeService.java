package com.shapesproject.service.shapeService;

import com.shapesproject.model.Shape2D;
import com.shapesproject.model.Shape3D;

public interface ShapeService {
    Double calculateArea2D (Shape2D shape2D, double...values);
    Double calculatePerimeter2D (Shape2D shape2D, double...values);
    Double calculateArea3D (Shape3D shape3D, double...values);
    Double calculateVolume3D (Shape3D shape3D, double...values);
}
