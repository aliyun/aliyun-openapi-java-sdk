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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.ListScriptRecordingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScriptRecordingResponse extends AcsResponse {

	private Integer httpStatusCode;

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer pageSize;

	private Integer pageNumber;

	private Long totalCount;

	private List<ScriptRecording> scriptRecordings;

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ScriptRecording> getScriptRecordings() {
		return this.scriptRecordings;
	}

	public void setScriptRecordings(List<ScriptRecording> scriptRecordings) {
		this.scriptRecordings = scriptRecordings;
	}

	public static class ScriptRecording {

		private String recordingContent;

		private Integer state;

		private String storageUuid;

		private String stateExtend;

		private String instanceId;

		private Long gmtModified;

		private String scriptId;

		private String uuid;

		private Long gmtUpload;

		private Integer recordingDuration;

		private String recordingName;

		private Long gmtCreate;

		private String innerId;

		public String getRecordingContent() {
			return this.recordingContent;
		}

		public void setRecordingContent(String recordingContent) {
			this.recordingContent = recordingContent;
		}

		public Integer getState() {
			return this.state;
		}

		public void setState(Integer state) {
			this.state = state;
		}

		public String getStorageUuid() {
			return this.storageUuid;
		}

		public void setStorageUuid(String storageUuid) {
			this.storageUuid = storageUuid;
		}

		public String getStateExtend() {
			return this.stateExtend;
		}

		public void setStateExtend(String stateExtend) {
			this.stateExtend = stateExtend;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Long getGmtUpload() {
			return this.gmtUpload;
		}

		public void setGmtUpload(Long gmtUpload) {
			this.gmtUpload = gmtUpload;
		}

		public Integer getRecordingDuration() {
			return this.recordingDuration;
		}

		public void setRecordingDuration(Integer recordingDuration) {
			this.recordingDuration = recordingDuration;
		}

		public String getRecordingName() {
			return this.recordingName;
		}

		public void setRecordingName(String recordingName) {
			this.recordingName = recordingName;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getInnerId() {
			return this.innerId;
		}

		public void setInnerId(String innerId) {
			this.innerId = innerId;
		}
	}

	@Override
	public ListScriptRecordingResponse getInstance(UnmarshallerContext context) {
		return	ListScriptRecordingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
