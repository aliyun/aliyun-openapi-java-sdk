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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListUserFbAcIssuesRequest extends RpcAcsRequest<ListUserFbAcIssuesResponse> {
	   

	private String errorMessage;

	private String issueId;

	private String instanceId;

	private String clientVersion;

	private String reservedB;

	private String reservedA;

	private String label;

	private String account;

	private String userEmail;
	public ListUserFbAcIssuesRequest() {
		super("wyota", "2021-04-20", "ListUserFbAcIssues");
		setMethod(MethodType.POST);
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		if(errorMessage != null){
			putBodyParameter("ErrorMessage", errorMessage);
		}
	}

	public String getIssueId() {
		return this.issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
		if(issueId != null){
			putBodyParameter("IssueId", issueId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		if(clientVersion != null){
			putBodyParameter("ClientVersion", clientVersion);
		}
	}

	public String getReservedB() {
		return this.reservedB;
	}

	public void setReservedB(String reservedB) {
		this.reservedB = reservedB;
		if(reservedB != null){
			putBodyParameter("ReservedB", reservedB);
		}
	}

	public String getReservedA() {
		return this.reservedA;
	}

	public void setReservedA(String reservedA) {
		this.reservedA = reservedA;
		if(reservedA != null){
			putBodyParameter("ReservedA", reservedA);
		}
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
		if(label != null){
			putBodyParameter("Label", label);
		}
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
		if(account != null){
			putBodyParameter("Account", account);
		}
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
		if(userEmail != null){
			putBodyParameter("UserEmail", userEmail);
		}
	}

	@Override
	public Class<ListUserFbAcIssuesResponse> getResponseClass() {
		return ListUserFbAcIssuesResponse.class;
	}

}
