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
import com.aliyuncs.qualitycheck.transform.v20190115.ListAsrVocabResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAsrVocabResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private List<AsrVocab> data;

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

	public List<AsrVocab> getData() {
		return this.data;
	}

	public void setData(List<AsrVocab> data) {
		this.data = data;
	}

	public static class AsrVocab {

		private String vocabularyId;

		private String updateTime;

		private String name;

		private String createTime;

		private String id;

		private Integer asrVersion;

		private String modelCustomizationId;

		public String getVocabularyId() {
			return this.vocabularyId;
		}

		public void setVocabularyId(String vocabularyId) {
			this.vocabularyId = vocabularyId;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
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
	}

	@Override
	public ListAsrVocabResponse getInstance(UnmarshallerContext context) {
		return	ListAsrVocabResponseUnmarshaller.unmarshall(this, context);
	}
}
