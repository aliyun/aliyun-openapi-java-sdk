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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeChangesRequest extends RoaAcsRequest<DescribeChangesResponse> {
	
	public DescribeChangesRequest() {
		super("WebPlus", "2019-03-20", "DescribeChanges", "webx");
		setUriPattern("/pop/v1/wam/change");
		setMethod(MethodType.GET);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Integer pageSize;

	private String envId;

	private String actionName;

	private Integer pageNumber;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getEnvId() {
		return this.envId;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId);
		}
	}

	public String getBizActionName() {
		return this.actionName;
	}

	public void setBizActionName(String actionName) {
		this.actionName = actionName;
		if(actionName != null){
			putQueryParameter("ActionName", actionName);
		}
	}

	/**
	 * @deprecated use getBizActionName instead of this.
	 */
	@Deprecated
	public String getActionName() {
		return this.actionName;
	}

	/**
	 * @deprecated use setBizActionName instead of this.
	 */
	@Deprecated
	public void setActionName(String actionName) {
		this.actionName = actionName;
		if(actionName != null){
			putQueryParameter("ActionName", actionName);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<DescribeChangesResponse> getResponseClass() {
		return DescribeChangesResponse.class;
	}

}
