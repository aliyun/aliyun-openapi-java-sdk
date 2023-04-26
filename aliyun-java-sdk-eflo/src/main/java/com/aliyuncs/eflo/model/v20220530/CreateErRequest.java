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
public class CreateErRequest extends RpcAcsRequest<CreateErResponse> {
	   

	private String description;

	private String erName;

	private String masterZoneId;
	public CreateErRequest() {
		super("eflo", "2022-05-30", "CreateEr", "eflo");
		setMethod(MethodType.POST);
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getErName() {
		return this.erName;
	}

	public void setErName(String erName) {
		this.erName = erName;
		if(erName != null){
			putBodyParameter("ErName", erName);
		}
	}

	public String getMasterZoneId() {
		return this.masterZoneId;
	}

	public void setMasterZoneId(String masterZoneId) {
		this.masterZoneId = masterZoneId;
		if(masterZoneId != null){
			putBodyParameter("MasterZoneId", masterZoneId);
		}
	}

	@Override
	public Class<CreateErResponse> getResponseClass() {
		return CreateErResponse.class;
	}

}
