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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class UpdateMCTemplateRequest extends RpcAcsRequest<UpdateMCTemplateResponse> {
	
	public UpdateMCTemplateRequest() {
		super("Mts", "2014-06-18", "UpdateMCTemplate", "mts");
	}

	private String politics;

	private Long resourceOwnerId;

	private String contraband;

	private String ad;

	private String abuse;

	private String resourceOwnerAccount;

	private String qrcode;

	private String ownerAccount;

	private Long ownerId;

	private String templateId;

	private String porn;

	private String terrorism;

	private String name;

	private String logo;

	private String spam;

	private String live;

	public String getPolitics() {
		return this.politics;
	}

	public void setPolitics(String politics) {
		this.politics = politics;
		if(politics != null){
			putQueryParameter("Politics", politics);
		}
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

	public String getContraband() {
		return this.contraband;
	}

	public void setContraband(String contraband) {
		this.contraband = contraband;
		if(contraband != null){
			putQueryParameter("Contraband", contraband);
		}
	}

	public String getAd() {
		return this.ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
		if(ad != null){
			putQueryParameter("Ad", ad);
		}
	}

	public String getAbuse() {
		return this.abuse;
	}

	public void setAbuse(String abuse) {
		this.abuse = abuse;
		if(abuse != null){
			putQueryParameter("Abuse", abuse);
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

	public String getQrcode() {
		return this.qrcode;
	}

	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
		if(qrcode != null){
			putQueryParameter("Qrcode", qrcode);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
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

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public String getPorn() {
		return this.porn;
	}

	public void setPorn(String porn) {
		this.porn = porn;
		if(porn != null){
			putQueryParameter("Porn", porn);
		}
	}

	public String getTerrorism() {
		return this.terrorism;
	}

	public void setTerrorism(String terrorism) {
		this.terrorism = terrorism;
		if(terrorism != null){
			putQueryParameter("Terrorism", terrorism);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
		if(logo != null){
			putQueryParameter("Logo", logo);
		}
	}

	public String getSpam() {
		return this.spam;
	}

	public void setSpam(String spam) {
		this.spam = spam;
		if(spam != null){
			putQueryParameter("spam", spam);
		}
	}

	public String getLive() {
		return this.live;
	}

	public void setLive(String live) {
		this.live = live;
		if(live != null){
			putQueryParameter("Live", live);
		}
	}

	@Override
	public Class<UpdateMCTemplateResponse> getResponseClass() {
		return UpdateMCTemplateResponse.class;
	}

}
