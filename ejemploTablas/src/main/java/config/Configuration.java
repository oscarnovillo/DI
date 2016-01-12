/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import com.ejemplotablas.JFrameDatos;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.yaml.snakeyaml.Yaml;

/**
 *
 * @author oscar
 */
public class Configuration {
    
    private static Configuration config;
    
    
    public static Configuration getInstance()
    {
        if (config == null)
        {
            try {
                config =  new Configuration();
                Yaml yaml = new Yaml();
                config = (Configuration)yaml.loadAs(new FileInputStream("config.yml"),Configuration.class);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return config;
    }
    
    private String dburl;

    public Configuration(String dburl) {
        this.dburl = dburl;
    }
    
    private Configuration() {
       Properties p = new Properties();
        try {
            p.load(new FileInputStream("config.properties"));
        } catch (IOException ex) {
            Logger.getLogger(Configuration.class.getName()).log(Level.SEVERE, null, ex);
        }
       // this.dburl = p.getProperty("dburl");
        
        
        
        
    }

   

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }

   
    
}
