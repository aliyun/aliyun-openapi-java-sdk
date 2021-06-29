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
import com.aliyuncs.vcs.transform.v20200515.GetProfileDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProfileDetailResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer catalogId;

		private Integer profileId;

		private String isvSubId;

		private String gender;

		private String bizId;

		private String idNumber;

		private String sceneType;

		private String phoneNo;

		private String faceUrl;

		private String liveAddress;

		private String name;

		private String personId;

		private String plateNo;

		public Integer getCatalogId() {
			return this.catalogId;
		}

		public void setCatalogId(Integer catalogId) {
			this.catalogId = catalogId;
		}

		public Integer getProfileId() {
			return this.profileId;
		}

		public void setProfileId(Integer profileId) {
			this.profileId = profileId;
		}

		public String getIsvSubId() {
			return this.isvSubId;
		}

		public void setIsvSubId(String isvSubId) {
			this.isvSubId = isvSubId;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getIdNumber() {
			return this.idNumber;
		}

		public void setIdNumber(String idNumber) {
			this.idNumber = idNumber;
		}

		public String getSceneType() {
			return this.sceneType;
		}

		public void setSceneType(String sceneType) {
			this.sceneType = sceneType;
		}

		public String getPhoneNo() {
			return this.phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getFaceUrl() {
			return this.faceUrl;
		}

		public void setFaceUrl(String faceUrl) {
			this.faceUrl = faceUrl;
		}

		public String getLiveAddress() {
			return this.liveAddress;
		}

		public void setLiveAddress(String liveAddress) {
			this.liveAddress = liveAddress;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPersonId() {
			return this.personId;
		}

		public void setPersonId(String personId) {
			this.personId = personId;
		}

		public String getPlateNo() {
			return this.plateNo;
		}

		public void setPlateNo(String plateNo) {
			this.plateNo = plateNo;
		}
	}

	@Override
	public GetProfileDetailResponse getInstance(UnmarshallerContext context) {
		return	GetProfileDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
