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

package com.aliyuncs.cloudauth.model.v20190307;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeWhitelistRequest extends RpcAcsRequest<DescribeWhitelistResponse> {
	   

	private String validEndDate;

	private String valid;

	private String sourceIp;

	private Integer pageSize;

	private String lang;

	private Integer currentPage;

	private String bizType;

	private String idCardNum;

	private String bizId;

	private String validStartDate;
	public DescribeWhitelistRequest() {
		super("Cloudauth", "2019-03-07", "DescribeWhitelist", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getValidEndDate() {
		return this.validEndDate;
	}

	public void setValidEndDate(String validEndDate) {
		this.validEndDate = validEndDate;
		if(validEndDate != null){
			putQueryParameter("ValidEndDate", validEndDate);
		}
	}

	public String getValid() {
		return this.valid;
	}

	public void setValid(String valid) {
		this.valid = valid;
		if(valid != null){
			putQueryParameter("Valid", valid);
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

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public String getIdCardNum() {
		return this.idCardNum;
	}

	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum;
		if(idCardNum != null){
			putQueryParameter("IdCardNum", idCardNum);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getValidStartDate() {
		return this.validStartDate;
	}

	public void setValidStartDate(String validStartDate) {
		this.validStartDate = validStartDate;
		if(validStartDate != null){
			putQueryParameter("ValidStartDate", validStartDate);
		}
	}

	@Override
	public Class<DescribeWhitelistResponse> getResponseClass() {
		return DescribeWhitelistResponse.class;
	}

}
