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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeBusinessCardResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeBusinessCardResponse extends AcsResponse {

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

		private String name;

		private List<String> companies;

		private List<String> departments;

		private List<String> titles;

		private List<String> cellPhoneNumbers;

		private List<String> officePhoneNumbers;

		private List<String> addresses;

		private List<String> emails;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<String> getCompanies() {
			return this.companies;
		}

		public void setCompanies(List<String> companies) {
			this.companies = companies;
		}

		public List<String> getDepartments() {
			return this.departments;
		}

		public void setDepartments(List<String> departments) {
			this.departments = departments;
		}

		public List<String> getTitles() {
			return this.titles;
		}

		public void setTitles(List<String> titles) {
			this.titles = titles;
		}

		public List<String> getCellPhoneNumbers() {
			return this.cellPhoneNumbers;
		}

		public void setCellPhoneNumbers(List<String> cellPhoneNumbers) {
			this.cellPhoneNumbers = cellPhoneNumbers;
		}

		public List<String> getOfficePhoneNumbers() {
			return this.officePhoneNumbers;
		}

		public void setOfficePhoneNumbers(List<String> officePhoneNumbers) {
			this.officePhoneNumbers = officePhoneNumbers;
		}

		public List<String> getAddresses() {
			return this.addresses;
		}

		public void setAddresses(List<String> addresses) {
			this.addresses = addresses;
		}

		public List<String> getEmails() {
			return this.emails;
		}

		public void setEmails(List<String> emails) {
			this.emails = emails;
		}
	}

	@Override
	public RecognizeBusinessCardResponse getInstance(UnmarshallerContext context) {
		return	RecognizeBusinessCardResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
