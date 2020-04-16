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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeDingTalkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDingTalkResponse extends AcsResponse {

	private String requestId;

	private List<ActionListArr> actionList;

	private PageInfo pageInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ActionListArr> getActionList() {
		return this.actionList;
	}

	public void setActionList(List<ActionListArr> actionList) {
		this.actionList = actionList;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ActionListArr {

		private Long gmtModified;

		private Integer id;

		private Long aliUid;

		private Long gmtCreate;

		private String url;

		private Integer intervalTime;

		private String actionName;

		private Integer status;

		private String configList;

		private String groupIdList;

		private String dingTalkLang;

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

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Integer getIntervalTime() {
			return this.intervalTime;
		}

		public void setIntervalTime(Integer intervalTime) {
			this.intervalTime = intervalTime;
		}

		public String getActionName() {
			return this.actionName;
		}

		public void setActionName(String actionName) {
			this.actionName = actionName;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getConfigList() {
			return this.configList;
		}

		public void setConfigList(String configList) {
			this.configList = configList;
		}

		public String getGroupIdList() {
			return this.groupIdList;
		}

		public void setGroupIdList(String groupIdList) {
			this.groupIdList = groupIdList;
		}

		public String getDingTalkLang() {
			return this.dingTalkLang;
		}

		public void setDingTalkLang(String dingTalkLang) {
			this.dingTalkLang = dingTalkLang;
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
