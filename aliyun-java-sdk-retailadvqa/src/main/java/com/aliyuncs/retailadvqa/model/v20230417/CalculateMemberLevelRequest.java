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

package com.aliyuncs.retailadvqa.model.v20230417;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CalculateMemberLevelRequest extends RpcAcsRequest<CalculateMemberLevelResponse> {
	   

	@SerializedName("body")
	private Body body;
	public CalculateMemberLevelRequest() {
		super("retailadvqa", "2023-04-17", "CalculateMemberLevel", "qucikmember");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putQueryParameter("Body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("Score")
		private String score;

		@SerializedName("CurrentGrade")
		private Integer currentGrade;

		@SerializedName("OpenMerchantId")
		private String openMerchantId;

		@SerializedName("CurrentGradeName")
		private String currentGradeName;

		@SerializedName("PlatformType")
		private String platformType;

		@SerializedName("MemberId")
		private String memberId;

		@SerializedName("SerialNo")
		private String serialNo;

		public String getScore() {
			return this.score;
		}

		public void setScore(String score) {
			this.score = score;
		}

		public Integer getCurrentGrade() {
			return this.currentGrade;
		}

		public void setCurrentGrade(Integer currentGrade) {
			this.currentGrade = currentGrade;
		}

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public String getCurrentGradeName() {
			return this.currentGradeName;
		}

		public void setCurrentGradeName(String currentGradeName) {
			this.currentGradeName = currentGradeName;
		}

		public String getPlatformType() {
			return this.platformType;
		}

		public void setPlatformType(String platformType) {
			this.platformType = platformType;
		}

		public String getMemberId() {
			return this.memberId;
		}

		public void setMemberId(String memberId) {
			this.memberId = memberId;
		}

		public String getSerialNo() {
			return this.serialNo;
		}

		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}
	}

	@Override
	public Class<CalculateMemberLevelResponse> getResponseClass() {
		return CalculateMemberLevelResponse.class;
	}

}
