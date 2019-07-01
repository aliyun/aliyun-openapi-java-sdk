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

package com.aliyuncs.cspro.model.v20180315;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cspro.transform.v20180315.GetIpProfileResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetIpProfileResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String ip;

		private Info info;

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Info getInfo() {
			return this.info;
		}

		public void setInfo(Info info) {
			this.info = info;
		}

		public static class Info {

			private Integer isAbroad;

			private Integer isIdc;

			private Integer isProxy;

			private Integer isNat;

			private Integer isBase;

			private Integer isTor;

			private Integer isBindDomain1d;

			private Integer isBindDomain7d;

			private Integer isBindDomain30d;

			private Integer isNetAttack1d;

			private Integer isNetAttack7d;

			private Integer isNetAttack30d;

			private Integer isBotnet1d;

			private Integer isBotnet7d;

			private Integer isBotnet30d;

			private Integer isC21d;

			private Integer isC27d;

			private Integer isC230d;

			private Integer isBlackCampaign1d;

			private Integer isBlackCampaign7d;

			private Integer isBlackCampaign30d;

			private Integer isOpenCommonPort1d;

			private Integer isOpenCommonPort7d;

			private Integer isOpenCommonPort30d;

			private Integer isCheatflow1d;

			private Integer isCheatflow7d;

			private Integer isCheatflow30d;

			private Integer isHijack1d;

			private Integer isHijack7d;

			private Integer isHijack30d;

			private Integer isProxy1d;

			private Integer isProxy7d;

			private Integer isProxy30d;

			private String country;

			private String province;

			private String city;

			private String isp;

			private String asnId;

			public Integer getIsAbroad() {
				return this.isAbroad;
			}

			public void setIsAbroad(Integer isAbroad) {
				this.isAbroad = isAbroad;
			}

			public Integer getIsIdc() {
				return this.isIdc;
			}

			public void setIsIdc(Integer isIdc) {
				this.isIdc = isIdc;
			}

			public Integer getIsProxy() {
				return this.isProxy;
			}

			public void setIsProxy(Integer isProxy) {
				this.isProxy = isProxy;
			}

			public Integer getIsNat() {
				return this.isNat;
			}

			public void setIsNat(Integer isNat) {
				this.isNat = isNat;
			}

			public Integer getIsBase() {
				return this.isBase;
			}

			public void setIsBase(Integer isBase) {
				this.isBase = isBase;
			}

			public Integer getIsTor() {
				return this.isTor;
			}

			public void setIsTor(Integer isTor) {
				this.isTor = isTor;
			}

			public Integer getIsBindDomain1d() {
				return this.isBindDomain1d;
			}

			public void setIsBindDomain1d(Integer isBindDomain1d) {
				this.isBindDomain1d = isBindDomain1d;
			}

			public Integer getIsBindDomain7d() {
				return this.isBindDomain7d;
			}

			public void setIsBindDomain7d(Integer isBindDomain7d) {
				this.isBindDomain7d = isBindDomain7d;
			}

			public Integer getIsBindDomain30d() {
				return this.isBindDomain30d;
			}

			public void setIsBindDomain30d(Integer isBindDomain30d) {
				this.isBindDomain30d = isBindDomain30d;
			}

			public Integer getIsNetAttack1d() {
				return this.isNetAttack1d;
			}

			public void setIsNetAttack1d(Integer isNetAttack1d) {
				this.isNetAttack1d = isNetAttack1d;
			}

			public Integer getIsNetAttack7d() {
				return this.isNetAttack7d;
			}

			public void setIsNetAttack7d(Integer isNetAttack7d) {
				this.isNetAttack7d = isNetAttack7d;
			}

			public Integer getIsNetAttack30d() {
				return this.isNetAttack30d;
			}

			public void setIsNetAttack30d(Integer isNetAttack30d) {
				this.isNetAttack30d = isNetAttack30d;
			}

			public Integer getIsBotnet1d() {
				return this.isBotnet1d;
			}

			public void setIsBotnet1d(Integer isBotnet1d) {
				this.isBotnet1d = isBotnet1d;
			}

			public Integer getIsBotnet7d() {
				return this.isBotnet7d;
			}

			public void setIsBotnet7d(Integer isBotnet7d) {
				this.isBotnet7d = isBotnet7d;
			}

			public Integer getIsBotnet30d() {
				return this.isBotnet30d;
			}

			public void setIsBotnet30d(Integer isBotnet30d) {
				this.isBotnet30d = isBotnet30d;
			}

			public Integer getIsC21d() {
				return this.isC21d;
			}

			public void setIsC21d(Integer isC21d) {
				this.isC21d = isC21d;
			}

			public Integer getIsC27d() {
				return this.isC27d;
			}

			public void setIsC27d(Integer isC27d) {
				this.isC27d = isC27d;
			}

			public Integer getIsC230d() {
				return this.isC230d;
			}

			public void setIsC230d(Integer isC230d) {
				this.isC230d = isC230d;
			}

			public Integer getIsBlackCampaign1d() {
				return this.isBlackCampaign1d;
			}

			public void setIsBlackCampaign1d(Integer isBlackCampaign1d) {
				this.isBlackCampaign1d = isBlackCampaign1d;
			}

			public Integer getIsBlackCampaign7d() {
				return this.isBlackCampaign7d;
			}

			public void setIsBlackCampaign7d(Integer isBlackCampaign7d) {
				this.isBlackCampaign7d = isBlackCampaign7d;
			}

			public Integer getIsBlackCampaign30d() {
				return this.isBlackCampaign30d;
			}

			public void setIsBlackCampaign30d(Integer isBlackCampaign30d) {
				this.isBlackCampaign30d = isBlackCampaign30d;
			}

			public Integer getIsOpenCommonPort1d() {
				return this.isOpenCommonPort1d;
			}

			public void setIsOpenCommonPort1d(Integer isOpenCommonPort1d) {
				this.isOpenCommonPort1d = isOpenCommonPort1d;
			}

			public Integer getIsOpenCommonPort7d() {
				return this.isOpenCommonPort7d;
			}

			public void setIsOpenCommonPort7d(Integer isOpenCommonPort7d) {
				this.isOpenCommonPort7d = isOpenCommonPort7d;
			}

			public Integer getIsOpenCommonPort30d() {
				return this.isOpenCommonPort30d;
			}

			public void setIsOpenCommonPort30d(Integer isOpenCommonPort30d) {
				this.isOpenCommonPort30d = isOpenCommonPort30d;
			}

			public Integer getIsCheatflow1d() {
				return this.isCheatflow1d;
			}

			public void setIsCheatflow1d(Integer isCheatflow1d) {
				this.isCheatflow1d = isCheatflow1d;
			}

			public Integer getIsCheatflow7d() {
				return this.isCheatflow7d;
			}

			public void setIsCheatflow7d(Integer isCheatflow7d) {
				this.isCheatflow7d = isCheatflow7d;
			}

			public Integer getIsCheatflow30d() {
				return this.isCheatflow30d;
			}

			public void setIsCheatflow30d(Integer isCheatflow30d) {
				this.isCheatflow30d = isCheatflow30d;
			}

			public Integer getIsHijack1d() {
				return this.isHijack1d;
			}

			public void setIsHijack1d(Integer isHijack1d) {
				this.isHijack1d = isHijack1d;
			}

			public Integer getIsHijack7d() {
				return this.isHijack7d;
			}

			public void setIsHijack7d(Integer isHijack7d) {
				this.isHijack7d = isHijack7d;
			}

			public Integer getIsHijack30d() {
				return this.isHijack30d;
			}

			public void setIsHijack30d(Integer isHijack30d) {
				this.isHijack30d = isHijack30d;
			}

			public Integer getIsProxy1d() {
				return this.isProxy1d;
			}

			public void setIsProxy1d(Integer isProxy1d) {
				this.isProxy1d = isProxy1d;
			}

			public Integer getIsProxy7d() {
				return this.isProxy7d;
			}

			public void setIsProxy7d(Integer isProxy7d) {
				this.isProxy7d = isProxy7d;
			}

			public Integer getIsProxy30d() {
				return this.isProxy30d;
			}

			public void setIsProxy30d(Integer isProxy30d) {
				this.isProxy30d = isProxy30d;
			}

			public String getCountry() {
				return this.country;
			}

			public void setCountry(String country) {
				this.country = country;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getIsp() {
				return this.isp;
			}

			public void setIsp(String isp) {
				this.isp = isp;
			}

			public String getAsnId() {
				return this.asnId;
			}

			public void setAsnId(String asnId) {
				this.asnId = asnId;
			}
		}
	}

	@Override
	public GetIpProfileResponse getInstance(UnmarshallerContext context) {
		return	GetIpProfileResponseUnmarshaller.unmarshall(this, context);
	}
}
