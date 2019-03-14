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

package com.aliyuncs.mopen.model.v20180211;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mopen.transform.v20180211.MoPenQueryCanvasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MoPenQueryCanvasResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private String description;

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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Canvas> canvasList;

		public List<Canvas> getCanvasList() {
			return this.canvasList;
		}

		public void setCanvasList(List<Canvas> canvasList) {
			this.canvasList = canvasList;
		}

		public static class Canvas {

			private Long id;

			private String deviceName;

			private String url;

			private Integer pageId;

			private String sessionId;

			private String createTime;

			private String lastModified;

			private Integer status;

			private String attribute;

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public String getBizUrl() {
				return this.url;
			}

			public void setBizUrl(String url) {
				this.url = url;
			}

			/**
			 * @deprecated use getBizUrl instead of this.
			 */
			@Deprecated
			public String getUrl() {
				return this.url;
			}

			/**
			 * @deprecated use setBizUrl instead of this.
			 */
			@Deprecated
			public void setUrl(String url) {
				this.url = url;
			}

			public Integer getPageId() {
				return this.pageId;
			}

			public void setPageId(Integer pageId) {
				this.pageId = pageId;
			}

			public String getSessionId() {
				return this.sessionId;
			}

			public void setSessionId(String sessionId) {
				this.sessionId = sessionId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getLastModified() {
				return this.lastModified;
			}

			public void setLastModified(String lastModified) {
				this.lastModified = lastModified;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getAttribute() {
				return this.attribute;
			}

			public void setAttribute(String attribute) {
				this.attribute = attribute;
			}
		}
	}

	@Override
	public MoPenQueryCanvasResponse getInstance(UnmarshallerContext context) {
		return	MoPenQueryCanvasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
