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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.GetLinkeBahamutVcscommitchangeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLinkeBahamutVcscommitchangeResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorMessage;

	private String errorMsgParamsMap;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMsgParamsMap() {
		return this.errorMsgParamsMap;
	}

	public void setErrorMsgParamsMap(String errorMsgParamsMap) {
		this.errorMsgParamsMap = errorMsgParamsMap;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String amode;

		private Boolean binary;

		private String bmode;

		private String charset;

		private Boolean deletedFile;

		private String diff;

		private String filePathId;

		private String fromId;

		private Boolean newFile;

		private String newPath;

		private String oldPath;

		private Boolean renamedFile;

		private String toId;

		public String getAmode() {
			return this.amode;
		}

		public void setAmode(String amode) {
			this.amode = amode;
		}

		public Boolean getBinary() {
			return this.binary;
		}

		public void setBinary(Boolean binary) {
			this.binary = binary;
		}

		public String getBmode() {
			return this.bmode;
		}

		public void setBmode(String bmode) {
			this.bmode = bmode;
		}

		public String getCharset() {
			return this.charset;
		}

		public void setCharset(String charset) {
			this.charset = charset;
		}

		public Boolean getDeletedFile() {
			return this.deletedFile;
		}

		public void setDeletedFile(Boolean deletedFile) {
			this.deletedFile = deletedFile;
		}

		public String getDiff() {
			return this.diff;
		}

		public void setDiff(String diff) {
			this.diff = diff;
		}

		public String getFilePathId() {
			return this.filePathId;
		}

		public void setFilePathId(String filePathId) {
			this.filePathId = filePathId;
		}

		public String getFromId() {
			return this.fromId;
		}

		public void setFromId(String fromId) {
			this.fromId = fromId;
		}

		public Boolean getNewFile() {
			return this.newFile;
		}

		public void setNewFile(Boolean newFile) {
			this.newFile = newFile;
		}

		public String getNewPath() {
			return this.newPath;
		}

		public void setNewPath(String newPath) {
			this.newPath = newPath;
		}

		public String getOldPath() {
			return this.oldPath;
		}

		public void setOldPath(String oldPath) {
			this.oldPath = oldPath;
		}

		public Boolean getRenamedFile() {
			return this.renamedFile;
		}

		public void setRenamedFile(Boolean renamedFile) {
			this.renamedFile = renamedFile;
		}

		public String getToId() {
			return this.toId;
		}

		public void setToId(String toId) {
			this.toId = toId;
		}
	}

	@Override
	public GetLinkeBahamutVcscommitchangeResponse getInstance(UnmarshallerContext context) {
		return	GetLinkeBahamutVcscommitchangeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
