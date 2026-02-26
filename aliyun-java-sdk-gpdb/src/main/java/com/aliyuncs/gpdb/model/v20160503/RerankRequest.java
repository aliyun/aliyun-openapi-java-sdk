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
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RerankRequest extends RpcAcsRequest<RerankResponse> {
	   

	private Integer topK;

	@SerializedName("documents")
	private List<String> documents;

	private String dBInstanceId;

	private String model;

	private Boolean returnDocuments;

	private String query;

	private Integer maxChunksPerDoc;

	private Long ownerId;
	public RerankRequest() {
		super("gpdb", "2016-05-03", "Rerank", "gpdb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getTopK() {
		return this.topK;
	}

	public void setTopK(Integer topK) {
		this.topK = topK;
		if(topK != null){
			putBodyParameter("TopK", topK.toString());
		}
	}

	public List<String> getDocuments() {
		return this.documents;
	}

	public void setDocuments(List<String> documents) {
		this.documents = documents;	
		if (documents != null) {
			putBodyParameter("Documents" , new Gson().toJson(documents));
		}	
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

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
		if(model != null){
			putBodyParameter("Model", model);
		}
	}

	public Boolean getReturnDocuments() {
		return this.returnDocuments;
	}

	public void setReturnDocuments(Boolean returnDocuments) {
		this.returnDocuments = returnDocuments;
		if(returnDocuments != null){
			putBodyParameter("ReturnDocuments", returnDocuments.toString());
		}
	}

	public String getQuery() {
		return this.query;
	}

	public void setQuery(String query) {
		this.query = query;
		if(query != null){
			putBodyParameter("Query", query);
		}
	}

	public Integer getMaxChunksPerDoc() {
		return this.maxChunksPerDoc;
	}

	public void setMaxChunksPerDoc(Integer maxChunksPerDoc) {
		this.maxChunksPerDoc = maxChunksPerDoc;
		if(maxChunksPerDoc != null){
			putBodyParameter("MaxChunksPerDoc", maxChunksPerDoc.toString());
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<RerankResponse> getResponseClass() {
		return RerankResponse.class;
	}

}
