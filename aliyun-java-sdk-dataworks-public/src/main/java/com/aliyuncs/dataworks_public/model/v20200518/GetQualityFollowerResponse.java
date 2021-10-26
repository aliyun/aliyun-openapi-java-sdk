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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetQualityFollowerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityFollowerResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private String errorMessage;

	private Boolean success;

	private String errorCode;

	private List<Follower> data;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<Follower> getData() {
		return this.data;
	}

	public void setData(List<Follower> data) {
		this.data = data;
	}

	public static class Follower {

		private String followerAccountName;

		private String tableName;

		private Integer alarmMode;

		private String entityId;

		private String projectName;

		private Long id;

		private String follower;

		public String getFollowerAccountName() {
			return this.followerAccountName;
		}

		public void setFollowerAccountName(String followerAccountName) {
			this.followerAccountName = followerAccountName;
		}

		public String getTableName() {
			return this.tableName;
		}

		public void setTableName(String tableName) {
			this.tableName = tableName;
		}

		public Integer getAlarmMode() {
			return this.alarmMode;
		}

		public void setAlarmMode(Integer alarmMode) {
			this.alarmMode = alarmMode;
		}

		public String getEntityId() {
			return this.entityId;
		}

		public void setEntityId(String entityId) {
			this.entityId = entityId;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFollower() {
			return this.follower;
		}

		public void setFollower(String follower) {
			this.follower = follower;
		}
	}

	@Override
	public GetQualityFollowerResponse getInstance(UnmarshallerContext context) {
		return	GetQualityFollowerResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
