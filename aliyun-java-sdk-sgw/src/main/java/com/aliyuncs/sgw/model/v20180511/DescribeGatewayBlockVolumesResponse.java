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

package com.aliyuncs.sgw.model.v20180511;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sgw.transform.v20180511.DescribeGatewayBlockVolumesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGatewayBlockVolumesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<BlockVolume> blockVolumes;

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

	public List<BlockVolume> getBlockVolumes() {
		return this.blockVolumes;
	}

	public void setBlockVolumes(List<BlockVolume> blockVolumes) {
		this.blockVolumes = blockVolumes;
	}

	public static class BlockVolume {

		private String name;

		private String diskId;

		private String diskType;

		private String protocol;

		private Long size;

		private Boolean enabled;

		private String state;

		private Long totalUpload;

		private Long totalDownload;

		private String ossBucketName;

		private String ossEndpoint;

		private Boolean ossBucketSsl;

		private String localPath;

		private Integer chunkSize;

		private String cacheMode;

		private String address;

		private String serialNumber;

		private String indexId;

		private String target;

		private Integer port;

		private Integer lunId;

		private Boolean chapEnabled;

		private String chapInUser;

		private String chapOutUser;

		private Integer status;

		private Integer volumeState;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getDiskType() {
			return this.diskType;
		}

		public void setDiskType(String diskType) {
			this.diskType = diskType;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getTotalUpload() {
			return this.totalUpload;
		}

		public void setTotalUpload(Long totalUpload) {
			this.totalUpload = totalUpload;
		}

		public Long getTotalDownload() {
			return this.totalDownload;
		}

		public void setTotalDownload(Long totalDownload) {
			this.totalDownload = totalDownload;
		}

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public Boolean getOssBucketSsl() {
			return this.ossBucketSsl;
		}

		public void setOssBucketSsl(Boolean ossBucketSsl) {
			this.ossBucketSsl = ossBucketSsl;
		}

		public String getLocalPath() {
			return this.localPath;
		}

		public void setLocalPath(String localPath) {
			this.localPath = localPath;
		}

		public Integer getChunkSize() {
			return this.chunkSize;
		}

		public void setChunkSize(Integer chunkSize) {
			this.chunkSize = chunkSize;
		}

		public String getCacheMode() {
			return this.cacheMode;
		}

		public void setCacheMode(String cacheMode) {
			this.cacheMode = cacheMode;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getSerialNumber() {
			return this.serialNumber;
		}

		public void setSerialNumber(String serialNumber) {
			this.serialNumber = serialNumber;
		}

		public String getIndexId() {
			return this.indexId;
		}

		public void setIndexId(String indexId) {
			this.indexId = indexId;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getLunId() {
			return this.lunId;
		}

		public void setLunId(Integer lunId) {
			this.lunId = lunId;
		}

		public Boolean getChapEnabled() {
			return this.chapEnabled;
		}

		public void setChapEnabled(Boolean chapEnabled) {
			this.chapEnabled = chapEnabled;
		}

		public String getChapInUser() {
			return this.chapInUser;
		}

		public void setChapInUser(String chapInUser) {
			this.chapInUser = chapInUser;
		}

		public String getChapOutUser() {
			return this.chapOutUser;
		}

		public void setChapOutUser(String chapOutUser) {
			this.chapOutUser = chapOutUser;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Integer getVolumeState() {
			return this.volumeState;
		}

		public void setVolumeState(Integer volumeState) {
			this.volumeState = volumeState;
		}
	}

	@Override
	public DescribeGatewayBlockVolumesResponse getInstance(UnmarshallerContext context) {
		return	DescribeGatewayBlockVolumesResponseUnmarshaller.unmarshall(this, context);
	}
}
