package mainPackages;

import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class InputException extends Exception {
    int idErr;
    
    InputException(int err)
    {
        idErr = err;
    }
    
    public void showMessageError()
    {
        Component frame = null;
        switch (idErr)
        {
            case 0:
                JOptionPane.showMessageDialog(frame, "Для ввода требуются числа в диапазоне от 0.000001 до 1000000.\nПример числа: 0.001", "Ошибка ввода", JOptionPane.INFORMATION_MESSAGE); 
                break;
            case 1:
                JOptionPane.showMessageDialog(frame, "Нижняя граница не может быть больше или равной верхней.", "Ошибка ввода", JOptionPane.INFORMATION_MESSAGE); 
                break;
        }
    }
}
