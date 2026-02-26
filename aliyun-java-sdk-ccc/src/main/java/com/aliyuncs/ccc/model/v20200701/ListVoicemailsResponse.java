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

package com.aliyuncs.ccc.model.v20200701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20200701.ListVoicemailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVoicemailsResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<CdrVoicemail> list;

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

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<CdrVoicemail> getList() {
			return this.list;
		}

		public void setList(List<CdrVoicemail> list) {
			this.list = list;
		}

		public static class CdrVoicemail {

			private Long cdrStartTime;

			private String caller;

			private String contactId;

			private Long recordingDuration;

			private String instanceId;

			private String name;

			private String callee;

			private String startTime;

			private Long duration;

			public Long getCdrStartTime() {
				return this.cdrStartTime;
			}

			public void setCdrStartTime(Long cdrStartTime) {
				this.cdrStartTime = cdrStartTime;
			}

			public String getCaller() {
				return this.caller;
			}

			public void setCaller(String caller) {
				this.caller = caller;
			}

			public String getContactId() {
				return this.contactId;
			}

			public void setContactId(String contactId) {
				this.contactId = contactId;
			}

			public Long getRecordingDuration() {
				return this.recordingDuration;
			}

			public void setRecordingDuration(Long recordingDuration) {
				this.recordingDuration = recordingDuration;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCallee() {
				return this.callee;
			}

			public void setCallee(String callee) {
				this.callee = callee;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}
		}
	}

	@Override
	public ListVoicemailsResponse getInstance(UnmarshallerContext context) {
		return	ListVoicemailsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
