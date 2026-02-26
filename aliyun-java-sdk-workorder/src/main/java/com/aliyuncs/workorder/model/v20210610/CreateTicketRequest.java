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

package com.aliyuncs.workorder.model.v20210610;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.workorder.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTicketRequest extends RpcAcsRequest<CreateTicketResponse> {
	   

	private Integer severity;

	private String creatorId;

	private String description;

	private String title;

	private List<String> fileNameList;

	@SerializedName("secretInfo")
	private SecretInfo secretInfo;

	private String categoryId;

	private String email;
	public CreateTicketRequest() {
		super("Workorder", "2021-06-10", "CreateTicket");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getSeverity() {
		return this.severity;
	}

	public void setSeverity(Integer severity) {
		this.severity = severity;
		if(severity != null){
			putBodyParameter("Severity", severity.toString());
		}
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
		if(creatorId != null){
			putBodyParameter("CreatorId", creatorId);
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public List<String> getFileNameList() {
		return this.fileNameList;
	}

	public void setFileNameList(List<String> fileNameList) {
		this.fileNameList = fileNameList;	
		if (fileNameList != null) {
			String fileNameListArrVal = "";
			for(int depth1 = 0; depth1 < fileNameList.size(); depth1++) {
				fileNameListArrVal += fileNameList.get(depth1) + ",";
			}
			if (fileNameListArrVal.length() > 0) {
				fileNameListArrVal = fileNameListArrVal.substring(0, fileNameListArrVal.length() - 1);
			}
			putBodyParameter("FileNameList" , fileNameListArrVal);
		}	
	}

	public SecretInfo getSecretInfo() {
		return this.secretInfo;
	}

	public void setSecretInfo(SecretInfo secretInfo) {
		this.secretInfo = secretInfo;	
		if (secretInfo != null) {
			putQueryParameter("SecretInfo" , new Gson().toJson(secretInfo));
		}	
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putBodyParameter("CategoryId", categoryId);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putBodyParameter("Email", email);
		}
	}

	public static class SecretInfo {

		@SerializedName("FileNameList")
		private List<String> fileNameList;

		@SerializedName("Content")
		private String content;

		public List<String> getFileNameList() {
			return this.fileNameList;
		}

		public void setFileNameList(List<String> fileNameList) {
			this.fileNameList = fileNameList;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	@Override
	public Class<CreateTicketResponse> getResponseClass() {
		return CreateTicketResponse.class;
	}

}
