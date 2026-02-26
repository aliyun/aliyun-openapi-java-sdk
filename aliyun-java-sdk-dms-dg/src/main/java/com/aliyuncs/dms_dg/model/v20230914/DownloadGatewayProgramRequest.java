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

package com.aliyuncs.dms_dg.model.v20230914;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DownloadGatewayProgramRequest extends RpcAcsRequest<DownloadGatewayProgramResponse> {
	   

	private String userOS;

	private String dgVersion;
	public DownloadGatewayProgramRequest() {
		super("dms-dg", "2023-09-14", "DownloadGatewayProgram");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getUserOS() {
		return this.userOS;
	}

	public void setUserOS(String userOS) {
		this.userOS = userOS;
		if(userOS != null){
			putBodyParameter("UserOS", userOS);
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

	@Override
	public Class<DownloadGatewayProgramResponse> getResponseClass() {
		return DownloadGatewayProgramResponse.class;
	}

}
