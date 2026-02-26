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

package com.aliyuncs.qualitycheck.model.v20190115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateCheckTypeToSchemeRequest extends RpcAcsRequest<CreateCheckTypeToSchemeResponse> {
	   

	private String jsonStr;

	private Long baseMeAgentId;
	public CreateCheckTypeToSchemeRequest() {
		super("Qualitycheck", "2019-01-15", "CreateCheckTypeToScheme");
		setMethod(MethodType.POST);
	}

	public String getJsonStr() {
		return this.jsonStr;
	}

	public void setJsonStr(String jsonStr) {
		this.jsonStr = jsonStr;
		if(jsonStr != null){
			putQueryParameter("jsonStr", jsonStr);
		}
	}

	public Long getBaseMeAgentId() {
		return this.baseMeAgentId;
	}

	public void setBaseMeAgentId(Long baseMeAgentId) {
		this.baseMeAgentId = baseMeAgentId;
		if(baseMeAgentId != null){
			putQueryParameter("BaseMeAgentId", baseMeAgentId.toString());
		}
	}

	@Override
	public Class<CreateCheckTypeToSchemeResponse> getResponseClass() {
		return CreateCheckTypeToSchemeResponse.class;
	}

}
