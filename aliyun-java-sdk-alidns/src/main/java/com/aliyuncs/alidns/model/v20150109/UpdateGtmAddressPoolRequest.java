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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alidns.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateGtmAddressPoolRequest extends RpcAcsRequest<UpdateGtmAddressPoolResponse> {
	   

	private String type;

	private Integer minAvailableAddrNum;

	private String addrPoolId;

	private String name;

	private String lang;

	private List<Addr> addrs;
	public UpdateGtmAddressPoolRequest() {
		super("Alidns", "2015-01-09", "UpdateGtmAddressPool", "alidns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getMinAvailableAddrNum() {
		return this.minAvailableAddrNum;
	}

	public void setMinAvailableAddrNum(Integer minAvailableAddrNum) {
		this.minAvailableAddrNum = minAvailableAddrNum;
		if(minAvailableAddrNum != null){
			putQueryParameter("MinAvailableAddrNum", minAvailableAddrNum.toString());
		}
	}

	public String getAddrPoolId() {
		return this.addrPoolId;
	}

	public void setAddrPoolId(String addrPoolId) {
		this.addrPoolId = addrPoolId;
		if(addrPoolId != null){
			putQueryParameter("AddrPoolId", addrPoolId);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public List<Addr> getAddrs() {
		return this.addrs;
	}

	public void setAddrs(List<Addr> addrs) {
		this.addrs = addrs;	
		if (addrs != null) {
			for (int depth1 = 0; depth1 < addrs.size(); depth1++) {
				putQueryParameter("Addr." + (depth1 + 1) + ".Mode" , addrs.get(depth1).getMode());
				putQueryParameter("Addr." + (depth1 + 1) + ".LbaWeight" , addrs.get(depth1).getLbaWeight());
				putQueryParameter("Addr." + (depth1 + 1) + ".Value" , addrs.get(depth1).getValue());
			}
		}	
	}

	public static class Addr {

		private String mode;

		private Integer lbaWeight;

		private String value;

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public Integer getLbaWeight() {
			return this.lbaWeight;
		}

		public void setLbaWeight(Integer lbaWeight) {
			this.lbaWeight = lbaWeight;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<UpdateGtmAddressPoolResponse> getResponseClass() {
		return UpdateGtmAddressPoolResponse.class;
	}

}
