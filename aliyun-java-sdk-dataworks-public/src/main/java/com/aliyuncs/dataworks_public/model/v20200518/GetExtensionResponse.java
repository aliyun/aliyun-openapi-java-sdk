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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.GetExtensionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetExtensionResponse extends AcsResponse {

	private String requestId;

	private Extension extension;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Extension getExtension() {
		return this.extension;
	}

	public void setExtension(Extension extension) {
		this.extension = extension;
	}

	public static class Extension {

		private String extensionCode;

		private String extensionName;

		private String extensionDesc;

		private String helpDocUrl;

		private Integer status;

		private Long projectTesting;

		private String detailUrl;

		private String parameterSetting;

		private String optionSetting;

		private List<BindEventListItem> bindEventList;

		private List<EventCategoryListItem> eventCategoryList;

		public String getExtensionCode() {
			return this.extensionCode;
		}

		public void setExtensionCode(String extensionCode) {
			this.extensionCode = extensionCode;
		}

		public String getExtensionName() {
			return this.extensionName;
		}

		public void setExtensionName(String extensionName) {
			this.extensionName = extensionName;
		}

		public String getExtensionDesc() {
			return this.extensionDesc;
		}

		public void setExtensionDesc(String extensionDesc) {
			this.extensionDesc = extensionDesc;
		}

		public String getHelpDocUrl() {
			return this.helpDocUrl;
		}

		public void setHelpDocUrl(String helpDocUrl) {
			this.helpDocUrl = helpDocUrl;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Long getProjectTesting() {
			return this.projectTesting;
		}

		public void setProjectTesting(Long projectTesting) {
			this.projectTesting = projectTesting;
		}

		public String getDetailUrl() {
			return this.detailUrl;
		}

		public void setDetailUrl(String detailUrl) {
			this.detailUrl = detailUrl;
		}

		public String getParameterSetting() {
			return this.parameterSetting;
		}

		public void setParameterSetting(String parameterSetting) {
			this.parameterSetting = parameterSetting;
		}

		public String getOptionSetting() {
			return this.optionSetting;
		}

		public void setOptionSetting(String optionSetting) {
			this.optionSetting = optionSetting;
		}

		public List<BindEventListItem> getBindEventList() {
			return this.bindEventList;
		}

		public void setBindEventList(List<BindEventListItem> bindEventList) {
			this.bindEventList = bindEventList;
		}

		public List<EventCategoryListItem> getEventCategoryList() {
			return this.eventCategoryList;
		}

		public void setEventCategoryList(List<EventCategoryListItem> eventCategoryList) {
			this.eventCategoryList = eventCategoryList;
		}

		public static class BindEventListItem {

			private String eventCode;

			private String eventName;

			public String getEventCode() {
				return this.eventCode;
			}

			public void setEventCode(String eventCode) {
				this.eventCode = eventCode;
			}

			public String getEventName() {
				return this.eventName;
			}

			public void setEventName(String eventName) {
				this.eventName = eventName;
			}
		}

		public static class EventCategoryListItem {

			private String categoryCode;

			private String categoryName;

			public String getCategoryCode() {
				return this.categoryCode;
			}

			public void setCategoryCode(String categoryCode) {
				this.categoryCode = categoryCode;
			}

			public String getCategoryName() {
				return this.categoryName;
			}

			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}
		}
	}

	@Override
	public GetExtensionResponse getInstance(UnmarshallerContext context) {
		return	GetExtensionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
