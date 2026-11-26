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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableCollectionGraphRAGRequest extends RpcAcsRequest<EnableCollectionGraphRAGResponse> {
	   

	private String lLMModel;

	private String language;

	private String managerAccount;

	private String dBInstanceId;

	private String managerAccountPassword;

	@SerializedName("relationshipTypes")
	private List<String> relationshipTypes;

	private String collection;

	private Long ownerId;

	private String namespacePassword;

	private String namespace;

	@SerializedName("entityTypes")
	private List<String> entityTypes;
	public EnableCollectionGraphRAGRequest() {
		super("gpdb", "2016-05-03", "EnableCollectionGraphRAG", "GPDB");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getLLMModel() {
		return this.lLMModel;
	}

	public void setLLMModel(String lLMModel) {
		this.lLMModel = lLMModel;
		if(lLMModel != null){
			putQueryParameter("LLMModel", lLMModel);
		}
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
		if(language != null){
			putQueryParameter("Language", language);
		}
	}

	public String getManagerAccount() {
		return this.managerAccount;
	}

	public void setManagerAccount(String managerAccount) {
		this.managerAccount = managerAccount;
		if(managerAccount != null){
			putQueryParameter("ManagerAccount", managerAccount);
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

	public String getManagerAccountPassword() {
		return this.managerAccountPassword;
	}

	public void setManagerAccountPassword(String managerAccountPassword) {
		this.managerAccountPassword = managerAccountPassword;
		if(managerAccountPassword != null){
			putQueryParameter("ManagerAccountPassword", managerAccountPassword);
		}
	}

	public List<String> getRelationshipTypes() {
		return this.relationshipTypes;
	}

	public void setRelationshipTypes(List<String> relationshipTypes) {
		this.relationshipTypes = relationshipTypes;	
		if (relationshipTypes != null) {
			putQueryParameter("RelationshipTypes" , new Gson().toJson(relationshipTypes));
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

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
		if(namespace != null){
			putQueryParameter("Namespace", namespace);
		}
	}

	public List<String> getEntityTypes() {
		return this.entityTypes;
	}

	public void setEntityTypes(List<String> entityTypes) {
		this.entityTypes = entityTypes;	
		if (entityTypes != null) {
			putQueryParameter("EntityTypes" , new Gson().toJson(entityTypes));
		}	
	}

	@Override
	public Class<EnableCollectionGraphRAGResponse> getResponseClass() {
		return EnableCollectionGraphRAGResponse.class;
	}

}
