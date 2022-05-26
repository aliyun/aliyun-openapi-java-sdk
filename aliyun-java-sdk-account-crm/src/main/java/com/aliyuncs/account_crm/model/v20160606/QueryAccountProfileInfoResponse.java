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

package com.aliyuncs.account_crm.model.v20160606;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.account_crm.transform.v20160606.QueryAccountProfileInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAccountProfileInfoResponse extends AcsResponse {

	private String requestId;

	private ProfileInfo profileInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ProfileInfo getProfileInfo() {
		return this.profileInfo;
	}

	public void setProfileInfo(ProfileInfo profileInfo) {
		this.profileInfo = profileInfo;
	}

	public static class ProfileInfo {

		private String updateTime;

		private String registerIP;

		private String createTime;

		private String contactMethod;

		private String activeNotSetMobile;

		private String mobile;

		private String fax;

		private String bankId;

		private String firstName;

		private String securityMobile;

		private String taobaoAccount;

		private String yahooEmail;

		private String isCertified;

		private String alipayUid;

		private String alipayAccount;

		private String src;

		private String nickName;

		private String authDomainUserId;

		private String phone;

		private String certifiedFrom;

		private String beiAnMobile;

		private String nationalityCode;

		private String iDNumber;

		private String address2;

		private String trueName;

		private String address6;

		private String own;

		private String eid;

		private String address4;

		private String fyl;

		private String beiAnAuthCId;

		private String address;

		private String taobaoNickFromHavana;

		private String beiAnIcpNumber;

		private String aliyunPK;

		private String aliyunID;

		private String accountAttr;

		private String postCode;

		private Boolean processingEnterpriseCertify;

		private String bindAlipayNo;

		private String tbhid;

		private String b2bhid;

		private String isBankIDAuth;

		private String head;

		private String certifiedTime;

		private String email;

		private String authAlipay;

		private Boolean securityQuestionExists;

		private String havanaId;

		private String preferredLanguage;

		private String address3;

		private String address5;

		private String certType;

		private String accountCertifyType;

		private String bankName;

		private String lastName;

		private Province province;

		private City city;

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getRegisterIP() {
			return this.registerIP;
		}

		public void setRegisterIP(String registerIP) {
			this.registerIP = registerIP;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getContactMethod() {
			return this.contactMethod;
		}

		public void setContactMethod(String contactMethod) {
			this.contactMethod = contactMethod;
		}

		public String getActiveNotSetMobile() {
			return this.activeNotSetMobile;
		}

		public void setActiveNotSetMobile(String activeNotSetMobile) {
			this.activeNotSetMobile = activeNotSetMobile;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getFax() {
			return this.fax;
		}

		public void setFax(String fax) {
			this.fax = fax;
		}

		public String getBankId() {
			return this.bankId;
		}

		public void setBankId(String bankId) {
			this.bankId = bankId;
		}

		public String getFirstName() {
			return this.firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getSecurityMobile() {
			return this.securityMobile;
		}

		public void setSecurityMobile(String securityMobile) {
			this.securityMobile = securityMobile;
		}

		public String getTaobaoAccount() {
			return this.taobaoAccount;
		}

		public void setTaobaoAccount(String taobaoAccount) {
			this.taobaoAccount = taobaoAccount;
		}

		public String getYahooEmail() {
			return this.yahooEmail;
		}

		public void setYahooEmail(String yahooEmail) {
			this.yahooEmail = yahooEmail;
		}

		public String getIsCertified() {
			return this.isCertified;
		}

		public void setIsCertified(String isCertified) {
			this.isCertified = isCertified;
		}

		public String getAlipayUid() {
			return this.alipayUid;
		}

		public void setAlipayUid(String alipayUid) {
			this.alipayUid = alipayUid;
		}

		public String getAlipayAccount() {
			return this.alipayAccount;
		}

		public void setAlipayAccount(String alipayAccount) {
			this.alipayAccount = alipayAccount;
		}

		public String getSrc() {
			return this.src;
		}

		public void setSrc(String src) {
			this.src = src;
		}

		public String getNickName() {
			return this.nickName;
		}

		public void setNickName(String nickName) {
			this.nickName = nickName;
		}

		public String getAuthDomainUserId() {
			return this.authDomainUserId;
		}

		public void setAuthDomainUserId(String authDomainUserId) {
			this.authDomainUserId = authDomainUserId;
		}

		public String getPhone() {
			return this.phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getCertifiedFrom() {
			return this.certifiedFrom;
		}

		public void setCertifiedFrom(String certifiedFrom) {
			this.certifiedFrom = certifiedFrom;
		}

		public String getBeiAnMobile() {
			return this.beiAnMobile;
		}

		public void setBeiAnMobile(String beiAnMobile) {
			this.beiAnMobile = beiAnMobile;
		}

		public String getNationalityCode() {
			return this.nationalityCode;
		}

		public void setNationalityCode(String nationalityCode) {
			this.nationalityCode = nationalityCode;
		}

		public String getIDNumber() {
			return this.iDNumber;
		}

		public void setIDNumber(String iDNumber) {
			this.iDNumber = iDNumber;
		}

		public String getAddress2() {
			return this.address2;
		}

		public void setAddress2(String address2) {
			this.address2 = address2;
		}

		public String getTrueName() {
			return this.trueName;
		}

		public void setTrueName(String trueName) {
			this.trueName = trueName;
		}

		public String getAddress6() {
			return this.address6;
		}

		public void setAddress6(String address6) {
			this.address6 = address6;
		}

		public String getOwn() {
			return this.own;
		}

		public void setOwn(String own) {
			this.own = own;
		}

		public String getEid() {
			return this.eid;
		}

		public void setEid(String eid) {
			this.eid = eid;
		}

		public String getAddress4() {
			return this.address4;
		}

		public void setAddress4(String address4) {
			this.address4 = address4;
		}

		public String getFyl() {
			return this.fyl;
		}

		public void setFyl(String fyl) {
			this.fyl = fyl;
		}

		public String getBeiAnAuthCId() {
			return this.beiAnAuthCId;
		}

		public void setBeiAnAuthCId(String beiAnAuthCId) {
			this.beiAnAuthCId = beiAnAuthCId;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getTaobaoNickFromHavana() {
			return this.taobaoNickFromHavana;
		}

		public void setTaobaoNickFromHavana(String taobaoNickFromHavana) {
			this.taobaoNickFromHavana = taobaoNickFromHavana;
		}

		public String getBeiAnIcpNumber() {
			return this.beiAnIcpNumber;
		}

		public void setBeiAnIcpNumber(String beiAnIcpNumber) {
			this.beiAnIcpNumber = beiAnIcpNumber;
		}

		public String getAliyunPK() {
			return this.aliyunPK;
		}

		public void setAliyunPK(String aliyunPK) {
			this.aliyunPK = aliyunPK;
		}

		public String getAliyunID() {
			return this.aliyunID;
		}

		public void setAliyunID(String aliyunID) {
			this.aliyunID = aliyunID;
		}

		public String getAccountAttr() {
			return this.accountAttr;
		}

		public void setAccountAttr(String accountAttr) {
			this.accountAttr = accountAttr;
		}

		public String getPostCode() {
			return this.postCode;
		}

		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}

		public Boolean getProcessingEnterpriseCertify() {
			return this.processingEnterpriseCertify;
		}

		public void setProcessingEnterpriseCertify(Boolean processingEnterpriseCertify) {
			this.processingEnterpriseCertify = processingEnterpriseCertify;
		}

		public String getBindAlipayNo() {
			return this.bindAlipayNo;
		}

		public void setBindAlipayNo(String bindAlipayNo) {
			this.bindAlipayNo = bindAlipayNo;
		}

		public String getTbhid() {
			return this.tbhid;
		}

		public void setTbhid(String tbhid) {
			this.tbhid = tbhid;
		}

		public String getB2bhid() {
			return this.b2bhid;
		}

		public void setB2bhid(String b2bhid) {
			this.b2bhid = b2bhid;
		}

		public String getIsBankIDAuth() {
			return this.isBankIDAuth;
		}

		public void setIsBankIDAuth(String isBankIDAuth) {
			this.isBankIDAuth = isBankIDAuth;
		}

		public String getHead() {
			return this.head;
		}

		public void setHead(String head) {
			this.head = head;
		}

		public String getCertifiedTime() {
			return this.certifiedTime;
		}

		public void setCertifiedTime(String certifiedTime) {
			this.certifiedTime = certifiedTime;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getAuthAlipay() {
			return this.authAlipay;
		}

		public void setAuthAlipay(String authAlipay) {
			this.authAlipay = authAlipay;
		}

		public Boolean getSecurityQuestionExists() {
			return this.securityQuestionExists;
		}

		public void setSecurityQuestionExists(Boolean securityQuestionExists) {
			this.securityQuestionExists = securityQuestionExists;
		}

		public String getHavanaId() {
			return this.havanaId;
		}

		public void setHavanaId(String havanaId) {
			this.havanaId = havanaId;
		}

		public String getPreferredLanguage() {
			return this.preferredLanguage;
		}

		public void setPreferredLanguage(String preferredLanguage) {
			this.preferredLanguage = preferredLanguage;
		}

		public String getAddress3() {
			return this.address3;
		}

		public void setAddress3(String address3) {
			this.address3 = address3;
		}

		public String getAddress5() {
			return this.address5;
		}

		public void setAddress5(String address5) {
			this.address5 = address5;
		}

		public String getCertType() {
			return this.certType;
		}

		public void setCertType(String certType) {
			this.certType = certType;
		}

		public String getAccountCertifyType() {
			return this.accountCertifyType;
		}

		public void setAccountCertifyType(String accountCertifyType) {
			this.accountCertifyType = accountCertifyType;
		}

		public String getBankName() {
			return this.bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public String getLastName() {
			return this.lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Province getProvince() {
			return this.province;
		}

		public void setProvince(Province province) {
			this.province = province;
		}

		public City getCity() {
			return this.city;
		}

		public void setCity(City city) {
			this.city = city;
		}

		public static class Province {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}

		public static class City {

			private String name;

			private String id;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}
		}
	}

	@Override
	public QueryAccountProfileInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryAccountProfileInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
