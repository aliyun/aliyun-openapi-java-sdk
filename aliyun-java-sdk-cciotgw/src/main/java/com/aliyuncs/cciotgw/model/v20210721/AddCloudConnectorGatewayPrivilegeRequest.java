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

package com.aliyuncs.cciotgw.model.v20210721;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddCloudConnectorGatewayPrivilegeRequest extends RpcAcsRequest<AddCloudConnectorGatewayPrivilegeResponse> {
	   

	private String userAliUid;

	private String type;

	private String ioTCloudConnectorGatewayId;
	public AddCloudConnectorGatewayPrivilegeRequest() {
		super("CCIoTGW", "2021-07-21", "AddCloudConnectorGatewayPrivilege");
		setMethod(MethodType.POST);
	}

	public String getUserAliUid() {
		return this.userAliUid;
	}

	public void setUserAliUid(String userAliUid) {
		this.userAliUid = userAliUid;
		if(userAliUid != null){
			putQueryParameter("UserAliUid", userAliUid);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getIoTCloudConnectorGatewayId() {
		return this.ioTCloudConnectorGatewayId;
	}

	public void setIoTCloudConnectorGatewayId(String ioTCloudConnectorGatewayId) {
		this.ioTCloudConnectorGatewayId = ioTCloudConnectorGatewayId;
		if(ioTCloudConnectorGatewayId != null){
			putQueryParameter("IoTCloudConnectorGatewayId", ioTCloudConnectorGatewayId);
		}
	}

	@Override
	public Class<AddCloudConnectorGatewayPrivilegeResponse> getResponseClass() {
		return AddCloudConnectorGatewayPrivilegeResponse.class;
	}

}
