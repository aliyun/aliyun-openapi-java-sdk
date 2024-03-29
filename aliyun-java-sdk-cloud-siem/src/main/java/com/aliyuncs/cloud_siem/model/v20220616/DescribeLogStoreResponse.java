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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeLogStoreResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLogStoreResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String logStoreName;

		private Integer ttl;

		private Integer shardCount;

		private Boolean enableTracking;

		private Boolean autoSplit;

		private Integer maxSplitShard;

		private Boolean appendMeta;

		public String getLogStoreName() {
			return this.logStoreName;
		}

		public void setLogStoreName(String logStoreName) {
			this.logStoreName = logStoreName;
		}

		public Integer getTtl() {
			return this.ttl;
		}

		public void setTtl(Integer ttl) {
			this.ttl = ttl;
		}

		public Integer getShardCount() {
			return this.shardCount;
		}

		public void setShardCount(Integer shardCount) {
			this.shardCount = shardCount;
		}

		public Boolean getEnableTracking() {
			return this.enableTracking;
		}

		public void setEnableTracking(Boolean enableTracking) {
			this.enableTracking = enableTracking;
		}

		public Boolean getAutoSplit() {
			return this.autoSplit;
		}

		public void setAutoSplit(Boolean autoSplit) {
			this.autoSplit = autoSplit;
		}

		public Integer getMaxSplitShard() {
			return this.maxSplitShard;
		}

		public void setMaxSplitShard(Integer maxSplitShard) {
			this.maxSplitShard = maxSplitShard;
		}

		public Boolean getAppendMeta() {
			return this.appendMeta;
		}

		public void setAppendMeta(Boolean appendMeta) {
			this.appendMeta = appendMeta;
		}
	}

	@Override
	public DescribeLogStoreResponse getInstance(UnmarshallerContext context) {
		return	DescribeLogStoreResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
