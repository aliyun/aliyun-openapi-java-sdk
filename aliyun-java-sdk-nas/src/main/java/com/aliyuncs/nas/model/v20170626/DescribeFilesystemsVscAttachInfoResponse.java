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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.DescribeFilesystemsVscAttachInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFilesystemsVscAttachInfoResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer totalCount;

	private Integer maxResults;

	private List<VscAttachInfoItem> vscAttachInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<VscAttachInfoItem> getVscAttachInfo() {
		return this.vscAttachInfo;
	}

	public void setVscAttachInfo(List<VscAttachInfoItem> vscAttachInfo) {
		this.vscAttachInfo = vscAttachInfo;
	}

	public static class VscAttachInfoItem {

		private String fileSystemId;

		private String vscId;

		private String status;

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getVscId() {
			return this.vscId;
		}

		public void setVscId(String vscId) {
			this.vscId = vscId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeFilesystemsVscAttachInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeFilesystemsVscAttachInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
