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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.GetBackupInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBackupInfoResponse extends AcsResponse {

	private String requestId;

	private String id;

	private String backupPlanId;

	private String clusterId;

	private Long createTime;

	private String md5;

	private String tarFileName;

	private String storePath;

	private String status;

	private MetadataInfo metadataInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBackupPlanId() {
		return this.backupPlanId;
	}

	public void setBackupPlanId(String backupPlanId) {
		this.backupPlanId = backupPlanId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public Long getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getTarFileName() {
		return this.tarFileName;
	}

	public void setTarFileName(String tarFileName) {
		this.tarFileName = tarFileName;
	}

	public String getStorePath() {
		return this.storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public MetadataInfo getMetadataInfo() {
		return this.metadataInfo;
	}

	public void setMetadataInfo(MetadataInfo metadataInfo) {
		this.metadataInfo = metadataInfo;
	}

	public static class MetadataInfo {

		private String metadataType;

		private String properties;

		public String getMetadataType() {
			return this.metadataType;
		}

		public void setMetadataType(String metadataType) {
			this.metadataType = metadataType;
		}

		public String getProperties() {
			return this.properties;
		}

		public void setProperties(String properties) {
			this.properties = properties;
		}
	}

	@Override
	public GetBackupInfoResponse getInstance(UnmarshallerContext context) {
		return	GetBackupInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
