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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.QueryMcuJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMcuJobResponse extends AcsResponse {

	private String requestId;

	private List<Job> jobResult;

	private List<String> nonExistJobIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Job> getJobResult() {
		return this.jobResult;
	}

	public void setJobResult(List<Job> jobResult) {
		this.jobResult = jobResult;
	}

	public List<String> getNonExistJobIds() {
		return this.nonExistJobIds;
	}

	public void setNonExistJobIds(List<String> nonExistJobIds) {
		this.nonExistJobIds = nonExistJobIds;
	}

	public static class Job {

		private String jobId;

		private String template;

		private String userData;

		private String templateId;

		private List<Tag> tagResult;

		private List<Ocr> ocrResult;

		private List<SubTask> subTaskInfo;

		private List<Face> faceResult;

		private CategoryResult categoryResult;

		private Input input;

		private AsrResult asrResult;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public String getUserData() {
			return this.userData;
		}

		public void setUserData(String userData) {
			this.userData = userData;
		}

		public String getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(String templateId) {
			this.templateId = templateId;
		}

		public List<Tag> getTagResult() {
			return this.tagResult;
		}

		public void setTagResult(List<Tag> tagResult) {
			this.tagResult = tagResult;
		}

		public List<Ocr> getOcrResult() {
			return this.ocrResult;
		}

		public void setOcrResult(List<Ocr> ocrResult) {
			this.ocrResult = ocrResult;
		}

		public List<SubTask> getSubTaskInfo() {
			return this.subTaskInfo;
		}

		public void setSubTaskInfo(List<SubTask> subTaskInfo) {
			this.subTaskInfo = subTaskInfo;
		}

		public List<Face> getFaceResult() {
			return this.faceResult;
		}

		public void setFaceResult(List<Face> faceResult) {
			this.faceResult = faceResult;
		}

		public CategoryResult getCategoryResult() {
			return this.categoryResult;
		}

		public void setCategoryResult(CategoryResult categoryResult) {
			this.categoryResult = categoryResult;
		}

		public Input getInput() {
			return this.input;
		}

		public void setInput(Input input) {
			this.input = input;
		}

		public AsrResult getAsrResult() {
			return this.asrResult;
		}

		public void setAsrResult(AsrResult asrResult) {
			this.asrResult = asrResult;
		}

		public static class Tag {

			private String time;

			private String imageUrl;

			private String imageId;

			private List<FrameTagInfo> frameTagInfos;

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public List<FrameTagInfo> getFrameTagInfos() {
				return this.frameTagInfos;
			}

			public void setFrameTagInfos(List<FrameTagInfo> frameTagInfos) {
				this.frameTagInfos = frameTagInfos;
			}

			public static class FrameTagInfo {

				private String score;

				private String category;

				private String tag;

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getCategory() {
					return this.category;
				}

				public void setCategory(String category) {
					this.category = category;
				}

				public String getTag() {
					return this.tag;
				}

				public void setTag(String tag) {
					this.tag = tag;
				}
			}
		}

		public static class Ocr {

			private String time;

			private String imageUrl;

			private String ocrText;

			private String imageId;

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public String getOcrText() {
				return this.ocrText;
			}

			public void setOcrText(String ocrText) {
				this.ocrText = ocrText;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}
		}

		public static class SubTask {

			private String type;

			private String code;

			private String message;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
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
		}

		public static class Face {

			private String time;

			private String imageUrl;

			private String imageId;

			private List<Celebrity> celebrities;

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getImageUrl() {
				return this.imageUrl;
			}

			public void setImageUrl(String imageUrl) {
				this.imageUrl = imageUrl;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public List<Celebrity> getCelebrities() {
				return this.celebrities;
			}

			public void setCelebrities(List<Celebrity> celebrities) {
				this.celebrities = celebrities;
			}

			public static class Celebrity {

				private String score;

				private String name;

				private String target;

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getTarget() {
					return this.target;
				}

				public void setTarget(String target) {
					this.target = target;
				}
			}
		}

		public static class CategoryResult {

			private String details;

			private List<Category> categories;

			public String getDetails() {
				return this.details;
			}

			public void setDetails(String details) {
				this.details = details;
			}

			public List<Category> getCategories() {
				return this.categories;
			}

			public void setCategories(List<Category> categories) {
				this.categories = categories;
			}

			public static class Category {

				private String score;

				private String label;

				public String getScore() {
					return this.score;
				}

				public void setScore(String score) {
					this.score = score;
				}

				public String getLabel() {
					return this.label;
				}

				public void setLabel(String label) {
					this.label = label;
				}
			}
		}

		public static class Input {

			private String object;

			private String location;

			private String bucket;

			public String getObject() {
				return this.object;
			}

			public void setObject(String object) {
				this.object = object;
			}

			public String getLocation() {
				return this.location;
			}

			public void setLocation(String location) {
				this.location = location;
			}

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}
		}

		public static class AsrResult {

			private String duration;

			private List<AsrText> asrTextList;

			public String getDuration() {
				return this.duration;
			}

			public void setDuration(String duration) {
				this.duration = duration;
			}

			public List<AsrText> getAsrTextList() {
				return this.asrTextList;
			}

			public void setAsrTextList(List<AsrText> asrTextList) {
				this.asrTextList = asrTextList;
			}

			public static class AsrText {

				private String endTime;

				private Integer startTime;

				private String channelId;

				private String text;

				private String speechRate;

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}

				public Integer getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Integer startTime) {
					this.startTime = startTime;
				}

				public String getChannelId() {
					return this.channelId;
				}

				public void setChannelId(String channelId) {
					this.channelId = channelId;
				}

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public String getSpeechRate() {
					return this.speechRate;
				}

				public void setSpeechRate(String speechRate) {
					this.speechRate = speechRate;
				}
			}
		}
	}

	@Override
	public QueryMcuJobResponse getInstance(UnmarshallerContext context) {
		return	QueryMcuJobResponseUnmarshaller.unmarshall(this, context);
	}
}
