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
public class CreateSmartCallWorkOrderRequest extends RpcAcsRequest<CreateSmartCallWorkOrderResponse> {
	   

	private Long resourceOwnerId;

	private String excelFileId;

	private Long oldOrderId;

	private String subjectName;

	private String specialFileList;

	private String sceneType;

	private String resourceOwnerAccount;

	private String qaFileList;

	private String prodCode;

	private String processFileList;

	private Long ownerId;
	public CreateSmartCallWorkOrderRequest() {
		super("Dyvms", "2017-06-20", "CreateSmartCallWorkOrder", "dyvms");
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

	public String getExcelFileId() {
		return this.excelFileId;
	}

	public void setExcelFileId(String excelFileId) {
		this.excelFileId = excelFileId;
		if(excelFileId != null){
			putQueryParameter("ExcelFileId", excelFileId);
		}
	}

	public Long getOldOrderId() {
		return this.oldOrderId;
	}

	public void setOldOrderId(Long oldOrderId) {
		this.oldOrderId = oldOrderId;
		if(oldOrderId != null){
			putQueryParameter("OldOrderId", oldOrderId.toString());
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

	public String getSpecialFileList() {
		return this.specialFileList;
	}

	public void setSpecialFileList(String specialFileList) {
		this.specialFileList = specialFileList;
		if(specialFileList != null){
			putQueryParameter("SpecialFileList", specialFileList);
		}
	}

	public String getSceneType() {
		return this.sceneType;
	}

	public void setSceneType(String sceneType) {
		this.sceneType = sceneType;
		if(sceneType != null){
			putQueryParameter("SceneType", sceneType);
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

	public String getQaFileList() {
		return this.qaFileList;
	}

	public void setQaFileList(String qaFileList) {
		this.qaFileList = qaFileList;
		if(qaFileList != null){
			putQueryParameter("QaFileList", qaFileList);
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

	public String getProcessFileList() {
		return this.processFileList;
	}

	public void setProcessFileList(String processFileList) {
		this.processFileList = processFileList;
		if(processFileList != null){
			putQueryParameter("ProcessFileList", processFileList);
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

	@Override
	public Class<CreateSmartCallWorkOrderResponse> getResponseClass() {
		return CreateSmartCallWorkOrderResponse.class;
	}

}
