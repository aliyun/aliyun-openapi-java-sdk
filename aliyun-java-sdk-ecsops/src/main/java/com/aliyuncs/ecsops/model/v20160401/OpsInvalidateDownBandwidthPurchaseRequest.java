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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsInvalidateDownBandwidthPurchaseRequest extends RpcAcsRequest<OpsInvalidateDownBandwidthPurchaseResponse> {
	   

	private Long resourceOwnerId;

	private Integer baseBandwidth;

	private Long orderId;

	private String instanceId;

	private Integer targetBandwidth;

	private String auditParamStr;
	public OpsInvalidateDownBandwidthPurchaseRequest() {
		super("Ecsops", "2016-04-01", "OpsInvalidateDownBandwidthPurchase", "ecsops");
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

	public Integer getBaseBandwidth() {
		return this.baseBandwidth;
	}

	public void setBaseBandwidth(Integer baseBandwidth) {
		this.baseBandwidth = baseBandwidth;
		if(baseBandwidth != null){
			putQueryParameter("BaseBandwidth", baseBandwidth.toString());
		}
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getTargetBandwidth() {
		return this.targetBandwidth;
	}

	public void setTargetBandwidth(Integer targetBandwidth) {
		this.targetBandwidth = targetBandwidth;
		if(targetBandwidth != null){
			putQueryParameter("TargetBandwidth", targetBandwidth.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsInvalidateDownBandwidthPurchaseResponse> getResponseClass() {
		return OpsInvalidateDownBandwidthPurchaseResponse.class;
	}

}
