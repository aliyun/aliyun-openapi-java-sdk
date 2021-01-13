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

package com.aliyuncs.cloudauth.model.v20190307;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.DescribeWhitelistResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWhitelistResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer currentPage;

	private Integer pageSize;

	private List<Item> items;

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

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static class Item {

		private Long id;

		private Long uid;

		private String bizType;

		private Long startDate;

		private Long endDate;

		private String idCardNum;

		private String bizId;

		private Integer valid;

		private Long gmtCreate;

		private Long gmtModified;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getUid() {
			return this.uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
		}

		public String getBizType() {
			return this.bizType;
		}

		public void setBizType(String bizType) {
			this.bizType = bizType;
		}

		public Long getStartDate() {
			return this.startDate;
		}

		public void setStartDate(Long startDate) {
			this.startDate = startDate;
		}

		public Long getEndDate() {
			return this.endDate;
		}

		public void setEndDate(Long endDate) {
			this.endDate = endDate;
		}

		public String getIdCardNum() {
			return this.idCardNum;
		}

		public void setIdCardNum(String idCardNum) {
			this.idCardNum = idCardNum;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public Integer getValid() {
			return this.valid;
		}

		public void setValid(Integer valid) {
			this.valid = valid;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public DescribeWhitelistResponse getInstance(UnmarshallerContext context) {
		return	DescribeWhitelistResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
