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

package com.aliyuncs.emas_dmp.model.v20210402;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.emas_dmp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAppRequest extends RpcAcsRequest<ListAppResponse> {
	   

	private String subTypeList;

	private Integer pageSize;

	private String name;

	private Integer pageNum;

	private String usageRange;

	private String parentType;

	private String businessScenario;
	public ListAppRequest() {
		super("emas-dmp", "2021-04-02", "ListApp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubTypeList() {
		return this.subTypeList;
	}

	public void setSubTypeList(String subTypeList) {
		this.subTypeList = subTypeList;
		if(subTypeList != null){
			putBodyParameter("SubTypeList", subTypeList);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putBodyParameter("PageNum", pageNum.toString());
		}
	}

	public String getUsageRange() {
		return this.usageRange;
	}

	public void setUsageRange(String usageRange) {
		this.usageRange = usageRange;
		if(usageRange != null){
			putBodyParameter("UsageRange", usageRange);
		}
	}

	public String getParentType() {
		return this.parentType;
	}

	public void setParentType(String parentType) {
		this.parentType = parentType;
		if(parentType != null){
			putBodyParameter("ParentType", parentType);
		}
	}

	public String getBusinessScenario() {
		return this.businessScenario;
	}

	public void setBusinessScenario(String businessScenario) {
		this.businessScenario = businessScenario;
		if(businessScenario != null){
			putBodyParameter("BusinessScenario", businessScenario);
		}
	}

	@Override
	public Class<ListAppResponse> getResponseClass() {
		return ListAppResponse.class;
	}

}
