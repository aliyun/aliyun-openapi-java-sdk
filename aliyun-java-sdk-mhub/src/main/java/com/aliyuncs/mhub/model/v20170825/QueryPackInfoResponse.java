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

package com.aliyuncs.mhub.model.v20170825;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mhub.transform.v20170825.QueryPackInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPackInfoResponse extends AcsResponse {

	private String requestId;

	private PackInfo packInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public PackInfo getPackInfo() {
		return this.packInfo;
	}

	public void setPackInfo(PackInfo packInfo) {
		this.packInfo = packInfo;
	}

	public static class PackInfo {

		private String oS;

		private Integer status;

		private String taskId;

		private String createTime;

		private String info;

		public String getOS() {
			return this.oS;
		}

		public void setOS(String oS) {
			this.oS = oS;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getInfo() {
			return this.info;
		}

		public void setInfo(String info) {
			this.info = info;
		}
	}

	@Override
	public QueryPackInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryPackInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
