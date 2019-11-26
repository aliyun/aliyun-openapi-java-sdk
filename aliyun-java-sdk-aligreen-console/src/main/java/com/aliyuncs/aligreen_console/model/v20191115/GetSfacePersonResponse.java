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

package com.aliyuncs.aligreen_console.model.v20191115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aligreen_console.transform.v20191115.GetSfacePersonResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSfacePersonResponse extends AcsResponse {

	private String requestId;

	private Person person;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public static class Person {

		private String personId;

		private String personName;

		private String personGender;

		private String personType;

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public String getPersonName() {
			return this.personName;
		}

		public void setPersonName(String personName) {
			this.personName = personName;
		}

		public String getPersonGender() {
			return this.personGender;
		}

		public void setPersonGender(String personGender) {
			this.personGender = personGender;
		}

		public String getPersonType() {
			return this.personType;
		}

		public void setPersonType(String personType) {
			this.personType = personType;
		}
	}

	@Override
	public GetSfacePersonResponse getInstance(UnmarshallerContext context) {
		return	GetSfacePersonResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
