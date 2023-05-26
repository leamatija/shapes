package com.shapesproject.service.impl;

import com.shapesproject.model.Shape3D;
import com.shapesproject.service.ShapeThreeD;
import org.springframework.stereotype.Service;

@Service
public class Cylinder implements ShapeThreeD {

    private Shape3D shape3D=Shape3D.CYLINDER;

    @Override
    public boolean isShapeTypeSupported(String shapeType) {
        return this.shape3D == shape3D.fromValue(shapeType);
    }

    @Override
    public Double calculateArea3D(double... values) {
        return (values[0]+values[1])*2*3.14*values[0];
    }

    @Override
    public Double calculateVolume(double... values) {
        return 3.14*(values[0]*values[0]);
    }
}
