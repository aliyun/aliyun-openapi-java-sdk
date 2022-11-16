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
public class VerifyOwnerInfoRequest extends RpcAcsRequest<VerifyOwnerInfoResponse> {
	   

	private String city;

	private String cardNum;

	private String province;

	private String ownerType;

	private String name;

	private String cardType;
	public VerifyOwnerInfoRequest() {
		super("Copyright", "2019-01-23", "VerifyOwnerInfo", "swcopyright");
		setMethod(MethodType.POST);
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

	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
		if(cardNum != null){
			putQueryParameter("CardNum", cardNum);
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

	public String getOwnerType() {
		return this.ownerType;
	}

	public void setOwnerType(String ownerType) {
		this.ownerType = ownerType;
		if(ownerType != null){
			putQueryParameter("OwnerType", ownerType);
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

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
		if(cardType != null){
			putQueryParameter("CardType", cardType);
		}
	}

	@Override
	public Class<VerifyOwnerInfoResponse> getResponseClass() {
		return VerifyOwnerInfoResponse.class;
	}

}
