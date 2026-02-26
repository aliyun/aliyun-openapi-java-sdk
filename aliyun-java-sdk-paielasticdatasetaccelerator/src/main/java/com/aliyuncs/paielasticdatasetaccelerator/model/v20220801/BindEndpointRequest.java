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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BindEndpointRequest extends RoaAcsRequest<BindEndpointResponse> {
	   

	private String endpointId;

	private String slotId;
	public BindEndpointRequest() {
		super("PAIElasticDatasetAccelerator", "2022-08-01", "BindEndpoint", "datasetacc");
		setUriPattern("/api/v1/endpoints/[EndpointId]/slots/[SlotId]");
		setMethod(MethodType.POST);
	}

	public String getEndpointId() {
		return this.endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
		if(endpointId != null){
			putPathParameter("EndpointId", endpointId);
		}
	}

	public String getSlotId() {
		return this.slotId;
	}

	public void setSlotId(String slotId) {
		this.slotId = slotId;
		if(slotId != null){
			putPathParameter("SlotId", slotId);
		}
	}

	@Override
	public Class<BindEndpointResponse> getResponseClass() {
		return BindEndpointResponse.class;
	}

}
