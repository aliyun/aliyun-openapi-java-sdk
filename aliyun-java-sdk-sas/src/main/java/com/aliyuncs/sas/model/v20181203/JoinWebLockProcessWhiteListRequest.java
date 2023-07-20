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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class JoinWebLockProcessWhiteListRequest extends RpcAcsRequest<JoinWebLockProcessWhiteListResponse> {
	   

	private List<String> processPathss;

	private String uuids;
	public JoinWebLockProcessWhiteListRequest() {
		super("Sas", "2018-12-03", "JoinWebLockProcessWhiteList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getProcessPathss() {
		return this.processPathss;
	}

	public void setProcessPathss(List<String> processPathss) {
		this.processPathss = processPathss;	
		if (processPathss != null) {
			for (int i = 0; i < processPathss.size(); i++) {
				putQueryParameter("ProcessPaths." + (i + 1) , processPathss.get(i));
			}
		}	
	}

	public String getUuids() {
		return this.uuids;
	}

	public void setUuids(String uuids) {
		this.uuids = uuids;
		if(uuids != null){
			putQueryParameter("Uuids", uuids);
		}
	}

	@Override
	public Class<JoinWebLockProcessWhiteListResponse> getResponseClass() {
		return JoinWebLockProcessWhiteListResponse.class;
	}

}
