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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.DescribeAiotPersonTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAiotPersonTablesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private List<PersonTableType> personTableList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<PersonTableType> getPersonTableList() {
		return this.personTableList;
	}

	public void setPersonTableList(List<PersonTableType> personTableList) {
		this.personTableList = personTableList;
	}

	public static class PersonTableType {

		private String personTableId;

		private String name;

		private Long type;

		private Long totalPersonNum;

		private Long personNum;

		private Long faceNum;

		private String lastChange;

		private String deviceId;

		private List<Long> verificationModelList;

		public String getPersonTableId() {
			return this.personTableId;
		}

		public void setPersonTableId(String personTableId) {
			this.personTableId = personTableId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getType() {
			return this.type;
		}

		public void setType(Long type) {
			this.type = type;
		}

		public Long getTotalPersonNum() {
			return this.totalPersonNum;
		}

		public void setTotalPersonNum(Long totalPersonNum) {
			this.totalPersonNum = totalPersonNum;
		}

		public Long getPersonNum() {
			return this.personNum;
		}

		public void setPersonNum(Long personNum) {
			this.personNum = personNum;
		}

		public Long getFaceNum() {
			return this.faceNum;
		}

		public void setFaceNum(Long faceNum) {
			this.faceNum = faceNum;
		}

		public String getLastChange() {
			return this.lastChange;
		}

		public void setLastChange(String lastChange) {
			this.lastChange = lastChange;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public List<Long> getVerificationModelList() {
			return this.verificationModelList;
		}

		public void setVerificationModelList(List<Long> verificationModelList) {
			this.verificationModelList = verificationModelList;
		}
	}

	@Override
	public DescribeAiotPersonTablesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAiotPersonTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
