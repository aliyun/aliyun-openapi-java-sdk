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

package com.aliyuncs.resellertrade.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resellertrade.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryEcoRelationRequest extends RpcAcsRequest<QueryEcoRelationResponse> {
	   

	private Long uid;

	private String relationTime;
	public QueryEcoRelationRequest() {
		super("ResellerTrade", "2019-12-27", "QueryEcoRelation");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
		if(uid != null){
			putBodyParameter("Uid", uid.toString());
		}
	}

	public String getRelationTime() {
		return this.relationTime;
	}

	public void setRelationTime(String relationTime) {
		this.relationTime = relationTime;
		if(relationTime != null){
			putBodyParameter("RelationTime", relationTime);
		}
	}

	@Override
	public Class<QueryEcoRelationResponse> getResponseClass() {
		return QueryEcoRelationResponse.class;
	}

}
