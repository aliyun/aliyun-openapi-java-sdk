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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateNumber400OrderRequest extends RpcAcsRequest<CreateNumber400OrderResponse> {
	
	public CreateNumber400OrderRequest() {
		super("CloudCallCenter", "2017-07-05", "CreateNumber400Order", "CloudCallCenter", "innerAPI");
	}

	private String specId;

	private List<String> numbers;

	private String specName;

	private String realNameInsId;

	private String regionNameProvince;

	private String corpName;

	private String type;

	private String regionNameCity;

	private Integer guaranteedPackageLevel;

	private Integer monthlyPrice;

	public String getSpecId() {
		return this.specId;
	}

	public void setSpecId(String specId) {
		this.specId = specId;
		if(specId != null){
			putQueryParameter("SpecId", specId);
		}
	}

	public List<String> getNumbers() {
		return this.numbers;
	}

	public void setNumbers(List<String> numbers) {
		this.numbers = numbers;	
		if (numbers != null) {
			for (int i = 0; i < numbers.size(); i++) {
				putQueryParameter("Number." + (i + 1) , numbers.get(i));
			}
		}	
	}

	public String getSpecName() {
		return this.specName;
	}

	public void setSpecName(String specName) {
		this.specName = specName;
		if(specName != null){
			putQueryParameter("SpecName", specName);
		}
	}

	public String getRealNameInsId() {
		return this.realNameInsId;
	}

	public void setRealNameInsId(String realNameInsId) {
		this.realNameInsId = realNameInsId;
		if(realNameInsId != null){
			putQueryParameter("RealNameInsId", realNameInsId);
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

	public String getCorpName() {
		return this.corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
		if(corpName != null){
			putQueryParameter("CorpName", corpName);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
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

	public Integer getGuaranteedPackageLevel() {
		return this.guaranteedPackageLevel;
	}

	public void setGuaranteedPackageLevel(Integer guaranteedPackageLevel) {
		this.guaranteedPackageLevel = guaranteedPackageLevel;
		if(guaranteedPackageLevel != null){
			putQueryParameter("GuaranteedPackageLevel", guaranteedPackageLevel.toString());
		}
	}

	public Integer getMonthlyPrice() {
		return this.monthlyPrice;
	}

	public void setMonthlyPrice(Integer monthlyPrice) {
		this.monthlyPrice = monthlyPrice;
		if(monthlyPrice != null){
			putQueryParameter("MonthlyPrice", monthlyPrice.toString());
		}
	}

	@Override
	public Class<CreateNumber400OrderResponse> getResponseClass() {
		return CreateNumber400OrderResponse.class;
	}

}
