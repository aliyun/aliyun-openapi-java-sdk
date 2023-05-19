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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MemberPointAddRequest extends RpcAcsRequest<MemberPointAddResponse> {
	   

	@SerializedName("body")
	private Body body;
	public MemberPointAddRequest() {
		super("retailadvqa", "2023-04-17", "MemberPointAdd");
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

		@SerializedName("OpenMerchantId")
		private String openMerchantId;

		@SerializedName("Quantity")
		private Long quantity;

		@SerializedName("DimensionId")
		private String dimensionId;

		@SerializedName("QuantityType")
		private String quantityType;

		@SerializedName("Extra")
		private String extra;

		@SerializedName("OuterMemberId")
		private String outerMemberId;

		@SerializedName("Scene")
		private String scene;

		@SerializedName("SerialNo")
		private String serialNo;

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public Long getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Long quantity) {
			this.quantity = quantity;
		}

		public String getDimensionId() {
			return this.dimensionId;
		}

		public void setDimensionId(String dimensionId) {
			this.dimensionId = dimensionId;
		}

		public String getQuantityType() {
			return this.quantityType;
		}

		public void setQuantityType(String quantityType) {
			this.quantityType = quantityType;
		}

		public String getExtra() {
			return this.extra;
		}

		public void setExtra(String extra) {
			this.extra = extra;
		}

		public String getOuterMemberId() {
			return this.outerMemberId;
		}

		public void setOuterMemberId(String outerMemberId) {
			this.outerMemberId = outerMemberId;
		}

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
		}

		public String getSerialNo() {
			return this.serialNo;
		}

		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}
	}

	@Override
	public Class<MemberPointAddResponse> getResponseClass() {
		return MemberPointAddResponse.class;
	}

}
