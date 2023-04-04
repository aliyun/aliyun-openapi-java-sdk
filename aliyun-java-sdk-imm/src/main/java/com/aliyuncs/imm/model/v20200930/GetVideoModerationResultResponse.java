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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.GetVideoModerationResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVideoModerationResultResponse extends AcsResponse {

	private String requestId;

	private String projectName;

	private String eventId;

	private String status;

	private String code;

	private String message;

	private String startTime;

	private String endTime;

	private String userData;

	private String taskType;

	private String taskId;

	private ModerationResult moderationResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}

	public String getTaskType() {
		return this.taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public ModerationResult getModerationResult() {
		return this.moderationResult;
	}

	public void setModerationResult(ModerationResult moderationResult) {
		this.moderationResult = moderationResult;
	}

	public static class ModerationResult {

		private String uRI;

		private String suggestion;

		private List<String> categories;

		private Frames frames;

		public String getURI() {
			return this.uRI;
		}

		public void setURI(String uRI) {
			this.uRI = uRI;
		}

		public String getSuggestion() {
			return this.suggestion;
		}

		public void setSuggestion(String suggestion) {
			this.suggestion = suggestion;
		}

		public List<String> getCategories() {
			return this.categories;
		}

		public void setCategories(List<String> categories) {
			this.categories = categories;
		}

		public Frames getFrames() {
			return this.frames;
		}

		public void setFrames(Frames frames) {
			this.frames = frames;
		}

		public static class Frames {

			private Integer totalCount;

			private List<BlockFramesItem> blockFrames;

			public Integer getTotalCount() {
				return this.totalCount;
			}

			public void setTotalCount(Integer totalCount) {
				this.totalCount = totalCount;
			}

			public List<BlockFramesItem> getBlockFrames() {
				return this.blockFrames;
			}

			public void setBlockFrames(List<BlockFramesItem> blockFrames) {
				this.blockFrames = blockFrames;
			}

			public static class BlockFramesItem {

				private Double rate;

				private Integer offset;

				private String label;

				public Double getRate() {
					return this.rate;
				}

				public void setRate(Double rate) {
					this.rate = rate;
				}

				public Integer getOffset() {
					return this.offset;
				}

				public void setOffset(Integer offset) {
					this.offset = offset;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}
			}
		}
	}

	@Override
	public GetVideoModerationResultResponse getInstance(UnmarshallerContext context) {
		return	GetVideoModerationResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
