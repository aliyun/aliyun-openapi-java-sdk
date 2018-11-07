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

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class RemoveTerminalsRequest extends RpcAcsRequest<RemoveTerminalsResponse> {
	
	public RemoveTerminalsRequest() {
		super("rtc", "2018-01-11", "RemoveTerminals", "rtc");
	}

	private List<String> terminalIdss;

	private Long ownerId;

	private String appId;

	private String channelId;

	public List<String> getTerminalIdss() {
		return this.terminalIdss;
	}

	public void setTerminalIdss(List<String> terminalIdss) {
		this.terminalIdss = terminalIdss;	
		if (terminalIdss != null) {
			for (int i = 0; i < terminalIdss.size(); i++) {
				putQueryParameter("TerminalIds." + (i + 1) , terminalIdss.get(i));
			}
		}	
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
		if(channelId != null){
			putQueryParameter("ChannelId", channelId);
		}
	}

	@Override
	public Class<RemoveTerminalsResponse> getResponseClass() {
		return RemoveTerminalsResponse.class;
	}

}
