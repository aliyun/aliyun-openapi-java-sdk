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

package com.aliyuncs.advisor_share.model.v20180608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAdvicesRequest extends RpcAcsRequest<DescribeAdvicesResponse> {
	   

	private Long adviceId;

	private Long excludeAdviceId;

	private String resourceId;

	private String product;

	private Long associateUid;

	private Long clientUid;

	private String filterValue;

	private String language;

	private String filterType;

	private String token;

	private String region;

	private String checkId;
	public DescribeAdvicesRequest() {
		super("Advisor-Share", "2018-06-08", "DescribeAdvices", "advisor");
		setMethod(MethodType.POST);
	}

	public Long getAdviceId() {
		return this.adviceId;
	}

	public void setAdviceId(Long adviceId) {
		this.adviceId = adviceId;
		if(adviceId != null){
			putQueryParameter("AdviceId", adviceId.toString());
		}
	}

	public Long getExcludeAdviceId() {
		return this.excludeAdviceId;
	}

	public void setExcludeAdviceId(Long excludeAdviceId) {
		this.excludeAdviceId = excludeAdviceId;
		if(excludeAdviceId != null){
			putQueryParameter("ExcludeAdviceId", excludeAdviceId.toString());
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public Long getAssociateUid() {
		return this.associateUid;
	}

	public void setAssociateUid(Long associateUid) {
		this.associateUid = associateUid;
		if(associateUid != null){
			putQueryParameter("AssociateUid", associateUid.toString());
		}
	}

	public Long getClientUid() {
		return this.clientUid;
	}

	public void setClientUid(Long clientUid) {
		this.clientUid = clientUid;
		if(clientUid != null){
			putQueryParameter("ClientUid", clientUid.toString());
		}
	}

	public String getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(String filterValue) {
		this.filterValue = filterValue;
		if(filterValue != null){
			putQueryParameter("FilterValue", filterValue);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getFilterType() {
		return this.filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
		if(filterType != null){
			putQueryParameter("FilterType", filterType);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	public String getCheckId() {
		return this.checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
		if(checkId != null){
			putQueryParameter("CheckId", checkId);
		}
	}

	@Override
	public Class<DescribeAdvicesResponse> getResponseClass() {
		return DescribeAdvicesResponse.class;
	}

}
