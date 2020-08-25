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
public class QueryLinkeBahamutIterationaddunitRequest extends RpcAcsRequest<QueryLinkeBahamutIterationaddunitResponse> {
	   

	private List<String> workItemsRepeatLists;

	private String branchPostfix;

	private String appName;

	private String sameBranch;

	private String stringversion;

	private String fromTag;

	private List<String> membersRepeatLists;

	private String iterationId;
	public QueryLinkeBahamutIterationaddunitRequest() {
		super("SOFA", "2019-08-15", "QueryLinkeBahamutIterationaddunit", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getWorkItemsRepeatLists() {
		return this.workItemsRepeatLists;
	}

	public void setWorkItemsRepeatLists(List<String> workItemsRepeatLists) {
		this.workItemsRepeatLists = workItemsRepeatLists;	
		if (workItemsRepeatLists != null) {
			for (int i = 0; i < workItemsRepeatLists.size(); i++) {
				putBodyParameter("WorkItemsRepeatList." + (i + 1) , workItemsRepeatLists.get(i));
			}
		}	
	}

	public String getBranchPostfix() {
		return this.branchPostfix;
	}

	public void setBranchPostfix(String branchPostfix) {
		this.branchPostfix = branchPostfix;
		if(branchPostfix != null){
			putBodyParameter("BranchPostfix", branchPostfix);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public String getSameBranch() {
		return this.sameBranch;
	}

	public void setSameBranch(String sameBranch) {
		this.sameBranch = sameBranch;
		if(sameBranch != null){
			putBodyParameter("SameBranch", sameBranch);
		}
	}

	public String getStringversion() {
		return this.stringversion;
	}

	public void setStringversion(String stringversion) {
		this.stringversion = stringversion;
		if(stringversion != null){
			putBodyParameter("Stringversion", stringversion);
		}
	}

	public String getFromTag() {
		return this.fromTag;
	}

	public void setFromTag(String fromTag) {
		this.fromTag = fromTag;
		if(fromTag != null){
			putBodyParameter("FromTag", fromTag);
		}
	}

	public List<String> getMembersRepeatLists() {
		return this.membersRepeatLists;
	}

	public void setMembersRepeatLists(List<String> membersRepeatLists) {
		this.membersRepeatLists = membersRepeatLists;	
		if (membersRepeatLists != null) {
			for (int i = 0; i < membersRepeatLists.size(); i++) {
				putBodyParameter("MembersRepeatList." + (i + 1) , membersRepeatLists.get(i));
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
	public Class<QueryLinkeBahamutIterationaddunitResponse> getResponseClass() {
		return QueryLinkeBahamutIterationaddunitResponse.class;
	}

}
