package com.shapesproject.service.impl;

import com.shapesproject.model.Shape2D;
import com.shapesproject.service.ShapeTwoD;
import org.springframework.stereotype.Service;

@Service
public class Rectangle implements ShapeTwoD {

    private Shape2D shape2D=Shape2D.RECTANGLE;

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return this.shape2D == shape2D.fromValue(shapeType);
    }

    @Override
    public Double calculatePerimeter(double... values) {
        return (values[0]*2)+(values[1]*2);
    }

    @Override
    public Double calculateArea(double... values) {
        return values[0]*values[1];
    }
}
