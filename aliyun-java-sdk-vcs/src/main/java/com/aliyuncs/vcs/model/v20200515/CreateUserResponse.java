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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.CreateUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateUserResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

		private Integer userId;

		private String isvSubId;

		private String userName;

		private Integer userGroupId;

		private String idNumber;

		private String faceImageUrl;

		private String address;

		private String age;

		private String gender;

		private String plateNo;

		private String phoneNo;

		private String attachment;

		private String bizId;

		public Integer getUserId() {
			return this.userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public String getIsvSubId() {
			return this.isvSubId;
		}

		public void setIsvSubId(String isvSubId) {
			this.isvSubId = isvSubId;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public Integer getUserGroupId() {
			return this.userGroupId;
		}

		public void setUserGroupId(Integer userGroupId) {
			this.userGroupId = userGroupId;
		}

		public String getIdNumber() {
			return this.idNumber;
		}

		public void setIdNumber(String idNumber) {
			this.idNumber = idNumber;
		}

		public String getFaceImageUrl() {
			return this.faceImageUrl;
		}

		public void setFaceImageUrl(String faceImageUrl) {
			this.faceImageUrl = faceImageUrl;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getAge() {
			return this.age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPlateNo() {
			return this.plateNo;
		}

		public void setPlateNo(String plateNo) {
			this.plateNo = plateNo;
		}

		public String getPhoneNo() {
			return this.phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getAttachment() {
			return this.attachment;
		}

		public void setAttachment(String attachment) {
			this.attachment = attachment;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}
	}

	@Override
	public CreateUserResponse getInstance(UnmarshallerContext context) {
		return	CreateUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
