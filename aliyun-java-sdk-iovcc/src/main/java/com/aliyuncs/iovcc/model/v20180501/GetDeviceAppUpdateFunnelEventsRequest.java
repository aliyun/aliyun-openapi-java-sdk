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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceAppUpdateFunnelEventsRequest extends RpcAcsRequest<GetDeviceAppUpdateFunnelEventsResponse> {
	   

	private String packageName;

	private String targetVersionCode;

	private String idType;

	private String originalId;

	private String projectId;
	public GetDeviceAppUpdateFunnelEventsRequest() {
		super("iovcc", "2018-05-01", "GetDeviceAppUpdateFunnelEvents", "iovcc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
		if(packageName != null){
			putQueryParameter("PackageName", packageName);
		}
	}

	public String getTargetVersionCode() {
		return this.targetVersionCode;
	}

	public void setTargetVersionCode(String targetVersionCode) {
		this.targetVersionCode = targetVersionCode;
		if(targetVersionCode != null){
			putQueryParameter("TargetVersionCode", targetVersionCode);
		}
	}

	public String getIdType() {
		return this.idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
		if(idType != null){
			putQueryParameter("IdType", idType);
		}
	}

	public String getOriginalId() {
		return this.originalId;
	}

	public void setOriginalId(String originalId) {
		this.originalId = originalId;
		if(originalId != null){
			putQueryParameter("OriginalId", originalId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<GetDeviceAppUpdateFunnelEventsResponse> getResponseClass() {
		return GetDeviceAppUpdateFunnelEventsResponse.class;
	}

}
