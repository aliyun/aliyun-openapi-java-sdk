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
import com.aliyuncs.cloudauth.transform.v20190307.DescribeWhitelistSettingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWhitelistSettingResponse extends AcsResponse {

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

		private Long sceneId;

		private String validStartDate;

		private String validEndDate;

		private String certNo;

		private String certifyId;

		private String status;

		private String gmtCreate;

		private String gmtModified;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getSceneId() {
			return this.sceneId;
		}

		public void setSceneId(Long sceneId) {
			this.sceneId = sceneId;
		}

		public String getValidStartDate() {
			return this.validStartDate;
		}

		public void setValidStartDate(String validStartDate) {
			this.validStartDate = validStartDate;
		}

		public String getValidEndDate() {
			return this.validEndDate;
		}

		public void setValidEndDate(String validEndDate) {
			this.validEndDate = validEndDate;
		}

		public String getCertNo() {
			return this.certNo;
		}

		public void setCertNo(String certNo) {
			this.certNo = certNo;
		}

		public String getCertifyId() {
			return this.certifyId;
		}

		public void setCertifyId(String certifyId) {
			this.certifyId = certifyId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public DescribeWhitelistSettingResponse getInstance(UnmarshallerContext context) {
		return	DescribeWhitelistSettingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
