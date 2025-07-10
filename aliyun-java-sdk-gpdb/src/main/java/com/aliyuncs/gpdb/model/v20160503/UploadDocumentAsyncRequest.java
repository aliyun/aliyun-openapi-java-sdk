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
public class UploadDocumentAsyncRequest extends RpcAcsRequest<UploadDocumentAsyncResponse> {
	   

	@SerializedName("metadata")
	private Map<String,Object> metadata;

	private Integer chunkSize;

	private String dBInstanceId;

	private Integer chunkOverlap;

	private String documentLoaderName;

	private Boolean dryRun;

	private Boolean zhTitleEnhance;

	private String textSplitterName;

	private String collection;

	private Long ownerId;

	private String namespacePassword;

	private String fileName;

	private String namespace;

	private String fileUrl;

	@SerializedName("separators")
	private List<String> separators;
	public UploadDocumentAsyncRequest() {
		super("gpdb", "2016-05-03", "UploadDocumentAsync", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Map<String,Object> getMetadata() {
		return this.metadata;
	}

	public void setMetadata(Map<String,Object> metadata) {
		this.metadata = metadata;	
		if (metadata != null) {
			putBodyParameter("Metadata" , new Gson().toJson(metadata));
		}	
	}

	public Integer getChunkSize() {
		return this.chunkSize;
	}

	public void setChunkSize(Integer chunkSize) {
		this.chunkSize = chunkSize;
		if(chunkSize != null){
			putBodyParameter("ChunkSize", chunkSize.toString());
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

	public Integer getChunkOverlap() {
		return this.chunkOverlap;
	}

	public void setChunkOverlap(Integer chunkOverlap) {
		this.chunkOverlap = chunkOverlap;
		if(chunkOverlap != null){
			putBodyParameter("ChunkOverlap", chunkOverlap.toString());
		}
	}

	public String getDocumentLoaderName() {
		return this.documentLoaderName;
	}

	public void setDocumentLoaderName(String documentLoaderName) {
		this.documentLoaderName = documentLoaderName;
		if(documentLoaderName != null){
			putBodyParameter("DocumentLoaderName", documentLoaderName);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public Boolean getZhTitleEnhance() {
		return this.zhTitleEnhance;
	}

	public void setZhTitleEnhance(Boolean zhTitleEnhance) {
		this.zhTitleEnhance = zhTitleEnhance;
		if(zhTitleEnhance != null){
			putBodyParameter("ZhTitleEnhance", zhTitleEnhance.toString());
		}
	}

	public String getTextSplitterName() {
		return this.textSplitterName;
	}

	public void setTextSplitterName(String textSplitterName) {
		this.textSplitterName = textSplitterName;
		if(textSplitterName != null){
			putBodyParameter("TextSplitterName", textSplitterName);
		}
	}

	public String getCollection() {
		return this.collection;
	}

	public void setCollection(String collection) {
		this.collection = collection;
		if(collection != null){
			putBodyParameter("Collection", collection);
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
			putBodyParameter("NamespacePassword", namespacePassword);
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putBodyParameter("FileName", fileName);
		}
	}

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putBodyParameter("Namespace", namespace);
		}
	}

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		if(fileUrl != null){
			putBodyParameter("FileUrl", fileUrl);
		}
	}

	public List<String> getSeparators() {
		return this.separators;
	}

	public void setSeparators(List<String> separators) {
		this.separators = separators;	
		if (separators != null) {
			putBodyParameter("Separators" , new Gson().toJson(separators));
		}	
	}

	@Override
	public Class<UploadDocumentAsyncResponse> getResponseClass() {
		return UploadDocumentAsyncResponse.class;
	}

}
