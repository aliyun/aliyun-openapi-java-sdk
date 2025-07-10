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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVectorIndexRequest extends RpcAcsRequest<CreateVectorIndexResponse> {
	   

	private String type;

	private Integer externalStorage;

	private String managerAccount;

	private String dBInstanceId;

	private Integer dimension;

	private String managerAccountPassword;

	private Integer hnswEfConstruction;

	private String collection;

	private Long ownerId;

	private Integer hnswM;

	private String namespace;

	private String metrics;

	private Integer pqEnable;
	public CreateVectorIndexRequest() {
		super("gpdb", "2016-05-03", "CreateVectorIndex", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Integer getExternalStorage() {
		return this.externalStorage;
	}

	public void setExternalStorage(Integer externalStorage) {
		this.externalStorage = externalStorage;
		if(externalStorage != null){
			putQueryParameter("ExternalStorage", externalStorage.toString());
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

	public Integer getDimension() {
		return this.dimension;
	}

	public void setDimension(Integer dimension) {
		this.dimension = dimension;
		if(dimension != null){
			putQueryParameter("Dimension", dimension.toString());
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

	public Integer getHnswEfConstruction() {
		return this.hnswEfConstruction;
	}

	public void setHnswEfConstruction(Integer hnswEfConstruction) {
		this.hnswEfConstruction = hnswEfConstruction;
		if(hnswEfConstruction != null){
			putQueryParameter("HnswEfConstruction", hnswEfConstruction.toString());
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

	public Integer getHnswM() {
		return this.hnswM;
	}

	public void setHnswM(Integer hnswM) {
		this.hnswM = hnswM;
		if(hnswM != null){
			putQueryParameter("HnswM", hnswM.toString());
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

	public String getMetrics() {
		return this.metrics;
	}

	public void setMetrics(String metrics) {
		this.metrics = metrics;
		if(metrics != null){
			putQueryParameter("Metrics", metrics);
		}
	}

	public Integer getPqEnable() {
		return this.pqEnable;
	}

	public void setPqEnable(Integer pqEnable) {
		this.pqEnable = pqEnable;
		if(pqEnable != null){
			putQueryParameter("PqEnable", pqEnable.toString());
		}
	}

	@Override
	public Class<CreateVectorIndexResponse> getResponseClass() {
		return CreateVectorIndexResponse.class;
	}

}
