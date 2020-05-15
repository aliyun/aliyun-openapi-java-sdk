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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryXpackRelateDBRequest extends RpcAcsRequest<QueryXpackRelateDBResponse> {
	   

	private Boolean hasSingleNode;

	private String clusterId;

	private String relateDbType;
	public QueryXpackRelateDBRequest() {
		super("HBase", "2019-01-01", "QueryXpackRelateDB", "hbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getHasSingleNode() {
		return this.hasSingleNode;
	}

	public void setHasSingleNode(Boolean hasSingleNode) {
		this.hasSingleNode = hasSingleNode;
		if(hasSingleNode != null){
			putQueryParameter("HasSingleNode", hasSingleNode.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getRelateDbType() {
		return this.relateDbType;
	}

	public void setRelateDbType(String relateDbType) {
		this.relateDbType = relateDbType;
		if(relateDbType != null){
			putQueryParameter("RelateDbType", relateDbType);
		}
	}

	@Override
	public Class<QueryXpackRelateDBResponse> getResponseClass() {
		return QueryXpackRelateDBResponse.class;
	}

}
