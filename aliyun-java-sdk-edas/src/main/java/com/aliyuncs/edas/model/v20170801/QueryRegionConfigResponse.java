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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.edas.transform.v20170801.QueryRegionConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRegionConfigResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private RegionConfig regionConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RegionConfig getRegionConfig() {
		return this.regionConfig;
	}

	public void setRegionConfig(RegionConfig regionConfig) {
		this.regionConfig = regionConfig;
	}

	public static class RegionConfig {

		private String addressServerHost;

		private String agentInstallScript;

		private String fileServerType;

		private String id;

		private String imageId;

		private String name;

		private Integer no;

		private String tag;

		private FileServerConfig fileServerConfig;

		public String getAddressServerHost() {
			return this.addressServerHost;
		}

		public void setAddressServerHost(String addressServerHost) {
			this.addressServerHost = addressServerHost;
		}

		public String getAgentInstallScript() {
			return this.agentInstallScript;
		}

		public void setAgentInstallScript(String agentInstallScript) {
			this.agentInstallScript = agentInstallScript;
		}

		public String getFileServerType() {
			return this.fileServerType;
		}

		public void setFileServerType(String fileServerType) {
			this.fileServerType = fileServerType;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getNo() {
			return this.no;
		}

		public void setNo(Integer no) {
			this.no = no;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public FileServerConfig getFileServerConfig() {
			return this.fileServerConfig;
		}

		public void setFileServerConfig(FileServerConfig fileServerConfig) {
			this.fileServerConfig = fileServerConfig;
		}

		public static class FileServerConfig {

			private String bucket;

			private String internalUrl;

			private String publicUrl;

			private String vpcUrl;

			public String getBucket() {
				return this.bucket;
			}

			public void setBucket(String bucket) {
				this.bucket = bucket;
			}

			public String getInternalUrl() {
				return this.internalUrl;
			}

			public void setInternalUrl(String internalUrl) {
				this.internalUrl = internalUrl;
			}

			public String getPublicUrl() {
				return this.publicUrl;
			}

			public void setPublicUrl(String publicUrl) {
				this.publicUrl = publicUrl;
			}

			public String getVpcUrl() {
				return this.vpcUrl;
			}

			public void setVpcUrl(String vpcUrl) {
				this.vpcUrl = vpcUrl;
			}
		}
	}

	@Override
	public QueryRegionConfigResponse getInstance(UnmarshallerContext context) {
		return	QueryRegionConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
