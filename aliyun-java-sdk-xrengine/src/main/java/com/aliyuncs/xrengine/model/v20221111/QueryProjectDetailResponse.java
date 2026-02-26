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
import com.aliyuncs.xrengine.transform.v20221111.QueryProjectDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryProjectDetailResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String errorName;

	private String requestId;

	private Integer httpCode;

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

	public String getErrorName() {
		return this.errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
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

		private String bizUsage;

		private String id;

		private Boolean deleted;

		private String createTime;

		private String modifiedTime;

		private String dependencies;

		private String materialCoverUrl;

		private String ext;

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

		public String getBizUsage() {
			return this.bizUsage;
		}

		public void setBizUsage(String bizUsage) {
			this.bizUsage = bizUsage;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Boolean getDeleted() {
			return this.deleted;
		}

		public void setDeleted(Boolean deleted) {
			this.deleted = deleted;
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

		public String getDependencies() {
			return this.dependencies;
		}

		public void setDependencies(String dependencies) {
			this.dependencies = dependencies;
		}

		public String getMaterialCoverUrl() {
			return this.materialCoverUrl;
		}

		public void setMaterialCoverUrl(String materialCoverUrl) {
			this.materialCoverUrl = materialCoverUrl;
		}

		public String getExt() {
			return this.ext;
		}

		public void setExt(String ext) {
			this.ext = ext;
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

			private String ossKey;

			private String id;

			private Boolean deleted;

			private String createTime;

			private String modifiedTime;

			private List<FilesItem> files;

			private List<ClothesItem> clothes;

			private Policy policy;

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

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
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

			public List<FilesItem> getFiles() {
				return this.files;
			}

			public void setFiles(List<FilesItem> files) {
				this.files = files;
			}

			public List<ClothesItem> getClothes() {
				return this.clothes;
			}

			public void setClothes(List<ClothesItem> clothes) {
				this.clothes = clothes;
			}

			public Policy getPolicy() {
				return this.policy;
			}

			public void setPolicy(Policy policy) {
				this.policy = policy;
			}

			public static class FilesItem {

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

			public static class ClothesItem {

				private String id;

				private String ossKey;

				private String type;

				private String name;

				private String coverUrl;

				public String getId() {
					return this.id;
				}

				public void setId(String id) {
					this.id = id;
				}

				public String getOssKey() {
					return this.ossKey;
				}

				public void setOssKey(String ossKey) {
					this.ossKey = ossKey;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getCoverUrl() {
					return this.coverUrl;
				}

				public void setCoverUrl(String coverUrl) {
					this.coverUrl = coverUrl;
				}
			}

			public static class Policy {

				private String accessId;

				private String policy;

				private String signature;

				private String dir;

				private String host;

				private String expire;

				public String getAccessId() {
					return this.accessId;
				}

				public void setAccessId(String accessId) {
					this.accessId = accessId;
				}

				public String getPolicy() {
					return this.policy;
				}

				public void setPolicy(String policy) {
					this.policy = policy;
				}

				public String getSignature() {
					return this.signature;
				}

				public void setSignature(String signature) {
					this.signature = signature;
				}

				public String getDir() {
					return this.dir;
				}

				public void setDir(String dir) {
					this.dir = dir;
				}

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getExpire() {
					return this.expire;
				}

				public void setExpire(String expire) {
					this.expire = expire;
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

			private String id;

			private Boolean deleted;

			private String createTime;

			private String modifiedTime;

			private String glbModelUrl;

			private Map<Object,Object> buildResultUrl;

			private String errorMessage;

			private String errorCode;

			private Policy1 policy1;

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

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public Boolean getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Boolean deleted) {
				this.deleted = deleted;
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

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public Policy1 getPolicy1() {
				return this.policy1;
			}

			public void setPolicy1(Policy1 policy1) {
				this.policy1 = policy1;
			}

			public static class Policy1 {

				private String accessId;

				private String policy;

				private String signature;

				private String dir;

				private String host;

				private String expire;

				public String getAccessId() {
					return this.accessId;
				}

				public void setAccessId(String accessId) {
					this.accessId = accessId;
				}

				public String getPolicy() {
					return this.policy;
				}

				public void setPolicy(String policy) {
					this.policy = policy;
				}

				public String getSignature() {
					return this.signature;
				}

				public void setSignature(String signature) {
					this.signature = signature;
				}

				public String getDir() {
					return this.dir;
				}

				public void setDir(String dir) {
					this.dir = dir;
				}

				public String getHost() {
					return this.host;
				}

				public void setHost(String host) {
					this.host = host;
				}

				public String getExpire() {
					return this.expire;
				}

				public void setExpire(String expire) {
					this.expire = expire;
				}
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
	public QueryProjectDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryProjectDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
