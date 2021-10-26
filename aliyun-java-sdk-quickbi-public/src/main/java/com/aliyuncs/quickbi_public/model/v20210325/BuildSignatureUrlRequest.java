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

package com.aliyuncs.quickbi_public.model.v20210325;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quickbi_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BuildSignatureUrlRequest extends RpcAcsRequest<BuildSignatureUrlResponse> {
	   

	private String watermark;

	private Integer accountType;

	private String userId;

	private String accountName;

	private String worksId;

	private Boolean withHost;

	private Integer expireMin;
	public BuildSignatureUrlRequest() {
		super("quickbi-public", "2021-03-25", "BuildSignatureUrl", "quickbi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWatermark() {
		return this.watermark;
	}

	public void setWatermark(String watermark) {
		this.watermark = watermark;
		if(watermark != null){
			putQueryParameter("Watermark", watermark);
		}
	}

	public Integer getAccountType() {
		return this.accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
		if(accountType != null){
			putQueryParameter("AccountType", accountType.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
		if(accountName != null){
			putQueryParameter("AccountName", accountName);
		}
	}

	public String getWorksId() {
		return this.worksId;
	}

	public void setWorksId(String worksId) {
		this.worksId = worksId;
		if(worksId != null){
			putQueryParameter("WorksId", worksId);
		}
	}

	public Boolean getWithHost() {
		return this.withHost;
	}

	public void setWithHost(Boolean withHost) {
		this.withHost = withHost;
		if(withHost != null){
			putQueryParameter("WithHost", withHost.toString());
		}
	}

	public Integer getExpireMin() {
		return this.expireMin;
	}

	public void setExpireMin(Integer expireMin) {
		this.expireMin = expireMin;
		if(expireMin != null){
			putQueryParameter("ExpireMin", expireMin.toString());
		}
	}

	@Override
	public Class<BuildSignatureUrlResponse> getResponseClass() {
		return BuildSignatureUrlResponse.class;
	}

}
