package br.edu.utfpr.dv.siacoes.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import br.edu.utfpr.dv.siacoes.model.ActivityUnit;
import br.edu.utfpr.dv.siacoes.model._ModelBase;

public abstract class _DaoBase {

	protected Connection conn = null;
	ResultSet rs = null;
	public _DaoBase(){
		if(conn == null){
			try{
				this.conn = ConnectionDAO.getInstance().getConnection();
			}catch(Exception exp){
				//Exception no Singleton.
			}
		}
	}
	
	public abstract void closeResultSet();
	
}
