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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryNcPerformanceRequest extends RpcAcsRequest<OpsQueryNcPerformanceResponse> {
	   

	private String accessKeySecret;

	private String startTime;

	private String endTime;

	private String ncIps;

	private String perfSignature;

	private String signatureMethod;

	private String signatureVersion;

	private String auditParamStr;
	public OpsQueryNcPerformanceRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryNcPerformance", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccessKeySecret() {
		return this.accessKeySecret;
	}

	public void setAccessKeySecret(String accessKeySecret) {
		this.accessKeySecret = accessKeySecret;
		if(accessKeySecret != null){
			putQueryParameter("AccessKeySecret", accessKeySecret);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getNcIps() {
		return this.ncIps;
	}

	public void setNcIps(String ncIps) {
		this.ncIps = ncIps;
		if(ncIps != null){
			putQueryParameter("NcIps", ncIps);
		}
	}

	public String getPerfSignature() {
		return this.perfSignature;
	}

	public void setPerfSignature(String perfSignature) {
		this.perfSignature = perfSignature;
		if(perfSignature != null){
			putQueryParameter("PerfSignature", perfSignature);
		}
	}

	public String getSignatureMethod() {
		return this.signatureMethod;
	}

	public void setSignatureMethod(String signatureMethod) {
		this.signatureMethod = signatureMethod;
		if(signatureMethod != null){
			putQueryParameter("SignatureMethod", signatureMethod);
		}
	}

	public String getSignatureVersion() {
		return this.signatureVersion;
	}

	public void setSignatureVersion(String signatureVersion) {
		this.signatureVersion = signatureVersion;
		if(signatureVersion != null){
			putQueryParameter("SignatureVersion", signatureVersion);
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
	public Class<OpsQueryNcPerformanceResponse> getResponseClass() {
		return OpsQueryNcPerformanceResponse.class;
	}

}
