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
public class ReportUserFbAcIssueRequest extends RpcAcsRequest<ReportUserFbAcIssueResponse> {
	   

	private String instanceId;

	private String clientVersion;

	private String reservedB;

	@SerializedName("fileList")
	private List<FileList> fileList;

	private String reservedA;

	private String account;

	private String errorMsg;

	private String userEmail;

	private String labels;
	public ReportUserFbAcIssueRequest() {
		super("wyota", "2021-04-20", "ReportUserFbAcIssue");
		setMethod(MethodType.POST);
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

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
		if(account != null){
			putBodyParameter("Account", account);
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

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
		if(userEmail != null){
			putBodyParameter("UserEmail", userEmail);
		}
	}

	public String getLabels() {
		return this.labels;
	}

	public void setLabels(String labels) {
		this.labels = labels;
		if(labels != null){
			putBodyParameter("Labels", labels);
		}
	}

	public static class FileList {

		@SerializedName("FileType")
		private Integer fileType;

		@SerializedName("FileName")
		private String fileName;

		@SerializedName("SessionId")
		private String sessionId;

		@SerializedName("FileSize")
		private Integer fileSize;

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

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public Integer getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Integer fileSize) {
			this.fileSize = fileSize;
		}
	}

	@Override
	public Class<ReportUserFbAcIssueResponse> getResponseClass() {
		return ReportUserFbAcIssueResponse.class;
	}

}
