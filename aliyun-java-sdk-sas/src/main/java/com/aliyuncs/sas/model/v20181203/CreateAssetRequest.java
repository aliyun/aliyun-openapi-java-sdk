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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAssetRequest extends RpcAcsRequest<CreateAssetResponse> {
	   

	private String internetIp;

	private String osName;

	private String os;

	private String instanceName;

	private String intranetIp;

	private String status;
	public CreateAssetRequest() {
		super("Sas", "2018-12-03", "CreateAsset", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInternetIp() {
		return this.internetIp;
	}

	public void setInternetIp(String internetIp) {
		this.internetIp = internetIp;
		if(internetIp != null){
			putQueryParameter("InternetIp", internetIp);
		}
	}

	public String getOsName() {
		return this.osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
		if(osName != null){
			putQueryParameter("OsName", osName);
		}
	}

	public String getOs() {
		return this.os;
	}

	public void setOs(String os) {
		this.os = os;
		if(os != null){
			putQueryParameter("Os", os);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public String getIntranetIp() {
		return this.intranetIp;
	}

	public void setIntranetIp(String intranetIp) {
		this.intranetIp = intranetIp;
		if(intranetIp != null){
			putQueryParameter("IntranetIp", intranetIp);
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
	public Class<CreateAssetResponse> getResponseClass() {
		return CreateAssetResponse.class;
	}

}
