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
public class QueryMemberBasicInfoRequest extends RpcAcsRequest<QueryMemberBasicInfoResponse> {
	   

	@SerializedName("body")
	private Body body;
	public QueryMemberBasicInfoRequest() {
		super("retailadvqa", "2023-04-17", "QueryMemberBasicInfo", "qucikmember");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putQueryParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("DimensionType")
		private String dimensionType;

		@SerializedName("OpenMerchantId")
		private String openMerchantId;

		@SerializedName("DimensionId")
		private String dimensionId;

		@SerializedName("OpenId")
		private String openId;

		@SerializedName("Mobile")
		private String mobile;

		@SerializedName("PlatFromType")
		private String platFromType;

		@SerializedName("Type")
		private String type;

		@SerializedName("ChannelCode")
		private String channelCode;

		@SerializedName("OuterMemberId")
		private String outerMemberId;

		public String getDimensionType() {
			return this.dimensionType;
		}

		public void setDimensionType(String dimensionType) {
			this.dimensionType = dimensionType;
		}

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public String getDimensionId() {
			return this.dimensionId;
		}

		public void setDimensionId(String dimensionId) {
			this.dimensionId = dimensionId;
		}

		public String getOpenId() {
			return this.openId;
		}

		public void setOpenId(String openId) {
			this.openId = openId;
		}

		public String getMobile() {
			return this.mobile;
		}

		public void setMobile(String mobile) {
			this.mobile = mobile;
		}

		public String getPlatFromType() {
			return this.platFromType;
		}

		public void setPlatFromType(String platFromType) {
			this.platFromType = platFromType;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getChannelCode() {
			return this.channelCode;
		}

		public void setChannelCode(String channelCode) {
			this.channelCode = channelCode;
		}

		public String getOuterMemberId() {
			return this.outerMemberId;
		}

		public void setOuterMemberId(String outerMemberId) {
			this.outerMemberId = outerMemberId;
		}
	}

	@Override
	public Class<QueryMemberBasicInfoResponse> getResponseClass() {
		return QueryMemberBasicInfoResponse.class;
	}

}
