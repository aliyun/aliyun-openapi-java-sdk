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

package com.aliyuncs.gpdb.model.v20190620;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceSecurityIpsRequest extends RpcAcsRequest<ModifyDBInstanceSecurityIpsResponse> {
	
	public ModifyDBInstanceSecurityIpsRequest() {
		super("gpdb", "2019-06-20", "ModifyDBInstanceSecurityIps", "gpdb");
	}

	private String instanceId;

	private String whileList;

	private Long aliUid;

	private String groupName;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getWhileList() {
		return this.whileList;
	}

	public void setWhileList(String whileList) {
		this.whileList = whileList;
		if(whileList != null){
			putQueryParameter("WhileList", whileList);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	@Override
	public Class<ModifyDBInstanceSecurityIpsResponse> getResponseClass() {
		return ModifyDBInstanceSecurityIpsResponse.class;
	}

}
