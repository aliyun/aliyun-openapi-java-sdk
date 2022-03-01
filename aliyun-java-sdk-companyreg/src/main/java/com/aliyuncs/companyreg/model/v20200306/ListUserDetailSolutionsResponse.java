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

package com.aliyuncs.companyreg.model.v20200306;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20200306.ListUserDetailSolutionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserDetailSolutionsResponse extends AcsResponse {

	private Integer currentPageNum;

	private Integer totalPageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalItemNum;

	private List<Solution> data;

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public List<Solution> getData() {
		return this.data;
	}

	public void setData(List<Solution> data) {
		this.data = data;
	}

	public static class Solution {

		private Integer status;

		private Long updateTime;

		private String deliveryOrderBizId;

		private Long createTime;

		private String userId;

		private String bizId;

		private String partnerCode;

		private String extInfo;

		private String bizType;

		private String intentionBizId;

		private String reason;

		private String intentionAssignBizId;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(Long updateTime) {
			this.updateTime = updateTime;
		}

		public String getDeliveryOrderBizId() {
			return this.deliveryOrderBizId;
		}

		public void setDeliveryOrderBizId(String deliveryOrderBizId) {
			this.deliveryOrderBizId = deliveryOrderBizId;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
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

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		public String getIntentionAssignBizId() {
			return this.intentionAssignBizId;
		}

		public void setIntentionAssignBizId(String intentionAssignBizId) {
			this.intentionAssignBizId = intentionAssignBizId;
		}
	}

	@Override
	public ListUserDetailSolutionsResponse getInstance(UnmarshallerContext context) {
		return	ListUserDetailSolutionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
