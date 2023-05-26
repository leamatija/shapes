package com.shapesproject.service.impl;

import com.shapesproject.model.Shape3D;
import com.shapesproject.service.ShapeThreeD;
import org.springframework.stereotype.Service;

@Service
public class Cuboid implements ShapeThreeD {

    private Shape3D shape3D=Shape3D.CUBOID;

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return this.shape3D == shape3D.fromValue(shapeType);
    }

    @Override
    public Double calculateArea3D(double... values) {
        return ((values[0]*values[1])+(values[0]*values[2])+(values[2]*values[1]))*2;
    }

    @Override
    public Double calculateVolume(double... values) {
        return values[0]*values[1]*values[2];
    }
}
