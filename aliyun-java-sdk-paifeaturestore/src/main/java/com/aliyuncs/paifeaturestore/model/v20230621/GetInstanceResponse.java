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

package com.aliyuncs.paifeaturestore.model.v20230621;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.paifeaturestore.transform.v20230621.GetInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResponse extends AcsResponse {

	private String requestId;

	private String status;

	private String regionId;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	private Double progress;

	private String message;

	private String type;

	private FeatureDBInstanceInfo featureDBInstanceInfo;

	private FeatureDBInfo featureDBInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getGmtCreateTime() {
		return this.gmtCreateTime;
	}

	public void setGmtCreateTime(String gmtCreateTime) {
		this.gmtCreateTime = gmtCreateTime;
	}

	public String getGmtModifiedTime() {
		return this.gmtModifiedTime;
	}

	public void setGmtModifiedTime(String gmtModifiedTime) {
		this.gmtModifiedTime = gmtModifiedTime;
	}

	public Double getProgress() {
		return this.progress;
	}

	public void setProgress(Double progress) {
		this.progress = progress;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public FeatureDBInstanceInfo getFeatureDBInstanceInfo() {
		return this.featureDBInstanceInfo;
	}

	public void setFeatureDBInstanceInfo(FeatureDBInstanceInfo featureDBInstanceInfo) {
		this.featureDBInstanceInfo = featureDBInstanceInfo;
	}

	public FeatureDBInfo getFeatureDBInfo() {
		return this.featureDBInfo;
	}

	public void setFeatureDBInfo(FeatureDBInfo featureDBInfo) {
		this.featureDBInfo = featureDBInfo;
	}

	public static class FeatureDBInstanceInfo {

		private String status;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	public static class FeatureDBInfo {

		private String status;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public GetInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
