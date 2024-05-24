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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.ListMessageGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMessageGroupResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Boolean hasMore;

		private Integer total;

		private List<GroupListItem> groupList;

		public Boolean getHasMore() {
			return this.hasMore;
		}

		public void setHasMore(Boolean hasMore) {
			this.hasMore = hasMore;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public List<GroupListItem> getGroupList() {
			return this.groupList;
		}

		public void setGroupList(List<GroupListItem> groupList) {
			this.groupList = groupList;
		}

		public static class GroupListItem {

			private String appId;

			private Long createTime;

			private String creatorId;

			private Map<Object,Object> extension;

			private String groupId;

			private Integer status;

			public String getAppId() {
				return this.appId;
			}

			public void setAppId(String appId) {
				this.appId = appId;
			}

			public Long getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(Long createTime) {
				this.createTime = createTime;
			}

			public String getCreatorId() {
				return this.creatorId;
			}

			public void setCreatorId(String creatorId) {
				this.creatorId = creatorId;
			}

			public Map<Object,Object> getExtension() {
				return this.extension;
			}

			public void setExtension(Map<Object,Object> extension) {
				this.extension = extension;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}
		}
	}

	@Override
	public ListMessageGroupResponse getInstance(UnmarshallerContext context) {
		return	ListMessageGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
