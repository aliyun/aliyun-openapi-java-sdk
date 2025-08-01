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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UninstallAppRequest extends RpcAcsRequest<UninstallAppResponse> {
	   

	private List<String> instanceGroupIdLists;

	private List<String> appIdLists;

	private List<String> instanceIdLists;
	public UninstallAppRequest() {
		super("eds-aic", "2023-09-30", "UninstallApp");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getInstanceGroupIdLists() {
		return this.instanceGroupIdLists;
	}

	public void setInstanceGroupIdLists(List<String> instanceGroupIdLists) {
		this.instanceGroupIdLists = instanceGroupIdLists;	
		if (instanceGroupIdLists != null) {
			for (int i = 0; i < instanceGroupIdLists.size(); i++) {
				putQueryParameter("InstanceGroupIdList." + (i + 1) , instanceGroupIdLists.get(i));
			}
		}	
	}

	public List<String> getAppIdLists() {
		return this.appIdLists;
	}

	public void setAppIdLists(List<String> appIdLists) {
		this.appIdLists = appIdLists;	
		if (appIdLists != null) {
			for (int i = 0; i < appIdLists.size(); i++) {
				putQueryParameter("AppIdList." + (i + 1) , appIdLists.get(i));
			}
		}	
	}

	public List<String> getInstanceIdLists() {
		return this.instanceIdLists;
	}

	public void setInstanceIdLists(List<String> instanceIdLists) {
		this.instanceIdLists = instanceIdLists;	
		if (instanceIdLists != null) {
			for (int i = 0; i < instanceIdLists.size(); i++) {
				putQueryParameter("InstanceIdList." + (i + 1) , instanceIdLists.get(i));
			}
		}	
	}

	@Override
	public Class<UninstallAppResponse> getResponseClass() {
		return UninstallAppResponse.class;
	}

}
