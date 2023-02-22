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
public class AddCheckInstanceResultWhiteListRequest extends RpcAcsRequest<AddCheckInstanceResultWhiteListResponse> {
	   

	private String checkGroupId;

	private List<String> instanceIdss;

	private Long checkId;
	public AddCheckInstanceResultWhiteListRequest() {
		super("Sas", "2018-12-03", "AddCheckInstanceResultWhiteList");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCheckGroupId() {
		return this.checkGroupId;
	}

	public void setCheckGroupId(String checkGroupId) {
		this.checkGroupId = checkGroupId;
		if(checkGroupId != null){
			putQueryParameter("CheckGroupId", checkGroupId);
		}
	}

	public List<String> getInstanceIdss() {
		return this.instanceIdss;
	}

	public void setInstanceIdss(List<String> instanceIdss) {
		this.instanceIdss = instanceIdss;	
		if (instanceIdss != null) {
			for (int i = 0; i < instanceIdss.size(); i++) {
				putQueryParameter("InstanceIds." + (i + 1) , instanceIdss.get(i));
			}
		}	
	}

	public Long getCheckId() {
		return this.checkId;
	}

	public void setCheckId(Long checkId) {
		this.checkId = checkId;
		if(checkId != null){
			putQueryParameter("CheckId", checkId.toString());
		}
	}

	@Override
	public Class<AddCheckInstanceResultWhiteListResponse> getResponseClass() {
		return AddCheckInstanceResultWhiteListResponse.class;
	}

}
