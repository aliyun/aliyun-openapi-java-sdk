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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oam.transform.v20170101.GetOamUserByBucEmplIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOamUserByBucEmplIdResponse extends AcsResponse {

	private String code;

	private String message;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long uid;

		private String loginId;

		private String customUserId;

		private String gmtCreated;

		private String description;

		public Long getUid() {
			return this.uid;
		}

		public void setUid(Long uid) {
			this.uid = uid;
		}

		public String getLoginId() {
			return this.loginId;
		}

		public void setLoginId(String loginId) {
			this.loginId = loginId;
		}

		public String getCustomUserId() {
			return this.customUserId;
		}

		public void setCustomUserId(String customUserId) {
			this.customUserId = customUserId;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public GetOamUserByBucEmplIdResponse getInstance(UnmarshallerContext context) {
		return	GetOamUserByBucEmplIdResponseUnmarshaller.unmarshall(this, context);
	}
}
