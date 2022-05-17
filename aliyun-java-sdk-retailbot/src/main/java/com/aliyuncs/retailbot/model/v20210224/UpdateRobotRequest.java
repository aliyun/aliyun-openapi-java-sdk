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

package com.aliyuncs.retailbot.model.v20210224;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateRobotRequest extends RpcAcsRequest<UpdateRobotResponse> {
	   

	@SerializedName("robotDTO")
	private RobotDTO robotDTO;

	@SerializedName("operator")
	private Operator operator;
	public UpdateRobotRequest() {
		super("RetailBot", "2021-02-24", "UpdateRobot");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public RobotDTO getRobotDTO() {
		return this.robotDTO;
	}

	public void setRobotDTO(RobotDTO robotDTO) {
		this.robotDTO = robotDTO;	
		if (robotDTO != null) {
			putBodyParameter("RobotDTO" , new Gson().toJson(robotDTO));
		}	
	}

	public Operator getOperator() {
		return this.operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;	
		if (operator != null) {
			putBodyParameter("Operator" , new Gson().toJson(operator));
		}	
	}

	public static class RobotDTO {

		@SerializedName("SellerId")
		private String sellerId;

		@SerializedName("SellerNick")
		private String sellerNick;

		@SerializedName("ShopId")
		private String shopId;

		@SerializedName("ExpireDate")
		private Long expireDate;

		@SerializedName("RobotCode")
		private String robotCode;

		@SerializedName("SignDate")
		private Long signDate;

		public String getSellerId() {
			return this.sellerId;
		}

		public void setSellerId(String sellerId) {
			this.sellerId = sellerId;
		}

		public String getSellerNick() {
			return this.sellerNick;
		}

		public void setSellerNick(String sellerNick) {
			this.sellerNick = sellerNick;
		}

		public String getShopId() {
			return this.shopId;
		}

		public void setShopId(String shopId) {
			this.shopId = shopId;
		}

		public Long getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(Long expireDate) {
			this.expireDate = expireDate;
		}

		public String getRobotCode() {
			return this.robotCode;
		}

		public void setRobotCode(String robotCode) {
			this.robotCode = robotCode;
		}

		public Long getSignDate() {
			return this.signDate;
		}

		public void setSignDate(Long signDate) {
			this.signDate = signDate;
		}
	}

	public static class Operator {

		@SerializedName("OperatorId")
		private String operatorId;

		@SerializedName("OperatorName")
		private String operatorName;

		public String getOperatorId() {
			return this.operatorId;
		}

		public void setOperatorId(String operatorId) {
			this.operatorId = operatorId;
		}

		public String getOperatorName() {
			return this.operatorName;
		}

		public void setOperatorName(String operatorName) {
			this.operatorName = operatorName;
		}
	}

	@Override
	public Class<UpdateRobotResponse> getResponseClass() {
		return UpdateRobotResponse.class;
	}

}
