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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.xrengine.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListProjectRequest extends RpcAcsRequest<ListProjectResponse> {
	   

	private String type;

	private String title;

	private Integer current;

	private String jwtToken;

	private String bizUsage;

	private String excludedBizUsage;

	private Boolean withUser;

	private Integer size;

	private Boolean withSource;

	private String sortField;

	private String status;
	public ListProjectRequest() {
		super("xrEngine", "2022-11-11", "ListProject");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public Integer getCurrent() {
		return this.current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
		if(current != null){
			putBodyParameter("Current", current.toString());
		}
	}

	public String getJwtToken() {
		return this.jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
		if(jwtToken != null){
			putBodyParameter("JwtToken", jwtToken);
		}
	}

	public String getBizUsage() {
		return this.bizUsage;
	}

	public void setBizUsage(String bizUsage) {
		this.bizUsage = bizUsage;
		if(bizUsage != null){
			putBodyParameter("BizUsage", bizUsage);
		}
	}

	public String getExcludedBizUsage() {
		return this.excludedBizUsage;
	}

	public void setExcludedBizUsage(String excludedBizUsage) {
		this.excludedBizUsage = excludedBizUsage;
		if(excludedBizUsage != null){
			putBodyParameter("ExcludedBizUsage", excludedBizUsage);
		}
	}

	public Boolean getWithUser() {
		return this.withUser;
	}

	public void setWithUser(Boolean withUser) {
		this.withUser = withUser;
		if(withUser != null){
			putBodyParameter("WithUser", withUser.toString());
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putBodyParameter("Size", size.toString());
		}
	}

	public Boolean getWithSource() {
		return this.withSource;
	}

	public void setWithSource(Boolean withSource) {
		this.withSource = withSource;
		if(withSource != null){
			putBodyParameter("WithSource", withSource.toString());
		}
	}

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
		if(sortField != null){
			putBodyParameter("SortField", sortField);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<ListProjectResponse> getResponseClass() {
		return ListProjectResponse.class;
	}

}
