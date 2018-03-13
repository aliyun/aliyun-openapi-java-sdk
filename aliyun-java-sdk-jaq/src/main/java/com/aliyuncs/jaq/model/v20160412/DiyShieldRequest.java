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
package com.aliyuncs.jaq.model.v20160412;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DiyShieldRequest extends RpcAcsRequest<DiyShieldResponse> {
	
	public DiyShieldRequest() {
		super("jaq", "2016-04-12", "DiyShield");
	}

	private String appInfo;

	private String channel;

	private String enhance;

	public String getAppInfo() {
		return this.appInfo;
	}

	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
		putQueryParameter("AppInfo", appInfo);
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		putQueryParameter("Channel", channel);
	}

	public String getEnhance() {
		return this.enhance;
	}

	public void setEnhance(String enhance) {
		this.enhance = enhance;
		putQueryParameter("Enhance", enhance);
	}

	@Override
	public Class<DiyShieldResponse> getResponseClass() {
		return DiyShieldResponse.class;
	}

}
