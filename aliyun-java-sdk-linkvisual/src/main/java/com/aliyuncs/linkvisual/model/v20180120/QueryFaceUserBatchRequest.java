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

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryFaceUserBatchRequest extends RpcAcsRequest<QueryFaceUserBatchResponse> {
	   

	private List<String> userIdLists;

	private String isolationId;
	public QueryFaceUserBatchRequest() {
		super("Linkvisual", "2018-01-20", "QueryFaceUserBatch", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getUserIdLists() {
		return this.userIdLists;
	}

	public void setUserIdLists(List<String> userIdLists) {
		this.userIdLists = userIdLists;	
		if (userIdLists != null) {
			for (int i = 0; i < userIdLists.size(); i++) {
				putQueryParameter("UserIdList." + (i + 1) , userIdLists.get(i));
			}
		}	
	}

	public String getIsolationId() {
		return this.isolationId;
	}

	public void setIsolationId(String isolationId) {
		this.isolationId = isolationId;
		if(isolationId != null){
			putQueryParameter("IsolationId", isolationId);
		}
	}

	@Override
	public Class<QueryFaceUserBatchResponse> getResponseClass() {
		return QueryFaceUserBatchResponse.class;
	}

}
