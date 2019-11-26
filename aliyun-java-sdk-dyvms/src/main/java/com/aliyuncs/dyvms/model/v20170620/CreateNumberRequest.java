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
public class CreateNumberRequest extends RpcAcsRequest<CreateNumberResponse> {
	   

	private Long specId;

	private Long resourceOwnerId;

	private Integer guaranteedPackageLevel;

	private String monthlyPrice;

	private String number;

	private String regionNameCity;

	private String resourceOwnerAccount;

	private String numberArray;

	private String prodCode;

	private String regionNameProvince;

	private Long realNameInsId;

	private Boolean isCuteNumber;

	private Long ownerId;

	private Integer numberType;

	private Integer levelId;

	private String corpName;
	public CreateNumberRequest() {
		super("Dyvms", "2017-06-20", "CreateNumber", "dyvms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getSpecId() {
		return this.specId;
	}

	public void setSpecId(Long specId) {
		this.specId = specId;
		if(specId != null){
			putQueryParameter("SpecId", specId.toString());
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

	public Integer getGuaranteedPackageLevel() {
		return this.guaranteedPackageLevel;
	}

	public void setGuaranteedPackageLevel(Integer guaranteedPackageLevel) {
		this.guaranteedPackageLevel = guaranteedPackageLevel;
		if(guaranteedPackageLevel != null){
			putQueryParameter("GuaranteedPackageLevel", guaranteedPackageLevel.toString());
		}
	}

	public String getMonthlyPrice() {
		return this.monthlyPrice;
	}

	public void setMonthlyPrice(String monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
		if(monthlyPrice != null){
			putQueryParameter("MonthlyPrice", monthlyPrice);
		}
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
		}
	}

	public String getRegionNameCity() {
		return this.regionNameCity;
	}

	public void setRegionNameCity(String regionNameCity) {
		this.regionNameCity = regionNameCity;
		if(regionNameCity != null){
			putQueryParameter("RegionNameCity", regionNameCity);
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

	public String getNumberArray() {
		return this.numberArray;
	}

	public void setNumberArray(String numberArray) {
		this.numberArray = numberArray;
		if(numberArray != null){
			putQueryParameter("NumberArray", numberArray);
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

	public String getRegionNameProvince() {
		return this.regionNameProvince;
	}

	public void setRegionNameProvince(String regionNameProvince) {
		this.regionNameProvince = regionNameProvince;
		if(regionNameProvince != null){
			putQueryParameter("RegionNameProvince", regionNameProvince);
		}
	}

	public Long getRealNameInsId() {
		return this.realNameInsId;
	}

	public void setRealNameInsId(Long realNameInsId) {
		this.realNameInsId = realNameInsId;
		if(realNameInsId != null){
			putQueryParameter("RealNameInsId", realNameInsId.toString());
		}
	}

	public Boolean getIsCuteNumber() {
		return this.isCuteNumber;
	}

	public void setIsCuteNumber(Boolean isCuteNumber) {
		this.isCuteNumber = isCuteNumber;
		if(isCuteNumber != null){
			putQueryParameter("IsCuteNumber", isCuteNumber.toString());
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

	public Integer getNumberType() {
		return this.numberType;
	}

	public void setNumberType(Integer numberType) {
		this.numberType = numberType;
		if(numberType != null){
			putQueryParameter("NumberType", numberType.toString());
		}
	}

	public Integer getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
		if(levelId != null){
			putQueryParameter("LevelId", levelId.toString());
		}
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
		if(corpName != null){
			putQueryParameter("CorpName", corpName);
		}
	}

	@Override
	public Class<CreateNumberResponse> getResponseClass() {
		return CreateNumberResponse.class;
	}

}
