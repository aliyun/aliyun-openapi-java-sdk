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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.foas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyMasterSpecRequest extends RoaAcsRequest<ModifyMasterSpecResponse> {
	   

	private String clusterId;

	private String masterTargetModel;
	public ModifyMasterSpecRequest() {
		super("foas", "2018-11-11", "ModifyMasterSpec", "foas");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/api/v2/clusters/[clusterId]/specification");
		setMethod(MethodType.PUT);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("clusterId", clusterId);
		}
	}

	public String getMasterTargetModel() {
		return this.masterTargetModel;
	}

	public void setMasterTargetModel(String masterTargetModel) {
		this.masterTargetModel = masterTargetModel;
		if(masterTargetModel != null){
			putBodyParameter("masterTargetModel", masterTargetModel);
		}
	}

	@Override
	public Class<ModifyMasterSpecResponse> getResponseClass() {
		return ModifyMasterSpecResponse.class;
	}

}
