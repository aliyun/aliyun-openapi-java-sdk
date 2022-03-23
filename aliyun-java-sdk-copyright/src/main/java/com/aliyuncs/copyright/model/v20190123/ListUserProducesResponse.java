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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.ListUserProducesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserProducesResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private Boolean success;

	private Integer totalItemNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private List<Produces> data;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

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

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public List<Produces> getData() {
		return this.data;
	}

	public void setData(List<Produces> data) {
		this.data = data;
	}

	public static class Produces {

		private Integer status;

		private String orderPrice;

		private String solutionBizId;

		private String userId;

		private String bizId;

		private String orderTime;

		private String partnerCode;

		private String extInfo;

		private String bizType;

		private String intentionBizId;

		private String endTime;

		private String startTime;

		private String orderId;

		private String modifyTime;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getOrderPrice() {
			return this.orderPrice;
		}

		public void setOrderPrice(String orderPrice) {
			this.orderPrice = orderPrice;
		}

		public String getSolutionBizId() {
			return this.solutionBizId;
		}

		public void setSolutionBizId(String solutionBizId) {
			this.solutionBizId = solutionBizId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getOrderTime() {
			return this.orderTime;
		}

		public void setOrderTime(String orderTime) {
			this.orderTime = orderTime;
		}

		public String getPartnerCode() {
			return this.partnerCode;
		}

		public void setPartnerCode(String partnerCode) {
			this.partnerCode = partnerCode;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getIntentionBizId() {
			return this.intentionBizId;
		}

		public void setIntentionBizId(String intentionBizId) {
			this.intentionBizId = intentionBizId;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getOrderId() {
			return this.orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}
	}

	@Override
	public ListUserProducesResponse getInstance(UnmarshallerContext context) {
		return	ListUserProducesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
