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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mhub.transform.v20170825.QueryPackHistoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPackHistoriesResponse extends AcsResponse {

	private String requestId;

	private List<PackInfo> packInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PackInfo> getPackInfos() {
		return this.packInfos;
	}

	public void setPackInfos(List<PackInfo> packInfos) {
		this.packInfos = packInfos;
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
	public QueryPackHistoriesResponse getInstance(UnmarshallerContext context) {
		return	QueryPackHistoriesResponseUnmarshaller.unmarshall(this, context);
	}
}
