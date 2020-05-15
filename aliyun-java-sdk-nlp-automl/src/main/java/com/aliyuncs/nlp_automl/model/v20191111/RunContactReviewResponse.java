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

package com.aliyuncs.nlp_automl.model.v20191111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nlp_automl.transform.v20191111.RunContactReviewResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RunContactReviewResponse extends AcsResponse {

	private String requestId;

	private String rawContractContent;

	private ContactContent contactContent;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRawContractContent() {
		return this.rawContractContent;
	}

	public void setRawContractContent(String rawContractContent) {
		this.rawContractContent = rawContractContent;
	}

	public ContactContent getContactContent() {
		return this.contactContent;
	}

	public void setContactContent(ContactContent contactContent) {
		this.contactContent = contactContent;
	}

	public static class ContactContent {

		private List<ReviewResult> reviewResults;

		private List<StructureResult> structureResults;

		public List<ReviewResult> getReviewResults() {
			return this.reviewResults;
		}

		public void setReviewResults(List<ReviewResult> reviewResults) {
			this.reviewResults = reviewResults;
		}

		public List<StructureResult> getStructureResults() {
			return this.structureResults;
		}

		public void setStructureResults(List<StructureResult> structureResults) {
			this.structureResults = structureResults;
		}

		public static class ReviewResult {

			private String riskLevel;

			private String reason;

			private String type;

			private String modificationSuggestion;

			private List<String> value;

			private List<String> endPosition;

			private List<String> startPosition;

			public String getRiskLevel() {
				return this.riskLevel;
			}

			public void setRiskLevel(String riskLevel) {
				this.riskLevel = riskLevel;
			}

			public String getReason() {
				return this.reason;
			}

			public void setReason(String reason) {
				this.reason = reason;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getModificationSuggestion() {
				return this.modificationSuggestion;
			}

			public void setModificationSuggestion(String modificationSuggestion) {
				this.modificationSuggestion = modificationSuggestion;
			}

			public List<String> getValue() {
				return this.value;
			}

			public void setValue(List<String> value) {
				this.value = value;
			}

			public List<String> getEndPosition() {
				return this.endPosition;
			}

			public void setEndPosition(List<String> endPosition) {
				this.endPosition = endPosition;
			}

			public List<String> getStartPosition() {
				return this.startPosition;
			}

			public void setStartPosition(List<String> startPosition) {
				this.startPosition = startPosition;
			}
		}

		public static class StructureResult {

			private String name;

			private String type;

			private List<String> value1;

			private List<String> endPosition2;

			private List<String> startPosition3;

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

			public List<String> getValue1() {
				return this.value1;
			}

			public void setValue1(List<String> value1) {
				this.value1 = value1;
			}

			public List<String> getEndPosition2() {
				return this.endPosition2;
			}

			public void setEndPosition2(List<String> endPosition2) {
				this.endPosition2 = endPosition2;
			}

			public List<String> getStartPosition3() {
				return this.startPosition3;
			}

			public void setStartPosition3(List<String> startPosition3) {
				this.startPosition3 = startPosition3;
			}
		}
	}

	@Override
	public RunContactReviewResponse getInstance(UnmarshallerContext context) {
		return	RunContactReviewResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
