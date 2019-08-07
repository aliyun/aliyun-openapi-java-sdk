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

package com.aliyuncs.hdr.model.v20170925;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.hdr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReportWorkloadRequest extends RpcAcsRequest<ReportWorkloadResponse> {
	
	public ReportWorkloadRequest() {
		super("hdr", "2017-09-25", "ReportWorkload", "hdr");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String gatewayId;

	private Integer recoveryWorkload;

	private Integer backupWorkload;

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
		if(gatewayId != null){
			putQueryParameter("GatewayId", gatewayId);
		}
	}

	public Integer getRecoveryWorkload() {
		return this.recoveryWorkload;
	}

	public void setRecoveryWorkload(Integer recoveryWorkload) {
		this.recoveryWorkload = recoveryWorkload;
		if(recoveryWorkload != null){
			putQueryParameter("RecoveryWorkload", recoveryWorkload.toString());
		}
	}

	public Integer getBackupWorkload() {
		return this.backupWorkload;
	}

	public void setBackupWorkload(Integer backupWorkload) {
		this.backupWorkload = backupWorkload;
		if(backupWorkload != null){
			putQueryParameter("BackupWorkload", backupWorkload.toString());
		}
	}

	@Override
	public Class<ReportWorkloadResponse> getResponseClass() {
		return ReportWorkloadResponse.class;
	}

}
