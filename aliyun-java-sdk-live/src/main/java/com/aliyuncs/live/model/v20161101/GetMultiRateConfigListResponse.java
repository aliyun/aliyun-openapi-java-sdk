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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.GetMultiRateConfigListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMultiRateConfigListResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private List<Info> groupInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<Info> getGroupInfo() {
		return this.groupInfo;
	}

	public void setGroupInfo(List<Info> groupInfo) {
		this.groupInfo = groupInfo;
	}

	public static class Info {

		private String app;

		private String avFormat;

		private String groupId;

		private Integer count;

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getAvFormat() {
			return this.avFormat;
		}

		public void setAvFormat(String avFormat) {
			this.avFormat = avFormat;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public GetMultiRateConfigListResponse getInstance(UnmarshallerContext context) {
		return	GetMultiRateConfigListResponseUnmarshaller.unmarshall(this, context);
	}
}
