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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.VerifySentenceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class VerifySentenceResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer sourceRole;

	private Integer targetRole;

	private Integer incorrectWords;

	private List<Delta> data;

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

	public Integer getSourceRole() {
		return this.sourceRole;
	}

	public void setSourceRole(Integer sourceRole) {
		this.sourceRole = sourceRole;
	}

	public Integer getTargetRole() {
		return this.targetRole;
	}

	public void setTargetRole(Integer targetRole) {
		this.targetRole = targetRole;
	}

	public Integer getIncorrectWords() {
		return this.incorrectWords;
	}

	public void setIncorrectWords(Integer incorrectWords) {
		this.incorrectWords = incorrectWords;
	}

	public List<Delta> getData() {
		return this.data;
	}

	public void setData(List<Delta> data) {
		this.data = data;
	}

	public static class Delta {

		private String type;

		private Source source;

		private Target target;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public Target getTarget() {
			return this.target;
		}

		public void setTarget(Target target) {
			this.target = target;
		}

		public static class Source {

			private Integer position;

			private List<String> line;

			public Integer getPosition() {
				return this.position;
			}

			public void setPosition(Integer position) {
				this.position = position;
			}

			public List<String> getLine() {
				return this.line;
			}

			public void setLine(List<String> line) {
				this.line = line;
			}
		}

		public static class Target {

			private Integer position;

			private List<String> line1;

			public Integer getPosition() {
				return this.position;
			}

			public void setPosition(Integer position) {
				this.position = position;
			}

			public List<String> getLine1() {
				return this.line1;
			}

			public void setLine1(List<String> line1) {
				this.line1 = line1;
			}
		}
	}

	@Override
	public VerifySentenceResponse getInstance(UnmarshallerContext context) {
		return	VerifySentenceResponseUnmarshaller.unmarshall(this, context);
	}
}
