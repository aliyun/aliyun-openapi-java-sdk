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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeDingTalkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDingTalkResponse extends AcsResponse {

	private String requestId;

	private List<ActionListItem> actionList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ActionListItem> getActionList() {
		return this.actionList;
	}

	public void setActionList(List<ActionListItem> actionList) {
		this.actionList = actionList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ActionListItem {

		private Long gmtModified;

		private Integer id;

		private Long aliUid;

		private Long gmtCreate;

		private String url;

		private Integer intervalTime;

		private String actionName;

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getBizUrl() {
			return this.url;
		}

		public void setBizUrl(String url) {
			this.url = url;
		}

		/**
		 * @deprecated use getBizUrl instead of this.
		 */
		@Deprecated
		public String getUrl() {
			return this.url;
		}

		/**
		 * @deprecated use setBizUrl instead of this.
		 */
		@Deprecated
		public void setUrl(String url) {
			this.url = url;
		}

		public Integer getIntervalTime() {
			return this.intervalTime;
		}

		public void setIntervalTime(Integer intervalTime) {
			this.intervalTime = intervalTime;
		}

		public String getBizActionName() {
			return this.actionName;
		}

		public void setBizActionName(String actionName) {
			this.actionName = actionName;
		}

		/**
		 * @deprecated use getBizActionName instead of this.
		 */
		@Deprecated
		public String getActionName() {
			return this.actionName;
		}

		/**
		 * @deprecated use setBizActionName instead of this.
		 */
		@Deprecated
		public void setActionName(String actionName) {
			this.actionName = actionName;
		}
	}

	public static class PageInfo {

		private Integer pageSize;

		private Integer totalCount;

		private Integer currentPage;

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
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
	}

	@Override
	public DescribeDingTalkResponse getInstance(UnmarshallerContext context) {
		return	DescribeDingTalkResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
