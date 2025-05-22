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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyRCInstanceRequest extends RpcAcsRequest<ModifyRCInstanceResponse> {
	   

	private Boolean autoUseCoupon;

	private String rebootTime;

	private String instanceType;

	private String direction;

	private Boolean autoPay;

	private Boolean dryRun;

	private Boolean rebootWhenFinished;

	private String instanceId;

	private String promotionCode;
	public ModifyRCInstanceRequest() {
		super("Rds", "2014-08-15", "ModifyRCInstance", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAutoUseCoupon() {
		return this.autoUseCoupon;
	}

	public void setAutoUseCoupon(Boolean autoUseCoupon) {
		this.autoUseCoupon = autoUseCoupon;
		if(autoUseCoupon != null){
			putQueryParameter("AutoUseCoupon", autoUseCoupon.toString());
		}
	}

	public String getRebootTime() {
		return this.rebootTime;
	}

	public void setRebootTime(String rebootTime) {
		this.rebootTime = rebootTime;
		if(rebootTime != null){
			putQueryParameter("RebootTime", rebootTime);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public Boolean getRebootWhenFinished() {
		return this.rebootWhenFinished;
	}

	public void setRebootWhenFinished(Boolean rebootWhenFinished) {
		this.rebootWhenFinished = rebootWhenFinished;
		if(rebootWhenFinished != null){
			putQueryParameter("RebootWhenFinished", rebootWhenFinished.toString());
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

	public String getPromotionCode() {
		return this.promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
		if(promotionCode != null){
			putQueryParameter("PromotionCode", promotionCode);
		}
	}

	@Override
	public Class<ModifyRCInstanceResponse> getResponseClass() {
		return ModifyRCInstanceResponse.class;
	}

}
