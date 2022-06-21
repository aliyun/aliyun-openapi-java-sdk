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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DeleteLiveStreamRecordIndexFilesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteLiveStreamRecordIndexFilesResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private List<RecordDeleteInfo> recordDeleteInfoList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<RecordDeleteInfo> getRecordDeleteInfoList() {
		return this.recordDeleteInfoList;
	}

	public void setRecordDeleteInfoList(List<RecordDeleteInfo> recordDeleteInfoList) {
		this.recordDeleteInfoList = recordDeleteInfoList;
	}

	public static class RecordDeleteInfo {

		private String recordId;

		private String message;

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	}

	@Override
	public DeleteLiveStreamRecordIndexFilesResponse getInstance(UnmarshallerContext context) {
		return	DeleteLiveStreamRecordIndexFilesResponseUnmarshaller.unmarshall(this, context);
	}
}
