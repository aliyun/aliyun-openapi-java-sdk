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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyStartVulScanRequest extends RpcAcsRequest<ModifyStartVulScanResponse> {
	   

	private String types;

	private String uuids;
	public ModifyStartVulScanRequest() {
		super("Sas", "2018-12-03", "ModifyStartVulScan", "sas");
		setMethod(MethodType.POST);
	}

	public String getTypes() {
		return this.types;
	}

	public void setTypes(String types) {
		this.types = types;
		if(types != null){
			putQueryParameter("Types", types);
		}
	}

	public String getUuids() {
		return this.uuids;
	}

	public void setUuids(String uuids) {
		this.uuids = uuids;
		if(uuids != null){
			putQueryParameter("Uuids", uuids);
		}
	}

	@Override
	public Class<ModifyStartVulScanResponse> getResponseClass() {
		return ModifyStartVulScanResponse.class;
	}

}
