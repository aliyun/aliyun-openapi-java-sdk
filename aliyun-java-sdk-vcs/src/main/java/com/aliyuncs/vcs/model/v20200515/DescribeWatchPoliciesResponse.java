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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.DescribeWatchPoliciesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWatchPoliciesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

		private Long totalCount;

		private Long pageSize;

		private Long pageNumber;

		private List<Record> records;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Long pageNumber) {
			this.pageNumber = pageNumber;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public static class Record {

			private String watchPolicyId;

			private String watchPolicyName;

			private String watchMode;

			private String targetType;

			private Double similarityThreshold;

			private String itemMatchType;

			public String getWatchPolicyId() {
				return this.watchPolicyId;
			}

			public void setWatchPolicyId(String watchPolicyId) {
				this.watchPolicyId = watchPolicyId;
			}

			public String getWatchPolicyName() {
				return this.watchPolicyName;
			}

			public void setWatchPolicyName(String watchPolicyName) {
				this.watchPolicyName = watchPolicyName;
			}

			public String getWatchMode() {
				return this.watchMode;
			}

			public void setWatchMode(String watchMode) {
				this.watchMode = watchMode;
			}

			public String getTargetType() {
				return this.targetType;
			}

			public void setTargetType(String targetType) {
				this.targetType = targetType;
			}

			public Double getSimilarityThreshold() {
				return this.similarityThreshold;
			}

			public void setSimilarityThreshold(Double similarityThreshold) {
				this.similarityThreshold = similarityThreshold;
			}

			public String getItemMatchType() {
				return this.itemMatchType;
			}

			public void setItemMatchType(String itemMatchType) {
				this.itemMatchType = itemMatchType;
			}
		}
	}

	@Override
	public DescribeWatchPoliciesResponse getInstance(UnmarshallerContext context) {
		return	DescribeWatchPoliciesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
