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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddTerminalRequest extends RpcAcsRequest<AddTerminalResponse> {
	   

	private String serialNumber;

	private String terminalGroupId;

	private String alias;
	public AddTerminalRequest() {
		super("wyota", "2021-04-20", "AddTerminal");
		setMethod(MethodType.POST);
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		if(serialNumber != null){
			putBodyParameter("SerialNumber", serialNumber);
		}
	}

	public String getTerminalGroupId() {
		return this.terminalGroupId;
	}

	public void setTerminalGroupId(String terminalGroupId) {
		this.terminalGroupId = terminalGroupId;
		if(terminalGroupId != null){
			putBodyParameter("TerminalGroupId", terminalGroupId);
		}
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
		if(alias != null){
			putBodyParameter("Alias", alias);
		}
	}

	@Override
	public Class<AddTerminalResponse> getResponseClass() {
		return AddTerminalResponse.class;
	}

}
