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

package com.aliyuncs.educloud.model.v20220202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.educloud.transform.v20220202.DescribeCourseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCourseResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Long code;

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

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
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

		private String courseId;

		private String title;

		private String introduce;

		private String pictureUrl;

		private String category;

		private String tags;

		private Long lessonNum;

		private List<Lesson> lessons;

		private List<ChapterItem> chapter;

		public String getCourseId() {
			return this.courseId;
		}

		public void setCourseId(String courseId) {
			this.courseId = courseId;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getIntroduce() {
			return this.introduce;
		}

		public void setIntroduce(String introduce) {
			this.introduce = introduce;
		}

		public String getPictureUrl() {
			return this.pictureUrl;
		}

		public void setPictureUrl(String pictureUrl) {
			this.pictureUrl = pictureUrl;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getTags() {
			return this.tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public Long getLessonNum() {
			return this.lessonNum;
		}

		public void setLessonNum(Long lessonNum) {
			this.lessonNum = lessonNum;
		}

		public List<Lesson> getLessons() {
			return this.lessons;
		}

		public void setLessons(List<Lesson> lessons) {
			this.lessons = lessons;
		}

		public List<ChapterItem> getChapter() {
			return this.chapter;
		}

		public void setChapter(List<ChapterItem> chapter) {
			this.chapter = chapter;
		}

		public static class Lesson {

			private String lessonId;

			private String title;

			private String type;

			private Long duration;

			public String getLessonId() {
				return this.lessonId;
			}

			public void setLessonId(String lessonId) {
				this.lessonId = lessonId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}
		}

		public static class ChapterItem {

			private Long number;

			private String title;

			private List<Lesson2> lessons1;

			private List<UnitItem> unit;

			public Long getNumber() {
				return this.number;
			}

			public void setNumber(Long number) {
				this.number = number;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public List<Lesson2> getLessons1() {
				return this.lessons1;
			}

			public void setLessons1(List<Lesson2> lessons1) {
				this.lessons1 = lessons1;
			}

			public List<UnitItem> getUnit() {
				return this.unit;
			}

			public void setUnit(List<UnitItem> unit) {
				this.unit = unit;
			}

			public static class Lesson2 {

				private String lessonId;

				private String title;

				private String type;

				private Long duration;

				public String getLessonId() {
					return this.lessonId;
				}

				public void setLessonId(String lessonId) {
					this.lessonId = lessonId;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Long getDuration() {
					return this.duration;
				}

				public void setDuration(Long duration) {
					this.duration = duration;
				}
			}

			public static class UnitItem {

				private Long number;

				private String title;

				private List<Lesson4> lessons3;

				public Long getNumber() {
					return this.number;
				}

				public void setNumber(Long number) {
					this.number = number;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public List<Lesson4> getLessons3() {
					return this.lessons3;
				}

				public void setLessons3(List<Lesson4> lessons3) {
					this.lessons3 = lessons3;
				}

				public static class Lesson4 {

					private String lessonId;

					private String title;

					private String type;

					private Long duration;

					public String getLessonId() {
						return this.lessonId;
					}

					public void setLessonId(String lessonId) {
						this.lessonId = lessonId;
					}

					public String getTitle() {
						return this.title;
					}

					public void setTitle(String title) {
						this.title = title;
					}

					public String getType() {
						return this.type;
					}

					public void setType(String type) {
						this.type = type;
					}

					public Long getDuration() {
						return this.duration;
					}

					public void setDuration(Long duration) {
						this.duration = duration;
					}
				}
			}
		}
	}

	@Override
	public DescribeCourseResponse getInstance(UnmarshallerContext context) {
		return	DescribeCourseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
