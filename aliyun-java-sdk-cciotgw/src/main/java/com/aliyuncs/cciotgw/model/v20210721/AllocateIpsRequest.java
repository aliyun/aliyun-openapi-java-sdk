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
public class AllocateIpsRequest extends RpcAcsRequest<AllocateIpsResponse> {
	   

	private Boolean dryRun;

	private String clientToken;

	private String isp;

	private List<String> ipss;

	private String cciotGwId;

	private Integer ipCount;

	private String apn;
	public AllocateIpsRequest() {
		super("CCIoTGW", "2021-07-21", "AllocateIps");
		setMethod(MethodType.POST);
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
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

	public List<String> getIpss() {
		return this.ipss;
	}

	public void setIpss(List<String> ipss) {
		this.ipss = ipss;	
		if (ipss != null) {
			for (int i = 0; i < ipss.size(); i++) {
				putQueryParameter("Ips." + (i + 1) , ipss.get(i));
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

	public Integer getIpCount() {
		return this.ipCount;
	}

	public void setIpCount(Integer ipCount) {
		this.ipCount = ipCount;
		if(ipCount != null){
			putQueryParameter("IpCount", ipCount.toString());
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
	public Class<AllocateIpsResponse> getResponseClass() {
		return AllocateIpsResponse.class;
	}

}
