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

package com.aliyuncs.mindlive.model.v20210301;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReportCurrentBackgroundRequest extends RpcAcsRequest<ReportCurrentBackgroundResponse> {
	   

	private String mode;

	private String bgConfig;

	private Boolean open;

	private String resourceUuid;
	public ReportCurrentBackgroundRequest() {
		super("MindLive", "2021-03-01", "ReportCurrentBackground");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getBgConfig() {
		return this.bgConfig;
	}

	public void setBgConfig(String bgConfig) {
		this.bgConfig = bgConfig;
		if(bgConfig != null){
			putQueryParameter("BgConfig", bgConfig);
		}
	}

	public Boolean getOpen() {
		return this.open;
	}

	public void setOpen(Boolean open) {
		this.open = open;
		if(open != null){
			putQueryParameter("Open", open.toString());
		}
	}

	public String getResourceUuid() {
		return this.resourceUuid;
	}

	public void setResourceUuid(String resourceUuid) {
		this.resourceUuid = resourceUuid;
		if(resourceUuid != null){
			putQueryParameter("ResourceUuid", resourceUuid);
		}
	}

	@Override
	public Class<ReportCurrentBackgroundResponse> getResponseClass() {
		return ReportCurrentBackgroundResponse.class;
	}

}
