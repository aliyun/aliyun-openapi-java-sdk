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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckQuotaRequest extends RpcAcsRequest<CheckQuotaResponse> {
	   

	private String groupUuid;

	private String resourceAttribute;

	private Long aliUid;
	public CheckQuotaRequest() {
		super("Ens", "2017-11-10", "CheckQuota", "ens");
		setMethod(MethodType.POST);
	}

	public String getGroupUuid() {
		return this.groupUuid;
	}

	public void setGroupUuid(String groupUuid) {
		this.groupUuid = groupUuid;
		if(groupUuid != null){
			putQueryParameter("GroupUuid", groupUuid);
		}
	}

	public String getResourceAttribute() {
		return this.resourceAttribute;
	}

	public void setResourceAttribute(String resourceAttribute) {
		this.resourceAttribute = resourceAttribute;
		if(resourceAttribute != null){
			putBodyParameter("ResourceAttribute", resourceAttribute);
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

	@Override
	public Class<CheckQuotaResponse> getResponseClass() {
		return CheckQuotaResponse.class;
	}

}
