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

package com.aliyuncs.emap.model.v20200608;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateSubAccountPermissionRequest extends RpcAcsRequest<UpdateSubAccountPermissionResponse> {
	   

	private String permissionJson;

	private Long targetAccountId;

	private Integer status;
	public UpdateSubAccountPermissionRequest() {
		super("emap", "2020-06-08", "UpdateSubAccountPermission");
		setMethod(MethodType.POST);
	}

	public String getPermissionJson() {
		return this.permissionJson;
	}

	public void setPermissionJson(String permissionJson) {
		this.permissionJson = permissionJson;
		if(permissionJson != null){
			putBodyParameter("PermissionJson", permissionJson);
		}
	}

	public Long getTargetAccountId() {
		return this.targetAccountId;
	}

	public void setTargetAccountId(Long targetAccountId) {
		this.targetAccountId = targetAccountId;
		if(targetAccountId != null){
			putBodyParameter("TargetAccountId", targetAccountId.toString());
		}
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<UpdateSubAccountPermissionResponse> getResponseClass() {
		return UpdateSubAccountPermissionResponse.class;
	}

}
