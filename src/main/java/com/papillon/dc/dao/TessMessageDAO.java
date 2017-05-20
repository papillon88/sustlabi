package com.papillon.dc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by papillon on 5/19/2017.
 */
@Repository
public class TessMessageDAO {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcTemplate(DataSource dataSource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public boolean createTessMessage(TessMessage tessMessage){
        BeanPropertySqlParameterSource beanPropertySqlParameterSource =
                new BeanPropertySqlParameterSource(tessMessage);
        return namedParameterJdbcTemplate.update("insert into tessdata(message) values(:message)",
                beanPropertySqlParameterSource)==1;
    }

    public List<TessMessage> getTessMessages(){
        return namedParameterJdbcTemplate.query("select * from tessdata",
                new RowMapper<TessMessage>() {
                    @Override
                    public TessMessage mapRow(ResultSet rs, int rowNum) throws SQLException {
                        TessMessage tessMessage = new TessMessage();
                        tessMessage.setMessage(rs.getString("message"));
                        return tessMessage;
                    }
                });
    }


}
