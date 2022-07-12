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

package com.aliyuncs.antiddos_public.model.v20170518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDefenseThresholdRequest extends RpcAcsRequest<ModifyDefenseThresholdResponse> {
	   

	private String internetIp;

	private String ddosRegionId;

	private String instanceType;

	private Integer bps;

	private Integer pps;

	private String instanceId;

	private Boolean isAuto;
	public ModifyDefenseThresholdRequest() {
		super("antiddos-public", "2017-05-18", "ModifyDefenseThreshold");
		setMethod(MethodType.POST);
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
		if(internetIp != null){
			putQueryParameter("InternetIp", internetIp);
		}
	}

	public String getDdosRegionId() {
		return this.ddosRegionId;
	}

	public void setDdosRegionId(String ddosRegionId) {
		this.ddosRegionId = ddosRegionId;
		if(ddosRegionId != null){
			putQueryParameter("DdosRegionId", ddosRegionId);
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

	public Integer getBps() {
		return this.bps;
	}

	public void setBps(Integer bps) {
		this.bps = bps;
		if(bps != null){
			putQueryParameter("Bps", bps.toString());
		}
	}

	public Integer getPps() {
		return this.pps;
	}

	public void setPps(Integer pps) {
		this.pps = pps;
		if(pps != null){
			putQueryParameter("Pps", pps.toString());
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

	public Boolean getIsAuto() {
		return this.isAuto;
	}

	public void setIsAuto(Boolean isAuto) {
		this.isAuto = isAuto;
		if(isAuto != null){
			putQueryParameter("IsAuto", isAuto.toString());
		}
	}

	@Override
	public Class<ModifyDefenseThresholdResponse> getResponseClass() {
		return ModifyDefenseThresholdResponse.class;
	}

}
