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

/**
 * @author auto create
 * @version 
 */
public class SendUnicastCommandRequest extends RpcAcsRequest<SendUnicastCommandResponse> {
	
	public SendUnicastCommandRequest() {
		super("LinkWAN", "2018-12-30", "SendUnicastCommand", "linkwan");
	}

	private String devEui;

	private Integer maxRetries;

	private Boolean cleanUp;

	private Integer fPort;

	private Boolean comfirmed;

	private String content;

	public String getDevEui() {
		return this.devEui;
	}

	public void setDevEui(String devEui) {
		this.devEui = devEui;
		if(devEui != null){
			putBodyParameter("DevEui", devEui);
		}
	}

	public Integer getMaxRetries() {
		return this.maxRetries;
	}

	public void setMaxRetries(Integer maxRetries) {
		this.maxRetries = maxRetries;
		if(maxRetries != null){
			putBodyParameter("MaxRetries", maxRetries.toString());
		}
	}

	public Boolean getCleanUp() {
		return this.cleanUp;
	}

	public void setCleanUp(Boolean cleanUp) {
		this.cleanUp = cleanUp;
		if(cleanUp != null){
			putBodyParameter("CleanUp", cleanUp.toString());
		}
	}

	public Integer getFPort() {
		return this.fPort;
	}

	public void setFPort(Integer fPort) {
		this.fPort = fPort;
		if(fPort != null){
			putBodyParameter("FPort", fPort.toString());
		}
	}

	public Boolean getComfirmed() {
		return this.comfirmed;
	}

	public void setComfirmed(Boolean comfirmed) {
		this.comfirmed = comfirmed;
		if(comfirmed != null){
			putBodyParameter("Comfirmed", comfirmed.toString());
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	@Override
	public Class<SendUnicastCommandResponse> getResponseClass() {
		return SendUnicastCommandResponse.class;
	}

}
