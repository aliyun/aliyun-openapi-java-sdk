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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpsertCollectionDataRequest extends RpcAcsRequest<UpsertCollectionDataResponse> {
	   

	private String dBInstanceId;

	private String collection;

	private Long ownerId;

	@SerializedName("rows")
	private List<Rows> rows;

	private String namespacePassword;

	private String namespace;

	private String workspaceId;
	public UpsertCollectionDataRequest() {
		super("gpdb", "2016-05-03", "UpsertCollectionData", "gpdb");
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

	public String getCollection() {
		return this.collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
		if(collection != null){
			putQueryParameter("Collection", collection);
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

	public List<Rows> getRows() {
		return this.rows;
	}

	public void setRows(List<Rows> rows) {
		this.rows = rows;	
		if (rows != null) {
			putBodyParameter("Rows" , new Gson().toJson(rows));
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

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putQueryParameter("WorkspaceId", workspaceId);
		}
	}

	public static class Rows {

		@SerializedName("Metadata")
		private Map<String,String> metadata;

		@SerializedName("Vector")
		private List<Double> vector;

		@SerializedName("Id")
		private String id;

		@SerializedName("SparseVector")
		private SparseVector sparseVector;

		public Map<String,String> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<String,String> metadata) {
			this.metadata = metadata;
		}

		public List<Double> getVector() {
			return this.vector;
		}

		public void setVector(List<Double> vector) {
			this.vector = vector;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public SparseVector getSparseVector() {
			return this.sparseVector;
		}

		public void setSparseVector(SparseVector sparseVector) {
			this.sparseVector = sparseVector;
		}

		public static class SparseVector {

			@SerializedName("Indices")
			private List<Long> indices;

			@SerializedName("Values")
			private List<Double> values;

			public List<Long> getIndices() {
				return this.indices;
			}

			public void setIndices(List<Long> indices) {
				this.indices = indices;
			}

			public List<Double> getValues() {
				return this.values;
			}

			public void setValues(List<Double> values) {
				this.values = values;
			}
		}
	}

	@Override
	public Class<UpsertCollectionDataResponse> getResponseClass() {
		return UpsertCollectionDataResponse.class;
	}

}
