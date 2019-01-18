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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class UpdateLabNodeDownlinkConfigRequest extends RpcAcsRequest<UpdateLabNodeDownlinkConfigResponse> {
	
	public UpdateLabNodeDownlinkConfigRequest() {
		super("LinkWAN", "2018-12-30", "UpdateLabNodeDownlinkConfig", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private String devEui;

	private String debugConfig;

	private String downlinkConfig;

	public String getDevEui() {
		return this.devEui;
	}

	public void setDevEui(String devEui) {
		this.devEui = devEui;
		if(devEui != null){
			putBodyParameter("DevEui", devEui);
		}
	}

	public String getDebugConfig() {
		return this.debugConfig;
	}

	public void setDebugConfig(String debugConfig) {
		this.debugConfig = debugConfig;
		if(debugConfig != null){
			putBodyParameter("DebugConfig", debugConfig);
		}
	}

	public String getDownlinkConfig() {
		return this.downlinkConfig;
	}

	public void setDownlinkConfig(String downlinkConfig) {
		this.downlinkConfig = downlinkConfig;
		if(downlinkConfig != null){
			putBodyParameter("DownlinkConfig", downlinkConfig);
		}
	}

	@Override
	public Class<UpdateLabNodeDownlinkConfigResponse> getResponseClass() {
		return UpdateLabNodeDownlinkConfigResponse.class;
	}

}
