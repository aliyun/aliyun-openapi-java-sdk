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
public class OpsCreateNetworkPingTraceRequest extends RpcAcsRequest<OpsCreateNetworkPingTraceResponse> {
	   

	private Integer packageAmount;

	private String targetResourceId;

	private String operator;

	private String protocol;

	private String resourceId;

	private String regionNo;

	private Integer intervalInMillisecond;

	private String resourceIp;

	private String auditParamStr;

	private String targetResourceIp;
	public OpsCreateNetworkPingTraceRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateNetworkPingTrace", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getPackageAmount() {
		return this.packageAmount;
	}

	public void setPackageAmount(Integer packageAmount) {
		this.packageAmount = packageAmount;
		if(packageAmount != null){
			putQueryParameter("PackageAmount", packageAmount.toString());
		}
	}

	public String getTargetResourceId() {
		return this.targetResourceId;
	}

	public void setTargetResourceId(String targetResourceId) {
		this.targetResourceId = targetResourceId;
		if(targetResourceId != null){
			putQueryParameter("TargetResourceId", targetResourceId);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public Integer getIntervalInMillisecond() {
		return this.intervalInMillisecond;
	}

	public void setIntervalInMillisecond(Integer intervalInMillisecond) {
		this.intervalInMillisecond = intervalInMillisecond;
		if(intervalInMillisecond != null){
			putQueryParameter("IntervalInMillisecond", intervalInMillisecond.toString());
		}
	}

	public String getResourceIp() {
		return this.resourceIp;
	}

	public void setResourceIp(String resourceIp) {
		this.resourceIp = resourceIp;
		if(resourceIp != null){
			putQueryParameter("ResourceIp", resourceIp);
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

	public String getTargetResourceIp() {
		return this.targetResourceIp;
	}

	public void setTargetResourceIp(String targetResourceIp) {
		this.targetResourceIp = targetResourceIp;
		if(targetResourceIp != null){
			putQueryParameter("TargetResourceIp", targetResourceIp);
		}
	}

	@Override
	public Class<OpsCreateNetworkPingTraceResponse> getResponseClass() {
		return OpsCreateNetworkPingTraceResponse.class;
	}

}
