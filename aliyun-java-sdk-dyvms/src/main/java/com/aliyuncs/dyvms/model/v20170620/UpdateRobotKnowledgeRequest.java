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

package com.aliyuncs.dyvms.model.v20170620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dyvms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateRobotKnowledgeRequest extends RpcAcsRequest<UpdateRobotKnowledgeResponse> {
	   

	private Long resourceOwnerId;

	private String questions;

	private String mediaCode;

	private Boolean isBreak;

	private String knowledgeName;

	private Long id;

	private String subjectName;

	private String resourceOwnerAccount;

	private String prodCode;

	private Long ownerId;

	private String mediaContent;
	public UpdateRobotKnowledgeRequest() {
		super("Dyvms", "2017-06-20", "UpdateRobotKnowledge", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getQuestions() {
		return this.questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
		if(questions != null){
			putQueryParameter("Questions", questions);
		}
	}

	public String getMediaCode() {
		return this.mediaCode;
	}

	public void setMediaCode(String mediaCode) {
		this.mediaCode = mediaCode;
		if(mediaCode != null){
			putQueryParameter("MediaCode", mediaCode);
		}
	}

	public Boolean getIsBreak() {
		return this.isBreak;
	}

	public void setIsBreak(Boolean isBreak) {
		this.isBreak = isBreak;
		if(isBreak != null){
			putQueryParameter("IsBreak", isBreak.toString());
		}
	}

	public String getKnowledgeName() {
		return this.knowledgeName;
	}

	public void setKnowledgeName(String knowledgeName) {
		this.knowledgeName = knowledgeName;
		if(knowledgeName != null){
			putQueryParameter("KnowledgeName", knowledgeName);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	public String getSubjectName() {
		return this.subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
		if(subjectName != null){
			putQueryParameter("SubjectName", subjectName);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getProdCode() {
		return this.prodCode;
	}

	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
		if(prodCode != null){
			putQueryParameter("ProdCode", prodCode);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getMediaContent() {
		return this.mediaContent;
	}

	public void setMediaContent(String mediaContent) {
		this.mediaContent = mediaContent;
		if(mediaContent != null){
			putQueryParameter("MediaContent", mediaContent);
		}
	}

	@Override
	public Class<UpdateRobotKnowledgeResponse> getResponseClass() {
		return UpdateRobotKnowledgeResponse.class;
	}

}
