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

package com.aliyuncs.mns.model.v20210319;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ConsoleSavePretendStatusRequest extends RpcAcsRequest<ConsoleSavePretendStatusResponse> {
	   

	private String agent;

	private Integer type;

	private String consoleSessionId;

	private String key;
	public ConsoleSavePretendStatusRequest() {
		super("mns", "2021-03-19", "ConsoleSavePretendStatus");
		setMethod(MethodType.POST);
	}

	public String getAgent() {
		return this.agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
		if(agent != null){
			putQueryParameter("Agent", agent);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type.toString());
		}
	}

	public String getConsoleSessionId() {
		return this.consoleSessionId;
	}

	public void setConsoleSessionId(String consoleSessionId) {
		this.consoleSessionId = consoleSessionId;
		if(consoleSessionId != null){
			putQueryParameter("ConsoleSessionId", consoleSessionId);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	@Override
	public Class<ConsoleSavePretendStatusResponse> getResponseClass() {
		return ConsoleSavePretendStatusResponse.class;
	}

}
