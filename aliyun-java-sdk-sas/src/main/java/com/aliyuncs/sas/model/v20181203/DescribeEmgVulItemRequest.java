/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEmgVulItemRequest extends RpcAcsRequest<DescribeEmgVulItemResponse> {
	   

	private String scanType;

	private Integer pageSize;

	private String lang;

	private Integer currentPage;

	private String vulName;

	private String riskStatus;
	public DescribeEmgVulItemRequest() {
		super("Sas", "2018-12-03", "DescribeEmgVulItem", "sas");
		setMethod(MethodType.POST);
	}

	public String getScanType() {
		return this.scanType;
	}

	public void setScanType(String scanType) {
		this.scanType = scanType;
		if(scanType != null){
			putQueryParameter("ScanType", scanType);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getVulName() {
		return this.vulName;
	}

	public void setVulName(String vulName) {
		this.vulName = vulName;
		if(vulName != null){
			putQueryParameter("VulName", vulName);
		}
	}

	public String getRiskStatus() {
		return this.riskStatus;
	}

	public void setRiskStatus(String riskStatus) {
		this.riskStatus = riskStatus;
		if(riskStatus != null){
			putQueryParameter("RiskStatus", riskStatus);
		}
	}

	@Override
	public Class<DescribeEmgVulItemResponse> getResponseClass() {
		return DescribeEmgVulItemResponse.class;
	}

}
