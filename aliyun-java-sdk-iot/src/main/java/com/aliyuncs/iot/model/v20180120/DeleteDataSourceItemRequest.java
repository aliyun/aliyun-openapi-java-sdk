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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteDataSourceItemRequest extends RpcAcsRequest<DeleteDataSourceItemResponse> {
	   

	private String iotInstanceId;

	private Long dataSourceItemId;

	private Long dataSourceId;
	public DeleteDataSourceItemRequest() {
		super("Iot", "2018-01-20", "DeleteDataSourceItem");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getDataSourceItemId() {
		return this.dataSourceItemId;
	}

	public void setDataSourceItemId(Long dataSourceItemId) {
		this.dataSourceItemId = dataSourceItemId;
		if(dataSourceItemId != null){
			putQueryParameter("DataSourceItemId", dataSourceItemId.toString());
		}
	}

	public Long getDataSourceId() {
		return this.dataSourceId;
	}

	public void setDataSourceId(Long dataSourceId) {
		this.dataSourceId = dataSourceId;
		if(dataSourceId != null){
			putQueryParameter("DataSourceId", dataSourceId.toString());
		}
	}

	@Override
	public Class<DeleteDataSourceItemResponse> getResponseClass() {
		return DeleteDataSourceItemResponse.class;
	}

}
