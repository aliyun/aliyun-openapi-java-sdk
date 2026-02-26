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
public class UnbindUserDesktopRequest extends RpcAcsRequest<UnbindUserDesktopResponse> {
	   

	private String reason;

	private List<String> desktopAgentIdss;

	private List<String> desktopIdss;

	private String desktopGroupId;

	private Boolean force;

	private List<String> userDesktopIdss;
	public UnbindUserDesktopRequest() {
		super("ecd", "2020-09-30", "UnbindUserDesktop", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public List<String> getDesktopAgentIdss() {
		return this.desktopAgentIdss;
	}

	public void setDesktopAgentIdss(List<String> desktopAgentIdss) {
		this.desktopAgentIdss = desktopAgentIdss;	
		if (desktopAgentIdss != null) {
			for (int i = 0; i < desktopAgentIdss.size(); i++) {
				putQueryParameter("DesktopAgentIds." + (i + 1) , desktopAgentIdss.get(i));
			}
		}	
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

	public Boolean getForce() {
		return this.force;
	}

	public void setForce(Boolean force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
		}
	}

	public List<String> getUserDesktopIdss() {
		return this.userDesktopIdss;
	}

	public void setUserDesktopIdss(List<String> userDesktopIdss) {
		this.userDesktopIdss = userDesktopIdss;	
		if (userDesktopIdss != null) {
			for (int i = 0; i < userDesktopIdss.size(); i++) {
				putQueryParameter("UserDesktopIds." + (i + 1) , userDesktopIdss.get(i));
			}
		}	
	}

	@Override
	public Class<UnbindUserDesktopResponse> getResponseClass() {
		return UnbindUserDesktopResponse.class;
	}

}
