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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetDingTalkUserOrgByAliyunTmpCodeRequest extends RpcAcsRequest<GetDingTalkUserOrgByAliyunTmpCodeResponse> {
	   

	private String appName;

	private String tmpCode;

	private String dingTalkChannel;

	private String version;
	public GetDingTalkUserOrgByAliyunTmpCodeRequest() {
		super("account-crm", "2016-06-06", "GetDingTalkUserOrgByAliyunTmpCode");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getTmpCode() {
		return this.tmpCode;
	}

	public void setTmpCode(String tmpCode) {
		this.tmpCode = tmpCode;
		if(tmpCode != null){
			putQueryParameter("TmpCode", tmpCode);
		}
	}

	public String getDingTalkChannel() {
		return this.dingTalkChannel;
	}

	public void setDingTalkChannel(String dingTalkChannel) {
		this.dingTalkChannel = dingTalkChannel;
		if(dingTalkChannel != null){
			putQueryParameter("DingTalkChannel", dingTalkChannel);
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	@Override
	public Class<GetDingTalkUserOrgByAliyunTmpCodeResponse> getResponseClass() {
		return GetDingTalkUserOrgByAliyunTmpCodeResponse.class;
	}

}
