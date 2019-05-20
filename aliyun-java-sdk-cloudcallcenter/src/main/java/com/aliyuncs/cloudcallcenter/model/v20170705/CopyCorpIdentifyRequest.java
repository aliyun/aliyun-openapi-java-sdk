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
public class CopyCorpIdentifyRequest extends RpcAcsRequest<CopyCorpIdentifyResponse> {
	
	public CopyCorpIdentifyRequest() {
		super("CloudCallCenter", "2017-07-05", "CopyCorpIdentify", "CloudCallCenter", "innerAPI");
	}

	private String orderId;

	private String regionNameProvince;

	private String realNameInsId;

	private String offsiteCertPic;

	private String regionNameCity;

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId);
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

	public String getRealNameInsId() {
		return this.realNameInsId;
	}

	public void setRealNameInsId(String realNameInsId) {
		this.realNameInsId = realNameInsId;
		if(realNameInsId != null){
			putQueryParameter("RealNameInsId", realNameInsId);
		}
	}

	public String getOffsiteCertPic() {
		return this.offsiteCertPic;
	}

	public void setOffsiteCertPic(String offsiteCertPic) {
		this.offsiteCertPic = offsiteCertPic;
		if(offsiteCertPic != null){
			putQueryParameter("OffsiteCertPic", offsiteCertPic);
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

	@Override
	public Class<CopyCorpIdentifyResponse> getResponseClass() {
		return CopyCorpIdentifyResponse.class;
	}

}
