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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListSnapshotsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListSnapshotsResponse extends AcsResponse {

	private String requestId;

	private MediaSnapshot mediaSnapshot;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MediaSnapshot getMediaSnapshot() {
		return this.mediaSnapshot;
	}

	public void setMediaSnapshot(MediaSnapshot mediaSnapshot) {
		this.mediaSnapshot = mediaSnapshot;
	}

	public static class MediaSnapshot {

		private Long total;

		private String regular;

		private String creationTime;

		private String jobId;

		private List<Snapshot> snapshots;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public String getRegular() {
			return this.regular;
		}

		public void setRegular(String regular) {
			this.regular = regular;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public List<Snapshot> getSnapshots() {
			return this.snapshots;
		}

		public void setSnapshots(List<Snapshot> snapshots) {
			this.snapshots = snapshots;
		}

		public static class Snapshot {

			private Long index;

			private String url;

			public Long getIndex() {
				return this.index;
			}

			public void setIndex(Long index) {
				this.index = index;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}
		}
	}

	@Override
	public ListSnapshotsResponse getInstance(UnmarshallerContext context) {
		return	ListSnapshotsResponseUnmarshaller.unmarshall(this, context);
	}
}
