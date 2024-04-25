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

package com.aliyuncs.ehpcinstant.model.v20230701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpcinstant.transform.v20230701.GetImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetImageResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private Image image;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Image getImage() {
		return this.image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public static class Image {

		private String imageType;

		private String appId;

		private String name;

		private String version;

		private String label;

		private String description;

		private String size;

		private String createTime;

		private String updateTime;

		private ContainerImageSpec containerImageSpec;

		private VMImageSpec vMImageSpec;

		public String getImageType() {
			return this.imageType;
		}

		public void setImageType(String imageType) {
			this.imageType = imageType;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public ContainerImageSpec getContainerImageSpec() {
			return this.containerImageSpec;
		}

		public void setContainerImageSpec(ContainerImageSpec containerImageSpec) {
			this.containerImageSpec = containerImageSpec;
		}

		public VMImageSpec getVMImageSpec() {
			return this.vMImageSpec;
		}

		public void setVMImageSpec(VMImageSpec vMImageSpec) {
			this.vMImageSpec = vMImageSpec;
		}

		public static class ContainerImageSpec {

			private String registryUrl;

			private Boolean isACRRegistry;

			private Boolean isACREnterprise;

			private String registryCriId;

			private RegistryCredential registryCredential;

			public String getRegistryUrl() {
				return this.registryUrl;
			}

			public void setRegistryUrl(String registryUrl) {
				this.registryUrl = registryUrl;
			}

			public Boolean getIsACRRegistry() {
				return this.isACRRegistry;
			}

			public void setIsACRRegistry(Boolean isACRRegistry) {
				this.isACRRegistry = isACRRegistry;
			}

			public Boolean getIsACREnterprise() {
				return this.isACREnterprise;
			}

			public void setIsACREnterprise(Boolean isACREnterprise) {
				this.isACREnterprise = isACREnterprise;
			}

			public String getRegistryCriId() {
				return this.registryCriId;
			}

			public void setRegistryCriId(String registryCriId) {
				this.registryCriId = registryCriId;
			}

			public RegistryCredential getRegistryCredential() {
				return this.registryCredential;
			}

			public void setRegistryCredential(RegistryCredential registryCredential) {
				this.registryCredential = registryCredential;
			}

			public static class RegistryCredential {

				private String server;

				private String userName;

				private String password;

				public String getServer() {
					return this.server;
				}

				public void setServer(String server) {
					this.server = server;
				}

				public String getUserName() {
					return this.userName;
				}

				public void setUserName(String userName) {
					this.userName = userName;
				}

				public String getPassword() {
					return this.password;
				}

				public void setPassword(String password) {
					this.password = password;
				}
			}
		}

		public static class VMImageSpec {

			private String imageId;

			private String osTag;

			private String platform;

			private String version;

			private String architecture;

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getOsTag() {
				return this.osTag;
			}

			public void setOsTag(String osTag) {
				this.osTag = osTag;
			}

			public String getPlatform() {
				return this.platform;
			}

			public void setPlatform(String platform) {
				this.platform = platform;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}

			public String getArchitecture() {
				return this.architecture;
			}

			public void setArchitecture(String architecture) {
				this.architecture = architecture;
			}
		}
	}

	@Override
	public GetImageResponse getInstance(UnmarshallerContext context) {
		return	GetImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
