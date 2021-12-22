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

package com.aliyuncs.cciotgw.model.v20210721;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyIpStatusRequest extends RpcAcsRequest<ModifyIpStatusResponse> {
	   

	private String clientToken;

	private String isp;

	private List<String> ipLists;

	private String cciotGwId;

	private String apn;

	private String status;
	public ModifyIpStatusRequest() {
		super("CCIoTGW", "2021-07-21", "ModifyIpStatus");
		setMethod(MethodType.GET);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
		}
	}

	public List<String> getIpLists() {
		return this.ipLists;
	}

	public void setIpLists(List<String> ipLists) {
		this.ipLists = ipLists;	
		if (ipLists != null) {
			for (int i = 0; i < ipLists.size(); i++) {
				putQueryParameter("IpList." + (i + 1) , ipLists.get(i));
			}
		}	
	}

	public String getCciotGwId() {
		return this.cciotGwId;
	}

	public void setCciotGwId(String cciotGwId) {
		this.cciotGwId = cciotGwId;
		if(cciotGwId != null){
			putQueryParameter("CciotGwId", cciotGwId);
		}
	}

	public String getApn() {
		return this.apn;
	}

	public void setApn(String apn) {
		this.apn = apn;
		if(apn != null){
			putQueryParameter("Apn", apn);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<ModifyIpStatusResponse> getResponseClass() {
		return ModifyIpStatusResponse.class;
	}

}
