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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.InspectImageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InspectImageResponse extends AcsResponse {

	private String requestId;

	private ImageStatus imageStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ImageStatus getImageStatus() {
		return this.imageStatus;
	}

	public void setImageStatus(ImageStatus imageStatus) {
		this.imageStatus = imageStatus;
	}

	public static class ImageStatus {

		private ImageInspectInfo imageInspectInfo;

		public ImageInspectInfo getImageInspectInfo() {
			return this.imageInspectInfo;
		}

		public void setImageInspectInfo(ImageInspectInfo imageInspectInfo) {
			this.imageInspectInfo = imageInspectInfo;
		}

		public static class ImageInspectInfo {

			private String buildArch;

			private String buildDate;

			private String bootStrap;

			private String defFrom;

			private String containerVersion;

			private String schemaVersion;

			public String getBuildArch() {
				return this.buildArch;
			}

			public void setBuildArch(String buildArch) {
				this.buildArch = buildArch;
			}

			public String getBuildDate() {
				return this.buildDate;
			}

			public void setBuildDate(String buildDate) {
				this.buildDate = buildDate;
			}

			public String getBootStrap() {
				return this.bootStrap;
			}

			public void setBootStrap(String bootStrap) {
				this.bootStrap = bootStrap;
			}

			public String getDefFrom() {
				return this.defFrom;
			}

			public void setDefFrom(String defFrom) {
				this.defFrom = defFrom;
			}

			public String getContainerVersion() {
				return this.containerVersion;
			}

			public void setContainerVersion(String containerVersion) {
				this.containerVersion = containerVersion;
			}

			public String getSchemaVersion() {
				return this.schemaVersion;
			}

			public void setSchemaVersion(String schemaVersion) {
				this.schemaVersion = schemaVersion;
			}
		}
	}

	@Override
	public InspectImageResponse getInstance(UnmarshallerContext context) {
		return	InspectImageResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
