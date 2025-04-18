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
public class ModifyElasticRuleRequest extends RpcAcsRequest<ModifyElasticRuleResponse> {
	   

	private Long resourceOwnerId;

	private String dbInstanceId;

	private String product;

	private String executionPeriod;

	private String clusterId;

	private String elasticRuleStartTime;

	private String clusterClass;

	private Long ruleId;
	public ModifyElasticRuleRequest() {
		super("selectdb", "2023-05-22", "ModifyElasticRule");
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

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putQueryParameter("DbInstanceId", dbInstanceId);
		}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public String getExecutionPeriod() {
		return this.executionPeriod;
	}

	public void setExecutionPeriod(String executionPeriod) {
		this.executionPeriod = executionPeriod;
		if(executionPeriod != null){
			putQueryParameter("ExecutionPeriod", executionPeriod);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getElasticRuleStartTime() {
		return this.elasticRuleStartTime;
	}

	public void setElasticRuleStartTime(String elasticRuleStartTime) {
		this.elasticRuleStartTime = elasticRuleStartTime;
		if(elasticRuleStartTime != null){
			putQueryParameter("ElasticRuleStartTime", elasticRuleStartTime);
		}
	}

	public String getClusterClass() {
		return this.clusterClass;
	}

	public void setClusterClass(String clusterClass) {
		this.clusterClass = clusterClass;
		if(clusterClass != null){
			putQueryParameter("ClusterClass", clusterClass);
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
		}
	}

	@Override
	public Class<ModifyElasticRuleResponse> getResponseClass() {
		return ModifyElasticRuleResponse.class;
	}

}
