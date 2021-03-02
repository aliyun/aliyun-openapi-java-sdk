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

/**
 * @author auto create
 * @version 
 */
public class UpdateDnsGtmAddressPoolRequest extends RpcAcsRequest<UpdateDnsGtmAddressPoolResponse> {
	   

	private String lbaStrategy;

	private String addrPoolId;

	private String name;

	private String lang;

	private List<Addr> addrs;
	public UpdateDnsGtmAddressPoolRequest() {
		super("Alidns", "2015-01-09", "UpdateDnsGtmAddressPool", "alidns");
		setMethod(MethodType.POST);
	}

	public String getLbaStrategy() {
		return this.lbaStrategy;
	}

	public void setLbaStrategy(String lbaStrategy) {
		this.lbaStrategy = lbaStrategy;
		if(lbaStrategy != null){
			putQueryParameter("LbaStrategy", lbaStrategy);
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
				putQueryParameter("Addr." + (depth1 + 1) + ".AttributeInfo" , addrs.get(depth1).getAttributeInfo());
				putQueryParameter("Addr." + (depth1 + 1) + ".Remark" , addrs.get(depth1).getRemark());
				putQueryParameter("Addr." + (depth1 + 1) + ".Addr" , addrs.get(depth1).getAddr());
				putQueryParameter("Addr." + (depth1 + 1) + ".LbaWeight" , addrs.get(depth1).getLbaWeight());
			}
		}	
	}

	public static class Addr {

		private String mode;

		private String attributeInfo;

		private String remark;

		private String addr;

		private Integer lbaWeight;

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getAttributeInfo() {
			return this.attributeInfo;
		}

		public void setAttributeInfo(String attributeInfo) {
			this.attributeInfo = attributeInfo;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getAddr() {
			return this.addr;
		}

		public void setAddr(String addr) {
			this.addr = addr;
		}

		public Integer getLbaWeight() {
			return this.lbaWeight;
		}

		public void setLbaWeight(Integer lbaWeight) {
			this.lbaWeight = lbaWeight;
		}
	}

	@Override
	public Class<UpdateDnsGtmAddressPoolResponse> getResponseClass() {
		return UpdateDnsGtmAddressPoolResponse.class;
	}

}
