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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSAGDeviceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSAGDeviceInfoResponse extends AcsResponse {

	private String requestId;

	private String version;

	private String vpnState;

	private String smartAGType;

	private String controllerState;

	private String startupTime;

	private String lastConnectedControllerTime;

	private String serviceIP;

	private String synStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getVpnState() {
		return this.vpnState;
	}

	public void setVpnState(String vpnState) {
		this.vpnState = vpnState;
	}

	public String getSmartAGType() {
		return this.smartAGType;
	}

	public void setSmartAGType(String smartAGType) {
		this.smartAGType = smartAGType;
	}

	public String getControllerState() {
		return this.controllerState;
	}

	public void setControllerState(String controllerState) {
		this.controllerState = controllerState;
	}

	public String getStartupTime() {
		return this.startupTime;
	}

	public void setStartupTime(String startupTime) {
		this.startupTime = startupTime;
	}

	public String getLastConnectedControllerTime() {
		return this.lastConnectedControllerTime;
	}

	public void setLastConnectedControllerTime(String lastConnectedControllerTime) {
		this.lastConnectedControllerTime = lastConnectedControllerTime;
	}

	public String getServiceIP() {
		return this.serviceIP;
	}

	public void setServiceIP(String serviceIP) {
		this.serviceIP = serviceIP;
	}

	public String getSynStatus() {
		return this.synStatus;
	}

	public void setSynStatus(String synStatus) {
		this.synStatus = synStatus;
	}

	@Override
	public DescribeSAGDeviceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeSAGDeviceInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
