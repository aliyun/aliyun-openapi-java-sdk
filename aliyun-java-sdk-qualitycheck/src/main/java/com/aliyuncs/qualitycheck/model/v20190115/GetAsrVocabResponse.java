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
import com.aliyuncs.qualitycheck.transform.v20190115.GetAsrVocabResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAsrVocabResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String name;

		private Integer asrVersion;

		private String modelCustomizationId;

		private List<Word> words;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAsrVersion() {
			return this.asrVersion;
		}

		public void setAsrVersion(Integer asrVersion) {
			this.asrVersion = asrVersion;
		}

		public String getModelCustomizationId() {
			return this.modelCustomizationId;
		}

		public void setModelCustomizationId(String modelCustomizationId) {
			this.modelCustomizationId = modelCustomizationId;
		}

		public List<Word> getWords() {
			return this.words;
		}

		public void setWords(List<Word> words) {
			this.words = words;
		}

		public static class Word {

			private Integer weight;

			private String word;

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}

			public String getWord() {
				return this.word;
			}

			public void setWord(String word) {
				this.word = word;
			}
		}
	}

	@Override
	public GetAsrVocabResponse getInstance(UnmarshallerContext context) {
		return	GetAsrVocabResponseUnmarshaller.unmarshall(this, context);
	}
}
