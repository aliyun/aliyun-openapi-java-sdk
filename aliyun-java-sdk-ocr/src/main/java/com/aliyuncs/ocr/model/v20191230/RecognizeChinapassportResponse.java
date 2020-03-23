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

package com.aliyuncs.ocr.model.v20191230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeChinapassportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeChinapassportResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String authority;

		private String birthDate;

		private String birthDay;

		private String birthPlace;

		private String birthPlaceRaw;

		private String country;

		private String expiryDate;

		private String expiryDay;

		private String issueDate;

		private String issuePlace;

		private String issuePlaceRaw;

		private String lineZero;

		private String lineOne;

		private String name;

		private String nameChinese;

		private String nameChineseRaw;

		private String passportNo;

		private String personId;

		private String sex;

		private String sourceCountry;

		private Boolean success;

		private String type;

		public String getAuthority() {
			return this.authority;
		}

		public void setAuthority(String authority) {
			this.authority = authority;
		}

		public String getBirthDate() {
			return this.birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public String getBirthDay() {
			return this.birthDay;
		}

		public void setBirthDay(String birthDay) {
			this.birthDay = birthDay;
		}

		public String getBirthPlace() {
			return this.birthPlace;
		}

		public void setBirthPlace(String birthPlace) {
			this.birthPlace = birthPlace;
		}

		public String getBirthPlaceRaw() {
			return this.birthPlaceRaw;
		}

		public void setBirthPlaceRaw(String birthPlaceRaw) {
			this.birthPlaceRaw = birthPlaceRaw;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getExpiryDate() {
			return this.expiryDate;
		}

		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}

		public String getExpiryDay() {
			return this.expiryDay;
		}

		public void setExpiryDay(String expiryDay) {
			this.expiryDay = expiryDay;
		}

		public String getIssueDate() {
			return this.issueDate;
		}

		public void setIssueDate(String issueDate) {
			this.issueDate = issueDate;
		}

		public String getIssuePlace() {
			return this.issuePlace;
		}

		public void setIssuePlace(String issuePlace) {
			this.issuePlace = issuePlace;
		}

		public String getIssuePlaceRaw() {
			return this.issuePlaceRaw;
		}

		public void setIssuePlaceRaw(String issuePlaceRaw) {
			this.issuePlaceRaw = issuePlaceRaw;
		}

		public String getLineZero() {
			return this.lineZero;
		}

		public void setLineZero(String lineZero) {
			this.lineZero = lineZero;
		}

		public String getLineOne() {
			return this.lineOne;
		}

		public void setLineOne(String lineOne) {
			this.lineOne = lineOne;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNameChinese() {
			return this.nameChinese;
		}

		public void setNameChinese(String nameChinese) {
			this.nameChinese = nameChinese;
		}

		public String getNameChineseRaw() {
			return this.nameChineseRaw;
		}

		public void setNameChineseRaw(String nameChineseRaw) {
			this.nameChineseRaw = nameChineseRaw;
		}

		public String getPassportNo() {
			return this.passportNo;
		}

		public void setPassportNo(String passportNo) {
			this.passportNo = passportNo;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public String getSex() {
			return this.sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getSourceCountry() {
			return this.sourceCountry;
		}

		public void setSourceCountry(String sourceCountry) {
			this.sourceCountry = sourceCountry;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public RecognizeChinapassportResponse getInstance(UnmarshallerContext context) {
		return	RecognizeChinapassportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
