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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryConfigHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryConfigHistoryResponse extends AcsResponse {

	private String requestId;

	private List<OpsCommitRecord> opsCommitRecords;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OpsCommitRecord> getOpsCommitRecords() {
		return this.opsCommitRecords;
	}

	public void setOpsCommitRecords(List<OpsCommitRecord> opsCommitRecords) {
		this.opsCommitRecords = opsCommitRecords;
	}

	public static class OpsCommitRecord {

		private String commitId;

		private String commitDate;

		private String uniqueKey;

		private String description;

		private String author;

		public String getCommitId() {
			return this.commitId;
		}

		public void setCommitId(String commitId) {
			this.commitId = commitId;
		}

		public String getCommitDate() {
			return this.commitDate;
		}

		public void setCommitDate(String commitDate) {
			this.commitDate = commitDate;
		}

		public String getUniqueKey() {
			return this.uniqueKey;
		}

		public void setUniqueKey(String uniqueKey) {
			this.uniqueKey = uniqueKey;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAuthor() {
			return this.author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
	}

	@Override
	public OpsQueryConfigHistoryResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryConfigHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
