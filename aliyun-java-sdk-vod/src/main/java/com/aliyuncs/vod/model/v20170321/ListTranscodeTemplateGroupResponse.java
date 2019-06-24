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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.ListTranscodeTemplateGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTranscodeTemplateGroupResponse extends AcsResponse {

	private String requestId;

	private List<TranscodeTemplateGroup> transcodeTemplateGroupList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TranscodeTemplateGroup> getTranscodeTemplateGroupList() {
		return this.transcodeTemplateGroupList;
	}

	public void setTranscodeTemplateGroupList(List<TranscodeTemplateGroup> transcodeTemplateGroupList) {
		this.transcodeTemplateGroupList = transcodeTemplateGroupList;
	}

	public static class TranscodeTemplateGroup {

		private String creationTime;

		private String modifyTime;

		private String name;

		private String isDefault;

		private String locked;

		private String transcodeTemplateGroupId;

		private String transcodeMode;

		private String appId;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(String isDefault) {
			this.isDefault = isDefault;
		}

		public String getLocked() {
			return this.locked;
		}

		public void setLocked(String locked) {
			this.locked = locked;
		}

		public String getTranscodeTemplateGroupId() {
			return this.transcodeTemplateGroupId;
		}

		public void setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
			this.transcodeTemplateGroupId = transcodeTemplateGroupId;
		}

		public String getTranscodeMode() {
			return this.transcodeMode;
		}

		public void setTranscodeMode(String transcodeMode) {
			this.transcodeMode = transcodeMode;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}
	}

	@Override
	public ListTranscodeTemplateGroupResponse getInstance(UnmarshallerContext context) {
		return	ListTranscodeTemplateGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
