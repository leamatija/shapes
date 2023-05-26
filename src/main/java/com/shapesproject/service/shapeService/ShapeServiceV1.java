package com.shapesproject.service.shapeService;

import com.shapesproject.model.Shape2D;
import com.shapesproject.model.Shape3D;
import com.shapesproject.service.ShapeThreeD;
import com.shapesproject.service.ShapeTwoD;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShapeServiceV1 implements ShapeService{
    private final List<ShapeThreeD> shapeThreeDList;
    private final List<ShapeTwoD> shapeTwoDList;

    public ShapeServiceV1(List<ShapeThreeD> shapeThreeDList, List<ShapeTwoD> shapeTwoDList) {
        this.shapeThreeDList = shapeThreeDList;
        this.shapeTwoDList = shapeTwoDList;
    }

    @Override
    public Double calculateArea2D(Shape2D shape2D, double... values) {
        return shapeTwoDList.stream().filter(s-> s.isShapeTypeSupported(shape2D.getValue()))
                .findFirst()
                .map(s->s.calculateArea(values))
                .orElseThrow(()->new RuntimeException("Calculation error"));
    }

    @Override
    public Double calculatePerimeter2D(Shape2D shape2D, double... values) {
        return shapeTwoDList.stream().filter(s-> s.isShapeTypeSupported(shape2D.getValue()))
                .findFirst()
                .map(s->s.calculatePerimeter(values))
                .orElseThrow(()->new RuntimeException("Calculation error"));
    }

    @Override
    public Double calculateArea3D(Shape3D shape3D, double... values) {
        return shapeThreeDList.stream().filter(s-> s.isShapeTypeSupported(shape3D.getValue()))
                .findFirst()
                .map(s->s.calculateArea3D(values))
                .orElseThrow(()->new RuntimeException("Calculation error"));
    }

    @Override
    public Double calculateVolume3D(Shape3D shape3D, double... values) {
        return shapeThreeDList.stream().filter(s-> s.isShapeTypeSupported(shape3D.getValue()))
                .findFirst()
                .map(s->s.calculateVolume(values))
                .orElseThrow(()->new RuntimeException("Calculation error"));
    }
}
