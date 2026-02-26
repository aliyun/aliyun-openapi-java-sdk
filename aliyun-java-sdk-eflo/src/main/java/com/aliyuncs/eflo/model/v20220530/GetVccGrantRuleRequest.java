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

package com.aliyuncs.eflo.model.v20220530;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetVccGrantRuleRequest extends RpcAcsRequest<GetVccGrantRuleResponse> {
	   

	private String erId;

	private String grantTenantId;

	private String instanceId;

	private String grantRuleId;
	public GetVccGrantRuleRequest() {
		super("eflo", "2022-05-30", "GetVccGrantRule", "eflo");
		setMethod(MethodType.POST);
	}

	public String getErId() {
		return this.erId;
	}

	public void setErId(String erId) {
		this.erId = erId;
		if(erId != null){
			putBodyParameter("ErId", erId);
		}
	}

	public String getGrantTenantId() {
		return this.grantTenantId;
	}

	public void setGrantTenantId(String grantTenantId) {
		this.grantTenantId = grantTenantId;
		if(grantTenantId != null){
			putBodyParameter("GrantTenantId", grantTenantId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getGrantRuleId() {
		return this.grantRuleId;
	}

	public void setGrantRuleId(String grantRuleId) {
		this.grantRuleId = grantRuleId;
		if(grantRuleId != null){
			putBodyParameter("GrantRuleId", grantRuleId);
		}
	}

	@Override
	public Class<GetVccGrantRuleResponse> getResponseClass() {
		return GetVccGrantRuleResponse.class;
	}

}
