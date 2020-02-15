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
public class UpdateAntChainRequest extends RpcAcsRequest<UpdateAntChainResponse> {
	   

	private String antChainName;

	private String antChainId;
	public UpdateAntChainRequest() {
		super("Baas", "2018-12-21", "UpdateAntChain", "baas");
		setMethod(MethodType.PUT);
	}

	public String getAntChainName() {
		return this.antChainName;
	}

	public void setAntChainName(String antChainName) {
		this.antChainName = antChainName;
		if(antChainName != null){
			putBodyParameter("AntChainName", antChainName);
		}
	}

	public String getAntChainId() {
		return this.antChainId;
	}

	public void setAntChainId(String antChainId) {
		this.antChainId = antChainId;
		if(antChainId != null){
			putBodyParameter("AntChainId", antChainId);
		}
	}

	@Override
	public Class<UpdateAntChainResponse> getResponseClass() {
		return UpdateAntChainResponse.class;
	}

}
