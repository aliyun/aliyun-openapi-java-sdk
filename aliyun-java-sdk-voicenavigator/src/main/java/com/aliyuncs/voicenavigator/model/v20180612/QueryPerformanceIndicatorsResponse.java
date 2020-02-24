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

package com.aliyuncs.voicenavigator.model.v20180612;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.voicenavigator.transform.v20180612.QueryPerformanceIndicatorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPerformanceIndicatorsResponse extends AcsResponse {

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

		private Float totalRateValue;

		private List<ValuePerDateUnit> valuePerDateUnits;

		public Float getTotalRateValue() {
			return this.totalRateValue;
		}

		public void setTotalRateValue(Float totalRateValue) {
			this.totalRateValue = totalRateValue;
		}

		public List<ValuePerDateUnit> getValuePerDateUnits() {
			return this.valuePerDateUnits;
		}

		public void setValuePerDateUnits(List<ValuePerDateUnit> valuePerDateUnits) {
			this.valuePerDateUnits = valuePerDateUnits;
		}

		public static class ValuePerDateUnit {

			private Long date;

			private Float rateValue;

			public Long getDate() {
				return this.date;
			}

			public void setDate(Long date) {
				this.date = date;
			}

			public Float getRateValue() {
				return this.rateValue;
			}

			public void setRateValue(Float rateValue) {
				this.rateValue = rateValue;
			}
		}
	}

	public static class ValidAnswerRate {

		private Float totalRateValue;

		private List<ValuePerDateUnit2> valuePerDateUnits1;

		public Float getTotalRateValue() {
			return this.totalRateValue;
		}

		public void setTotalRateValue(Float totalRateValue) {
			this.totalRateValue = totalRateValue;
		}

		public List<ValuePerDateUnit2> getValuePerDateUnits1() {
			return this.valuePerDateUnits1;
		}

		public void setValuePerDateUnits1(List<ValuePerDateUnit2> valuePerDateUnits1) {
			this.valuePerDateUnits1 = valuePerDateUnits1;
		}

		public static class ValuePerDateUnit2 {

			private Long date;

			private Float rateValue;

			public Long getDate() {
				return this.date;
			}

			public void setDate(Long date) {
				this.date = date;
			}

			public Float getRateValue() {
				return this.rateValue;
			}

			public void setRateValue(Float rateValue) {
				this.rateValue = rateValue;
			}
		}
	}

	public static class DialoguePassRate {

		private Float totalRateValue;

		private List<ValuePerDateUnit4> valuePerDateUnits3;

		public Float getTotalRateValue() {
			return this.totalRateValue;
		}

		public void setTotalRateValue(Float totalRateValue) {
			this.totalRateValue = totalRateValue;
		}

		public List<ValuePerDateUnit4> getValuePerDateUnits3() {
			return this.valuePerDateUnits3;
		}

		public void setValuePerDateUnits3(List<ValuePerDateUnit4> valuePerDateUnits3) {
			this.valuePerDateUnits3 = valuePerDateUnits3;
		}

		public static class ValuePerDateUnit4 {

			private Long date;

			private Float rateValue;

			public Long getDate() {
				return this.date;
			}

			public void setDate(Long date) {
				this.date = date;
			}

			public Float getRateValue() {
				return this.rateValue;
			}

			public void setRateValue(Float rateValue) {
				this.rateValue = rateValue;
			}
		}
	}

	public static class KnowledgeHitRate {

		private Float totalRateValue;

		private List<ValuePerDateUnit6> valuePerDateUnits5;

		public Float getTotalRateValue() {
			return this.totalRateValue;
		}

		public void setTotalRateValue(Float totalRateValue) {
			this.totalRateValue = totalRateValue;
		}

		public List<ValuePerDateUnit6> getValuePerDateUnits5() {
			return this.valuePerDateUnits5;
		}

		public void setValuePerDateUnits5(List<ValuePerDateUnit6> valuePerDateUnits5) {
			this.valuePerDateUnits5 = valuePerDateUnits5;
		}

		public static class ValuePerDateUnit6 {

			private Long date;

			private Float rateValue;

			public Long getDate() {
				return this.date;
			}

			public void setDate(Long date) {
				this.date = date;
			}

			public Float getRateValue() {
				return this.rateValue;
			}

			public void setRateValue(Float rateValue) {
				this.rateValue = rateValue;
			}
		}
	}

	@Override
	public QueryPerformanceIndicatorsResponse getInstance(UnmarshallerContext context) {
		return	QueryPerformanceIndicatorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
