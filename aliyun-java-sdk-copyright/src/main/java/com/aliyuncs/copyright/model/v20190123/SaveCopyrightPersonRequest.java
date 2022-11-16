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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SaveCopyrightPersonRequest extends RpcAcsRequest<SaveCopyrightPersonResponse> {
	   

	private String contactPerson;

	private String city;

	private String idBackImage;

	private String idFrontImage;

	private String county;

	private String enterpriseTime;

	private Long expiredDate;

	private String province;

	private Integer roleType;

	private Long personId;

	private String cardType;

	private String legalPersonType;

	private String email;

	private String idHandedImage;

	private String address;

	private String enterprisePark;

	private String cardNum;

	private String enterpriseLicensePath;

	private String phone;

	private Integer ownerType;

	private String name;

	private String enterpriseType;

	private Integer useType;
	public SaveCopyrightPersonRequest() {
		super("Copyright", "2019-01-23", "SaveCopyrightPerson", "swcopyright");
		setMethod(MethodType.POST);
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
		if(contactPerson != null){
			putQueryParameter("ContactPerson", contactPerson);
		}
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
		if(city != null){
			putQueryParameter("City", city);
		}
	}

	public String getIdBackImage() {
		return this.idBackImage;
	}

	public void setIdBackImage(String idBackImage) {
		this.idBackImage = idBackImage;
		if(idBackImage != null){
			putQueryParameter("IdBackImage", idBackImage);
		}
	}

	public String getIdFrontImage() {
		return this.idFrontImage;
	}

	public void setIdFrontImage(String idFrontImage) {
		this.idFrontImage = idFrontImage;
		if(idFrontImage != null){
			putQueryParameter("IdFrontImage", idFrontImage);
		}
	}

	public String getCounty() {
		return this.county;
	}

	public void setCounty(String county) {
		this.county = county;
		if(county != null){
			putQueryParameter("County", county);
		}
	}

	public String getEnterpriseTime() {
		return this.enterpriseTime;
	}

	public void setEnterpriseTime(String enterpriseTime) {
		this.enterpriseTime = enterpriseTime;
		if(enterpriseTime != null){
			putQueryParameter("EnterpriseTime", enterpriseTime);
		}
	}

	public Long getExpiredDate() {
		return this.expiredDate;
	}

	public void setExpiredDate(Long expiredDate) {
		this.expiredDate = expiredDate;
		if(expiredDate != null){
			putQueryParameter("ExpiredDate", expiredDate.toString());
		}
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
		if(province != null){
			putQueryParameter("Province", province);
		}
	}

	public Integer getRoleType() {
		return this.roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putQueryParameter("RoleType", roleType.toString());
		}
	}

	public Long getPersonId() {
		return this.personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
		if(personId != null){
			putQueryParameter("PersonId", personId.toString());
		}
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
		if(cardType != null){
			putQueryParameter("CardType", cardType);
		}
	}

	public String getLegalPersonType() {
		return this.legalPersonType;
	}

	public void setLegalPersonType(String legalPersonType) {
		this.legalPersonType = legalPersonType;
		if(legalPersonType != null){
			putQueryParameter("LegalPersonType", legalPersonType);
		}
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
		if(email != null){
			putQueryParameter("Email", email);
		}
	}

	public String getIdHandedImage() {
		return this.idHandedImage;
	}

	public void setIdHandedImage(String idHandedImage) {
		this.idHandedImage = idHandedImage;
		if(idHandedImage != null){
			putQueryParameter("IdHandedImage", idHandedImage);
		}
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
		if(address != null){
			putQueryParameter("Address", address);
		}
	}

	public String getEnterprisePark() {
		return this.enterprisePark;
	}

	public void setEnterprisePark(String enterprisePark) {
		this.enterprisePark = enterprisePark;
		if(enterprisePark != null){
			putQueryParameter("EnterprisePark", enterprisePark);
		}
	}

	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
		if(cardNum != null){
			putQueryParameter("CardNum", cardNum);
		}
	}

	public String getEnterpriseLicensePath() {
		return this.enterpriseLicensePath;
	}

	public void setEnterpriseLicensePath(String enterpriseLicensePath) {
		this.enterpriseLicensePath = enterpriseLicensePath;
		if(enterpriseLicensePath != null){
			putQueryParameter("EnterpriseLicensePath", enterpriseLicensePath);
		}
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
		if(phone != null){
			putQueryParameter("Phone", phone);
		}
	}

	public Integer getOwnerType() {
		return this.ownerType;
	}

	public void setOwnerType(Integer ownerType) {
		this.ownerType = ownerType;
		if(ownerType != null){
			putQueryParameter("OwnerType", ownerType.toString());
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

	public String getEnterpriseType() {
		return this.enterpriseType;
	}

	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
		if(enterpriseType != null){
			putQueryParameter("EnterpriseType", enterpriseType);
		}
	}

	public Integer getUseType() {
		return this.useType;
	}

	public void setUseType(Integer useType) {
		this.useType = useType;
		if(useType != null){
			putQueryParameter("UseType", useType.toString());
		}
	}

	@Override
	public Class<SaveCopyrightPersonResponse> getResponseClass() {
		return SaveCopyrightPersonResponse.class;
	}

}
