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
public class EnDisableScalingRulesRequest extends RpcAcsRequest<EnDisableScalingRulesResponse> {
	   

	private Long resourceOwnerId;

	private String product;

	private String clusterId;

	private String dbInstanceId;

	private Boolean scalingRulesEnable;
	public EnDisableScalingRulesRequest() {
		super("selectdb", "2023-05-22", "EnDisableScalingRules");
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

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
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

	public String getDbInstanceId() {
		return this.dbInstanceId;
	}

	public void setDbInstanceId(String dbInstanceId) {
		this.dbInstanceId = dbInstanceId;
		if(dbInstanceId != null){
			putQueryParameter("DbInstanceId", dbInstanceId);
		}
	}

	public Boolean getScalingRulesEnable() {
		return this.scalingRulesEnable;
	}

	public void setScalingRulesEnable(Boolean scalingRulesEnable) {
		this.scalingRulesEnable = scalingRulesEnable;
		if(scalingRulesEnable != null){
			putQueryParameter("ScalingRulesEnable", scalingRulesEnable.toString());
		}
	}

	@Override
	public Class<EnDisableScalingRulesResponse> getResponseClass() {
		return EnDisableScalingRulesResponse.class;
	}

}
