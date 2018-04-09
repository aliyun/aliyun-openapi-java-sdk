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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.QueryUserByIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryUserByIdResponse extends AcsResponse {

	private String requestId;

	private User user;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static class User {

		private String id;

		private String aliyunId;

		private String aliyunOmtId;

		private String userId;

		private String email;

		private String status;

		private String defaultSecGroup;

		private String regionId;

		private String channelId;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAliyunId() {
			return this.aliyunId;
		}

		public void setAliyunId(String aliyunId) {
			this.aliyunId = aliyunId;
		}

		public String getAliyunOmtId() {
			return this.aliyunOmtId;
		}

		public void setAliyunOmtId(String aliyunOmtId) {
			this.aliyunOmtId = aliyunOmtId;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDefaultSecGroup() {
			return this.defaultSecGroup;
		}

		public void setDefaultSecGroup(String defaultSecGroup) {
			this.defaultSecGroup = defaultSecGroup;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}
	}

	@Override
	public QueryUserByIdResponse getInstance(UnmarshallerContext context) {
		return	QueryUserByIdResponseUnmarshaller.unmarshall(this, context);
	}
}
