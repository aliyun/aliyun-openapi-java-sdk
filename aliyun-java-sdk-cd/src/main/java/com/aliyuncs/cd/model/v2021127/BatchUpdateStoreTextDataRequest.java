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

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchUpdateStoreTextDataRequest extends RoaAcsRequest<BatchUpdateStoreTextDataResponse> {
	   

	private String country;

	@SerializedName("storeTextData")
	private List<StoreTextData> storeTextData;
	public BatchUpdateStoreTextDataRequest() {
		super("cd", "2021-12-7", "BatchUpdateStoreTextData");
		setUriPattern("/BatchUpdateStoreTextData");
		setMethod(MethodType.POST);
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
		if(country != null){
			putBodyParameter("country", country);
		}
	}

	public List<StoreTextData> getStoreTextData() {
		return this.storeTextData;
	}

	public void setStoreTextData(List<StoreTextData> storeTextData) {
		this.storeTextData = storeTextData;	
		if (storeTextData != null) {
			putBodyParameter("StoreTextData" , new Gson().toJson(storeTextData));
		}	
	}

	public static class StoreTextData {

		@SerializedName("Containers")
		private List<ContainersItem> containers;

		@SerializedName("StoreId")
		private String storeId;

		public List<ContainersItem> getContainers() {
			return this.containers;
		}

		public void setContainers(List<ContainersItem> containers) {
			this.containers = containers;
		}

		public String getStoreId() {
			return this.storeId;
		}

		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}

		public static class ContainersItem {

			@SerializedName("Visible")
			private Integer visible;

			@SerializedName("Type")
			private String type;

			@SerializedName("Title")
			private String title;

			@SerializedName("ContainerData")
			private List<ContainerDataItem> containerData;

			public Integer getVisible() {
				return this.visible;
			}

			public void setVisible(Integer visible) {
				this.visible = visible;
			}

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

			public List<ContainerDataItem> getContainerData() {
				return this.containerData;
			}

			public void setContainerData(List<ContainerDataItem> containerData) {
				this.containerData = containerData;
			}

			public static class ContainerDataItem {

				@SerializedName("SubText")
				private String subText;

				@SerializedName("Color")
				private String color;

				@SerializedName("Text")
				private String text;

				@SerializedName("Bold")
				private Integer bold;

				@SerializedName("Mark")
				private String mark;

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

				public String getText() {
					return this.text;
				}

				public void setText(String text) {
					this.text = text;
				}

				public Integer getBold() {
					return this.bold;
				}

				public void setBold(Integer bold) {
					this.bold = bold;
				}

				public String getMark() {
					return this.mark;
				}

				public void setMark(String mark) {
					this.mark = mark;
				}
			}
		}
	}

	@Override
	public Class<BatchUpdateStoreTextDataResponse> getResponseClass() {
		return BatchUpdateStoreTextDataResponse.class;
	}

}
