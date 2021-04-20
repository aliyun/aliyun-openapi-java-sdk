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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.VerifyDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifyDeviceResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private List<VerifyDeviceResult> data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<VerifyDeviceResult> getData() {
		return this.data;
	}

	public void setData(List<VerifyDeviceResult> data) {
		this.data = data;
	}

	public static class VerifyDeviceResult {

		private Long rowNumber;

		private String originalGbId;

		private String message;

		private String suggestGbId;

		private String id;

		private String code;

		public Long getRowNumber() {
			return this.rowNumber;
		}

		public void setRowNumber(Long rowNumber) {
			this.rowNumber = rowNumber;
		}

		public String getOriginalGbId() {
			return this.originalGbId;
		}

		public void setOriginalGbId(String originalGbId) {
			this.originalGbId = originalGbId;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getSuggestGbId() {
			return this.suggestGbId;
		}

		public void setSuggestGbId(String suggestGbId) {
			this.suggestGbId = suggestGbId;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}

	@Override
	public VerifyDeviceResponse getInstance(UnmarshallerContext context) {
		return	VerifyDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
