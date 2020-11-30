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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.GetQualityRuleDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQualityRuleDetailResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private Integer matchType;

		private Long ruleId;

		private String name;

		private String ruleCreateTime;

		private Integer ruleTag;

		private List<String> keyWords;

		public Integer getMatchType() {
			return this.matchType;
		}

		public void setMatchType(Integer matchType) {
			this.matchType = matchType;
		}

		public Long getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(Long ruleId) {
			this.ruleId = ruleId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRuleCreateTime() {
			return this.ruleCreateTime;
		}

		public void setRuleCreateTime(String ruleCreateTime) {
			this.ruleCreateTime = ruleCreateTime;
		}

		public Integer getRuleTag() {
			return this.ruleTag;
		}

		public void setRuleTag(Integer ruleTag) {
			this.ruleTag = ruleTag;
		}

		public List<String> getKeyWords() {
			return this.keyWords;
		}

		public void setKeyWords(List<String> keyWords) {
			this.keyWords = keyWords;
		}
	}

	@Override
	public GetQualityRuleDetailResponse getInstance(UnmarshallerContext context) {
		return	GetQualityRuleDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
