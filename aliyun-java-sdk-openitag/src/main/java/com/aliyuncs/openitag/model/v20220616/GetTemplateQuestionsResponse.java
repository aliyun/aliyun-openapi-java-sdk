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

package com.aliyuncs.openitag.model.v20220616;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.openitag.transform.v20220616.GetTemplateQuestionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateQuestionsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String details;

	private Boolean success;

	private String errorCode;

	private List<QuestionConfigsItem> questionConfigs;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<QuestionConfigsItem> getQuestionConfigs() {
		return this.questionConfigs;
	}

	public void setQuestionConfigs(List<QuestionConfigsItem> questionConfigs) {
		this.questionConfigs = questionConfigs;
	}

	public static class QuestionConfigsItem {

		private String markTitle;

		private String markTitleAlias;

		private String type;

		private Boolean mustFill;

		private Boolean display;

		private Boolean selected;

		private String selectGroup;

		private String defaultResult;

		private String rule;

		private Boolean canSelect;

		private Map<Object,Object> exif;

		private String hotKeyMap;

		private String questionId;

		private List<OptionsItem> options;

		private List<String> children;

		private List<String> preOptions;

		public String getMarkTitle() {
			return this.markTitle;
		}

		public void setMarkTitle(String markTitle) {
			this.markTitle = markTitle;
		}

		public String getMarkTitleAlias() {
			return this.markTitleAlias;
		}

		public void setMarkTitleAlias(String markTitleAlias) {
			this.markTitleAlias = markTitleAlias;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getMustFill() {
			return this.mustFill;
		}

		public void setMustFill(Boolean mustFill) {
			this.mustFill = mustFill;
		}

		public Boolean getDisplay() {
			return this.display;
		}

		public void setDisplay(Boolean display) {
			this.display = display;
		}

		public Boolean getSelected() {
			return this.selected;
		}

		public void setSelected(Boolean selected) {
			this.selected = selected;
		}

		public String getSelectGroup() {
			return this.selectGroup;
		}

		public void setSelectGroup(String selectGroup) {
			this.selectGroup = selectGroup;
		}

		public String getDefaultResult() {
			return this.defaultResult;
		}

		public void setDefaultResult(String defaultResult) {
			this.defaultResult = defaultResult;
		}

		public String getRule() {
			return this.rule;
		}

		public void setRule(String rule) {
			this.rule = rule;
		}

		public Boolean getCanSelect() {
			return this.canSelect;
		}

		public void setCanSelect(Boolean canSelect) {
			this.canSelect = canSelect;
		}

		public Map<Object,Object> getExif() {
			return this.exif;
		}

		public void setExif(Map<Object,Object> exif) {
			this.exif = exif;
		}

		public String getHotKeyMap() {
			return this.hotKeyMap;
		}

		public void setHotKeyMap(String hotKeyMap) {
			this.hotKeyMap = hotKeyMap;
		}

		public String getQuestionId() {
			return this.questionId;
		}

		public void setQuestionId(String questionId) {
			this.questionId = questionId;
		}

		public List<OptionsItem> getOptions() {
			return this.options;
		}

		public void setOptions(List<OptionsItem> options) {
			this.options = options;
		}

		public List<String> getChildren() {
			return this.children;
		}

		public void setChildren(List<String> children) {
			this.children = children;
		}

		public List<String> getPreOptions() {
			return this.preOptions;
		}

		public void setPreOptions(List<String> preOptions) {
			this.preOptions = preOptions;
		}

		public static class OptionsItem {

			private String label;

			private String key;

			private String shortcut;

			private String color;

			private String remark;

			private List<String> children1;

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getShortcut() {
				return this.shortcut;
			}

			public void setShortcut(String shortcut) {
				this.shortcut = shortcut;
			}

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getRemark() {
				return this.remark;
			}

			public void setRemark(String remark) {
				this.remark = remark;
			}

			public List<String> getChildren1() {
				return this.children1;
			}

			public void setChildren1(List<String> children1) {
				this.children1 = children1;
			}
		}
	}

	@Override
	public GetTemplateQuestionsResponse getInstance(UnmarshallerContext context) {
		return	GetTemplateQuestionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
