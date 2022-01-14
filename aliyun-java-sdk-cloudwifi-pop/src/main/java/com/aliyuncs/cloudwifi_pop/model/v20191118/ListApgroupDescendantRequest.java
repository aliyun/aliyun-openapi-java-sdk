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

package com.aliyuncs.cloudwifi_pop.model.v20191118;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudwifi_pop.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListApgroupDescendantRequest extends RpcAcsRequest<ListApgroupDescendantResponse> {
	   

	private Long cursor;

	private String appName;

	private Long apgroupId;

	private Long level;

	private Integer pageSize;

	private String apgroupUuid;

	private String appCode;
	public ListApgroupDescendantRequest() {
		super("cloudwifi-pop", "2019-11-18", "ListApgroupDescendant", "cloudap");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
		if(cursor != null){
			putQueryParameter("Cursor", cursor.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public Long getApgroupId() {
		return this.apgroupId;
	}

	public void setApgroupId(Long apgroupId) {
		this.apgroupId = apgroupId;
		if(apgroupId != null){
			putQueryParameter("ApgroupId", apgroupId.toString());
		}
	}

	public Long getLevel() {
		return this.level;
	}

	public void setLevel(Long level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level.toString());
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

	public String getApgroupUuid() {
		return this.apgroupUuid;
	}

	public void setApgroupUuid(String apgroupUuid) {
		this.apgroupUuid = apgroupUuid;
		if(apgroupUuid != null){
			putQueryParameter("ApgroupUuid", apgroupUuid);
		}
	}

	public String getAppCode() {
		return this.appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
		if(appCode != null){
			putQueryParameter("AppCode", appCode);
		}
	}

	@Override
	public Class<ListApgroupDescendantResponse> getResponseClass() {
		return ListApgroupDescendantResponse.class;
	}

}
