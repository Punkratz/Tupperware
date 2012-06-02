package com.vcp.tupperware.exceptions;

public class EmptyPropertyException extends RuntimeException
{
	public EmptyPropertyException()
	{
		super();
	}

	public EmptyPropertyException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public EmptyPropertyException(String message)
	{
		super(message);
	}

	public EmptyPropertyException(Throwable cause)
	{
		super(cause);
	}
}
