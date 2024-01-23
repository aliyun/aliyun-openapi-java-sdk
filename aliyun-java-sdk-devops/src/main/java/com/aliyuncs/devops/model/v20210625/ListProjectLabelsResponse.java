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

package com.aliyuncs.devops.model.v20210625;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.devops.transform.v20210625.ListProjectLabelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectLabelsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private Long total;

	private List<Project_labels> result;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<Project_labels> getResult() {
		return this.result;
	}

	public void setResult(List<Project_labels> result) {
		this.result = result;
	}

	public static class Project_labels {

		private String id;

		private String name;

		private String color;

		private String description;

		private Long openMergeRequestsCount;

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

		public String getColor() {
			return this.color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Long getOpenMergeRequestsCount() {
			return this.openMergeRequestsCount;
		}

		public void setOpenMergeRequestsCount(Long openMergeRequestsCount) {
			this.openMergeRequestsCount = openMergeRequestsCount;
		}
	}

	@Override
	public ListProjectLabelsResponse getInstance(UnmarshallerContext context) {
		return	ListProjectLabelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
