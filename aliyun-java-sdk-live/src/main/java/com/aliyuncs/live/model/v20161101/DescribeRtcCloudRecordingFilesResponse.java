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
import com.aliyuncs.live.transform.v20161101.DescribeRtcCloudRecordingFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcCloudRecordingFilesResponse extends AcsResponse {

	private String requestId;

	private TaskInfo taskInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TaskInfo getTaskInfo() {
		return this.taskInfo;
	}

	public void setTaskInfo(TaskInfo taskInfo) {
		this.taskInfo = taskInfo;
	}

	public static class TaskInfo {

		private String taskId;

		private String status;

		private RecordFileList recordFileList;

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public RecordFileList getRecordFileList() {
			return this.recordFileList;
		}

		public void setRecordFileList(RecordFileList recordFileList) {
			this.recordFileList = recordFileList;
		}

		public static class RecordFileList {

			private List<MediaInfo> vodMediaList;

			private List<String> mp3FileList;

			private List<String> mp4FileList;

			private List<String> hlsFileList;

			public List<MediaInfo> getVodMediaList() {
				return this.vodMediaList;
			}

			public void setVodMediaList(List<MediaInfo> vodMediaList) {
				this.vodMediaList = vodMediaList;
			}

			public List<String> getMp3FileList() {
				return this.mp3FileList;
			}

			public void setMp3FileList(List<String> mp3FileList) {
				this.mp3FileList = mp3FileList;
			}

			public List<String> getMp4FileList() {
				return this.mp4FileList;
			}

			public void setMp4FileList(List<String> mp4FileList) {
				this.mp4FileList = mp4FileList;
			}

			public List<String> getHlsFileList() {
				return this.hlsFileList;
			}

			public void setHlsFileList(List<String> hlsFileList) {
				this.hlsFileList = hlsFileList;
			}

			public static class MediaInfo {

				private String stream;

				private List<String> mediaIds;

				private List<String> mergedIds;

				public String getStream() {
					return this.stream;
				}

				public void setStream(String stream) {
					this.stream = stream;
				}

				public List<String> getMediaIds() {
					return this.mediaIds;
				}

				public void setMediaIds(List<String> mediaIds) {
					this.mediaIds = mediaIds;
				}

				public List<String> getMergedIds() {
					return this.mergedIds;
				}

				public void setMergedIds(List<String> mergedIds) {
					this.mergedIds = mergedIds;
				}
			}
		}
	}

	@Override
	public DescribeRtcCloudRecordingFilesResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcCloudRecordingFilesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
