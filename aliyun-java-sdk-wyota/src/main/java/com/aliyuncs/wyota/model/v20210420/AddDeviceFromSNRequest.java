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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddDeviceFromSNRequest extends RpcAcsRequest<AddDeviceFromSNResponse> {
	   

	private String labelContents;

	private String groupId;

	private String serialNo;

	private String secureNetworkType;

	private String customProperty;

	private String alias;
	public AddDeviceFromSNRequest() {
		super("wyota", "2021-04-20", "AddDeviceFromSN");
		setMethod(MethodType.POST);
	}

	public String getLabelContents() {
		return this.labelContents;
	}

	public void setLabelContents(String labelContents) {
		this.labelContents = labelContents;
		if(labelContents != null){
			putBodyParameter("LabelContents", labelContents);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putBodyParameter("GroupId", groupId);
		}
	}

	public String getSerialNo() {
		return this.serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
		if(serialNo != null){
			putBodyParameter("SerialNo", serialNo);
		}
	}

	public String getSecureNetworkType() {
		return this.secureNetworkType;
	}

	public void setSecureNetworkType(String secureNetworkType) {
		this.secureNetworkType = secureNetworkType;
		if(secureNetworkType != null){
			putBodyParameter("SecureNetworkType", secureNetworkType);
		}
	}

	public String getCustomProperty() {
		return this.customProperty;
	}

	public void setCustomProperty(String customProperty) {
		this.customProperty = customProperty;
		if(customProperty != null){
			putBodyParameter("CustomProperty", customProperty);
		}
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putBodyParameter("Alias", alias);
		}
	}

	@Override
	public Class<AddDeviceFromSNResponse> getResponseClass() {
		return AddDeviceFromSNResponse.class;
	}

}
