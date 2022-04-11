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
import com.aliyuncs.vod.transform.v20170321.GetTranscodeTemplateGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTranscodeTemplateGroupResponse extends AcsResponse {

	private String requestId;

	private TranscodeTemplateGroup transcodeTemplateGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TranscodeTemplateGroup getTranscodeTemplateGroup() {
		return this.transcodeTemplateGroup;
	}

	public void setTranscodeTemplateGroup(TranscodeTemplateGroup transcodeTemplateGroup) {
		this.transcodeTemplateGroup = transcodeTemplateGroup;
	}

	public static class TranscodeTemplateGroup {

		private String creationTime;

		private String transcodeMode;

		private String isDefault;

		private String appId;

		private String transcodeTemplateGroupId;

		private String name;

		private String modifyTime;

		private String locked;

		private List<TranscodeTemplate> transcodeTemplateList;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getTranscodeMode() {
			return this.transcodeMode;
		}

		public void setTranscodeMode(String transcodeMode) {
			this.transcodeMode = transcodeMode;
		}

		public String getIsDefault() {
			return this.isDefault;
		}

		public void setIsDefault(String isDefault) {
			this.isDefault = isDefault;
		}

		public String getAppId() {
			return this.appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getTranscodeTemplateGroupId() {
			return this.transcodeTemplateGroupId;
		}

		public void setTranscodeTemplateGroupId(String transcodeTemplateGroupId) {
			this.transcodeTemplateGroupId = transcodeTemplateGroupId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getLocked() {
			return this.locked;
		}

		public void setLocked(String locked) {
			this.locked = locked;
		}

		public List<TranscodeTemplate> getTranscodeTemplateList() {
			return this.transcodeTemplateList;
		}

		public void setTranscodeTemplateList(List<TranscodeTemplate> transcodeTemplateList) {
			this.transcodeTemplateList = transcodeTemplateList;
		}

		public static class TranscodeTemplate {

			private String type;

			private String video;

			private String transConfig;

			private String rotate;

			private String transcodeTemplateId;

			private String templateName;

			private String encryptSetting;

			private String audio;

			private String transcodeFileRegular;

			private String container;

			private String clip;

			private String definition;

			private String packageSetting;

			private String openingList;

			private String userData;

			private String subtitleList;

			private String muxConfig;

			private String tailSlateList;

			private List<String> watermarkIds;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVideo() {
				return this.video;
			}

			public void setVideo(String video) {
				this.video = video;
			}

			public String getTransConfig() {
				return this.transConfig;
			}

			public void setTransConfig(String transConfig) {
				this.transConfig = transConfig;
			}

			public String getRotate() {
				return this.rotate;
			}

			public void setRotate(String rotate) {
				this.rotate = rotate;
			}

			public String getTranscodeTemplateId() {
				return this.transcodeTemplateId;
			}

			public void setTranscodeTemplateId(String transcodeTemplateId) {
				this.transcodeTemplateId = transcodeTemplateId;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
			}

			public String getEncryptSetting() {
				return this.encryptSetting;
			}

			public void setEncryptSetting(String encryptSetting) {
				this.encryptSetting = encryptSetting;
			}

			public String getAudio() {
				return this.audio;
			}

			public void setAudio(String audio) {
				this.audio = audio;
			}

			public String getTranscodeFileRegular() {
				return this.transcodeFileRegular;
			}

			public void setTranscodeFileRegular(String transcodeFileRegular) {
				this.transcodeFileRegular = transcodeFileRegular;
			}

			public String getContainer() {
				return this.container;
			}

			public void setContainer(String container) {
				this.container = container;
			}

			public String getClip() {
				return this.clip;
			}

			public void setClip(String clip) {
				this.clip = clip;
			}

			public String getDefinition() {
				return this.definition;
			}

			public void setDefinition(String definition) {
				this.definition = definition;
			}

			public String getPackageSetting() {
				return this.packageSetting;
			}

			public void setPackageSetting(String packageSetting) {
				this.packageSetting = packageSetting;
			}

			public String getOpeningList() {
				return this.openingList;
			}

			public void setOpeningList(String openingList) {
				this.openingList = openingList;
			}

			public String getUserData() {
				return this.userData;
			}

			public void setUserData(String userData) {
				this.userData = userData;
			}

			public String getSubtitleList() {
				return this.subtitleList;
			}

			public void setSubtitleList(String subtitleList) {
				this.subtitleList = subtitleList;
			}

			public String getMuxConfig() {
				return this.muxConfig;
			}

			public void setMuxConfig(String muxConfig) {
				this.muxConfig = muxConfig;
			}

			public String getTailSlateList() {
				return this.tailSlateList;
			}

			public void setTailSlateList(String tailSlateList) {
				this.tailSlateList = tailSlateList;
			}

			public List<String> getWatermarkIds() {
				return this.watermarkIds;
			}

			public void setWatermarkIds(List<String> watermarkIds) {
				this.watermarkIds = watermarkIds;
			}
		}
	}

	@Override
	public GetTranscodeTemplateGroupResponse getInstance(UnmarshallerContext context) {
		return	GetTranscodeTemplateGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
