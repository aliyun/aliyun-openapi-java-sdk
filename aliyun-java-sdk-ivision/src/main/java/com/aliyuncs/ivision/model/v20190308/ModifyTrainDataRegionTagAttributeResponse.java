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

package com.aliyuncs.ivision.model.v20190308;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ivision.transform.v20190308.ModifyTrainDataRegionTagAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyTrainDataRegionTagAttributeResponse extends AcsResponse {

	private String requestId;

	private TrainData trainData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TrainData getTrainData() {
		return this.trainData;
	}

	public void setTrainData(TrainData trainData) {
		this.trainData = trainData;
	}

	public static class TrainData {

		private String projectId;

		private String iterationId;

		private String dataId;

		private String dataName;

		private String dataUrl;

		private String creationTime;

		private String status;

		private String tagStatus;

		private List<TagItem> tagItems;

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getIterationId() {
			return this.iterationId;
		}

		public void setIterationId(String iterationId) {
			this.iterationId = iterationId;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getDataName() {
			return this.dataName;
		}

		public void setDataName(String dataName) {
			this.dataName = dataName;
		}

		public String getDataUrl() {
			return this.dataUrl;
		}

		public void setDataUrl(String dataUrl) {
			this.dataUrl = dataUrl;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getTagStatus() {
			return this.tagStatus;
		}

		public void setTagStatus(String tagStatus) {
			this.tagStatus = tagStatus;
		}

		public List<TagItem> getTagItems() {
			return this.tagItems;
		}

		public void setTagItems(List<TagItem> tagItems) {
			this.tagItems = tagItems;
		}

		public static class TagItem {

			private String tagId;

			private String regionType;

			private Region region;

			public String getTagId() {
				return this.tagId;
			}

			public void setTagId(String tagId) {
				this.tagId = tagId;
			}

			public String getRegionType() {
				return this.regionType;
			}

			public void setRegionType(String regionType) {
				this.regionType = regionType;
			}

			public Region getRegion() {
				return this.region;
			}

			public void setRegion(Region region) {
				this.region = region;
			}

			public static class Region {

				private String left;

				private String top;

				private String width;

				private String height;

				public String getLeft() {
					return this.left;
				}

				public void setLeft(String left) {
					this.left = left;
				}

				public String getTop() {
					return this.top;
				}

				public void setTop(String top) {
					this.top = top;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}
			}
		}
	}

	@Override
	public ModifyTrainDataRegionTagAttributeResponse getInstance(UnmarshallerContext context) {
		return	ModifyTrainDataRegionTagAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
