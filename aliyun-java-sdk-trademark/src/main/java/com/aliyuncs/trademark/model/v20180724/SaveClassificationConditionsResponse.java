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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.SaveClassificationConditionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SaveClassificationConditionsResponse extends AcsResponse {

	private String errorMsg;

	private String requestId;

	private String tagName;

	private Boolean success;

	private List<InvalidListItem> invalidList;

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<InvalidListItem> getInvalidList() {
		return this.invalidList;
	}

	public void setInvalidList(List<InvalidListItem> invalidList) {
		this.invalidList = invalidList;
	}

	public static class InvalidListItem {

		private String parentCode;

		private String officialCode;

		private String classificationName;

		private String classificationCode;

		public String getParentCode() {
			return this.parentCode;
		}

		public void setParentCode(String parentCode) {
			this.parentCode = parentCode;
		}

		public String getOfficialCode() {
			return this.officialCode;
		}

		public void setOfficialCode(String officialCode) {
			this.officialCode = officialCode;
		}

		public String getClassificationName() {
			return this.classificationName;
		}

		public void setClassificationName(String classificationName) {
			this.classificationName = classificationName;
		}

		public String getClassificationCode() {
			return this.classificationCode;
		}

		public void setClassificationCode(String classificationCode) {
			this.classificationCode = classificationCode;
		}
	}

	@Override
	public SaveClassificationConditionsResponse getInstance(UnmarshallerContext context) {
		return	SaveClassificationConditionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
