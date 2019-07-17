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

package com.aliyuncs.dg.model.v20190327;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class HeartbeatGatewayInstanceRequest extends RpcAcsRequest<HeartbeatGatewayInstanceResponse> {
	
	public HeartbeatGatewayInstanceRequest() {
		super("dg", "2019-03-27", "HeartbeatGatewayInstance", "dg");
		setProtocol(ProtocolType.HTTPS);
	}

	private String daemonExceptions;

	private String upgradeStatus;

	private String gatewayInstanceId;

	private String otherStatus;

	private String sessionId;

	private String dgVersion;

	private String progressStatus;

	public String getDaemonExceptions() {
		return this.daemonExceptions;
	}

	public void setDaemonExceptions(String daemonExceptions) {
		this.daemonExceptions = daemonExceptions;
		if(daemonExceptions != null){
			putBodyParameter("DaemonExceptions", daemonExceptions);
		}
	}

	public String getUpgradeStatus() {
		return this.upgradeStatus;
	}

	public void setUpgradeStatus(String upgradeStatus) {
		this.upgradeStatus = upgradeStatus;
		if(upgradeStatus != null){
			putBodyParameter("UpgradeStatus", upgradeStatus);
		}
	}

	public String getGatewayInstanceId() {
		return this.gatewayInstanceId;
	}

	public void setGatewayInstanceId(String gatewayInstanceId) {
		this.gatewayInstanceId = gatewayInstanceId;
		if(gatewayInstanceId != null){
			putBodyParameter("GatewayInstanceId", gatewayInstanceId);
		}
	}

	public String getOtherStatus() {
		return this.otherStatus;
	}

	public void setOtherStatus(String otherStatus) {
		this.otherStatus = otherStatus;
		if(otherStatus != null){
			putBodyParameter("OtherStatus", otherStatus);
		}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putBodyParameter("SessionId", sessionId);
		}
	}

	public String getDgVersion() {
		return this.dgVersion;
	}

	public void setDgVersion(String dgVersion) {
		this.dgVersion = dgVersion;
		if(dgVersion != null){
			putBodyParameter("DgVersion", dgVersion);
		}
	}

	public String getProgressStatus() {
		return this.progressStatus;
	}

	public void setProgressStatus(String progressStatus) {
		this.progressStatus = progressStatus;
		if(progressStatus != null){
			putBodyParameter("ProgressStatus", progressStatus);
		}
	}

	@Override
	public Class<HeartbeatGatewayInstanceResponse> getResponseClass() {
		return HeartbeatGatewayInstanceResponse.class;
	}

}
