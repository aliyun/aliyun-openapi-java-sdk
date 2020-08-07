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

package com.aliyuncs.alimt.model.v20181012;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.alimt.transform.v20181012.GetTitleDiagnoseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTitleDiagnoseResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String containCoreClasses;

		private String overLengthLimit;

		private String wordSpelledCorrectError;

		private String allUppercaseWords;

		private String noFirstUppercaseList;

		private String duplicateWords;

		private String disableWords;

		private String wordCount;

		private String totalScore;

		private String languageQualityScore;

		public String getContainCoreClasses() {
			return this.containCoreClasses;
		}

		public void setContainCoreClasses(String containCoreClasses) {
			this.containCoreClasses = containCoreClasses;
		}

		public String getOverLengthLimit() {
			return this.overLengthLimit;
		}

		public void setOverLengthLimit(String overLengthLimit) {
			this.overLengthLimit = overLengthLimit;
		}

		public String getWordSpelledCorrectError() {
			return this.wordSpelledCorrectError;
		}

		public void setWordSpelledCorrectError(String wordSpelledCorrectError) {
			this.wordSpelledCorrectError = wordSpelledCorrectError;
		}

		public String getAllUppercaseWords() {
			return this.allUppercaseWords;
		}

		public void setAllUppercaseWords(String allUppercaseWords) {
			this.allUppercaseWords = allUppercaseWords;
		}

		public String getNoFirstUppercaseList() {
			return this.noFirstUppercaseList;
		}

		public void setNoFirstUppercaseList(String noFirstUppercaseList) {
			this.noFirstUppercaseList = noFirstUppercaseList;
		}

		public String getDuplicateWords() {
			return this.duplicateWords;
		}

		public void setDuplicateWords(String duplicateWords) {
			this.duplicateWords = duplicateWords;
		}

		public String getDisableWords() {
			return this.disableWords;
		}

		public void setDisableWords(String disableWords) {
			this.disableWords = disableWords;
		}

		public String getWordCount() {
			return this.wordCount;
		}

		public void setWordCount(String wordCount) {
			this.wordCount = wordCount;
		}

		public String getTotalScore() {
			return this.totalScore;
		}

		public void setTotalScore(String totalScore) {
			this.totalScore = totalScore;
		}

		public String getLanguageQualityScore() {
			return this.languageQualityScore;
		}

		public void setLanguageQualityScore(String languageQualityScore) {
			this.languageQualityScore = languageQualityScore;
		}
	}

	@Override
	public GetTitleDiagnoseResponse getInstance(UnmarshallerContext context) {
		return	GetTitleDiagnoseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
