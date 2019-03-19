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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class SendCommandByMacRequest extends RpcAcsRequest<SendCommandByMacResponse> {
	
	public SendCommandByMacRequest() {
		super("cloudwf", "2017-03-28", "SendCommandByMac", "cloudwf");
	}

	private List<String> macLists;

	private String command;

	public List<String> getMacLists() {
		return this.macLists;
	}

	public void setMacLists(List<String> macLists) {
		this.macLists = macLists;	
		if (macLists != null) {
			for (int i = 0; i < macLists.size(); i++) {
				putQueryParameter("MacList." + (i + 1) , macLists.get(i));
			}
		}	
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putQueryParameter("Command", command);
		}
	}

	@Override
	public Class<SendCommandByMacResponse> getResponseClass() {
		return SendCommandByMacResponse.class;
	}

}
