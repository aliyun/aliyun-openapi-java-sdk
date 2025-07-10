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
public class UpsertChunksRequest extends RpcAcsRequest<UpsertChunksResponse> {
	   

	private Boolean allowInsertWithFilter;

	@SerializedName("textChunks")
	private List<TextChunks> textChunks;

	private String dBInstanceId;

	private String collection;

	private Long ownerId;

	private String namespacePassword;

	private String fileName;

	private Boolean shouldReplaceFile;

	private String namespace;
	public UpsertChunksRequest() {
		super("gpdb", "2016-05-03", "UpsertChunks", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAllowInsertWithFilter() {
		return this.allowInsertWithFilter;
	}

	public void setAllowInsertWithFilter(Boolean allowInsertWithFilter) {
		this.allowInsertWithFilter = allowInsertWithFilter;
		if(allowInsertWithFilter != null){
			putQueryParameter("AllowInsertWithFilter", allowInsertWithFilter.toString());
		}
	}

	public List<TextChunks> getTextChunks() {
		return this.textChunks;
	}

	public void setTextChunks(List<TextChunks> textChunks) {
		this.textChunks = textChunks;	
		if (textChunks != null) {
			putBodyParameter("TextChunks" , new Gson().toJson(textChunks));
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

	public String getNamespacePassword() {
		return this.namespacePassword;
	}

	public void setNamespacePassword(String namespacePassword) {
		this.namespacePassword = namespacePassword;
		if(namespacePassword != null){
			putQueryParameter("NamespacePassword", namespacePassword);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putQueryParameter("FileName", fileName);
		}
	}

	public Boolean getShouldReplaceFile() {
		return this.shouldReplaceFile;
	}

	public void setShouldReplaceFile(Boolean shouldReplaceFile) {
		this.shouldReplaceFile = shouldReplaceFile;
		if(shouldReplaceFile != null){
			putQueryParameter("ShouldReplaceFile", shouldReplaceFile.toString());
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

	public static class TextChunks {

		@SerializedName("Filter")
		private String filter;

		@SerializedName("Metadata")
		private Map<String,String> metadata;

		@SerializedName("Id")
		private String id;

		@SerializedName("Content")
		private String content;

		public String getFilter() {
			return this.filter;
		}

		public void setFilter(String filter) {
			this.filter = filter;
		}

		public Map<String,String> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(Map<String,String> metadata) {
			this.metadata = metadata;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public Class<UpsertChunksResponse> getResponseClass() {
		return UpsertChunksResponse.class;
	}

}
