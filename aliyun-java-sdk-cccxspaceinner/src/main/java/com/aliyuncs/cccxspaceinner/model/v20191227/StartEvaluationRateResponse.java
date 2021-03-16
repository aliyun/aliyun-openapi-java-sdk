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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cccxspaceinner.transform.v20191227.StartEvaluationRateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class StartEvaluationRateResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private String code;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Map<Object,Object> questions;

		private EvaluationInfo evaluationInfo;

		public Map<Object,Object> getQuestions() {
			return this.questions;
		}

		public void setQuestions(Map<Object,Object> questions) {
			this.questions = questions;
		}

		public EvaluationInfo getEvaluationInfo() {
			return this.evaluationInfo;
		}

		public void setEvaluationInfo(EvaluationInfo evaluationInfo) {
			this.evaluationInfo = evaluationInfo;
		}

		public static class EvaluationInfo {

			private Long id;

			private Long senceId;

			private String status;

			private String title;

			private String description;

			private Long creator;

			private Long lastModifier;

			private String purpose;

			private Long ruleId;

			private String type;

			private Integer priority;

			private String extAttrs;

			private Map<Object,Object> extMap;

			private Boolean isEmpty;

			private Boolean isAvailable;

			private Boolean isSimpleEvaluation;

			private Integer languageId;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Long getSenceId() {
				return this.senceId;
			}

			public void setSenceId(Long senceId) {
				this.senceId = senceId;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getCreator() {
				return this.creator;
			}

			public void setCreator(Long creator) {
				this.creator = creator;
			}

			public Long getLastModifier() {
				return this.lastModifier;
			}

			public void setLastModifier(Long lastModifier) {
				this.lastModifier = lastModifier;
			}

			public String getPurpose() {
				return this.purpose;
			}

			public void setPurpose(String purpose) {
				this.purpose = purpose;
			}

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Integer getPriority() {
				return this.priority;
			}

			public void setPriority(Integer priority) {
				this.priority = priority;
			}

			public String getExtAttrs() {
				return this.extAttrs;
			}

			public void setExtAttrs(String extAttrs) {
				this.extAttrs = extAttrs;
			}

			public Map<Object,Object> getExtMap() {
				return this.extMap;
			}

			public void setExtMap(Map<Object,Object> extMap) {
				this.extMap = extMap;
			}

			public Boolean getIsEmpty() {
				return this.isEmpty;
			}

			public void setIsEmpty(Boolean isEmpty) {
				this.isEmpty = isEmpty;
			}

			public Boolean getIsAvailable() {
				return this.isAvailable;
			}

			public void setIsAvailable(Boolean isAvailable) {
				this.isAvailable = isAvailable;
			}

			public Boolean getIsSimpleEvaluation() {
				return this.isSimpleEvaluation;
			}

			public void setIsSimpleEvaluation(Boolean isSimpleEvaluation) {
				this.isSimpleEvaluation = isSimpleEvaluation;
			}

			public Integer getLanguageId() {
				return this.languageId;
			}

			public void setLanguageId(Integer languageId) {
				this.languageId = languageId;
			}
		}
	}

	@Override
	public StartEvaluationRateResponse getInstance(UnmarshallerContext context) {
		return	StartEvaluationRateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
