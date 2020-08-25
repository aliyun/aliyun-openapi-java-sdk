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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.CreateLinkeantcodeAntcodeLsifhoverResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLinkeantcodeAntcodeLsifhoverResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Long responseStatusCode;

	private Contents contents;

	private Range range;

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

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Contents getContents() {
		return this.contents;
	}

	public void setContents(Contents contents) {
		this.contents = contents;
	}

	public Range getRange() {
		return this.range;
	}

	public void setRange(Range range) {
		this.range = range;
	}

	public static class Contents {

		private String kind;

		private String value;

		public String getKind() {
			return this.kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class Range {

		private String end;

		private String start;

		public String getEnd() {
			return this.end;
		}

		public void setEnd(String end) {
			this.end = end;
		}

		public String getStart() {
			return this.start;
		}

		public void setStart(String start) {
			this.start = start;
		}
	}

	@Override
	public CreateLinkeantcodeAntcodeLsifhoverResponse getInstance(UnmarshallerContext context) {
		return	CreateLinkeantcodeAntcodeLsifhoverResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
