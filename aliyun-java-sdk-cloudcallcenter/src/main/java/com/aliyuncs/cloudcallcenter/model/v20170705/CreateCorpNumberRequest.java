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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateCorpNumberRequest extends RpcAcsRequest<CreateCorpNumberResponse> {
	
	public CreateCorpNumberRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateCorpNumber", "CloudCallCenter", "innerAPI");
	}

	private String number;

	private Long realNameInsId;

	private String regionNameProvince;

	private String corpName;

	private Long taobaoUid;

	private Long ramId;

	private String regionNameCity;

	private String monthlyPrice;

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
		if(number != null){
			putQueryParameter("Number", number);
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

	public String getRegionNameProvince() {
		return this.regionNameProvince;
	}

	public void setRegionNameProvince(String regionNameProvince) {
		this.regionNameProvince = regionNameProvince;
		if(regionNameProvince != null){
			putQueryParameter("regionNameProvince", regionNameProvince);
		}
	}

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
		if(corpName != null){
			putQueryParameter("corpName", corpName);
		}
	}

	public Long getTaobaoUid() {
		return this.taobaoUid;
	}

	public void setTaobaoUid(Long taobaoUid) {
		this.taobaoUid = taobaoUid;
		if(taobaoUid != null){
			putQueryParameter("TaobaoUid", taobaoUid.toString());
		}
	}

	public Long getRamId() {
		return this.ramId;
	}

	public void setRamId(Long ramId) {
		this.ramId = ramId;
		if(ramId != null){
			putQueryParameter("RamId", ramId.toString());
		}
	}

	public String getRegionNameCity() {
		return this.regionNameCity;
	}

	public void setRegionNameCity(String regionNameCity) {
		this.regionNameCity = regionNameCity;
		if(regionNameCity != null){
			putQueryParameter("regionNameCity", regionNameCity);
		}
	}

	public String getMonthlyPrice() {
		return this.monthlyPrice;
	}

	public void setMonthlyPrice(String monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
		if(monthlyPrice != null){
			putQueryParameter("monthlyPrice", monthlyPrice);
		}
	}

	@Override
	public Class<CreateCorpNumberResponse> getResponseClass() {
		return CreateCorpNumberResponse.class;
	}

}
