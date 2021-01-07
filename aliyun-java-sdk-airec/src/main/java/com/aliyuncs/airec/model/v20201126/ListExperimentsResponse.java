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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ListExperimentsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExperimentsResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String experimentId;

		private String name;

		private String description;

		private String status;

		private Boolean base;

		private String onlineTime;

		private String offlineTime;

		private List<String> buckets;

		public String getExperimentId() {
			return this.experimentId;
		}

		public void setExperimentId(String experimentId) {
			this.experimentId = experimentId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getBase() {
			return this.base;
		}

		public void setBase(Boolean base) {
			this.base = base;
		}

		public String getOnlineTime() {
			return this.onlineTime;
		}

		public void setOnlineTime(String onlineTime) {
			this.onlineTime = onlineTime;
		}

		public String getOfflineTime() {
			return this.offlineTime;
		}

		public void setOfflineTime(String offlineTime) {
			this.offlineTime = offlineTime;
		}

		public List<String> getBuckets() {
			return this.buckets;
		}

		public void setBuckets(List<String> buckets) {
			this.buckets = buckets;
		}
	}

	@Override
	public ListExperimentsResponse getInstance(UnmarshallerContext context) {
		return	ListExperimentsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
