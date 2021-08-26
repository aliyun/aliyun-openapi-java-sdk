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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyUserToDesktopGroupRequest extends RpcAcsRequest<ModifyUserToDesktopGroupResponse> {
	   

	private List<String> oldEndUserIdss;

	private String desktopGroupId;

	private List<String> newEndUserIdss;
	public ModifyUserToDesktopGroupRequest() {
		super("ecd", "2020-09-30", "ModifyUserToDesktopGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getOldEndUserIdss() {
		return this.oldEndUserIdss;
	}

	public void setOldEndUserIdss(List<String> oldEndUserIdss) {
		this.oldEndUserIdss = oldEndUserIdss;	
		if (oldEndUserIdss != null) {
			for (int i = 0; i < oldEndUserIdss.size(); i++) {
				putQueryParameter("OldEndUserIds." + (i + 1) , oldEndUserIdss.get(i));
			}
		}	
	}

	public String getDesktopGroupId() {
		return this.desktopGroupId;
	}

	public void setDesktopGroupId(String desktopGroupId) {
		this.desktopGroupId = desktopGroupId;
		if(desktopGroupId != null){
			putQueryParameter("DesktopGroupId", desktopGroupId);
		}
	}

	public List<String> getNewEndUserIdss() {
		return this.newEndUserIdss;
	}

	public void setNewEndUserIdss(List<String> newEndUserIdss) {
		this.newEndUserIdss = newEndUserIdss;	
		if (newEndUserIdss != null) {
			for (int i = 0; i < newEndUserIdss.size(); i++) {
				putQueryParameter("NewEndUserIds." + (i + 1) , newEndUserIdss.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyUserToDesktopGroupResponse> getResponseClass() {
		return ModifyUserToDesktopGroupResponse.class;
	}

}
