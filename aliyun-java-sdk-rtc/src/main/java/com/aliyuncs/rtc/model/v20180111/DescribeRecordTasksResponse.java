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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRecordTasksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecordTasksResponse extends AcsResponse {

	private String requestId;

	private Long totalNum;

	private Long totalPage;

	private List<RecordTask> recordTasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getTotalNum() {
		return this.totalNum;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}

	public Long getTotalPage() {
		return this.totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public List<RecordTask> getRecordTasks() {
		return this.recordTasks;
	}

	public void setRecordTasks(List<RecordTask> recordTasks) {
		this.recordTasks = recordTasks;
	}

	public static class RecordTask {

		private String createTime;

		private String appId;

		private String channelId;

		private String taskId;

		private String templateId;

		private Integer status;

		private List<UserPanesItem> userPanes;

		private List<String> subSpecUsers;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public List<UserPanesItem> getUserPanes() {
			return this.userPanes;
		}

		public void setUserPanes(List<UserPanesItem> userPanes) {
			this.userPanes = userPanes;
		}

		public List<String> getSubSpecUsers() {
			return this.subSpecUsers;
		}

		public void setSubSpecUsers(List<String> subSpecUsers) {
			this.subSpecUsers = subSpecUsers;
		}

		public static class UserPanesItem {

			private Integer paneId;

			private String userId;

			private String source;

			public Integer getPaneId() {
				return this.paneId;
			}

			public void setPaneId(Integer paneId) {
				this.paneId = paneId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}
		}
	}

	@Override
	public DescribeRecordTasksResponse getInstance(UnmarshallerContext context) {
		return	DescribeRecordTasksResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
