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

package com.aliyuncs.hbr.model.v20170908;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hbr.transform.v20170908.DescribeHanaMetadataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHanaMetadataResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<HanaMetadataItem> hanaMetadata;

	private NextStartKey nextStartKey;

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

	public List<HanaMetadataItem> getHanaMetadata() {
		return this.hanaMetadata;
	}

	public void setHanaMetadata(List<HanaMetadataItem> hanaMetadata) {
		this.hanaMetadata = hanaMetadata;
	}

	public NextStartKey getNextStartKey() {
		return this.nextStartKey;
	}

	public void setNextStartKey(NextStartKey nextStartKey) {
		this.nextStartKey = nextStartKey;
	}

	public static class HanaMetadataItem {

		private String clusterId;

		private String sid;

		private String tags;

		private String paths;

		private String snapshotId;

		private Long updatedTime;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getSid() {
			return this.sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getPaths() {
			return this.paths;
		}

		public void setPaths(String paths) {
			this.paths = paths;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public Long getUpdatedTime() {
			return this.updatedTime;
		}

		public void setUpdatedTime(Long updatedTime) {
			this.updatedTime = updatedTime;
		}
	}

	public static class NextStartKey {

		private String clusterId;

		private String sid;

		private String tags;

		private String paths;

		private String snapshotId;

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getSid() {
			return this.sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getPaths() {
			return this.paths;
		}

		public void setPaths(String paths) {
			this.paths = paths;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}
	}

	@Override
	public DescribeHanaMetadataResponse getInstance(UnmarshallerContext context) {
		return	DescribeHanaMetadataResponseUnmarshaller.unmarshall(this, context);
	}
}
