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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddIoTCloudConnectorToGroupRequest extends RpcAcsRequest<AddIoTCloudConnectorToGroupResponse> {
	   

	private String ioTCloudConnectorGroupId;

	private Boolean dryRun;

	private String clientToken;

	private List<String> ioTCloudConnectorIds;
	public AddIoTCloudConnectorToGroupRequest() {
		super("IoTCC", "2021-05-13", "AddIoTCloudConnectorToGroup", "IoTCC");
		setMethod(MethodType.POST);
	}

	public String getIoTCloudConnectorGroupId() {
		return this.ioTCloudConnectorGroupId;
	}

	public void setIoTCloudConnectorGroupId(String ioTCloudConnectorGroupId) {
		this.ioTCloudConnectorGroupId = ioTCloudConnectorGroupId;
		if(ioTCloudConnectorGroupId != null){
			putQueryParameter("IoTCloudConnectorGroupId", ioTCloudConnectorGroupId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<String> getIoTCloudConnectorIds() {
		return this.ioTCloudConnectorIds;
	}

	public void setIoTCloudConnectorIds(List<String> ioTCloudConnectorIds) {
		this.ioTCloudConnectorIds = ioTCloudConnectorIds;	
		if (ioTCloudConnectorIds != null) {
			for (int i = 0; i < ioTCloudConnectorIds.size(); i++) {
				putQueryParameter("IoTCloudConnectorId." + (i + 1) , ioTCloudConnectorIds.get(i));
			}
		}	
	}

	@Override
	public Class<AddIoTCloudConnectorToGroupResponse> getResponseClass() {
		return AddIoTCloudConnectorToGroupResponse.class;
	}

}
