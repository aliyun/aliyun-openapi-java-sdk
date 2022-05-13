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
public class DisableDesktopsInGroupRequest extends RpcAcsRequest<DisableDesktopsInGroupResponse> {
	   

	private List<String> desktopIdss;

	private String desktopGroupId;
	public DisableDesktopsInGroupRequest() {
		super("ecd", "2020-09-30", "DisableDesktopsInGroup");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDesktopIdss() {
		return this.desktopIdss;
	}

	public void setDesktopIdss(List<String> desktopIdss) {
		this.desktopIdss = desktopIdss;	
		if (desktopIdss != null) {
			for (int i = 0; i < desktopIdss.size(); i++) {
				putQueryParameter("DesktopIds." + (i + 1) , desktopIdss.get(i));
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

	@Override
	public Class<DisableDesktopsInGroupResponse> getResponseClass() {
		return DisableDesktopsInGroupResponse.class;
	}

}
