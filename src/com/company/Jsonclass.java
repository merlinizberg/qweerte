package com.company;

import java.time.LocalDate;
import java.util.Currency;

public class Jsonclass
    {

        private String ogrn, code, address, name_full, name_short,inn, fio_head, phone, e_mail, www, id;
        Country country = new Country();
        Company_type company_type  = new Company_type();

        Securities securities = new Securities();
        private LocalDate egrul_date;
        private Boolean is_resident;

        public String getOgrn ()
        {
            return ogrn;
        }

        public void setOgrn (String ogrn)
        {
            this.ogrn = ogrn;
        }

        public Country getCountry ()
        {
            return country;
        }

        public void setCountry (Country country)
        {
            this.country = country;
        }

        public String getCode ()
        {
            return code;
        }

        public void setCode (String code)
        {
            this.code = code;
        }

        public String getAddress ()
        {
            return address;
        }

        public void setAddress (String address)
        {
            this.address = address;
        }

        public String getName_full ()
        {
            return name_full;
        }

        public void setName_full (String name_full)
        {
            this.name_full = name_full;
        }

        public String getInn ()
        {
            return inn;
        }

        public void setInn (String inn)
        {
            this.inn = inn;
        }

        public String getFio_head ()
        {
            return fio_head;
        }

        public void setFio_head (String fio_head)
        {
            this.fio_head = fio_head;
        }

        public Securities getSecurities ()
        {
            return securities;
        }

        public void setSecurities (Securities securities)
        {
            this.securities = securities;
        }

        public LocalDate getEgrul_date ()
        {
            return egrul_date;
        }

        public void setEgrul_date (LocalDate egrul_date)
        {
            this.egrul_date = egrul_date;
        }

        public String getPhone ()
        {
            return phone;
        }

        public void setPhone (String phone)
        {
            this.phone = phone;
        }

        public String getE_mail ()
        {
            return e_mail;
        }

        public void setE_mail (String e_mail)
        {
            this.e_mail = e_mail;
        }

        public String getWww ()
        {
            return www;
        }

        public void setWww (String www)
        {
            this.www = www;
        }

        public Boolean getIs_resident ()
        {
            return is_resident;
        }

        public void setIs_resident (Boolean is_resident)
        {
            this.is_resident = is_resident;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getName_short ()
        {
            return name_short;
        }

        public void setName_short (String name_short)
        {
            this.name_short = name_short;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [ogrn = "+ogrn+", company_type = "+company_type+", country = "+country+", code = "+code+", address = "+address+", name_full = "+name_full+", inn = "+inn+", fio_head = "+fio_head+", securities = "+securities+", egrul_date = "+egrul_date+", phone = "+phone+", e_mail = "+e_mail+", www = "+www+", is_resident = "+is_resident+", id = "+id+", name_short = "+name_short+"]";
        }
    }