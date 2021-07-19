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

package com.aliyuncs.aliyuncvc.model.v20191030;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyuncvc.transform.v20191030.QueryMeetingMemberActionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMeetingMemberActionResponse extends AcsResponse {

	private String message;

	private String requestId;

	private Integer meetingStatus;

	private Integer videoStatus;

	private Integer audioStatus;

	private Long errorCodeCount;

	private Integer errorCode;

	private Boolean success;

	private List<ErrorCodeListItem> errorCodeList;

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

	public Integer getMeetingStatus() {
		return this.meetingStatus;
	}

	public void setMeetingStatus(Integer meetingStatus) {
		this.meetingStatus = meetingStatus;
	}

	public Integer getVideoStatus() {
		return this.videoStatus;
	}

	public void setVideoStatus(Integer videoStatus) {
		this.videoStatus = videoStatus;
	}

	public Integer getAudioStatus() {
		return this.audioStatus;
	}

	public void setAudioStatus(Integer audioStatus) {
		this.audioStatus = audioStatus;
	}

	public Long getErrorCodeCount() {
		return this.errorCodeCount;
	}

	public void setErrorCodeCount(Long errorCodeCount) {
		this.errorCodeCount = errorCodeCount;
	}

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ErrorCodeListItem> getErrorCodeList() {
		return this.errorCodeList;
	}

	public void setErrorCodeList(List<ErrorCodeListItem> errorCodeList) {
		this.errorCodeList = errorCodeList;
	}

	public static class ErrorCodeListItem {

		private Long errorCodeCount;

		private Long time;

		public Long getErrorCodeCount() {
			return this.errorCodeCount;
		}

		public void setErrorCodeCount(Long errorCodeCount) {
			this.errorCodeCount = errorCodeCount;
		}

		public Long getTime() {
			return this.time;
		}

		public void setTime(Long time) {
			this.time = time;
		}
	}

	@Override
	public QueryMeetingMemberActionResponse getInstance(UnmarshallerContext context) {
		return	QueryMeetingMemberActionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
