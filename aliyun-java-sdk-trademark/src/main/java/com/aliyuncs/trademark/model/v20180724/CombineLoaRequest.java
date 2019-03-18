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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CombineLoaRequest extends RpcAcsRequest<CombineLoaResponse> {
	
	public CombineLoaRequest() {
		super("Trademark", "2018-07-24", "CombineLoa", "trademark");
	}

	private String trademarkName;

	private String materialName;

	private String address;

	private String nationality;

	private String tmProduceType;

	private String materialId;

	public String getTrademarkName() {
		return this.trademarkName;
	}

	public void setTrademarkName(String trademarkName) {
		this.trademarkName = trademarkName;
		if(trademarkName != null){
			putQueryParameter("TrademarkName", trademarkName);
		}
	}

	public String getMaterialName() {
		return this.materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
		if(materialName != null){
			putQueryParameter("MaterialName", materialName);
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

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
		if(nationality != null){
			putQueryParameter("Nationality", nationality);
		}
	}

	public String getTmProduceType() {
		return this.tmProduceType;
	}

	public void setTmProduceType(String tmProduceType) {
		this.tmProduceType = tmProduceType;
		if(tmProduceType != null){
			putQueryParameter("TmProduceType", tmProduceType);
		}
	}

	public String getMaterialId() {
		return this.materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
		if(materialId != null){
			putQueryParameter("MaterialId", materialId);
		}
	}

	@Override
	public Class<CombineLoaResponse> getResponseClass() {
		return CombineLoaResponse.class;
	}

}
