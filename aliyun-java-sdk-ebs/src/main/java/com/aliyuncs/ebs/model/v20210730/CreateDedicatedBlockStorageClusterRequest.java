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

package com.aliyuncs.ebs.model.v20210730;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateDedicatedBlockStorageClusterRequest extends RpcAcsRequest<CreateDedicatedBlockStorageClusterResponse> {
	   

	private String type;

	private Long capacity;

	private String dbscId;

	private String azone;

	private String dbscName;
	public CreateDedicatedBlockStorageClusterRequest() {
		super("ebs", "2021-07-30", "CreateDedicatedBlockStorageCluster", "ebs");
		setMethod(MethodType.POST);
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

	public Long getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
		if(capacity != null){
			putQueryParameter("Capacity", capacity.toString());
		}
	}

	public String getDbscId() {
		return this.dbscId;
	}

	public void setDbscId(String dbscId) {
		this.dbscId = dbscId;
		if(dbscId != null){
			putQueryParameter("DbscId", dbscId);
		}
	}

	public String getAzone() {
		return this.azone;
	}

	public void setAzone(String azone) {
		this.azone = azone;
		if(azone != null){
			putQueryParameter("Azone", azone);
		}
	}

	public String getDbscName() {
		return this.dbscName;
	}

	public void setDbscName(String dbscName) {
		this.dbscName = dbscName;
		if(dbscName != null){
			putQueryParameter("DbscName", dbscName);
		}
	}

	@Override
	public Class<CreateDedicatedBlockStorageClusterResponse> getResponseClass() {
		return CreateDedicatedBlockStorageClusterResponse.class;
	}

}
