package com.vcp.tupperware.exceptions;

public class EmptyStringException extends RuntimeException
{
	public EmptyStringException()
	{
		super();
	}

	public EmptyStringException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public EmptyStringException(String message)
	{
		super(message);
	}

	public EmptyStringException(Throwable cause)
	{
		super(cause);
	}
}
