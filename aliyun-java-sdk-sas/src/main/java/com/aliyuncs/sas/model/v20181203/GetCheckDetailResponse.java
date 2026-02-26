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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.GetCheckDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCheckDetailResponse extends AcsResponse {

	private String requestId;

	private List<CustomConfigsItem> customConfigs;

	private Description description;

	private Solution solution;

	private AssistInfo assistInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CustomConfigsItem> getCustomConfigs() {
		return this.customConfigs;
	}

	public void setCustomConfigs(List<CustomConfigsItem> customConfigs) {
		this.customConfigs = customConfigs;
	}

	public Description getDescription() {
		return this.description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Solution getSolution() {
		return this.solution;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}

	public AssistInfo getAssistInfo() {
		return this.assistInfo;
	}

	public void setAssistInfo(AssistInfo assistInfo) {
		this.assistInfo = assistInfo;
	}

	public static class CustomConfigsItem {

		private String name;

		private String typeDefine;

		private String defaultValue;

		private String value;

		private String showName;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTypeDefine() {
			return this.typeDefine;
		}

		public void setTypeDefine(String typeDefine) {
			this.typeDefine = typeDefine;
		}

		public String getDefaultValue() {
			return this.defaultValue;
		}

		public void setDefaultValue(String defaultValue) {
			this.defaultValue = defaultValue;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getShowName() {
			return this.showName;
		}

		public void setShowName(String showName) {
			this.showName = showName;
		}
	}

	public static class Description {

		private String type;

		private String value;

		private String link;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}
	}

	public static class Solution {

		private String type;

		private String value;

		private String link;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}
	}

	public static class AssistInfo {

		private String type;

		private String value;

		private String link;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getLink() {
			return this.link;
		}

		public void setLink(String link) {
			this.link = link;
		}
	}

	@Override
	public GetCheckDetailResponse getInstance(UnmarshallerContext context) {
		return	GetCheckDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
