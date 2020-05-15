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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListImagesResponse extends AcsResponse {

	private String requestId;

	private List<OsInfo> osTags;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OsInfo> getOsTags() {
		return this.osTags;
	}

	public void setOsTags(List<OsInfo> osTags) {
		this.osTags = osTags;
	}

	public static class OsInfo {

		private String osTag;

		private String platform;

		private String version;

		private String architecture;

		private String baseOsTag;

		private String imageId;

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

		public String getBaseOsTag() {
			return this.baseOsTag;
		}

		public void setBaseOsTag(String baseOsTag) {
			this.baseOsTag = baseOsTag;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}
	}

	@Override
	public ListImagesResponse getInstance(UnmarshallerContext context) {
		return	ListImagesResponseUnmarshaller.unmarshall(this, context);
	}
}
