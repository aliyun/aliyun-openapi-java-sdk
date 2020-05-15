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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteThingModelRequest extends RpcAcsRequest<DeleteThingModelResponse> {
	   

	private List<String> serviceIdentifiers;

	private String productKey;

	private String resourceGroupId;

	private List<String> propertyIdentifiers;

	private String iotInstanceId;

	private List<String> eventIdentifiers;
	public DeleteThingModelRequest() {
		super("Iot", "2018-01-20", "DeleteThingModel", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getServiceIdentifiers() {
		return this.serviceIdentifiers;
	}

	public void setServiceIdentifiers(List<String> serviceIdentifiers) {
		this.serviceIdentifiers = serviceIdentifiers;	
		if (serviceIdentifiers != null) {
			for (int i = 0; i < serviceIdentifiers.size(); i++) {
				putQueryParameter("ServiceIdentifier." + (i + 1) , serviceIdentifiers.get(i));
			}
		}	
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public List<String> getPropertyIdentifiers() {
		return this.propertyIdentifiers;
	}

	public void setPropertyIdentifiers(List<String> propertyIdentifiers) {
		this.propertyIdentifiers = propertyIdentifiers;	
		if (propertyIdentifiers != null) {
			for (int i = 0; i < propertyIdentifiers.size(); i++) {
				putQueryParameter("PropertyIdentifier." + (i + 1) , propertyIdentifiers.get(i));
			}
		}	
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public List<String> getEventIdentifiers() {
		return this.eventIdentifiers;
	}

	public void setEventIdentifiers(List<String> eventIdentifiers) {
		this.eventIdentifiers = eventIdentifiers;	
		if (eventIdentifiers != null) {
			for (int i = 0; i < eventIdentifiers.size(); i++) {
				putQueryParameter("EventIdentifier." + (i + 1) , eventIdentifiers.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteThingModelResponse> getResponseClass() {
		return DeleteThingModelResponse.class;
	}

}
