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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeUsageBillResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUsageBillResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer currentPage;

	private List<Bill> billList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<Bill> getBillList() {
		return this.billList;
	}

	public void setBillList(List<Bill> billList) {
		this.billList = billList;
	}

	public static class Bill {

		private String region;

		private String scene;

		private Long totalCount;

		private Long confirmCount;

		private Long reviewCount;

		private Long freeCount;

		private String subUid;

		private String bizType;

		private String day;

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getScene() {
			return this.scene;
		}

		public void setScene(String scene) {
			this.scene = scene;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getConfirmCount() {
			return this.confirmCount;
		}

		public void setConfirmCount(Long confirmCount) {
			this.confirmCount = confirmCount;
		}

		public Long getReviewCount() {
			return this.reviewCount;
		}

		public void setReviewCount(Long reviewCount) {
			this.reviewCount = reviewCount;
		}

		public Long getFreeCount() {
			return this.freeCount;
		}

		public void setFreeCount(Long freeCount) {
			this.freeCount = freeCount;
		}

		public String getSubUid() {
			return this.subUid;
		}

		public void setSubUid(String subUid) {
			this.subUid = subUid;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public String getDay() {
			return this.day;
		}

		public void setDay(String day) {
			this.day = day;
		}
	}

	@Override
	public DescribeUsageBillResponse getInstance(UnmarshallerContext context) {
		return	DescribeUsageBillResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
