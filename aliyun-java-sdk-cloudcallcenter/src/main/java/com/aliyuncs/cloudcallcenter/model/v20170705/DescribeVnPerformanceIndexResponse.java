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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudcallcenter.transform.v20170705.DescribeVnPerformanceIndexResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVnPerformanceIndexResponse extends AcsResponse {

	private String requestId;

	private ResolutionRate resolutionRate;

	private ValidAnswerRate validAnswerRate;

	private DialoguePassRate dialoguePassRate;

	private KnowledgeHitRate knowledgeHitRate;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ResolutionRate getResolutionRate() {
		return this.resolutionRate;
	}

	public void setResolutionRate(ResolutionRate resolutionRate) {
		this.resolutionRate = resolutionRate;
	}

	public ValidAnswerRate getValidAnswerRate() {
		return this.validAnswerRate;
	}

	public void setValidAnswerRate(ValidAnswerRate validAnswerRate) {
		this.validAnswerRate = validAnswerRate;
	}

	public DialoguePassRate getDialoguePassRate() {
		return this.dialoguePassRate;
	}

	public void setDialoguePassRate(DialoguePassRate dialoguePassRate) {
		this.dialoguePassRate = dialoguePassRate;
	}

	public KnowledgeHitRate getKnowledgeHitRate() {
		return this.knowledgeHitRate;
	}

	public void setKnowledgeHitRate(KnowledgeHitRate knowledgeHitRate) {
		this.knowledgeHitRate = knowledgeHitRate;
	}

	public static class ResolutionRate {

		private String totalRateValue;

		private List<UnitValue> unitValues;

		public String getTotalRateValue() {
			return this.totalRateValue;
		}

		public void setTotalRateValue(String totalRateValue) {
			this.totalRateValue = totalRateValue;
		}

		public List<UnitValue> getUnitValues() {
			return this.unitValues;
		}

		public void setUnitValues(List<UnitValue> unitValues) {
			this.unitValues = unitValues;
		}

		public static class UnitValue {

			private Long time;

			private String rateValue;

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public String getRateValue() {
				return this.rateValue;
			}

			public void setRateValue(String rateValue) {
				this.rateValue = rateValue;
			}
		}
	}

	public static class ValidAnswerRate {

		private String totalRateValue;

		private List<UnitValue2> unitValues1;

		public String getTotalRateValue() {
			return this.totalRateValue;
		}

		public void setTotalRateValue(String totalRateValue) {
			this.totalRateValue = totalRateValue;
		}

		public List<UnitValue2> getUnitValues1() {
			return this.unitValues1;
		}

		public void setUnitValues1(List<UnitValue2> unitValues1) {
			this.unitValues1 = unitValues1;
		}

		public static class UnitValue2 {

			private Long time;

			private String rateValue;

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public String getRateValue() {
				return this.rateValue;
			}

			public void setRateValue(String rateValue) {
				this.rateValue = rateValue;
			}
		}
	}

	public static class DialoguePassRate {

		private String totalRateValue;

		private List<UnitValue4> unitValues3;

		public String getTotalRateValue() {
			return this.totalRateValue;
		}

		public void setTotalRateValue(String totalRateValue) {
			this.totalRateValue = totalRateValue;
		}

		public List<UnitValue4> getUnitValues3() {
			return this.unitValues3;
		}

		public void setUnitValues3(List<UnitValue4> unitValues3) {
			this.unitValues3 = unitValues3;
		}

		public static class UnitValue4 {

			private Long time;

			private String rateValue;

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public String getRateValue() {
				return this.rateValue;
			}

			public void setRateValue(String rateValue) {
				this.rateValue = rateValue;
			}
		}
	}

	public static class KnowledgeHitRate {

		private String totalRateValue;

		private List<UnitValue6> unitValues5;

		public String getTotalRateValue() {
			return this.totalRateValue;
		}

		public void setTotalRateValue(String totalRateValue) {
			this.totalRateValue = totalRateValue;
		}

		public List<UnitValue6> getUnitValues5() {
			return this.unitValues5;
		}

		public void setUnitValues5(List<UnitValue6> unitValues5) {
			this.unitValues5 = unitValues5;
		}

		public static class UnitValue6 {

			private Long time;

			private String rateValue;

			public Long getTime() {
				return this.time;
			}

			public void setTime(Long time) {
				this.time = time;
			}

			public String getRateValue() {
				return this.rateValue;
			}

			public void setRateValue(String rateValue) {
				this.rateValue = rateValue;
			}
		}
	}

	@Override
	public DescribeVnPerformanceIndexResponse getInstance(UnmarshallerContext context) {
		return	DescribeVnPerformanceIndexResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
