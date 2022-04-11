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
public class ListIpsStatusRequest extends RpcAcsRequest<ListIpsStatusResponse> {
	   

	private String isp;

	private List<String> ips;

	private String cciotGwId;

	private String apn;
	public ListIpsStatusRequest() {
		super("CCIoTGW", "2021-07-21", "ListIpsStatus");
		setMethod(MethodType.POST);
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

	public List<String> getIps() {
		return this.ips;
	}

	public void setIps(List<String> ips) {
		this.ips = ips;	
		if (ips != null) {
			for (int depth1 = 0; depth1 < ips.size(); depth1++) {
				putQueryParameter("Ips." + (depth1 + 1) , ips.get(depth1));
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

	@Override
	public Class<ListIpsStatusResponse> getResponseClass() {
		return ListIpsStatusResponse.class;
	}

}
