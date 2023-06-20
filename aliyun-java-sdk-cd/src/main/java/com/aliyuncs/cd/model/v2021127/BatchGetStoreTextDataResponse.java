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

package com.aliyuncs.cd.model.v2021127;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cd.transform.v2021127.BatchGetStoreTextDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchGetStoreTextDataResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String code;

	private Integer httpStatusCode;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String storeId;

		private List<Container> containers;

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public List<Container> getContainers() {
			return this.containers;
		}

		public void setContainers(List<Container> containers) {
			this.containers = containers;
		}

		public static class Container {

			private String type;

			private String title;

			private Integer visible;

			private List<ContainerDataItem> containerData;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getTitle() {
				return this.title;
			}

			public void setTitle(String title) {
				this.title = title;
			}

			public Integer getVisible() {
				return this.visible;
			}

			public void setVisible(Integer visible) {
				this.visible = visible;
			}

			public List<ContainerDataItem> getContainerData() {
				return this.containerData;
			}

			public void setContainerData(List<ContainerDataItem> containerData) {
				this.containerData = containerData;
			}

			public static class ContainerDataItem {

				private String mark;

				private String text;

				private String subText;

				private String color;

				private Integer bold;

				public String getMark() {
					return this.mark;
				}

				public void setMark(String mark) {
					this.mark = mark;
				}

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public String getSubText() {
					return this.subText;
				}

				public void setSubText(String subText) {
					this.subText = subText;
				}

				public String getColor() {
					return this.color;
				}

				public void setColor(String color) {
					this.color = color;
				}

				public Integer getBold() {
					return this.bold;
				}

				public void setBold(Integer bold) {
					this.bold = bold;
				}
			}
		}
	}

	@Override
	public BatchGetStoreTextDataResponse getInstance(UnmarshallerContext context) {
		return	BatchGetStoreTextDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
