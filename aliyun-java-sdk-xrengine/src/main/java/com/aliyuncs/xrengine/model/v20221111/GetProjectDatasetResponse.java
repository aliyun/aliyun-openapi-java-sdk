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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.xrengine.transform.v20221111.GetProjectDatasetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetProjectDatasetResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String title;

		private String type;

		private String status;

		private String createMode;

		private String intro;

		private String id;

		private String createTime;

		private String modifiedTime;

		private String bizUsage;

		private Dataset dataset;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateMode() {
			return this.createMode;
		}

		public void setCreateMode(String createMode) {
			this.createMode = createMode;
		}

		public String getIntro() {
			return this.intro;
		}

		public void setIntro(String intro) {
			this.intro = intro;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getBizUsage() {
			return this.bizUsage;
		}

		public void setBizUsage(String bizUsage) {
			this.bizUsage = bizUsage;
		}

		public Dataset getDataset() {
			return this.dataset;
		}

		public void setDataset(Dataset dataset) {
			this.dataset = dataset;
		}

		public static class Dataset {

			private String ossKey;

			private String id;

			private String createTime;

			private String modifiedTime;

			private String modelUrl;

			private String coverUrl;

			private String previewUrl;

			private String poseUrl;

			private String originResultUrl;

			public String getOssKey() {
				return this.ossKey;
			}

			public void setOssKey(String ossKey) {
				this.ossKey = ossKey;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifiedTime() {
				return this.modifiedTime;
			}

			public void setModifiedTime(String modifiedTime) {
				this.modifiedTime = modifiedTime;
			}

			public String getModelUrl() {
				return this.modelUrl;
			}

			public void setModelUrl(String modelUrl) {
				this.modelUrl = modelUrl;
			}

			public String getCoverUrl() {
				return this.coverUrl;
			}

			public void setCoverUrl(String coverUrl) {
				this.coverUrl = coverUrl;
			}

			public String getPreviewUrl() {
				return this.previewUrl;
			}

			public void setPreviewUrl(String previewUrl) {
				this.previewUrl = previewUrl;
			}

			public String getPoseUrl() {
				return this.poseUrl;
			}

			public void setPoseUrl(String poseUrl) {
				this.poseUrl = poseUrl;
			}

			public String getOriginResultUrl() {
				return this.originResultUrl;
			}

			public void setOriginResultUrl(String originResultUrl) {
				this.originResultUrl = originResultUrl;
			}
		}
	}

	@Override
	public GetProjectDatasetResponse getInstance(UnmarshallerContext context) {
		return	GetProjectDatasetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
