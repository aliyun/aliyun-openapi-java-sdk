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

package com.aliyuncs.anytrans.model.v20250707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.anytrans.transform.v20250707.TermQueryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TermQueryResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private String httpStatusCode;

	private Data data;

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

	public String getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(String httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long failCount;

		private List<TermsItem> terms;

		public Long getFailCount() {
			return this.failCount;
		}

		public void setFailCount(Long failCount) {
			this.failCount = failCount;
		}

		public List<TermsItem> getTerms() {
			return this.terms;
		}

		public void setTerms(List<TermsItem> terms) {
			this.terms = terms;
		}

		public static class TermsItem {

			private String termId;

			private String src;

			private String tgt;

			public String getTermId() {
				return this.termId;
			}

			public void setTermId(String termId) {
				this.termId = termId;
			}

			public String getSrc() {
				return this.src;
			}

			public void setSrc(String src) {
				this.src = src;
			}

			public String getTgt() {
				return this.tgt;
			}

			public void setTgt(String tgt) {
				this.tgt = tgt;
			}
		}
	}

	@Override
	public TermQueryResponse getInstance(UnmarshallerContext context) {
		return	TermQueryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
