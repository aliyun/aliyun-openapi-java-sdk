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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyCloudDriveServiceRequest extends RpcAcsRequest<ModifyCloudDriveServiceResponse> {
	   

	private String cdsName;

	private String cdsId;

	private Long maxSize;
	public ModifyCloudDriveServiceRequest() {
		super("ecd", "2020-09-30", "ModifyCloudDriveService");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCdsName() {
		return this.cdsName;
	}

	public void setCdsName(String cdsName) {
		this.cdsName = cdsName;
		if(cdsName != null){
			putQueryParameter("CdsName", cdsName);
		}
	}

	public String getCdsId() {
		return this.cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
		if(cdsId != null){
			putQueryParameter("CdsId", cdsId);
		}
	}

	public Long getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
		if(maxSize != null){
			putQueryParameter("MaxSize", maxSize.toString());
		}
	}

	@Override
	public Class<ModifyCloudDriveServiceResponse> getResponseClass() {
		return ModifyCloudDriveServiceResponse.class;
	}

}
