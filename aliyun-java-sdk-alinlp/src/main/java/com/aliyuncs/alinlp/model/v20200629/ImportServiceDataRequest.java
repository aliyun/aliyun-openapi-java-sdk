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

package com.aliyuncs.alinlp.model.v20200629;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alinlp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportServiceDataRequest extends RpcAcsRequest<ImportServiceDataResponse> {
	   

	private String subPath;

	@SerializedName("partition")
	private List<Map<String,String>> partition;

	private Long serviceId;
	public ImportServiceDataRequest() {
		super("alinlp", "2020-06-29", "ImportServiceData", "alinlp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubPath() {
		return this.subPath;
	}

	public void setSubPath(String subPath) {
		this.subPath = subPath;
		if(subPath != null){
			putBodyParameter("SubPath", subPath);
		}
	}

	public List<Map<String,String>> getPartition() {
		return this.partition;
	}

	public void setPartition(List<Map<String,String>> partition) {
		this.partition = partition;	
		if (partition != null) {
			putBodyParameter("Partition" , new Gson().toJson(partition));
		}	
	}

	public Long getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putBodyParameter("ServiceId", serviceId.toString());
		}
	}

	@Override
	public Class<ImportServiceDataResponse> getResponseClass() {
		return ImportServiceDataResponse.class;
	}

}
