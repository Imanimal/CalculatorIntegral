package mainPackages;

import java.io.Serializable;

public class RecIntegral implements Serializable {
    private double downEdge, upEdge, step;
    
    public double getDownEdge()
    {
        return downEdge;
    }
    
    public void setDownEdge(double value) throws InputException
    {
        if (value > 1000000 || value < 0.000001)
            throw new InputException(0);
        if (value >= upEdge)
            throw new InputException(1);
        downEdge = value;
    }
    
    public double getUpEdge()
    {
        return upEdge;
    }
    
    public void setUpEdge(double value) throws InputException
    {
        if (value > 1000000 || value < 0.000001)
            throw new InputException(0);
        if (value <= downEdge)
            throw new InputException(1);
        upEdge = value;
    }
    
    public double getStep()
    {
        return step;
    }
    
    public void setStep(double value) throws InputException
    {
        if (value > 1000000 || value < 0.000001)
            throw new InputException(0);
        step = value;
    }

    RecIntegral()
    {
        downEdge = 0.000001;
        upEdge = 0.000001;
        step = 0.000001;
    }
    
    RecIntegral(double inDownEdge, double inUpEdge, double inStep) throws InputException
    {
        setUpEdge(inUpEdge);
        setDownEdge(inDownEdge);
        setStep(inStep);
    }
}
