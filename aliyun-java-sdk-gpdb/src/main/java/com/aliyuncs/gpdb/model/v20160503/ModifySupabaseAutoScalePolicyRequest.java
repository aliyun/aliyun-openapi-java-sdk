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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifySupabaseAutoScalePolicyRequest extends RpcAcsRequest<ModifySupabaseAutoScalePolicyResponse> {
	   

	private String idleTimeHours;

	private String projectId;

	private Boolean autoScale;
	public ModifySupabaseAutoScalePolicyRequest() {
		super("gpdb", "2016-05-03", "ModifySupabaseAutoScalePolicy", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIdleTimeHours() {
		return this.idleTimeHours;
	}

	public void setIdleTimeHours(String idleTimeHours) {
		this.idleTimeHours = idleTimeHours;
		if(idleTimeHours != null){
			putQueryParameter("IdleTimeHours", idleTimeHours);
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

	public Boolean getAutoScale() {
		return this.autoScale;
	}

	public void setAutoScale(Boolean autoScale) {
		this.autoScale = autoScale;
		if(autoScale != null){
			putQueryParameter("AutoScale", autoScale.toString());
		}
	}

	@Override
	public Class<ModifySupabaseAutoScalePolicyResponse> getResponseClass() {
		return ModifySupabaseAutoScalePolicyResponse.class;
	}

}
