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

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetWatermarkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetWatermarkResponse extends AcsResponse {

	private String requestId;

	private WatermarkInfo watermarkInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public WatermarkInfo getWatermarkInfo() {
		return this.watermarkInfo;
	}

	public void setWatermarkInfo(WatermarkInfo watermarkInfo) {
		this.watermarkInfo = watermarkInfo;
	}

	public static class WatermarkInfo {

		private String creationTime;

		private String type;

		private String isDefault;

		private String watermarkId;

		private String name;

		private String fileUrl;

		private String watermarkConfig;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(String isDefault) {
			this.isDefault = isDefault;
		}

		public String getWatermarkId() {
			return this.watermarkId;
		}

		public void setWatermarkId(String watermarkId) {
			this.watermarkId = watermarkId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getFileUrl() {
			return this.fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}

		public String getWatermarkConfig() {
			return this.watermarkConfig;
		}

		public void setWatermarkConfig(String watermarkConfig) {
			this.watermarkConfig = watermarkConfig;
		}
	}

	@Override
	public GetWatermarkResponse getInstance(UnmarshallerContext context) {
		return	GetWatermarkResponseUnmarshaller.unmarshall(this, context);
	}
}
