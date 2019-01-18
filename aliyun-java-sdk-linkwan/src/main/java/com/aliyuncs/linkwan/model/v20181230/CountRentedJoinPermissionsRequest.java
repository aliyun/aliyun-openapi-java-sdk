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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class CountRentedJoinPermissionsRequest extends RpcAcsRequest<CountRentedJoinPermissionsResponse> {
	
	public CountRentedJoinPermissionsRequest() {
		super("LinkWAN", "2018-12-30", "CountRentedJoinPermissions", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String fuzzyNodeGroupName;

	private String type;

	private Boolean enabled;

	private Boolean boundNodeGroup;

	private String fuzzyJoinEui;

	private String fuzzyOwnerAliyunId;

	public String getFuzzyNodeGroupName() {
		return this.fuzzyNodeGroupName;
	}

	public void setFuzzyNodeGroupName(String fuzzyNodeGroupName) {
		this.fuzzyNodeGroupName = fuzzyNodeGroupName;
		if(fuzzyNodeGroupName != null){
			putBodyParameter("FuzzyNodeGroupName", fuzzyNodeGroupName);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putBodyParameter("Enabled", enabled.toString());
		}
	}

	public Boolean getBoundNodeGroup() {
		return this.boundNodeGroup;
	}

	public void setBoundNodeGroup(Boolean boundNodeGroup) {
		this.boundNodeGroup = boundNodeGroup;
		if(boundNodeGroup != null){
			putBodyParameter("BoundNodeGroup", boundNodeGroup.toString());
		}
	}

	public String getFuzzyJoinEui() {
		return this.fuzzyJoinEui;
	}

	public void setFuzzyJoinEui(String fuzzyJoinEui) {
		this.fuzzyJoinEui = fuzzyJoinEui;
		if(fuzzyJoinEui != null){
			putBodyParameter("FuzzyJoinEui", fuzzyJoinEui);
		}
	}

	public String getFuzzyOwnerAliyunId() {
		return this.fuzzyOwnerAliyunId;
	}

	public void setFuzzyOwnerAliyunId(String fuzzyOwnerAliyunId) {
		this.fuzzyOwnerAliyunId = fuzzyOwnerAliyunId;
		if(fuzzyOwnerAliyunId != null){
			putBodyParameter("FuzzyOwnerAliyunId", fuzzyOwnerAliyunId);
		}
	}

	@Override
	public Class<CountRentedJoinPermissionsResponse> getResponseClass() {
		return CountRentedJoinPermissionsResponse.class;
	}

}
