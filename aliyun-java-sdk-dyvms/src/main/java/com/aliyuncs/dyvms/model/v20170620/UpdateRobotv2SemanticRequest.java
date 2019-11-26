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
public class UpdateRobotv2SemanticRequest extends RpcAcsRequest<UpdateRobotv2SemanticResponse> {
	   

	private Long resourceOwnerId;

	private String remark;

	private Long robotId;

	private String transferNumber;

	private String exeAction;

	private String thirdDialogContent;

	private String dialogContent;

	private Long id;

	private Integer state;

	private Long thirdDialogId;

	private Long secondDialogId;

	private String intentIds;

	private String secondDialogContent;

	private String resourceOwnerAccount;

	private String prodCode;

	private Long ownerId;

	private Long dialogId;

	private Integer touchCount;
	public UpdateRobotv2SemanticRequest() {
		super("Dyvms", "2017-06-20", "UpdateRobotv2Semantic", "dyvms");
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public Long getRobotId() {
		return this.robotId;
	}

	public void setRobotId(Long robotId) {
		this.robotId = robotId;
		if(robotId != null){
			putQueryParameter("RobotId", robotId.toString());
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

	public String getExeAction() {
		return this.exeAction;
	}

	public void setExeAction(String exeAction) {
		this.exeAction = exeAction;
		if(exeAction != null){
			putQueryParameter("ExeAction", exeAction);
		}
	}

	public String getThirdDialogContent() {
		return this.thirdDialogContent;
	}

	public void setThirdDialogContent(String thirdDialogContent) {
		this.thirdDialogContent = thirdDialogContent;
		if(thirdDialogContent != null){
			putQueryParameter("ThirdDialogContent", thirdDialogContent);
		}
	}

	public String getDialogContent() {
		return this.dialogContent;
	}

	public void setDialogContent(String dialogContent) {
		this.dialogContent = dialogContent;
		if(dialogContent != null){
			putQueryParameter("DialogContent", dialogContent);
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

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state.toString());
		}
	}

	public Long getThirdDialogId() {
		return this.thirdDialogId;
	}

	public void setThirdDialogId(Long thirdDialogId) {
		this.thirdDialogId = thirdDialogId;
		if(thirdDialogId != null){
			putQueryParameter("ThirdDialogId", thirdDialogId.toString());
		}
	}

	public Long getSecondDialogId() {
		return this.secondDialogId;
	}

	public void setSecondDialogId(Long secondDialogId) {
		this.secondDialogId = secondDialogId;
		if(secondDialogId != null){
			putQueryParameter("SecondDialogId", secondDialogId.toString());
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

	public String getSecondDialogContent() {
		return this.secondDialogContent;
	}

	public void setSecondDialogContent(String secondDialogContent) {
		this.secondDialogContent = secondDialogContent;
		if(secondDialogContent != null){
			putQueryParameter("SecondDialogContent", secondDialogContent);
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

	public Long getDialogId() {
		return this.dialogId;
	}

	public void setDialogId(Long dialogId) {
		this.dialogId = dialogId;
		if(dialogId != null){
			putQueryParameter("DialogId", dialogId.toString());
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

	@Override
	public Class<UpdateRobotv2SemanticResponse> getResponseClass() {
		return UpdateRobotv2SemanticResponse.class;
	}

}
