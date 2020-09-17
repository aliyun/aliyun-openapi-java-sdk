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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddLinkeBahamutIterationaddunitsRequest extends RpcAcsRequest<AddLinkeBahamutIterationaddunitsResponse> {
	   

	private String userAccount;

	private List<String> unitFormsRepeatLists;

	private String iterationId;
	public AddLinkeBahamutIterationaddunitsRequest() {
		super("SOFA", "2019-08-15", "AddLinkeBahamutIterationaddunits", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserAccount() {
		return this.userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
		if(userAccount != null){
			putBodyParameter("UserAccount", userAccount);
		}
	}

	public List<String> getUnitFormsRepeatLists() {
		return this.unitFormsRepeatLists;
	}

	public void setUnitFormsRepeatLists(List<String> unitFormsRepeatLists) {
		this.unitFormsRepeatLists = unitFormsRepeatLists;	
		if (unitFormsRepeatLists != null) {
			for (int i = 0; i < unitFormsRepeatLists.size(); i++) {
				putBodyParameter("UnitFormsRepeatList." + (i + 1) , unitFormsRepeatLists.get(i));
			}
		}	
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	@Override
	public Class<AddLinkeBahamutIterationaddunitsResponse> getResponseClass() {
		return AddLinkeBahamutIterationaddunitsResponse.class;
	}

}
