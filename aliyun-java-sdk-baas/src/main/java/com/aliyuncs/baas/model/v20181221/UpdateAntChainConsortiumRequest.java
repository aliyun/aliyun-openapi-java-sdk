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

package com.aliyuncs.baas.model.v20181221;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateAntChainConsortiumRequest extends RpcAcsRequest<UpdateAntChainConsortiumResponse> {
	   

	private String consortiumName;

	private String consortiumDescription;

	private String consortiumId;
	public UpdateAntChainConsortiumRequest() {
		super("Baas", "2018-12-21", "UpdateAntChainConsortium", "baas");
		setMethod(MethodType.PUT);
	}

	public String getConsortiumName() {
		return this.consortiumName;
	}

	public void setConsortiumName(String consortiumName) {
		this.consortiumName = consortiumName;
		if(consortiumName != null){
			putBodyParameter("ConsortiumName", consortiumName);
		}
	}

	public String getConsortiumDescription() {
		return this.consortiumDescription;
	}

	public void setConsortiumDescription(String consortiumDescription) {
		this.consortiumDescription = consortiumDescription;
		if(consortiumDescription != null){
			putBodyParameter("ConsortiumDescription", consortiumDescription);
		}
	}

	public String getConsortiumId() {
		return this.consortiumId;
	}

	public void setConsortiumId(String consortiumId) {
		this.consortiumId = consortiumId;
		if(consortiumId != null){
			putBodyParameter("ConsortiumId", consortiumId);
		}
	}

	@Override
	public Class<UpdateAntChainConsortiumResponse> getResponseClass() {
		return UpdateAntChainConsortiumResponse.class;
	}

}
