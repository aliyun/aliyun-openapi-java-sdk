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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListBaaSAntChainRequest extends RpcAcsRequest<ListBaaSAntChainResponse> {
	   

	private String baaSAntChainConsortiumId;
	public ListBaaSAntChainRequest() {
		super("lto", "2021-07-07", "ListBaaSAntChain");
		setMethod(MethodType.POST);
	}

	public String getBaaSAntChainConsortiumId() {
		return this.baaSAntChainConsortiumId;
	}

	public void setBaaSAntChainConsortiumId(String baaSAntChainConsortiumId) {
		this.baaSAntChainConsortiumId = baaSAntChainConsortiumId;
		if(baaSAntChainConsortiumId != null){
			putQueryParameter("BaaSAntChainConsortiumId", baaSAntChainConsortiumId);
		}
	}

	@Override
	public Class<ListBaaSAntChainResponse> getResponseClass() {
		return ListBaaSAntChainResponse.class;
	}

}
