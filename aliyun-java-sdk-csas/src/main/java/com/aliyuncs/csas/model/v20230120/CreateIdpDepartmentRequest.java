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
public class CreateIdpDepartmentRequest extends RpcAcsRequest<CreateIdpDepartmentResponse> {
	   

	private String idpConfigId;

	private String departmentName;
	public CreateIdpDepartmentRequest() {
		super("csas", "2023-01-20", "CreateIdpDepartment");
		setMethod(MethodType.POST);
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
	public Class<CreateIdpDepartmentResponse> getResponseClass() {
		return CreateIdpDepartmentResponse.class;
	}

}
