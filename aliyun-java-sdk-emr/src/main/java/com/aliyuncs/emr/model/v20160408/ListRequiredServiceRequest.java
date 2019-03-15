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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListRequiredServiceRequest extends RpcAcsRequest<ListRequiredServiceResponse> {
	
	public ListRequiredServiceRequest() {
		super("Emr", "2016-04-08", "ListRequiredService");
	}

	private Long resourceOwnerId;

	private String emrVersion;

	private String serviceNameList;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getEmrVersion() {
		return this.emrVersion;
	}

	public void setEmrVersion(String emrVersion) {
		this.emrVersion = emrVersion;
		if(emrVersion != null){
			putQueryParameter("EmrVersion", emrVersion);
		}
	}

	public String getServiceNameList() {
		return this.serviceNameList;
	}

	public void setServiceNameList(String serviceNameList) {
		this.serviceNameList = serviceNameList;
		if(serviceNameList != null){
			putQueryParameter("ServiceNameList", serviceNameList);
		}
	}

	@Override
	public Class<ListRequiredServiceResponse> getResponseClass() {
		return ListRequiredServiceResponse.class;
	}

}
