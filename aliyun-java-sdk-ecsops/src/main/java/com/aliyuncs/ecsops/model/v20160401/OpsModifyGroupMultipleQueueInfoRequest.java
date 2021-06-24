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
public class OpsModifyGroupMultipleQueueInfoRequest extends RpcAcsRequest<OpsModifyGroupMultipleQueueInfoResponse> {
	   

	private Integer blackListScanInterval;

	private String mode;

	private Integer scanInterval;

	private String config;

	private String auditParamStr;
	public OpsModifyGroupMultipleQueueInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsModifyGroupMultipleQueueInfo", "ecsops");
		setMethod(MethodType.POST);
	}

	public Integer getBlackListScanInterval() {
		return this.blackListScanInterval;
	}

	public void setBlackListScanInterval(Integer blackListScanInterval) {
		this.blackListScanInterval = blackListScanInterval;
		if(blackListScanInterval != null){
			putQueryParameter("BlackListScanInterval", blackListScanInterval.toString());
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public Integer getScanInterval() {
		return this.scanInterval;
	}

	public void setScanInterval(Integer scanInterval) {
		this.scanInterval = scanInterval;
		if(scanInterval != null){
			putQueryParameter("ScanInterval", scanInterval.toString());
		}
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
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
	public Class<OpsModifyGroupMultipleQueueInfoResponse> getResponseClass() {
		return OpsModifyGroupMultipleQueueInfoResponse.class;
	}

}
