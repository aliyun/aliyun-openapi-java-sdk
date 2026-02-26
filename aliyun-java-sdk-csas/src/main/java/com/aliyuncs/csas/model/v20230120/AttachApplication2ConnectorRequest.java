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

package com.aliyuncs.csas.model.v20230120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AttachApplication2ConnectorRequest extends RpcAcsRequest<AttachApplication2ConnectorResponse> {
	   

	private String connectorId;

	@SerializedName("applicationIds")
	private List<String> applicationIds;
	public AttachApplication2ConnectorRequest() {
		super("csas", "2023-01-20", "AttachApplication2Connector");
		setMethod(MethodType.POST);
	}

	public String getConnectorId() {
		return this.connectorId;
	}

	public void setConnectorId(String connectorId) {
		this.connectorId = connectorId;
		if(connectorId != null){
			putBodyParameter("ConnectorId", connectorId);
		}
	}

	public List<String> getApplicationIds() {
		return this.applicationIds;
	}

	public void setApplicationIds(List<String> applicationIds) {
		this.applicationIds = applicationIds;	
		if (applicationIds != null) {
			putBodyParameter("ApplicationIds" , new Gson().toJson(applicationIds));
		}	
	}

	@Override
	public Class<AttachApplication2ConnectorResponse> getResponseClass() {
		return AttachApplication2ConnectorResponse.class;
	}

}
