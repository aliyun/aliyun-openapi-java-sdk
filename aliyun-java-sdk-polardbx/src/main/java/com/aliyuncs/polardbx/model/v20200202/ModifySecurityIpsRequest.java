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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifySecurityIpsRequest extends RpcAcsRequest<ModifySecurityIpsResponse> {
	   

	private String dBInstanceName;

	private String modifyMode;

	private String groupName;

	private String securityIPList;
	public ModifySecurityIpsRequest() {
		super("polardbx", "2020-02-02", "ModifySecurityIps", "polardbx");
		setMethod(MethodType.POST);
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public String getModifyMode() {
		return this.modifyMode;
	}

	public void setModifyMode(String modifyMode) {
		this.modifyMode = modifyMode;
		if(modifyMode != null){
			putQueryParameter("ModifyMode", modifyMode);
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

	public String getSecurityIPList() {
		return this.securityIPList;
	}

	public void setSecurityIPList(String securityIPList) {
		this.securityIPList = securityIPList;
		if(securityIPList != null){
			putQueryParameter("SecurityIPList", securityIPList);
		}
	}

	@Override
	public Class<ModifySecurityIpsResponse> getResponseClass() {
		return ModifySecurityIpsResponse.class;
	}

}
