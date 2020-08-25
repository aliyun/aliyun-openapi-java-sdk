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
public class UpdateLinkeBahamutUserproductRequest extends RpcAcsRequest<UpdateLinkeBahamutUserproductResponse> {
	   

	private List<String> userProductInfosRepeatLists;

	private String userEmpId;
	public UpdateLinkeBahamutUserproductRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeBahamutUserproduct", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getUserProductInfosRepeatLists() {
		return this.userProductInfosRepeatLists;
	}

	public void setUserProductInfosRepeatLists(List<String> userProductInfosRepeatLists) {
		this.userProductInfosRepeatLists = userProductInfosRepeatLists;	
		if (userProductInfosRepeatLists != null) {
			for (int i = 0; i < userProductInfosRepeatLists.size(); i++) {
				putBodyParameter("UserProductInfosRepeatList." + (i + 1) , userProductInfosRepeatLists.get(i));
			}
		}	
	}

	public String getUserEmpId() {
		return this.userEmpId;
	}

	public void setUserEmpId(String userEmpId) {
		this.userEmpId = userEmpId;
		if(userEmpId != null){
			putBodyParameter("UserEmpId", userEmpId);
		}
	}

	@Override
	public Class<UpdateLinkeBahamutUserproductResponse> getResponseClass() {
		return UpdateLinkeBahamutUserproductResponse.class;
	}

}
