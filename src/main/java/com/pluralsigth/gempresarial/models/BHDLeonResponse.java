package com.pluralsigth.gempresarial.models;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.google.gson.Gson;

public class BHDLeonResponse<T> {

	private T Data;
	private boolean Success;
	private String Error;
	
	private Response response(Object data, Status status) {
		return  Response.status(status).entity(data).build();
	}

    public Response withError(String _error, Status status)
    {
    	Success = false;
    	Error = _error;
        return this.response(this, status);
    }
    
    public Response withError(String _error)
    {
    	Success = false;
    	Error = _error;
        return this.response(this, Status.OK);
    }

    public Response withSuccess(T _data)
    {
        Data = _data;
        Success = true;
        return this.response(this, Status.OK);
    }

	public Object getData() {
		return Data;
	}
	public void setData(T data) {
		Data = data;
	}
	public boolean isSuccess() {
		return Success;
	}
	public void setSuccess(boolean success) {
		Success = success;
	}
	public String getError() {
		return Error;
	}
	public void setError(String error) {
		Error = error;
	}
}
