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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CheckFileDeploymentRequest extends RpcAcsRequest<CheckFileDeploymentResponse> {
	   

	private String checkDetailUrl;

	private String checkerInstanceId;

	private String status;
	public CheckFileDeploymentRequest() {
		super("dataworks-public", "2020-05-18", "CheckFileDeployment");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCheckDetailUrl() {
		return this.checkDetailUrl;
	}

	public void setCheckDetailUrl(String checkDetailUrl) {
		this.checkDetailUrl = checkDetailUrl;
		if(checkDetailUrl != null){
			putBodyParameter("CheckDetailUrl", checkDetailUrl);
		}
	}

	public String getCheckerInstanceId() {
		return this.checkerInstanceId;
	}

	public void setCheckerInstanceId(String checkerInstanceId) {
		this.checkerInstanceId = checkerInstanceId;
		if(checkerInstanceId != null){
			putBodyParameter("CheckerInstanceId", checkerInstanceId);
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
	public Class<CheckFileDeploymentResponse> getResponseClass() {
		return CheckFileDeploymentResponse.class;
	}

}
