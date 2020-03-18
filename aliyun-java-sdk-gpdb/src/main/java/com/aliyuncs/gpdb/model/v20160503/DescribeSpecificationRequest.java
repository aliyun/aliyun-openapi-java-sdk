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
public class DescribeSpecificationRequest extends RpcAcsRequest<DescribeSpecificationResponse> {
	   

	private String storageType;

	private Integer cpuCores;

	private String dBInstanceId;

	private Integer totalNodeNum;

	private Long ownerId;
	public DescribeSpecificationRequest() {
		super("gpdb", "2016-05-03", "DescribeSpecification", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public Integer getCpuCores() {
		return this.cpuCores;
	}

	public void setCpuCores(Integer cpuCores) {
		this.cpuCores = cpuCores;
		if(cpuCores != null){
			putQueryParameter("CpuCores", cpuCores.toString());
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

	public Integer getTotalNodeNum() {
		return this.totalNodeNum;
	}

	public void setTotalNodeNum(Integer totalNodeNum) {
		this.totalNodeNum = totalNodeNum;
		if(totalNodeNum != null){
			putQueryParameter("TotalNodeNum", totalNodeNum.toString());
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
	public Class<DescribeSpecificationResponse> getResponseClass() {
		return DescribeSpecificationResponse.class;
	}

}
