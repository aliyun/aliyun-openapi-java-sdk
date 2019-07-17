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
public class DownloadGatewayProgramRequest extends RpcAcsRequest<DownloadGatewayProgramResponse> {
	
	public DownloadGatewayProgramRequest() {
		super("dg", "2019-03-27", "DownloadGatewayProgram", "dg");
		setProtocol(ProtocolType.HTTPS);
	}

	private String userOS;

	public String getUserOS() {
		return this.userOS;
	}

	public void setUserOS(String userOS) {
		this.userOS = userOS;
		if(userOS != null){
			putBodyParameter("UserOS", userOS);
		}
	}

	@Override
	public Class<DownloadGatewayProgramResponse> getResponseClass() {
		return DownloadGatewayProgramResponse.class;
	}

}
