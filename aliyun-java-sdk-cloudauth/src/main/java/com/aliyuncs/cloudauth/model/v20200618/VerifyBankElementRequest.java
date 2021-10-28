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

package com.aliyuncs.cloudauth.model.v20200618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudauth.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class VerifyBankElementRequest extends RpcAcsRequest<VerifyBankElementResponse> {
	   

	private String idName;

	private String mobile;

	private String bankCardUrl;

	private String idNo;

	private String bankCardNo;

	private String mode;

	private String outerOrderNo;

	private String bankCardFile;

	private Long sceneId;
	public VerifyBankElementRequest() {
		super("Cloudauth", "2020-06-18", "VerifyBankElement", "cloudauth");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIdName() {
		return this.idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
		if(idName != null){
			putBodyParameter("IdName", idName);
		}
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
		if(mobile != null){
			putBodyParameter("Mobile", mobile);
		}
	}

	public String getBankCardUrl() {
		return this.bankCardUrl;
	}

	public void setBankCardUrl(String bankCardUrl) {
		this.bankCardUrl = bankCardUrl;
		if(bankCardUrl != null){
			putBodyParameter("BankCardUrl", bankCardUrl);
		}
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
		if(idNo != null){
			putBodyParameter("IdNo", idNo);
		}
	}

	public String getBankCardNo() {
		return this.bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
		if(bankCardNo != null){
			putBodyParameter("BankCardNo", bankCardNo);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putBodyParameter("Mode", mode);
		}
	}

	public String getOuterOrderNo() {
		return this.outerOrderNo;
	}

	public void setOuterOrderNo(String outerOrderNo) {
		this.outerOrderNo = outerOrderNo;
		if(outerOrderNo != null){
			putBodyParameter("OuterOrderNo", outerOrderNo);
		}
	}

	public String getBankCardFile() {
		return this.bankCardFile;
	}

	public void setBankCardFile(String bankCardFile) {
		this.bankCardFile = bankCardFile;
		if(bankCardFile != null){
			putBodyParameter("BankCardFile", bankCardFile);
		}
	}

	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putBodyParameter("SceneId", sceneId.toString());
		}
	}

	@Override
	public Class<VerifyBankElementResponse> getResponseClass() {
		return VerifyBankElementResponse.class;
	}

}
