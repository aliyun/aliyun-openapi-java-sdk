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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyInstanceAdminRequest extends RpcAcsRequest<ModifyInstanceAdminResponse> {
	
	public ModifyInstanceAdminRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifyInstanceAdmin", "CloudCallCenter", "innerAPI");
	}

	private String removeUserRamId;

	private String newAddUserDetail;

	private String instanceId;

	private List<String> adminLists;

	public String getRemoveUserRamId() {
		return this.removeUserRamId;
	}

	public void setRemoveUserRamId(String removeUserRamId) {
		this.removeUserRamId = removeUserRamId;
		if(removeUserRamId != null){
			putQueryParameter("RemoveUserRamId", removeUserRamId);
		}
	}

	public String getNewAddUserDetail() {
		return this.newAddUserDetail;
	}

	public void setNewAddUserDetail(String newAddUserDetail) {
		this.newAddUserDetail = newAddUserDetail;
		if(newAddUserDetail != null){
			putQueryParameter("NewAddUserDetail", newAddUserDetail);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public List<String> getAdminLists() {
		return this.adminLists;
	}

	public void setAdminLists(List<String> adminLists) {
		this.adminLists = adminLists;	
		if (adminLists != null) {
			for (int i = 0; i < adminLists.size(); i++) {
				putQueryParameter("AdminList." + (i + 1) , adminLists.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyInstanceAdminResponse> getResponseClass() {
		return ModifyInstanceAdminResponse.class;
	}

}
