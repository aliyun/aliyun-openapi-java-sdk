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
public class SendMulticastCommandRequest extends RpcAcsRequest<SendMulticastCommandResponse> {
	
	public SendMulticastCommandRequest() {
		super("LinkWAN", "2018-12-30", "SendMulticastCommand", "linkwan");
	}

	private String mcAddress;

	private Integer fPort;

	private String content;

	public String getMcAddress() {
		return this.mcAddress;
	}

	public void setMcAddress(String mcAddress) {
		this.mcAddress = mcAddress;
		if(mcAddress != null){
			putBodyParameter("McAddress", mcAddress);
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
	public Class<SendMulticastCommandResponse> getResponseClass() {
		return SendMulticastCommandResponse.class;
	}

}
