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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.ListItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListItemsResponse extends AcsResponse {

	private String requestId;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private String errorMsg;

	private String errorCode;

	private Boolean success;

	private Boolean allowRetry;

	private String appName;

	private List<String> errorArgs;

	private Module module;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Boolean getAllowRetry() {
		return this.allowRetry;
	}

	public void setAllowRetry(Boolean allowRetry) {
		this.allowRetry = allowRetry;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public List<String> getErrorArgs() {
		return this.errorArgs;
	}

	public void setErrorArgs(List<String> errorArgs) {
		this.errorArgs = errorArgs;
	}

	public Module getModule() {
		return this.module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public static class Module {

		private Integer totalNum;

		private List<Item> items;

		public Integer getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Integer totalNum) {
			this.totalNum = totalNum;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private Integer itemId;

			private String title;

			private String picUrl;

			private String description;

			private Integer leftNum;

			private Integer totalNum;

			public Integer getItemId() {
				return this.itemId;
			}

			public void setItemId(Integer itemId) {
				this.itemId = itemId;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public String getPicUrl() {
				return this.picUrl;
			}

			public void setPicUrl(String picUrl) {
				this.picUrl = picUrl;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getLeftNum() {
				return this.leftNum;
			}

			public void setLeftNum(Integer leftNum) {
				this.leftNum = leftNum;
			}

			public Integer getTotalNum() {
				return this.totalNum;
			}

			public void setTotalNum(Integer totalNum) {
				this.totalNum = totalNum;
			}
		}
	}

	@Override
	public ListItemsResponse getInstance(UnmarshallerContext context) {
		return	ListItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
