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

package com.aliyuncs.jarvis.model.v20180206;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeRiskListDetailRequest extends RpcAcsRequest<DescribeRiskListDetailResponse> {
	
	public DescribeRiskListDetailRequest() {
		super("jarvis", "2018-02-06", "DescribeRiskListDetail", "jarvis");
	}

	private String riskType;

	private String sourceIp;

	private Integer pageSize;

	private String queryProduct;

	private Integer currentPage;

	private String riskDescribe;

	private String lang;

	private Long srcUid;

	private String sourceCode;

	private String queryRegionId;

	private String status;

	public String getRiskType() {
		return this.riskType;
	}

	public void setRiskType(String riskType) {
		this.riskType = riskType;
		if(riskType != null){
			putQueryParameter("riskType", riskType);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize.toString());
		}
	}

	public String getQueryProduct() {
		return this.queryProduct;
	}

	public void setQueryProduct(String queryProduct) {
		this.queryProduct = queryProduct;
		if(queryProduct != null){
			putQueryParameter("queryProduct", queryProduct);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("currentPage", currentPage.toString());
		}
	}

	public String getRiskDescribe() {
		return this.riskDescribe;
	}

	public void setRiskDescribe(String riskDescribe) {
		this.riskDescribe = riskDescribe;
		if(riskDescribe != null){
			putQueryParameter("riskDescribe", riskDescribe);
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

	public Long getSrcUid() {
		return this.srcUid;
	}

	public void setSrcUid(Long srcUid) {
		this.srcUid = srcUid;
		if(srcUid != null){
			putQueryParameter("srcUid", srcUid.toString());
		}
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
		if(sourceCode != null){
			putQueryParameter("sourceCode", sourceCode);
		}
	}

	public String getQueryRegionId() {
		return this.queryRegionId;
	}

	public void setQueryRegionId(String queryRegionId) {
		this.queryRegionId = queryRegionId;
		if(queryRegionId != null){
			putQueryParameter("queryRegionId", queryRegionId);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("status", status);
		}
	}

	@Override
	public Class<DescribeRiskListDetailResponse> getResponseClass() {
		return DescribeRiskListDetailResponse.class;
	}

}
