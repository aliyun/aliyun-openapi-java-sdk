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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCriteriaRequest extends RpcAcsRequest<DescribeCriteriaResponse> {
	   

	private Boolean supportAutoTag;

	private String value;

	private String machineTypes;
	public DescribeCriteriaRequest() {
		super("Sas", "2018-12-03", "DescribeCriteria");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getSupportAutoTag() {
		return this.supportAutoTag;
	}

	public void setSupportAutoTag(Boolean supportAutoTag) {
		this.supportAutoTag = supportAutoTag;
		if(supportAutoTag != null){
			putQueryParameter("SupportAutoTag", supportAutoTag.toString());
		}
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
		if(value != null){
			putQueryParameter("Value", value);
		}
	}

	public String getMachineTypes() {
		return this.machineTypes;
	}

	public void setMachineTypes(String machineTypes) {
		this.machineTypes = machineTypes;
		if(machineTypes != null){
			putQueryParameter("MachineTypes", machineTypes);
		}
	}

	@Override
	public Class<DescribeCriteriaResponse> getResponseClass() {
		return DescribeCriteriaResponse.class;
	}

}
