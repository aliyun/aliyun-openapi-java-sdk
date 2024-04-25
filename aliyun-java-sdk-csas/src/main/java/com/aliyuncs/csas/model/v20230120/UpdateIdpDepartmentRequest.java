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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateIdpDepartmentRequest extends RpcAcsRequest<UpdateIdpDepartmentResponse> {
	   

	private String departmentId;

	private String idpConfigId;

	private String departmentName;
	public UpdateIdpDepartmentRequest() {
		super("csas", "2023-01-20", "UpdateIdpDepartment");
		setMethod(MethodType.POST);
	}

	public String getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
		if(departmentId != null){
			putQueryParameter("DepartmentId", departmentId);
		}
	}

	public String getIdpConfigId() {
		return this.idpConfigId;
	}

	public void setIdpConfigId(String idpConfigId) {
		this.idpConfigId = idpConfigId;
		if(idpConfigId != null){
			putQueryParameter("IdpConfigId", idpConfigId);
		}
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
		if(departmentName != null){
			putQueryParameter("DepartmentName", departmentName);
		}
	}

	@Override
	public Class<UpdateIdpDepartmentResponse> getResponseClass() {
		return UpdateIdpDepartmentResponse.class;
	}

}
