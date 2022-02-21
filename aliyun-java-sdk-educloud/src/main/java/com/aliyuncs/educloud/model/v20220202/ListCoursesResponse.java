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
import com.aliyuncs.educloud.transform.v20220202.ListCoursesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCoursesResponse extends AcsResponse {

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

		private Long page;

		private Long pageSize;

		private Long total;

		private List<Course> list;

		public Long getPage() {
			return this.page;
		}

		public void setPage(Long page) {
			this.page = page;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<Course> getList() {
			return this.list;
		}

		public void setList(List<Course> list) {
			this.list = list;
		}

		public static class Course {

			private String courseId;

			private String title;

			private String introduce;

			private String pictureUrl;

			private String category;

			private String tags;

			private Long lessonNum;

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
		}
	}

	@Override
	public ListCoursesResponse getInstance(UnmarshallerContext context) {
		return	ListCoursesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
