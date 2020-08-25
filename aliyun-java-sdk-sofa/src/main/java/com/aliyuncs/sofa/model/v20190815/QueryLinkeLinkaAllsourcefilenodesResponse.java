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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkeLinkaAllsourcefilenodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkeLinkaAllsourcefilenodesResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String errorCode;

	private String errorMsg;

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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
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

		private Long branchCovered;

		private Long branchTotal;

		private Long classCovered;

		private Long classTotal;

		private Long cxtyCovered;

		private Long cxtyTotal;

		private String fileUrl;

		private Boolean hasSourceCode;

		private String id;

		private Long instrCovered;

		private Long instrTotal;

		private String lineCoverageData;

		private Long lineCovered;

		private Long lineTotal;

		private Long methodCovered;

		private Long methodTotal;

		private String name;

		private String type;

		private List<Long> diffLines;

		public Long getBranchCovered() {
			return this.branchCovered;
		}

		public void setBranchCovered(Long branchCovered) {
			this.branchCovered = branchCovered;
		}

		public Long getBranchTotal() {
			return this.branchTotal;
		}

		public void setBranchTotal(Long branchTotal) {
			this.branchTotal = branchTotal;
		}

		public Long getClassCovered() {
			return this.classCovered;
		}

		public void setClassCovered(Long classCovered) {
			this.classCovered = classCovered;
		}

		public Long getClassTotal() {
			return this.classTotal;
		}

		public void setClassTotal(Long classTotal) {
			this.classTotal = classTotal;
		}

		public Long getCxtyCovered() {
			return this.cxtyCovered;
		}

		public void setCxtyCovered(Long cxtyCovered) {
			this.cxtyCovered = cxtyCovered;
		}

		public Long getCxtyTotal() {
			return this.cxtyTotal;
		}

		public void setCxtyTotal(Long cxtyTotal) {
			this.cxtyTotal = cxtyTotal;
		}

		public String getFileUrl() {
			return this.fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}

		public Boolean getHasSourceCode() {
			return this.hasSourceCode;
		}

		public void setHasSourceCode(Boolean hasSourceCode) {
			this.hasSourceCode = hasSourceCode;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getInstrCovered() {
			return this.instrCovered;
		}

		public void setInstrCovered(Long instrCovered) {
			this.instrCovered = instrCovered;
		}

		public Long getInstrTotal() {
			return this.instrTotal;
		}

		public void setInstrTotal(Long instrTotal) {
			this.instrTotal = instrTotal;
		}

		public String getLineCoverageData() {
			return this.lineCoverageData;
		}

		public void setLineCoverageData(String lineCoverageData) {
			this.lineCoverageData = lineCoverageData;
		}

		public Long getLineCovered() {
			return this.lineCovered;
		}

		public void setLineCovered(Long lineCovered) {
			this.lineCovered = lineCovered;
		}

		public Long getLineTotal() {
			return this.lineTotal;
		}

		public void setLineTotal(Long lineTotal) {
			this.lineTotal = lineTotal;
		}

		public Long getMethodCovered() {
			return this.methodCovered;
		}

		public void setMethodCovered(Long methodCovered) {
			this.methodCovered = methodCovered;
		}

		public Long getMethodTotal() {
			return this.methodTotal;
		}

		public void setMethodTotal(Long methodTotal) {
			this.methodTotal = methodTotal;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<Long> getDiffLines() {
			return this.diffLines;
		}

		public void setDiffLines(List<Long> diffLines) {
			this.diffLines = diffLines;
		}
	}

	@Override
	public QueryLinkeLinkaAllsourcefilenodesResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkeLinkaAllsourcefilenodesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
