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

package com.aliyuncs.mpaas.model.v20200710;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.mpaas.transform.v20200710.GetTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String msg;

	private Data data;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String id;

		private String name;

		private String descInfo;

		private String title;

		private String content;

		private String uri;

		private String variables;

		private String pushStyle;

		private String imageUrls;

		private String iconUrls;

		private String showStyle;

		private String action;

		private String gmtCreate;

		private String gmtModified;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescInfo() {
			return this.descInfo;
		}

		public void setDescInfo(String descInfo) {
			this.descInfo = descInfo;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getUri() {
			return this.uri;
		}

		public void setUri(String uri) {
			this.uri = uri;
		}

		public String getVariables() {
			return this.variables;
		}

		public void setVariables(String variables) {
			this.variables = variables;
		}

		public String getPushStyle() {
			return this.pushStyle;
		}

		public void setPushStyle(String pushStyle) {
			this.pushStyle = pushStyle;
		}

		public String getImageUrls() {
			return this.imageUrls;
		}

		public void setImageUrls(String imageUrls) {
			this.imageUrls = imageUrls;
		}

		public String getIconUrls() {
			return this.iconUrls;
		}

		public void setIconUrls(String iconUrls) {
			this.iconUrls = iconUrls;
		}

		public String getShowStyle() {
			return this.showStyle;
		}

		public void setShowStyle(String showStyle) {
			this.showStyle = showStyle;
		}

		public String getAction() {
			return this.action;
		}

		public void setAction(String action) {
			this.action = action;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}
	}

	@Override
	public GetTemplateResponse getInstance(UnmarshallerContext context) {
		return	GetTemplateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
