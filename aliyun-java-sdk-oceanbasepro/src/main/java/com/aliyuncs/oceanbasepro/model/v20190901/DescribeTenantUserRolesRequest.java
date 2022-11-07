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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeTenantUserRolesRequest extends RpcAcsRequest<DescribeTenantUserRolesResponse> {
	   
	public DescribeTenantUserRolesRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeTenantUserRoles");
		setMethod(MethodType.POST);
	}

	@Override
	public Class<DescribeTenantUserRolesResponse> getResponseClass() {
		return DescribeTenantUserRolesResponse.class;
	}

}
