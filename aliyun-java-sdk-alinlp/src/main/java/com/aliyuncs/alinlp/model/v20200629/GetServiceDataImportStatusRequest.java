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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alinlp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetServiceDataImportStatusRequest extends RpcAcsRequest<GetServiceDataImportStatusResponse> {
	   

	@SerializedName("dataImportIds")
	private List<Long> dataImportIds;
	public GetServiceDataImportStatusRequest() {
		super("alinlp", "2020-06-29", "GetServiceDataImportStatus", "alinlp");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Long> getDataImportIds() {
		return this.dataImportIds;
	}

	public void setDataImportIds(List<Long> dataImportIds) {
		this.dataImportIds = dataImportIds;	
		if (dataImportIds != null) {
			putBodyParameter("DataImportIds" , new Gson().toJson(dataImportIds));
		}	
	}

	@Override
	public Class<GetServiceDataImportStatusResponse> getResponseClass() {
		return GetServiceDataImportStatusResponse.class;
	}

}
