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
import com.aliyuncs.xrengine.transform.v20221111.ListProjectResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListProjectResponse extends AcsResponse {

	private Integer current;

	private Integer size;

	private Integer total;

	private Integer pages;

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private List<DataItem> data;

	public Integer getCurrent() {
		return this.current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPages() {
		return this.pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
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

		private Map<Object,Object> extInfo;

		private String materialCoverUrl;

		private Dataset dataset;

		private User user;

		private Source source;

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

		public Map<Object,Object> getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(Map<Object,Object> extInfo) {
			this.extInfo = extInfo;
		}

		public String getMaterialCoverUrl() {
			return this.materialCoverUrl;
		}

		public void setMaterialCoverUrl(String materialCoverUrl) {
			this.materialCoverUrl = materialCoverUrl;
		}

		public Dataset getDataset() {
			return this.dataset;
		}

		public void setDataset(Dataset dataset) {
			this.dataset = dataset;
		}

		public User getUser() {
			return this.user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Source getSource() {
			return this.source;
		}

		public void setSource(Source source) {
			this.source = source;
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

			private String errorMessage;

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

			public String getErrorMessage() {
				return this.errorMessage;
			}

			public void setErrorMessage(String errorMessage) {
				this.errorMessage = errorMessage;
			}
		}

		public static class User {

			private String nickname;

			private String aliyunUid;

			private String createTime;

			private String modifiedTime;

			public String getNickname() {
				return this.nickname;
			}

			public void setNickname(String nickname) {
				this.nickname = nickname;
			}

			public String getAliyunUid() {
				return this.aliyunUid;
			}

			public void setAliyunUid(String aliyunUid) {
				this.aliyunUid = aliyunUid;
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
		}

		public static class Source {

			private String ossKey;

			private List<FilesItem> files;

			private List<ClothesItem> clothes;

			public String getOssKey() {
				return this.ossKey;
			}

			public void setOssKey(String ossKey) {
				this.ossKey = ossKey;
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

				private String ossKey;

				private String type;

				private String name;

				private String coverUrl;

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
		}
	}

	@Override
	public ListProjectResponse getInstance(UnmarshallerContext context) {
		return	ListProjectResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
