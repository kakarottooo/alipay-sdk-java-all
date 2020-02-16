package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TestCaseDomain;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.quality.test.shield.testcase.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-01-08 15:13:58
 */
public class KoubeiQualityTestShieldTestcaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8194684589336214963L;

	/** 
	 * 测试用例列表
	 */
	@ApiListField("case_list")
	@ApiField("test_case_domain")
	private List<TestCaseDomain> caseList;

	/** 
	 * 拓展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	public void setCaseList(List<TestCaseDomain> caseList) {
		this.caseList = caseList;
	}
	public List<TestCaseDomain> getCaseList( ) {
		return this.caseList;
	}

	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}
	public String getExtInfos( ) {
		return this.extInfos;
	}

}
