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
public class RemoveUserFromDesktopGroupRequest extends RpcAcsRequest<RemoveUserFromDesktopGroupResponse> {
	   

	private List<String> endUserIdss;

	private String desktopGroupId;

	private List<String> desktopGroupIdss;
	public RemoveUserFromDesktopGroupRequest() {
		super("ecd", "2020-09-30", "RemoveUserFromDesktopGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getEndUserIdss() {
		return this.endUserIdss;
	}

	public void setEndUserIdss(List<String> endUserIdss) {
		this.endUserIdss = endUserIdss;	
		if (endUserIdss != null) {
			for (int i = 0; i < endUserIdss.size(); i++) {
				putQueryParameter("EndUserIds." + (i + 1) , endUserIdss.get(i));
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

	public List<String> getDesktopGroupIdss() {
		return this.desktopGroupIdss;
	}

	public void setDesktopGroupIdss(List<String> desktopGroupIdss) {
		this.desktopGroupIdss = desktopGroupIdss;	
		if (desktopGroupIdss != null) {
			for (int i = 0; i < desktopGroupIdss.size(); i++) {
				putQueryParameter("DesktopGroupIds." + (i + 1) , desktopGroupIdss.get(i));
			}
		}	
	}

	@Override
	public Class<RemoveUserFromDesktopGroupResponse> getResponseClass() {
		return RemoveUserFromDesktopGroupResponse.class;
	}

}
