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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeBahamutIterationsupdateiterationpersonsRequest extends RpcAcsRequest<QueryLinkeBahamutIterationsupdateiterationpersonsResponse> {
	   

	private String iterationManager;

	private String testOwner;

	private String prePubOwner;

	private String iterationId;
	public QueryLinkeBahamutIterationsupdateiterationpersonsRequest() {
		super("SOFA", "2019-08-15", "QueryLinkeBahamutIterationsupdateiterationpersons", "sofacaferms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIterationManager() {
		return this.iterationManager;
	}

	public void setIterationManager(String iterationManager) {
		this.iterationManager = iterationManager;
		if(iterationManager != null){
			putBodyParameter("IterationManager", iterationManager);
		}
	}

	public String getTestOwner() {
		return this.testOwner;
	}

	public void setTestOwner(String testOwner) {
		this.testOwner = testOwner;
		if(testOwner != null){
			putBodyParameter("TestOwner", testOwner);
		}
	}

	public String getPrePubOwner() {
		return this.prePubOwner;
	}

	public void setPrePubOwner(String prePubOwner) {
		this.prePubOwner = prePubOwner;
		if(prePubOwner != null){
			putBodyParameter("PrePubOwner", prePubOwner);
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	@Override
	public Class<QueryLinkeBahamutIterationsupdateiterationpersonsResponse> getResponseClass() {
		return QueryLinkeBahamutIterationsupdateiterationpersonsResponse.class;
	}

}
