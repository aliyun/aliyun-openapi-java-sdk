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
import com.aliyuncs.devops.transform.v20210625.ListMergeRequestLabelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListMergeRequestLabelsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorCode;

	private String errorMessage;

	private List<Cr_labels> result;

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

	public List<Cr_labels> getResult() {
		return this.result;
	}

	public void setResult(List<Cr_labels> result) {
		this.result = result;
	}

	public static class Cr_labels {

		private String id;

		private String name;

		private String description;

		private String color;

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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getColor() {
			return this.color;
		}

		public void setColor(String color) {
			this.color = color;
		}
	}

	@Override
	public ListMergeRequestLabelsResponse getInstance(UnmarshallerContext context) {
		return	ListMergeRequestLabelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
