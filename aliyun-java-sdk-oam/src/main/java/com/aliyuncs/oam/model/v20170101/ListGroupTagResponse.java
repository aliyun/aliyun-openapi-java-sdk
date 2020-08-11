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

package com.aliyuncs.oam.model.v20170101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oam.transform.v20170101.ListGroupTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGroupTagResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private List<OamMutexGroupTagResult> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OamMutexGroupTagResult> getData() {
		return this.data;
	}

	public void setData(List<OamMutexGroupTagResult> data) {
		this.data = data;
	}

	public static class OamMutexGroupTagResult {

		private String groupTagId;

		private String description;

		private String name;

		private String gmtCreated;

		private String gmtModified;

		private String gmtExpired;

		private String userId;

		public String getGroupTagId() {
			return this.groupTagId;
		}

		public void setGroupTagId(String groupTagId) {
			this.groupTagId = groupTagId;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getGmtExpired() {
			return this.gmtExpired;
		}

		public void setGmtExpired(String gmtExpired) {
			this.gmtExpired = gmtExpired;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}
	}

	@Override
	public ListGroupTagResponse getInstance(UnmarshallerContext context) {
		return	ListGroupTagResponseUnmarshaller.unmarshall(this, context);
	}
}
