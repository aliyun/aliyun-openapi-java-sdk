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

package com.aliyuncs.cas.model.v20180813;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateWebSignatureRequest extends RpcAcsRequest<CreateWebSignatureResponse> {
	
	public CreateWebSignatureRequest() {
		super("cas", "2018-08-13", "CreateWebSignature", "cas_esign_fdd");
	}

	private Integer quantity;

	private String handSignImg;

	private String docId;

	private String customApi;

	private Integer positionPage;

	private String docTitle;

	private Integer positionX;

	private Integer positionY;

	private String sourceIp;

	private String peopleId;

	private Integer positionType;

	private String signKeyword;

	private String notifyUrl;

	private Integer validity;

	private String returnUrl;

	private String lang;

	private Integer keywordStrategy;

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		if(quantity != null){
			putQueryParameter("Quantity", quantity.toString());
		}
	}

	public String getHandSignImg() {
		return this.handSignImg;
	}

	public void setHandSignImg(String handSignImg) {
		this.handSignImg = handSignImg;
		if(handSignImg != null){
			putQueryParameter("HandSignImg", handSignImg);
		}
	}

	public String getDocId() {
		return this.docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
		if(docId != null){
			putQueryParameter("DocId", docId);
		}
	}

	public String getCustomApi() {
		return this.customApi;
	}

	public void setCustomApi(String customApi) {
		this.customApi = customApi;
		if(customApi != null){
			putQueryParameter("CustomApi", customApi);
		}
	}

	public Integer getPositionPage() {
		return this.positionPage;
	}

	public void setPositionPage(Integer positionPage) {
		this.positionPage = positionPage;
		if(positionPage != null){
			putQueryParameter("PositionPage", positionPage.toString());
		}
	}

	public String getDocTitle() {
		return this.docTitle;
	}

	public void setDocTitle(String docTitle) {
		this.docTitle = docTitle;
		if(docTitle != null){
			putQueryParameter("DocTitle", docTitle);
		}
	}

	public Integer getPositionX() {
		return this.positionX;
	}

	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
		if(positionX != null){
			putQueryParameter("PositionX", positionX.toString());
		}
	}

	public Integer getPositionY() {
		return this.positionY;
	}

	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
		if(positionY != null){
			putQueryParameter("PositionY", positionY.toString());
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getPeopleId() {
		return this.peopleId;
	}

	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
		if(peopleId != null){
			putQueryParameter("PeopleId", peopleId);
		}
	}

	public Integer getPositionType() {
		return this.positionType;
	}

	public void setPositionType(Integer positionType) {
		this.positionType = positionType;
		if(positionType != null){
			putQueryParameter("PositionType", positionType.toString());
		}
	}

	public String getSignKeyword() {
		return this.signKeyword;
	}

	public void setSignKeyword(String signKeyword) {
		this.signKeyword = signKeyword;
		if(signKeyword != null){
			putQueryParameter("SignKeyword", signKeyword);
		}
	}

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
		if(notifyUrl != null){
			putQueryParameter("NotifyUrl", notifyUrl);
		}
	}

	public Integer getValidity() {
		return this.validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
		if(validity != null){
			putQueryParameter("Validity", validity.toString());
		}
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
		if(returnUrl != null){
			putQueryParameter("ReturnUrl", returnUrl);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public Integer getKeywordStrategy() {
		return this.keywordStrategy;
	}

	public void setKeywordStrategy(Integer keywordStrategy) {
		this.keywordStrategy = keywordStrategy;
		if(keywordStrategy != null){
			putQueryParameter("KeywordStrategy", keywordStrategy.toString());
		}
	}

	@Override
	public Class<CreateWebSignatureResponse> getResponseClass() {
		return CreateWebSignatureResponse.class;
	}

}
