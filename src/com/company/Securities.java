package com.company;
import java.time.*;

public class Securities{
    private int id;
    private String code;
    private String name_full;
    private LocalDate date_to;
    private LocalDate state_reg_date;

    public int id()
    {
        return id;
    }
    public String code ()
    {
        return code;
    }
    public String name_full ()
    {
        return name_full;
    }
    public LocalDate date_to ()
    {
        return date_to;
    }
    public LocalDate state_reg_date ()
    {
        return state_reg_date;
    }

}
