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
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReportUserFbIssueRequest extends RpcAcsRequest<ReportUserFbIssueResponse> {
	   

	private String clientSn;

	private String clientId;

	private String description;

	private String wyId;

	private String title;

	private String userId;

	private String issueLabel;

	private String errorMsg;

	private String telNo;

	private Long occurTime;

	private String clientModel;

	private String desktopId;

	private String errorCode;

	private Integer desktopType;

	private Integer fbType;

	private String clientVersion;

	private String clientOsName;

	private String reservedB;

	@SerializedName("fileList")
	private List<FileList> fileList;

	private String reservedA;

	private String appId;

	private String customerId;

	private String userEmail;

	private String workspaceId;

	private String userName;
	public ReportUserFbIssueRequest() {
		super("wyota", "2021-04-20", "ReportUserFbIssue");
		setMethod(MethodType.POST);
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

	public String getWyId() {
		return this.wyId;
	}

	public void setWyId(String wyId) {
		this.wyId = wyId;
		if(wyId != null){
			putBodyParameter("WyId", wyId);
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

	public String getTelNo() {
		return this.telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
		if(telNo != null){
			putBodyParameter("TelNo", telNo);
		}
	}

	public Long getOccurTime() {
		return this.occurTime;
	}

	public void setOccurTime(Long occurTime) {
		this.occurTime = occurTime;
		if(occurTime != null){
			putBodyParameter("OccurTime", occurTime.toString());
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

	public Integer getDesktopType() {
		return this.desktopType;
	}

	public void setDesktopType(Integer desktopType) {
		this.desktopType = desktopType;
		if(desktopType != null){
			putBodyParameter("DesktopType", desktopType.toString());
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

	public String getClientVersion() {
		return this.clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		if(clientVersion != null){
			putBodyParameter("ClientVersion", clientVersion);
		}
	}

	public String getClientOsName() {
		return this.clientOsName;
	}

	public void setClientOsName(String clientOsName) {
		this.clientOsName = clientOsName;
		if(clientOsName != null){
			putBodyParameter("ClientOsName", clientOsName);
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

	public List<FileList> getFileList() {
		return this.fileList;
	}

	public void setFileList(List<FileList> fileList) {
		this.fileList = fileList;	
		if (fileList != null) {
			putBodyParameter("FileList" , new Gson().toJson(fileList));
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

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
		if(userEmail != null){
			putBodyParameter("UserEmail", userEmail);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
		if(userName != null){
			putBodyParameter("UserName", userName);
		}
	}

	public static class FileList {

		@SerializedName("FileType")
		private Integer fileType;

		@SerializedName("FileName")
		private String fileName;

		@SerializedName("OssUrl")
		private String ossUrl;

		@SerializedName("FileSize")
		private Integer fileSize;

		@SerializedName("FileMd5")
		private String fileMd5;

		@SerializedName("SessionId")
		private String sessionId;

		public Integer getFileType() {
			return this.fileType;
		}

		public void setFileType(Integer fileType) {
			this.fileType = fileType;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getOssUrl() {
			return this.ossUrl;
		}

		public void setOssUrl(String ossUrl) {
			this.ossUrl = ossUrl;
		}

		public Integer getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Integer fileSize) {
			this.fileSize = fileSize;
		}

		public String getFileMd5() {
			return this.fileMd5;
		}

		public void setFileMd5(String fileMd5) {
			this.fileMd5 = fileMd5;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}
	}

	@Override
	public Class<ReportUserFbIssueResponse> getResponseClass() {
		return ReportUserFbIssueResponse.class;
	}

}
