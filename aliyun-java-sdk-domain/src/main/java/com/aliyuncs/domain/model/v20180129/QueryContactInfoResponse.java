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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20180129.QueryContactInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryContactInfoResponse extends AcsResponse {

	private String zhProvince;

	private String email;

	private String telephone;

	private String requestId;

	private String address;

	private String postalCode;

	private String zhRegistrantName;

	private String city;

	private String createDate;

	private String province;

	private String zhCity;

	private String registrantName;

	private String zhRegistrantOrganization;

	private String country;

	private String registrantOrganization;

	private String telExt;

	private String telArea;

	private String zhAddress;

	public String getZhProvince() {
		return this.zhProvince;
	}

	public void setZhProvince(String zhProvince) {
		this.zhProvince = zhProvince;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getZhRegistrantName() {
		return this.zhRegistrantName;
	}

	public void setZhRegistrantName(String zhRegistrantName) {
		this.zhRegistrantName = zhRegistrantName;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getZhCity() {
		return this.zhCity;
	}

	public void setZhCity(String zhCity) {
		this.zhCity = zhCity;
	}

	public String getRegistrantName() {
		return this.registrantName;
	}

	public void setRegistrantName(String registrantName) {
		this.registrantName = registrantName;
	}

	public String getZhRegistrantOrganization() {
		return this.zhRegistrantOrganization;
	}

	public void setZhRegistrantOrganization(String zhRegistrantOrganization) {
		this.zhRegistrantOrganization = zhRegistrantOrganization;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegistrantOrganization() {
		return this.registrantOrganization;
	}

	public void setRegistrantOrganization(String registrantOrganization) {
		this.registrantOrganization = registrantOrganization;
	}

	public String getTelExt() {
		return this.telExt;
	}

	public void setTelExt(String telExt) {
		this.telExt = telExt;
	}

	public String getTelArea() {
		return this.telArea;
	}

	public void setTelArea(String telArea) {
		this.telArea = telArea;
	}

	public String getZhAddress() {
		return this.zhAddress;
	}

	public void setZhAddress(String zhAddress) {
		this.zhAddress = zhAddress;
	}

	@Override
	public QueryContactInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryContactInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
