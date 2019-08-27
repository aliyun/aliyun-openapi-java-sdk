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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.SearchLogResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchLogResponse extends AcsResponse {

	private String requestId;

	private Boolean completed;

	private List<SlsLogItem> slsLogItemList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getCompleted() {
		return this.completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public List<SlsLogItem> getSlsLogItemList() {
		return this.slsLogItemList;
	}

	public void setSlsLogItemList(List<SlsLogItem> slsLogItemList) {
		this.slsLogItemList = slsLogItemList;
	}

	public static class SlsLogItem {

		private Integer timestamp;

		private String sourceIp;

		private String hostName;

		private String path;

		private String content;

		private String packMeta;

		private String packId;

		public Integer getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(Integer timestamp) {
			this.timestamp = timestamp;
		}

		public String getSourceIp() {
			return this.sourceIp;
		}

		public void setSourceIp(String sourceIp) {
			this.sourceIp = sourceIp;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getPackMeta() {
			return this.packMeta;
		}

		public void setPackMeta(String packMeta) {
			this.packMeta = packMeta;
		}

		public String getPackId() {
			return this.packId;
		}

		public void setPackId(String packId) {
			this.packId = packId;
		}
	}

	@Override
	public SearchLogResponse getInstance(UnmarshallerContext context) {
		return	SearchLogResponseUnmarshaller.unmarshall(this, context);
	}
}
