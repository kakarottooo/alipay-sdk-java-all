package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MiniAppVersionInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-09-05 20:46:04
 */
public class AlipayOpenMiniInnerversionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4336572442756139362L;

	/** 
	 * 小程序版本信息
	 */
	@ApiListField("version_info_list")
	@ApiField("mini_app_version_info")
	private List<MiniAppVersionInfo> versionInfoList;

	public void setVersionInfoList(List<MiniAppVersionInfo> versionInfoList) {
		this.versionInfoList = versionInfoList;
	}
	public List<MiniAppVersionInfo> getVersionInfoList( ) {
		return this.versionInfoList;
	}

}