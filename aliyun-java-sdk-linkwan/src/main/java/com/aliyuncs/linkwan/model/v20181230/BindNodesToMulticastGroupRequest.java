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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class BindNodesToMulticastGroupRequest extends RpcAcsRequest<BindNodesToMulticastGroupResponse> {
	
	public BindNodesToMulticastGroupRequest() {
		super("LinkWAN", "2018-12-30", "BindNodesToMulticastGroup", "linkwan");
	}

	private String mcAddress;

	private List<String> devEuiLists;

	public String getMcAddress() {
		return this.mcAddress;
	}

	public void setMcAddress(String mcAddress) {
		this.mcAddress = mcAddress;
		if(mcAddress != null){
			putBodyParameter("McAddress", mcAddress);
		}
	}

	public List<String> getDevEuiLists() {
		return this.devEuiLists;
	}

	public void setDevEuiLists(List<String> devEuiLists) {
		this.devEuiLists = devEuiLists;	
		if (devEuiLists != null) {
			for (int i = 0; i < devEuiLists.size(); i++) {
				putBodyParameter("DevEuiList." + (i + 1) , devEuiLists.get(i));
			}
		}	
	}

	@Override
	public Class<BindNodesToMulticastGroupResponse> getResponseClass() {
		return BindNodesToMulticastGroupResponse.class;
	}

}
