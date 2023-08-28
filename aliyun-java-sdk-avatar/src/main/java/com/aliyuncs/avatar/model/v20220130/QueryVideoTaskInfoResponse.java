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

package com.aliyuncs.avatar.model.v20220130;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.avatar.transform.v20220130.QueryVideoTaskInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryVideoTaskInfoResponse extends AcsResponse {

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

		private Integer pageNo;

		private Integer pageSize;

		private Long totalCount;

		private List<ListItem> list;

		public Integer getPageNo() {
			return this.pageNo;
		}

		public void setPageNo(Integer pageNo) {
			this.pageNo = pageNo;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String taskUuid;

			private String title;

			private Integer type;

			private Integer status;

			private TaskResult taskResult;

			public String getTaskUuid() {
				return this.taskUuid;
			}

			public void setTaskUuid(String taskUuid) {
				this.taskUuid = taskUuid;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public TaskResult getTaskResult() {
				return this.taskResult;
			}

			public void setTaskResult(TaskResult taskResult) {
				this.taskResult = taskResult;
			}

			public static class TaskResult {

				private String videoUrl;

				private String subtitlesUrl;

				private String wordSubtitlesUrl;

				private Integer videoDuration;

				private String failReason;

				private String failCode;

				private String alphaUrl;

				private String previewPic;

				public String getVideoUrl() {
					return this.videoUrl;
				}

				public void setVideoUrl(String videoUrl) {
					this.videoUrl = videoUrl;
				}

				public String getSubtitlesUrl() {
					return this.subtitlesUrl;
				}

				public void setSubtitlesUrl(String subtitlesUrl) {
					this.subtitlesUrl = subtitlesUrl;
				}

				public String getWordSubtitlesUrl() {
					return this.wordSubtitlesUrl;
				}

				public void setWordSubtitlesUrl(String wordSubtitlesUrl) {
					this.wordSubtitlesUrl = wordSubtitlesUrl;
				}

				public Integer getVideoDuration() {
					return this.videoDuration;
				}

				public void setVideoDuration(Integer videoDuration) {
					this.videoDuration = videoDuration;
				}

				public String getFailReason() {
					return this.failReason;
				}

				public void setFailReason(String failReason) {
					this.failReason = failReason;
				}

				public String getFailCode() {
					return this.failCode;
				}

				public void setFailCode(String failCode) {
					this.failCode = failCode;
				}

				public String getAlphaUrl() {
					return this.alphaUrl;
				}

				public void setAlphaUrl(String alphaUrl) {
					this.alphaUrl = alphaUrl;
				}

				public String getPreviewPic() {
					return this.previewPic;
				}

				public void setPreviewPic(String previewPic) {
					this.previewPic = previewPic;
				}
			}
		}
	}

	@Override
	public QueryVideoTaskInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryVideoTaskInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
