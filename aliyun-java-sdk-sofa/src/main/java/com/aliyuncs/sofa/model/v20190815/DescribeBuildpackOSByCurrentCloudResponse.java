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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DescribeBuildpackOSByCurrentCloudResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBuildpackOSByCurrentCloudResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<BuildpackOsItem> buildpackOs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<BuildpackOsItem> getBuildpackOs() {
		return this.buildpackOs;
	}

	public void setBuildpackOs(List<BuildpackOsItem> buildpackOs) {
		this.buildpackOs = buildpackOs;
	}

	public static class BuildpackOsItem {

		private String creationTime;

		private String description;

		private String extraInfo;

		private String fullName;

		private Long id;

		private String modificationTime;

		private String name;

		private Long osBit;

		private Long osBitNum;

		private String version;

		private List<String> supportedCloudDisplayNames;

		private List<String> supportedCloudNames;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(String extraInfo) {
			this.extraInfo = extraInfo;
		}

		public String getFullName() {
			return this.fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getModificationTime() {
			return this.modificationTime;
		}

		public void setModificationTime(String modificationTime) {
			this.modificationTime = modificationTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getOsBit() {
			return this.osBit;
		}

		public void setOsBit(Long osBit) {
			this.osBit = osBit;
		}

		public Long getOsBitNum() {
			return this.osBitNum;
		}

		public void setOsBitNum(Long osBitNum) {
			this.osBitNum = osBitNum;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<String> getSupportedCloudDisplayNames() {
			return this.supportedCloudDisplayNames;
		}

		public void setSupportedCloudDisplayNames(List<String> supportedCloudDisplayNames) {
			this.supportedCloudDisplayNames = supportedCloudDisplayNames;
		}

		public List<String> getSupportedCloudNames() {
			return this.supportedCloudNames;
		}

		public void setSupportedCloudNames(List<String> supportedCloudNames) {
			this.supportedCloudNames = supportedCloudNames;
		}
	}

	@Override
	public DescribeBuildpackOSByCurrentCloudResponse getInstance(UnmarshallerContext context) {
		return	DescribeBuildpackOSByCurrentCloudResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
