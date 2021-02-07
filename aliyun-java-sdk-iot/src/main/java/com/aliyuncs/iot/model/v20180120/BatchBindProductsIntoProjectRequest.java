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
public class BatchBindProductsIntoProjectRequest extends RpcAcsRequest<BatchBindProductsIntoProjectResponse> {
	   

	private List<String> productKeyss;

	private String iotInstanceId;

	private String projectId;
	public BatchBindProductsIntoProjectRequest() {
		super("Iot", "2018-01-20", "BatchBindProductsIntoProject", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getProductKeyss() {
		return this.productKeyss;
	}

	public void setProductKeyss(List<String> productKeyss) {
		this.productKeyss = productKeyss;	
		if (productKeyss != null) {
			for (int i = 0; i < productKeyss.size(); i++) {
				putBodyParameter("ProductKeys." + (i + 1) , productKeyss.get(i));
			}
		}	
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<BatchBindProductsIntoProjectResponse> getResponseClass() {
		return BatchBindProductsIntoProjectResponse.class;
	}

}
