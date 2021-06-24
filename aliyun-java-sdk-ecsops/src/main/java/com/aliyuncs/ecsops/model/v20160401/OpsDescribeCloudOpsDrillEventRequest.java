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
public class OpsDescribeCloudOpsDrillEventRequest extends RpcAcsRequest<OpsDescribeCloudOpsDrillEventResponse> {
	   

	private String key;

	private String token;

	private String regionNo;

	private String submitEmpNo;

	private String auditParamStr;
	public OpsDescribeCloudOpsDrillEventRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeCloudOpsDrillEvent", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
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

	public String getSubmitEmpNo() {
		return this.submitEmpNo;
	}

	public void setSubmitEmpNo(String submitEmpNo) {
		this.submitEmpNo = submitEmpNo;
		if(submitEmpNo != null){
			putQueryParameter("SubmitEmpNo", submitEmpNo);
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
	public Class<OpsDescribeCloudOpsDrillEventResponse> getResponseClass() {
		return OpsDescribeCloudOpsDrillEventResponse.class;
	}

}
