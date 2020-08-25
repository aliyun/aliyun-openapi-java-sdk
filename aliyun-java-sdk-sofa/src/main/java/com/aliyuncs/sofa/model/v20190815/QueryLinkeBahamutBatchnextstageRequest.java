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
public class QueryLinkeBahamutBatchnextstageRequest extends RpcAcsRequest<QueryLinkeBahamutBatchnextstageResponse> {
	   

	private List<String> iterationUnitIdsRepeatLists;

	private String userAccount;

	private List<String> toStageIdsRepeatLists;

	private List<String> fromStageIdsRepeatLists;
	public QueryLinkeBahamutBatchnextstageRequest() {
		super("SOFA", "2019-08-15", "QueryLinkeBahamutBatchnextstage", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getIterationUnitIdsRepeatLists() {
		return this.iterationUnitIdsRepeatLists;
	}

	public void setIterationUnitIdsRepeatLists(List<String> iterationUnitIdsRepeatLists) {
		this.iterationUnitIdsRepeatLists = iterationUnitIdsRepeatLists;	
		if (iterationUnitIdsRepeatLists != null) {
			for (int i = 0; i < iterationUnitIdsRepeatLists.size(); i++) {
				putBodyParameter("IterationUnitIdsRepeatList." + (i + 1) , iterationUnitIdsRepeatLists.get(i));
			}
		}	
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

	public List<String> getToStageIdsRepeatLists() {
		return this.toStageIdsRepeatLists;
	}

	public void setToStageIdsRepeatLists(List<String> toStageIdsRepeatLists) {
		this.toStageIdsRepeatLists = toStageIdsRepeatLists;	
		if (toStageIdsRepeatLists != null) {
			for (int i = 0; i < toStageIdsRepeatLists.size(); i++) {
				putBodyParameter("ToStageIdsRepeatList." + (i + 1) , toStageIdsRepeatLists.get(i));
			}
		}	
	}

	public List<String> getFromStageIdsRepeatLists() {
		return this.fromStageIdsRepeatLists;
	}

	public void setFromStageIdsRepeatLists(List<String> fromStageIdsRepeatLists) {
		this.fromStageIdsRepeatLists = fromStageIdsRepeatLists;	
		if (fromStageIdsRepeatLists != null) {
			for (int i = 0; i < fromStageIdsRepeatLists.size(); i++) {
				putBodyParameter("FromStageIdsRepeatList." + (i + 1) , fromStageIdsRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<QueryLinkeBahamutBatchnextstageResponse> getResponseClass() {
		return QueryLinkeBahamutBatchnextstageResponse.class;
	}

}
