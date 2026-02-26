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

package com.aliyuncs.selectdb.model.v20230522;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterRequest extends RpcAcsRequest<ModifyDBClusterResponse> {
	   

	private Long resourceOwnerId;

	private String dBClusterId;

	private String dBClusterClass;

	private String cacheSize;

	private String engine;

	private String dBInstanceId;
	public ModifyDBClusterRequest() {
		super("selectdb", "2023-05-22", "ModifyDBCluster");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getDBClusterClass() {
		return this.dBClusterClass;
	}

	public void setDBClusterClass(String dBClusterClass) {
		this.dBClusterClass = dBClusterClass;
		if(dBClusterClass != null){
			putQueryParameter("DBClusterClass", dBClusterClass);
		}
	}

	public String getCacheSize() {
		return this.cacheSize;
	}

	public void setCacheSize(String cacheSize) {
		this.cacheSize = cacheSize;
		if(cacheSize != null){
			putQueryParameter("CacheSize", cacheSize);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
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

	@Override
	public Class<ModifyDBClusterResponse> getResponseClass() {
		return ModifyDBClusterResponse.class;
	}

}
