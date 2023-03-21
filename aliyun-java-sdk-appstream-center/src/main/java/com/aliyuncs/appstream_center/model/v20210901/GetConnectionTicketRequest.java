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

package com.aliyuncs.appstream_center.model.v20210901;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetConnectionTicketRequest extends RpcAcsRequest<GetConnectionTicketResponse> {
	   

	private String bizRegionId;

	private String appStartParam;

	private String productType;

	private String endUserId;

	private String taskId;

	private String appVersion;

	private List<String> appInstanceGroupIdLists;

	private String appId;

	private String appInstanceId;
	public GetConnectionTicketRequest() {
		super("appstream-center", "2021-09-01", "GetConnectionTicket");
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putBodyParameter("BizRegionId", bizRegionId);
		}
	}

	public String getAppStartParam() {
		return this.appStartParam;
	}

	public void setAppStartParam(String appStartParam) {
		this.appStartParam = appStartParam;
		if(appStartParam != null){
			putBodyParameter("AppStartParam", appStartParam);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putBodyParameter("ProductType", productType);
		}
	}

	public String getEndUserId() {
		return this.endUserId;
	}

	public void setEndUserId(String endUserId) {
		this.endUserId = endUserId;
		if(endUserId != null){
			putBodyParameter("EndUserId", endUserId);
		}
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putBodyParameter("AppVersion", appVersion);
		}
	}

	public List<String> getAppInstanceGroupIdLists() {
		return this.appInstanceGroupIdLists;
	}

	public void setAppInstanceGroupIdLists(List<String> appInstanceGroupIdLists) {
		this.appInstanceGroupIdLists = appInstanceGroupIdLists;	
		if (appInstanceGroupIdLists != null) {
			for (int i = 0; i < appInstanceGroupIdLists.size(); i++) {
				putBodyParameter("AppInstanceGroupIdList." + (i + 1) , appInstanceGroupIdLists.get(i));
			}
		}	
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getAppInstanceId() {
		return this.appInstanceId;
	}

	public void setAppInstanceId(String appInstanceId) {
		this.appInstanceId = appInstanceId;
		if(appInstanceId != null){
			putBodyParameter("AppInstanceId", appInstanceId);
		}
	}

	@Override
	public Class<GetConnectionTicketResponse> getResponseClass() {
		return GetConnectionTicketResponse.class;
	}

}
