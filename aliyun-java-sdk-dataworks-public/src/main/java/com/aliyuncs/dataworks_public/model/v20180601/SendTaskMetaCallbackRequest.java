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

package com.aliyuncs.dataworks_public.model.v20180601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendTaskMetaCallbackRequest extends RpcAcsRequest<SendTaskMetaCallbackResponse> {
	   

	private String code;

	private Long endTime;

	private List<String> resourcess;

	private Long startTime;

	private String type;

	private String connectionInfo;

	private String taskEnvParam;

	private String subType;

	private Long tenantId;

	private String user;
	public SendTaskMetaCallbackRequest() {
		super("dataworks-public", "2018-06-01", "SendTaskMetaCallback");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
		if(code != null){
			putBodyParameter("Code", code);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public List<String> getResourcess() {
		return this.resourcess;
	}

	public void setResourcess(List<String> resourcess) {
		this.resourcess = resourcess;	
		if (resourcess != null) {
			for (int i = 0; i < resourcess.size(); i++) {
				putBodyParameter("Resources." + (i + 1) , resourcess.get(i));
			}
		}	
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
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

	public String getConnectionInfo() {
		return this.connectionInfo;
	}

	public void setConnectionInfo(String connectionInfo) {
		this.connectionInfo = connectionInfo;
		if(connectionInfo != null){
			putBodyParameter("ConnectionInfo", connectionInfo);
		}
	}

	public String getTaskEnvParam() {
		return this.taskEnvParam;
	}

	public void setTaskEnvParam(String taskEnvParam) {
		this.taskEnvParam = taskEnvParam;
		if(taskEnvParam != null){
			putBodyParameter("TaskEnvParam", taskEnvParam);
		}
	}

	public String getSubType() {
		return this.subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
		if(subType != null){
			putBodyParameter("SubType", subType);
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putBodyParameter("User", user);
		}
	}

	@Override
	public Class<SendTaskMetaCallbackResponse> getResponseClass() {
		return SendTaskMetaCallbackResponse.class;
	}

}
