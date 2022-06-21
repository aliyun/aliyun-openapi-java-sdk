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
import com.aliyuncs.live.transform.v20161101.DeleteSnapshotFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteSnapshotFilesResponse extends AcsResponse {

	private String requestId;

	private Integer successCount;

	private Integer failureCount;

	private List<SnapshotDeleteInfo> snapshotDeleteInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getSuccessCount() {
		return this.successCount;
	}

	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}

	public Integer getFailureCount() {
		return this.failureCount;
	}

	public void setFailureCount(Integer failureCount) {
		this.failureCount = failureCount;
	}

	public List<SnapshotDeleteInfo> getSnapshotDeleteInfoList() {
		return this.snapshotDeleteInfoList;
	}

	public void setSnapshotDeleteInfoList(List<SnapshotDeleteInfo> snapshotDeleteInfoList) {
		this.snapshotDeleteInfoList = snapshotDeleteInfoList;
	}

	public static class SnapshotDeleteInfo {

		private Long createTimestamp;

		private String message;

		public Long getCreateTimestamp() {
			return this.createTimestamp;
		}

		public void setCreateTimestamp(Long createTimestamp) {
			this.createTimestamp = createTimestamp;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public DeleteSnapshotFilesResponse getInstance(UnmarshallerContext context) {
		return	DeleteSnapshotFilesResponseUnmarshaller.unmarshall(this, context);
	}
}
