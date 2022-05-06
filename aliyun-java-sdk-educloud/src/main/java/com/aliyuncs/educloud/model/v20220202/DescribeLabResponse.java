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
import com.aliyuncs.educloud.transform.v20220202.DescribeLabResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLabResponse extends AcsResponse {

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

		private String labId;

		private String title;

		private String introduce;

		private String time;

		private String category;

		private String tag;

		private List<ChapterItem> chapter;

		public String getLabId() {
			return this.labId;
		}

		public void setLabId(String labId) {
			this.labId = labId;
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

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
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

		public List<ChapterItem> getChapter() {
			return this.chapter;
		}

		public void setChapter(List<ChapterItem> chapter) {
			this.chapter = chapter;
		}

		public static class ChapterItem {

			private Long orderNumber;

			private String title;

			private List<Section> sections;

			public Long getOrderNumber() {
				return this.orderNumber;
			}

			public void setOrderNumber(Long orderNumber) {
				this.orderNumber = orderNumber;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public List<Section> getSections() {
				return this.sections;
			}

			public void setSections(List<Section> sections) {
				this.sections = sections;
			}

			public static class Section {

				private String sectionId;

				private String title;

				private Long orderNumber;

				private String content;

				public String getSectionId() {
					return this.sectionId;
				}

				public void setSectionId(String sectionId) {
					this.sectionId = sectionId;
				}

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public Long getOrderNumber() {
					return this.orderNumber;
				}

				public void setOrderNumber(Long orderNumber) {
					this.orderNumber = orderNumber;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}
			}
		}
	}

	@Override
	public DescribeLabResponse getInstance(UnmarshallerContext context) {
		return	DescribeLabResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
