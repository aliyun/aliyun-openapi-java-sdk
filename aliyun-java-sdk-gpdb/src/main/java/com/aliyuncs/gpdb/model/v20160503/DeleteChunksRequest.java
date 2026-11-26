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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteChunksRequest extends RpcAcsRequest<DeleteChunksResponse> {
	   

	private String dBInstanceId;

	private List<String> chunkIds;

	private String collection;

	private String namespacePassword;

	private String namespace;
	public DeleteChunksRequest() {
		super("gpdb", "2016-05-03", "DeleteChunks", "GPDB");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public List<String> getChunkIds() {
		return this.chunkIds;
	}

	public void setChunkIds(List<String> chunkIds) {
		this.chunkIds = chunkIds;	
		if (chunkIds != null) {
			String chunkIdsArrVal = "";
			for(int depth1 = 0; depth1 < chunkIds.size(); depth1++) {
				chunkIdsArrVal += chunkIds.get(depth1) + ",";
			}
			if (chunkIdsArrVal.length() > 0) {
				chunkIdsArrVal = chunkIdsArrVal.substring(0, chunkIdsArrVal.length() - 1);
			}
			putQueryParameter("ChunkIds" , chunkIdsArrVal);
		}	
	}

	public String getCollection() {
		return this.collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
		if(collection != null){
			putQueryParameter("Collection", collection);
		}
	}

	public String getNamespacePassword() {
		return this.namespacePassword;
	}

	public void setNamespacePassword(String namespacePassword) {
		this.namespacePassword = namespacePassword;
		if(namespacePassword != null){
			putQueryParameter("NamespacePassword", namespacePassword);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	@Override
	public Class<DeleteChunksResponse> getResponseClass() {
		return DeleteChunksResponse.class;
	}

}
