/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.domain.model.v20160511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain.transform.v20160511.QueryOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderResponse extends AcsResponse {

	private String requestId;

	private String orderID;

	private String userID;

	private String money;

	private String orderDate;

	private Boolean checkFlag;

	private String checkDate;

	private Boolean validFlag;

	private Boolean checkType;

	private List<SubOrderResult> orderProducts;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOrderID() {
		return this.orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getMoney() {
		return this.money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public Boolean getCheckFlag() {
		return this.checkFlag;
	}

	public void setCheckFlag(Boolean checkFlag) {
		this.checkFlag = checkFlag;
	}

	public String getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(String checkDate) {
		this.checkDate = checkDate;
	}

	public Boolean getValidFlag() {
		return this.validFlag;
	}

	public void setValidFlag(Boolean validFlag) {
		this.validFlag = validFlag;
	}

	public Boolean getCheckType() {
		return this.checkType;
	}

	public void setCheckType(Boolean checkType) {
		this.checkType = checkType;
	}

	public List<SubOrderResult> getOrderProducts() {
		return this.orderProducts;
	}

	public void setOrderProducts(List<SubOrderResult> orderProducts) {
		this.orderProducts = orderProducts;
	}

	public static class SubOrderResult {

		private String trackID;

		private String orderID;

		private String saleID;

		private String userID;

		private String classID;

		private String productName;

		private String relatedName;

		private String actionType;

		private Integer periodUnit;

		private Integer periodNum;

		private Integer amount;

		private String orderDate;

		private Boolean checkFlag;

		private String checkDate;

		private Integer bizStatus;

		private String updateDate;

		private String deadDate;

		private Boolean validFlag;

		private String money;

		private String parentSaleID;

		public String getTrackID() {
			return this.trackID;
		}

		public void setTrackID(String trackID) {
			this.trackID = trackID;
		}

		public String getOrderID() {
			return this.orderID;
		}

		public void setOrderID(String orderID) {
			this.orderID = orderID;
		}

		public String getSaleID() {
			return this.saleID;
		}

		public void setSaleID(String saleID) {
			this.saleID = saleID;
		}

		public String getUserID() {
			return this.userID;
		}

		public void setUserID(String userID) {
			this.userID = userID;
		}

		public String getClassID() {
			return this.classID;
		}

		public void setClassID(String classID) {
			this.classID = classID;
		}

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getRelatedName() {
			return this.relatedName;
		}

		public void setRelatedName(String relatedName) {
			this.relatedName = relatedName;
		}

		public String getActionType() {
			return this.actionType;
		}

		public void setActionType(String actionType) {
			this.actionType = actionType;
		}

		public Integer getPeriodUnit() {
			return this.periodUnit;
		}

		public void setPeriodUnit(Integer periodUnit) {
			this.periodUnit = periodUnit;
		}

		public Integer getPeriodNum() {
			return this.periodNum;
		}

		public void setPeriodNum(Integer periodNum) {
			this.periodNum = periodNum;
		}

		public Integer getAmount() {
			return this.amount;
		}

		public void setAmount(Integer amount) {
			this.amount = amount;
		}

		public String getOrderDate() {
			return this.orderDate;
		}

		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}

		public Boolean getCheckFlag() {
			return this.checkFlag;
		}

		public void setCheckFlag(Boolean checkFlag) {
			this.checkFlag = checkFlag;
		}

		public String getCheckDate() {
			return this.checkDate;
		}

		public void setCheckDate(String checkDate) {
			this.checkDate = checkDate;
		}

		public Integer getBizStatus() {
			return this.bizStatus;
		}

		public void setBizStatus(Integer bizStatus) {
			this.bizStatus = bizStatus;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getDeadDate() {
			return this.deadDate;
		}

		public void setDeadDate(String deadDate) {
			this.deadDate = deadDate;
		}

		public Boolean getValidFlag() {
			return this.validFlag;
		}

		public void setValidFlag(Boolean validFlag) {
			this.validFlag = validFlag;
		}

		public String getMoney() {
			return this.money;
		}

		public void setMoney(String money) {
			this.money = money;
		}

		public String getParentSaleID() {
			return this.parentSaleID;
		}

		public void setParentSaleID(String parentSaleID) {
			this.parentSaleID = parentSaleID;
		}
	}

	@Override
	public QueryOrderResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderResponseUnmarshaller.unmarshall(this, context);
	}
}
