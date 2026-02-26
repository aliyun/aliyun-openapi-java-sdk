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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mse.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateMigrationTaskRequest extends RpcAcsRequest<UpdateMigrationTaskResponse> {
	   

	private String targetClusterUrl;

	private String originInstanceAddress;

	private String requestPars;

	private String id;

	private String originInstanceName;

	private String projectDesc;

	private String originInstanceNamespace;

	private String clusterType;

	private String targetInstanceId;

	private String targetClusterName;

	private String acceptLanguage;
	public UpdateMigrationTaskRequest() {
		super("mse", "2019-05-31", "UpdateMigrationTask", "mse");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetClusterUrl() {
		return this.targetClusterUrl;
	}

	public void setTargetClusterUrl(String targetClusterUrl) {
		this.targetClusterUrl = targetClusterUrl;
		if(targetClusterUrl != null){
			putQueryParameter("TargetClusterUrl", targetClusterUrl);
		}
	}

	public String getOriginInstanceAddress() {
		return this.originInstanceAddress;
	}

	public void setOriginInstanceAddress(String originInstanceAddress) {
		this.originInstanceAddress = originInstanceAddress;
		if(originInstanceAddress != null){
			putQueryParameter("OriginInstanceAddress", originInstanceAddress);
		}
	}

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putQueryParameter("RequestPars", requestPars);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getOriginInstanceName() {
		return this.originInstanceName;
	}

	public void setOriginInstanceName(String originInstanceName) {
		this.originInstanceName = originInstanceName;
		if(originInstanceName != null){
			putQueryParameter("OriginInstanceName", originInstanceName);
		}
	}

	public String getProjectDesc() {
		return this.projectDesc;
	}

	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
		if(projectDesc != null){
			putQueryParameter("ProjectDesc", projectDesc);
		}
	}

	public String getOriginInstanceNamespace() {
		return this.originInstanceNamespace;
	}

	public void setOriginInstanceNamespace(String originInstanceNamespace) {
		this.originInstanceNamespace = originInstanceNamespace;
		if(originInstanceNamespace != null){
			putQueryParameter("OriginInstanceNamespace", originInstanceNamespace);
		}
	}

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType);
		}
	}

	public String getTargetInstanceId() {
		return this.targetInstanceId;
	}

	public void setTargetInstanceId(String targetInstanceId) {
		this.targetInstanceId = targetInstanceId;
		if(targetInstanceId != null){
			putQueryParameter("TargetInstanceId", targetInstanceId);
		}
	}

	public String getTargetClusterName() {
		return this.targetClusterName;
	}

	public void setTargetClusterName(String targetClusterName) {
		this.targetClusterName = targetClusterName;
		if(targetClusterName != null){
			putQueryParameter("TargetClusterName", targetClusterName);
		}
	}

	public String getAcceptLanguage() {
		return this.acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
		if(acceptLanguage != null){
			putQueryParameter("AcceptLanguage", acceptLanguage);
		}
	}

	@Override
	public Class<UpdateMigrationTaskResponse> getResponseClass() {
		return UpdateMigrationTaskResponse.class;
	}

}
