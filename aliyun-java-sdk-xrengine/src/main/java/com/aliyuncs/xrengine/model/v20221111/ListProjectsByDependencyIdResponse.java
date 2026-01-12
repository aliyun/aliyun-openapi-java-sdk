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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xrengine.transform.v20221111.ListProjectsByDependencyIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectsByDependencyIdResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private String errorName;

	private List<DataItem> data;

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

	public String getErrorName() {
		return this.errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String title;

		private String type;

		private String status;

		private String intro;

		private String id;

		private String createTime;

		private String modifiedTime;

		private String ext;

		private String bizUsage;

		private Source source;

		private Dataset dataset;

		private BuildDetail buildDetail;

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

		public String getExt() {
			return this.ext;
		}

		public void setExt(String ext) {
			this.ext = ext;
		}

		public String getBizUsage() {
			return this.bizUsage;
		}

		public void setBizUsage(String bizUsage) {
			this.bizUsage = bizUsage;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
		}

		public Dataset getDataset() {
			return this.dataset;
		}

		public void setDataset(Dataset dataset) {
			this.dataset = dataset;
		}

		public BuildDetail getBuildDetail() {
			return this.buildDetail;
		}

		public void setBuildDetail(BuildDetail buildDetail) {
			this.buildDetail = buildDetail;
		}

		public static class Source {

			private String id;

			private String createTime;

			private String modifiedTime;

			private String ossKey;

			private Long projectId;

			private List<SourceFilesItem> sourceFiles;

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

			public String getOssKey() {
				return this.ossKey;
			}

			public void setOssKey(String ossKey) {
				this.ossKey = ossKey;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public List<SourceFilesItem> getSourceFiles() {
				return this.sourceFiles;
			}

			public void setSourceFiles(List<SourceFilesItem> sourceFiles) {
				this.sourceFiles = sourceFiles;
			}

			public static class SourceFilesItem {

				private String id;

				private String fileName;

				private String type;

				private Long size;

				private String url;

				private String coverUrl;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getFileName() {
					return this.fileName;
				}

				public void setFileName(String fileName) {
					this.fileName = fileName;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Long getSize() {
					return this.size;
				}

				public void setSize(Long size) {
					this.size = size;
				}

				public String getUrl() {
					return this.url;
				}

				public void setUrl(String url) {
					this.url = url;
				}

				public String getCoverUrl() {
					return this.coverUrl;
				}

				public void setCoverUrl(String coverUrl) {
					this.coverUrl = coverUrl;
				}
			}
		}

		public static class Dataset {

			private String ossKey;

			private String coverUrl;

			private String previewUrl;

			private String modelUrl;

			private String poseUrl;

			private String originResultUrl;

			private String glbModelUrl;

			private Map<Object,Object> buildResultUrl;

			public String getOssKey() {
				return this.ossKey;
			}

			public void setOssKey(String ossKey) {
				this.ossKey = ossKey;
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

			public String getModelUrl() {
				return this.modelUrl;
			}

			public void setModelUrl(String modelUrl) {
				this.modelUrl = modelUrl;
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

			public String getGlbModelUrl() {
				return this.glbModelUrl;
			}

			public void setGlbModelUrl(String glbModelUrl) {
				this.glbModelUrl = glbModelUrl;
			}

			public Map<Object,Object> getBuildResultUrl() {
				return this.buildResultUrl;
			}

			public void setBuildResultUrl(Map<Object,Object> buildResultUrl) {
				this.buildResultUrl = buildResultUrl;
			}
		}

		public static class BuildDetail {

			private String submitTime;

			private String runningTime;

			private String completedTime;

			private Long estimatedDuration;

			private String errorMessage;

			public String getSubmitTime() {
				return this.submitTime;
			}

			public void setSubmitTime(String submitTime) {
				this.submitTime = submitTime;
			}

			public String getRunningTime() {
				return this.runningTime;
			}

			public void setRunningTime(String runningTime) {
				this.runningTime = runningTime;
			}

			public String getCompletedTime() {
				return this.completedTime;
			}

			public void setCompletedTime(String completedTime) {
				this.completedTime = completedTime;
			}

			public Long getEstimatedDuration() {
				return this.estimatedDuration;
			}

			public void setEstimatedDuration(Long estimatedDuration) {
				this.estimatedDuration = estimatedDuration;
			}

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}
		}
	}

	@Override
	public ListProjectsByDependencyIdResponse getInstance(UnmarshallerContext context) {
		return	ListProjectsByDependencyIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
