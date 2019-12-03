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

package com.aliyuncs.multimediaai.model.v20190810;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.multimediaai.transform.v20190810.ListFaceGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFaceGroupsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private List<FaceGroup> faceGroups;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
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

	public List<FaceGroup> getFaceGroups() {
		return this.faceGroups;
	}

	public void setFaceGroups(List<FaceGroup> faceGroups) {
		this.faceGroups = faceGroups;
	}

	public static class FaceGroup {

		private Long faceGroupId;

		private String faceGroupName;

		private String description;

		private Long personCount;

		private Long imageCount;

		private List<TemplatesItem> templates;

		public Long getFaceGroupId() {
			return this.faceGroupId;
		}

		public void setFaceGroupId(Long faceGroupId) {
			this.faceGroupId = faceGroupId;
		}

		public String getFaceGroupName() {
			return this.faceGroupName;
		}

		public void setFaceGroupName(String faceGroupName) {
			this.faceGroupName = faceGroupName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getPersonCount() {
			return this.personCount;
		}

		public void setPersonCount(Long personCount) {
			this.personCount = personCount;
		}

		public Long getImageCount() {
			return this.imageCount;
		}

		public void setImageCount(Long imageCount) {
			this.imageCount = imageCount;
		}

		public List<TemplatesItem> getTemplates() {
			return this.templates;
		}

		public void setTemplates(List<TemplatesItem> templates) {
			this.templates = templates;
		}

		public static class TemplatesItem {

			private String id;

			private String name;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public ListFaceGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListFaceGroupsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
