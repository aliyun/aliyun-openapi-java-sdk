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

package com.aliyuncs.cr.model.v20181201;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cr.transform.v20181201.GetRepoTagManifestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRepoTagManifestResponse extends AcsResponse {

	private Boolean isSuccess;

	private String code;

	private String requestId;

	private Manifest manifest;

	public Boolean getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Manifest getManifest() {
		return this.manifest;
	}

	public void setManifest(Manifest manifest) {
		this.manifest = manifest;
	}

	public static class Manifest {

		private Integer schemaVersion;

		private String name;

		private String tag;

		private String architecture;

		private String mediaType;

		private List<FsLayersItem> fsLayers;

		private List<HistoryItem> history;

		private List<SignaturesItem> signatures;

		private List<LayersItem> layers;

		private Config config;

		public Integer getSchemaVersion() {
			return this.schemaVersion;
		}

		public void setSchemaVersion(Integer schemaVersion) {
			this.schemaVersion = schemaVersion;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getArchitecture() {
			return this.architecture;
		}

		public void setArchitecture(String architecture) {
			this.architecture = architecture;
		}

		public String getMediaType() {
			return this.mediaType;
		}

		public void setMediaType(String mediaType) {
			this.mediaType = mediaType;
		}

		public List<FsLayersItem> getFsLayers() {
			return this.fsLayers;
		}

		public void setFsLayers(List<FsLayersItem> fsLayers) {
			this.fsLayers = fsLayers;
		}

		public List<HistoryItem> getHistory() {
			return this.history;
		}

		public void setHistory(List<HistoryItem> history) {
			this.history = history;
		}

		public List<SignaturesItem> getSignatures() {
			return this.signatures;
		}

		public void setSignatures(List<SignaturesItem> signatures) {
			this.signatures = signatures;
		}

		public List<LayersItem> getLayers() {
			return this.layers;
		}

		public void setLayers(List<LayersItem> layers) {
			this.layers = layers;
		}

		public Config getConfig() {
			return this.config;
		}

		public void setConfig(Config config) {
			this.config = config;
		}

		public static class FsLayersItem {

			private String blobSum;

			public String getBlobSum() {
				return this.blobSum;
			}

			public void setBlobSum(String blobSum) {
				this.blobSum = blobSum;
			}
		}

		public static class HistoryItem {

			private Map<Object,Object> v1Compatibility;

			public Map<Object,Object> getV1Compatibility() {
				return this.v1Compatibility;
			}

			public void setV1Compatibility(Map<Object,Object> v1Compatibility) {
				this.v1Compatibility = v1Compatibility;
			}
		}

		public static class SignaturesItem {

			private Map<Object,Object> header;

			private String signature;

			private String _protected;

			public Map<Object,Object> getHeader() {
				return this.header;
			}

			public void setHeader(Map<Object,Object> header) {
				this.header = header;
			}

			public String getSignature() {
				return this.signature;
			}

			public void setSignature(String signature) {
				this.signature = signature;
			}

			public String get_Protected() {
				return this._protected;
			}

			public void set_Protected(String _protected) {
				this._protected = _protected;
			}
		}

		public static class LayersItem {

			private String mediaType;

			private Long size;

			private String digest;

			public String getMediaType() {
				return this.mediaType;
			}

			public void setMediaType(String mediaType) {
				this.mediaType = mediaType;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getDigest() {
				return this.digest;
			}

			public void setDigest(String digest) {
				this.digest = digest;
			}
		}

		public static class Config {

			private String mediaType;

			private Long size;

			private String digest;

			public String getMediaType() {
				return this.mediaType;
			}

			public void setMediaType(String mediaType) {
				this.mediaType = mediaType;
			}

			public Long getSize() {
				return this.size;
			}

			public void setSize(Long size) {
				this.size = size;
			}

			public String getDigest() {
				return this.digest;
			}

			public void setDigest(String digest) {
				this.digest = digest;
			}
		}
	}

	@Override
	public GetRepoTagManifestResponse getInstance(UnmarshallerContext context) {
		return	GetRepoTagManifestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
