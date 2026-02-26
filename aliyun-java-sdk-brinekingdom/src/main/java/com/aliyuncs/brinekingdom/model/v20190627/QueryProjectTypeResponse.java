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

package com.aliyuncs.brinekingdom.model.v20190627;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.brinekingdom.transform.v20190627.QueryProjectTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProjectTypeResponse extends AcsResponse {

	private String _class;

	private String errorMessage;

	private Boolean success;

	private String resultCode;

	private String requestId;

	private List<ResultItem> result;

	public String get_Class() {
		return this._class;
	}

	public void set_Class(String _class) {
		this._class = _class;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String _class;

		private Long id;

		private String projectType;

		private String projectTypeName;

		public String get_Class() {
			return this._class;
		}

		public void set_Class(String _class) {
			this._class = _class;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectType() {
			return this.projectType;
		}

		public void setProjectType(String projectType) {
			this.projectType = projectType;
		}

		public String getProjectTypeName() {
			return this.projectTypeName;
		}

		public void setProjectTypeName(String projectTypeName) {
			this.projectTypeName = projectTypeName;
		}
	}

	@Override
	public QueryProjectTypeResponse getInstance(UnmarshallerContext context) {
		return	QueryProjectTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
