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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCASSlsLogstoreRequest extends RpcAcsRequest<CreateCASSlsLogstoreResponse> {
	   

	private String tenantId;

	private String slsRegionId;

	private Long shardCount;

	private String projectName;

	private String logstoreName;

	private Long ttl;
	public CreateCASSlsLogstoreRequest() {
		super("SOFA", "2019-08-15", "CreateCASSlsLogstore", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getSlsRegionId() {
		return this.slsRegionId;
	}

	public void setSlsRegionId(String slsRegionId) {
		this.slsRegionId = slsRegionId;
		if(slsRegionId != null){
			putBodyParameter("SlsRegionId", slsRegionId);
		}
	}

	public Long getShardCount() {
		return this.shardCount;
	}

	public void setShardCount(Long shardCount) {
		this.shardCount = shardCount;
		if(shardCount != null){
			putBodyParameter("ShardCount", shardCount.toString());
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putBodyParameter("ProjectName", projectName);
		}
	}

	public String getLogstoreName() {
		return this.logstoreName;
	}

	public void setLogstoreName(String logstoreName) {
		this.logstoreName = logstoreName;
		if(logstoreName != null){
			putBodyParameter("LogstoreName", logstoreName);
		}
	}

	public Long getTtl() {
		return this.ttl;
	}

	public void setTtl(Long ttl) {
		this.ttl = ttl;
		if(ttl != null){
			putBodyParameter("Ttl", ttl.toString());
		}
	}

	@Override
	public Class<CreateCASSlsLogstoreResponse> getResponseClass() {
		return CreateCASSlsLogstoreResponse.class;
	}

}
