package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.alipaypoint.send response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-04 00:00:15
 */
public class AlipayUserAlipaypointSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 6413832934583861129L;

	/** 
	 * 发放记录号
	 */
	@ApiField("record_id")
	private String recordId;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
