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
import com.aliyuncs.voicenavigator.transform.v20180612.DescribeNavigationConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNavigationConfigResponse extends AcsResponse {

	private String requestId;

	private GreetingConfig greetingConfig;

	private UnrecognizingConfig unrecognizingConfig;

	private RepeatingConfig repeatingConfig;

	private AskingBackConfig askingBackConfig;

	private ComplainingConfig complainingConfig;

	private SilenceTimeoutConfig silenceTimeoutConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GreetingConfig getGreetingConfig() {
		return this.greetingConfig;
	}

	public void setGreetingConfig(GreetingConfig greetingConfig) {
		this.greetingConfig = greetingConfig;
	}

	public UnrecognizingConfig getUnrecognizingConfig() {
		return this.unrecognizingConfig;
	}

	public void setUnrecognizingConfig(UnrecognizingConfig unrecognizingConfig) {
		this.unrecognizingConfig = unrecognizingConfig;
	}

	public RepeatingConfig getRepeatingConfig() {
		return this.repeatingConfig;
	}

	public void setRepeatingConfig(RepeatingConfig repeatingConfig) {
		this.repeatingConfig = repeatingConfig;
	}

	public AskingBackConfig getAskingBackConfig() {
		return this.askingBackConfig;
	}

	public void setAskingBackConfig(AskingBackConfig askingBackConfig) {
		this.askingBackConfig = askingBackConfig;
	}

	public ComplainingConfig getComplainingConfig() {
		return this.complainingConfig;
	}

	public void setComplainingConfig(ComplainingConfig complainingConfig) {
		this.complainingConfig = complainingConfig;
	}

	public SilenceTimeoutConfig getSilenceTimeoutConfig() {
		return this.silenceTimeoutConfig;
	}

	public void setSilenceTimeoutConfig(SilenceTimeoutConfig silenceTimeoutConfig) {
		this.silenceTimeoutConfig = silenceTimeoutConfig;
	}

	public static class GreetingConfig {

		private String greetingWords;

		private String sourceType;

		private String intentTrigger;

		public String getGreetingWords() {
			return this.greetingWords;
		}

		public void setGreetingWords(String greetingWords) {
			this.greetingWords = greetingWords;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getIntentTrigger() {
			return this.intentTrigger;
		}

		public void setIntentTrigger(String intentTrigger) {
			this.intentTrigger = intentTrigger;
		}
	}

	public static class UnrecognizingConfig {

		private String prompt;

		private Integer threshold;

		private String finalPrompt;

		private String finalAction;

		private String finalActionParams;

		public String getPrompt() {
			return this.prompt;
		}

		public void setPrompt(String prompt) {
			this.prompt = prompt;
		}

		public Integer getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Integer threshold) {
			this.threshold = threshold;
		}

		public String getFinalPrompt() {
			return this.finalPrompt;
		}

		public void setFinalPrompt(String finalPrompt) {
			this.finalPrompt = finalPrompt;
		}

		public String getFinalAction() {
			return this.finalAction;
		}

		public void setFinalAction(String finalAction) {
			this.finalAction = finalAction;
		}

		public String getFinalActionParams() {
			return this.finalActionParams;
		}

		public void setFinalActionParams(String finalActionParams) {
			this.finalActionParams = finalActionParams;
		}
	}

	public static class RepeatingConfig {

		private List<String> utterances;

		public List<String> getUtterances() {
			return this.utterances;
		}

		public void setUtterances(List<String> utterances) {
			this.utterances = utterances;
		}
	}

	public static class AskingBackConfig {

		private Boolean enabled;

		private String prompt;

		private Boolean enableNegativeFeedback;

		private String negativeFeedbackPrompt;

		private String negativeFeedbackAction;

		private String negativeFeedbackActionParams;

		private List<String> negativeFeedbackUtterances;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getPrompt() {
			return this.prompt;
		}

		public void setPrompt(String prompt) {
			this.prompt = prompt;
		}

		public Boolean getEnableNegativeFeedback() {
			return this.enableNegativeFeedback;
		}

		public void setEnableNegativeFeedback(Boolean enableNegativeFeedback) {
			this.enableNegativeFeedback = enableNegativeFeedback;
		}

		public String getNegativeFeedbackPrompt() {
			return this.negativeFeedbackPrompt;
		}

		public void setNegativeFeedbackPrompt(String negativeFeedbackPrompt) {
			this.negativeFeedbackPrompt = negativeFeedbackPrompt;
		}

		public String getNegativeFeedbackAction() {
			return this.negativeFeedbackAction;
		}

		public void setNegativeFeedbackAction(String negativeFeedbackAction) {
			this.negativeFeedbackAction = negativeFeedbackAction;
		}

		public String getNegativeFeedbackActionParams() {
			return this.negativeFeedbackActionParams;
		}

		public void setNegativeFeedbackActionParams(String negativeFeedbackActionParams) {
			this.negativeFeedbackActionParams = negativeFeedbackActionParams;
		}

		public List<String> getNegativeFeedbackUtterances() {
			return this.negativeFeedbackUtterances;
		}

		public void setNegativeFeedbackUtterances(List<String> negativeFeedbackUtterances) {
			this.negativeFeedbackUtterances = negativeFeedbackUtterances;
		}
	}

	public static class ComplainingConfig {

		private String prompt;

		private String finalAction;

		private String finalActionParams;

		private List<String> utterances1;

		public String getPrompt() {
			return this.prompt;
		}

		public void setPrompt(String prompt) {
			this.prompt = prompt;
		}

		public String getFinalAction() {
			return this.finalAction;
		}

		public void setFinalAction(String finalAction) {
			this.finalAction = finalAction;
		}

		public String getFinalActionParams() {
			return this.finalActionParams;
		}

		public void setFinalActionParams(String finalActionParams) {
			this.finalActionParams = finalActionParams;
		}

		public List<String> getUtterances1() {
			return this.utterances1;
		}

		public void setUtterances1(List<String> utterances1) {
			this.utterances1 = utterances1;
		}
	}

	public static class SilenceTimeoutConfig {

		private String prompt;

		private Long timeout;

		private Integer threshold;

		private String finalPrompt;

		private String finalAction;

		private String finalActionParams;

		private String sourceType;

		private String intentTrigger;

		public String getPrompt() {
			return this.prompt;
		}

		public void setPrompt(String prompt) {
			this.prompt = prompt;
		}

		public Long getTimeout() {
			return this.timeout;
		}

		public void setTimeout(Long timeout) {
			this.timeout = timeout;
		}

		public Integer getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Integer threshold) {
			this.threshold = threshold;
		}

		public String getFinalPrompt() {
			return this.finalPrompt;
		}

		public void setFinalPrompt(String finalPrompt) {
			this.finalPrompt = finalPrompt;
		}

		public String getFinalAction() {
			return this.finalAction;
		}

		public void setFinalAction(String finalAction) {
			this.finalAction = finalAction;
		}

		public String getFinalActionParams() {
			return this.finalActionParams;
		}

		public void setFinalActionParams(String finalActionParams) {
			this.finalActionParams = finalActionParams;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getIntentTrigger() {
			return this.intentTrigger;
		}

		public void setIntentTrigger(String intentTrigger) {
			this.intentTrigger = intentTrigger;
		}
	}

	@Override
	public DescribeNavigationConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeNavigationConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
