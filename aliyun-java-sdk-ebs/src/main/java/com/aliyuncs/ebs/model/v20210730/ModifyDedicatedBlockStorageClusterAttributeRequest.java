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

package com.aliyuncs.ebs.model.v20210730;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDedicatedBlockStorageClusterAttributeRequest extends RpcAcsRequest<ModifyDedicatedBlockStorageClusterAttributeResponse> {
	   

	private String dbscName;

	private String clientToken;

	private String description;

	private String dbscId;
	public ModifyDedicatedBlockStorageClusterAttributeRequest() {
		super("ebs", "2021-07-30", "ModifyDedicatedBlockStorageClusterAttribute", "ebs");
		setMethod(MethodType.POST);
	}

	public String getDbscName() {
		return this.dbscName;
	}

	public void setDbscName(String dbscName) {
		this.dbscName = dbscName;
		if(dbscName != null){
			putQueryParameter("DbscName", dbscName);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getDbscId() {
		return this.dbscId;
	}

	public void setDbscId(String dbscId) {
		this.dbscId = dbscId;
		if(dbscId != null){
			putQueryParameter("DbscId", dbscId);
		}
	}

	@Override
	public Class<ModifyDedicatedBlockStorageClusterAttributeResponse> getResponseClass() {
		return ModifyDedicatedBlockStorageClusterAttributeResponse.class;
	}

}
