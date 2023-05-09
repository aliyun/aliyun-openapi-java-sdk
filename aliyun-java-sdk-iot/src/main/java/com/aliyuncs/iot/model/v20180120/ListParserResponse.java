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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.ListParserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListParserResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Integer total;

	private Boolean success;

	private List<ParserList> data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ParserList> getData() {
		return this.data;
	}

	public void setData(List<ParserList> data) {
		this.data = data;
	}

	public static class ParserList {

		private String status;

		private String description;

		private String utcModified;

		private String name;

		private String utcCreated;

		private Long parserId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(String utcModified) {
			this.utcModified = utcModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getUtcCreated() {
			return this.utcCreated;
		}

		public void setUtcCreated(String utcCreated) {
			this.utcCreated = utcCreated;
		}

		public Long getParserId() {
			return this.parserId;
		}

		public void setParserId(Long parserId) {
			this.parserId = parserId;
		}
	}

	@Override
	public ListParserResponse getInstance(UnmarshallerContext context) {
		return	ListParserResponseUnmarshaller.unmarshall(this, context);
	}
}
