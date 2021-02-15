package com.ec.core.entity;

import java.io.Serializable;

public class RestResponse implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1108595795681417627L;
    private Object response;
    private boolean error = false;
    private String message;


    public RestResponse() {
        super();
    }

    public RestResponse(Object respuesta, boolean error, String mensaje) {
        super();
        this.response = respuesta;
        this.error = error;
        this.message = mensaje;
    }

    public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

}

