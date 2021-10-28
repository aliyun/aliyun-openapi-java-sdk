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

package com.aliyuncs.cloudauth.model.v20180916;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20180916.GetMaterialsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMaterialsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String name;

		private String identificationNumber;

		private String idCardType;

		private String idCardStartDate;

		private String idCardExpiry;

		private String address;

		private String sex;

		private String idCardFrontPic;

		private String idCardBackPic;

		private String facePic;

		private String ethnicGroup;

		private String authority;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIdentificationNumber() {
			return this.identificationNumber;
		}

		public void setIdentificationNumber(String identificationNumber) {
			this.identificationNumber = identificationNumber;
		}

		public String getIdCardType() {
			return this.idCardType;
		}

		public void setIdCardType(String idCardType) {
			this.idCardType = idCardType;
		}

		public String getIdCardStartDate() {
			return this.idCardStartDate;
		}

		public void setIdCardStartDate(String idCardStartDate) {
			this.idCardStartDate = idCardStartDate;
		}

		public String getIdCardExpiry() {
			return this.idCardExpiry;
		}

		public void setIdCardExpiry(String idCardExpiry) {
			this.idCardExpiry = idCardExpiry;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getSex() {
			return this.sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}

		public String getIdCardFrontPic() {
			return this.idCardFrontPic;
		}

		public void setIdCardFrontPic(String idCardFrontPic) {
			this.idCardFrontPic = idCardFrontPic;
		}

		public String getIdCardBackPic() {
			return this.idCardBackPic;
		}

		public void setIdCardBackPic(String idCardBackPic) {
			this.idCardBackPic = idCardBackPic;
		}

		public String getFacePic() {
			return this.facePic;
		}

		public void setFacePic(String facePic) {
			this.facePic = facePic;
		}

		public String getEthnicGroup() {
			return this.ethnicGroup;
		}

		public void setEthnicGroup(String ethnicGroup) {
			this.ethnicGroup = ethnicGroup;
		}

		public String getAuthority() {
			return this.authority;
		}

		public void setAuthority(String authority) {
			this.authority = authority;
		}
	}

	@Override
	public GetMaterialsResponse getInstance(UnmarshallerContext context) {
		return	GetMaterialsResponseUnmarshaller.unmarshall(this, context);
	}
}
