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
public class UpdateRobotSemanticRequest extends RpcAcsRequest<UpdateRobotSemanticResponse> {
	   

	private Long resourceOwnerId;

	private String questions;

	private String secondMediaCode;

	private String mediaCode;

	private String touchCondition;

	private String transferNumber;

	private String secondAction;

	private Long id;

	private String execAction;

	private Integer state;

	private String intentIds;

	private String subjectName;

	private String resourceOwnerAccount;

	private String prodCode;

	private String thirdMediaContent;

	private String secondSubjectName;

	private Long ownerId;

	private String thirdAction;

	private String thirdMediaCode;

	private String semanticName;

	private String secondMediaContent;

	private Integer touchCount;

	private String thirdSubjectName;

	private String mediaContent;
	public UpdateRobotSemanticRequest() {
		super("Dyvms", "2017-06-20", "UpdateRobotSemantic", "dyvms");
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

	public String getSecondMediaCode() {
		return this.secondMediaCode;
	}

	public void setSecondMediaCode(String secondMediaCode) {
		this.secondMediaCode = secondMediaCode;
		if(secondMediaCode != null){
			putQueryParameter("SecondMediaCode", secondMediaCode);
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

	public String getTouchCondition() {
		return this.touchCondition;
	}

	public void setTouchCondition(String touchCondition) {
		this.touchCondition = touchCondition;
		if(touchCondition != null){
			putQueryParameter("TouchCondition", touchCondition);
		}
	}

	public String getTransferNumber() {
		return this.transferNumber;
	}

	public void setTransferNumber(String transferNumber) {
		this.transferNumber = transferNumber;
		if(transferNumber != null){
			putQueryParameter("TransferNumber", transferNumber);
		}
	}

	public String getSecondAction() {
		return this.secondAction;
	}

	public void setSecondAction(String secondAction) {
		this.secondAction = secondAction;
		if(secondAction != null){
			putQueryParameter("SecondAction", secondAction);
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

	public String getExecAction() {
		return this.execAction;
	}

	public void setExecAction(String execAction) {
		this.execAction = execAction;
		if(execAction != null){
			putQueryParameter("ExecAction", execAction);
		}
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state.toString());
		}
	}

	public String getIntentIds() {
		return this.intentIds;
	}

	public void setIntentIds(String intentIds) {
		this.intentIds = intentIds;
		if(intentIds != null){
			putQueryParameter("IntentIds", intentIds);
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

	public String getThirdMediaContent() {
		return this.thirdMediaContent;
	}

	public void setThirdMediaContent(String thirdMediaContent) {
		this.thirdMediaContent = thirdMediaContent;
		if(thirdMediaContent != null){
			putQueryParameter("ThirdMediaContent", thirdMediaContent);
		}
	}

	public String getSecondSubjectName() {
		return this.secondSubjectName;
	}

	public void setSecondSubjectName(String secondSubjectName) {
		this.secondSubjectName = secondSubjectName;
		if(secondSubjectName != null){
			putQueryParameter("SecondSubjectName", secondSubjectName);
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

	public String getThirdAction() {
		return this.thirdAction;
	}

	public void setThirdAction(String thirdAction) {
		this.thirdAction = thirdAction;
		if(thirdAction != null){
			putQueryParameter("ThirdAction", thirdAction);
		}
	}

	public String getThirdMediaCode() {
		return this.thirdMediaCode;
	}

	public void setThirdMediaCode(String thirdMediaCode) {
		this.thirdMediaCode = thirdMediaCode;
		if(thirdMediaCode != null){
			putQueryParameter("ThirdMediaCode", thirdMediaCode);
		}
	}

	public String getSemanticName() {
		return this.semanticName;
	}

	public void setSemanticName(String semanticName) {
		this.semanticName = semanticName;
		if(semanticName != null){
			putQueryParameter("SemanticName", semanticName);
		}
	}

	public String getSecondMediaContent() {
		return this.secondMediaContent;
	}

	public void setSecondMediaContent(String secondMediaContent) {
		this.secondMediaContent = secondMediaContent;
		if(secondMediaContent != null){
			putQueryParameter("SecondMediaContent", secondMediaContent);
		}
	}

	public Integer getTouchCount() {
		return this.touchCount;
	}

	public void setTouchCount(Integer touchCount) {
		this.touchCount = touchCount;
		if(touchCount != null){
			putQueryParameter("TouchCount", touchCount.toString());
		}
	}

	public String getThirdSubjectName() {
		return this.thirdSubjectName;
	}

	public void setThirdSubjectName(String thirdSubjectName) {
		this.thirdSubjectName = thirdSubjectName;
		if(thirdSubjectName != null){
			putQueryParameter("ThirdSubjectName", thirdSubjectName);
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
	public Class<UpdateRobotSemanticResponse> getResponseClass() {
		return UpdateRobotSemanticResponse.class;
	}

}
