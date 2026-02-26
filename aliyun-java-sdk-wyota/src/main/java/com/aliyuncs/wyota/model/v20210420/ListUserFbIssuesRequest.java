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
public class ListUserFbIssuesRequest extends RpcAcsRequest<ListUserFbIssuesResponse> {
	   

	private Integer issueId;

	private String clientSn;

	private String clientId;

	private String description;

	private Integer wasRead;

	private String title;

	private String userId;

	private String issueLabel;

	private String errorMsg;

	private Integer pageNumber;

	private String clientModel;

	private String appId;

	private String customerId;

	private Integer pageSize;

	private String desktopId;

	private String errorCode;

	private Integer fbType;

	private String userEmail;

	private Integer status;
	public ListUserFbIssuesRequest() {
		super("wyota", "2021-04-20", "ListUserFbIssues");
		setMethod(MethodType.POST);
	}

	public Integer getIssueId() {
		return this.issueId;
	}

	public void setIssueId(Integer issueId) {
		this.issueId = issueId;
		if(issueId != null){
			putBodyParameter("IssueId", issueId.toString());
		}
	}

	public String getClientSn() {
		return this.clientSn;
	}

	public void setClientSn(String clientSn) {
		this.clientSn = clientSn;
		if(clientSn != null){
			putBodyParameter("ClientSn", clientSn);
		}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putBodyParameter("ClientId", clientId);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public Integer getWasRead() {
		return this.wasRead;
	}

	public void setWasRead(Integer wasRead) {
		this.wasRead = wasRead;
		if(wasRead != null){
			putBodyParameter("WasRead", wasRead.toString());
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getIssueLabel() {
		return this.issueLabel;
	}

	public void setIssueLabel(String issueLabel) {
		this.issueLabel = issueLabel;
		if(issueLabel != null){
			putBodyParameter("IssueLabel", issueLabel);
		}
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
		if(errorMsg != null){
			putBodyParameter("ErrorMsg", errorMsg);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getClientModel() {
		return this.clientModel;
	}

	public void setClientModel(String clientModel) {
		this.clientModel = clientModel;
		if(clientModel != null){
			putBodyParameter("ClientModel", clientModel);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
		if(customerId != null){
			putBodyParameter("CustomerId", customerId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getDesktopId() {
		return this.desktopId;
	}

	public void setDesktopId(String desktopId) {
		this.desktopId = desktopId;
		if(desktopId != null){
			putBodyParameter("DesktopId", desktopId);
		}
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		if(errorCode != null){
			putBodyParameter("ErrorCode", errorCode);
		}
	}

	public Integer getFbType() {
		return this.fbType;
	}

	public void setFbType(Integer fbType) {
		this.fbType = fbType;
		if(fbType != null){
			putBodyParameter("FbType", fbType.toString());
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	@Override
	public Class<ListUserFbIssuesResponse> getResponseClass() {
		return ListUserFbIssuesResponse.class;
	}

}
