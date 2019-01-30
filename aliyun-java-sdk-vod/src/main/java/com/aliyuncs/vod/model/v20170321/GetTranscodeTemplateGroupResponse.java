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

		private String modifyTime;

		private String name;

		private String isDefault;

		private String locked;

		private String transcodeTemplateGroupId;

		private List<TranscodeTemplate> transcodeTemplateList;

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

		public List<TranscodeTemplate> getTranscodeTemplateList() {
			return this.transcodeTemplateList;
		}

		public void setTranscodeTemplateList(List<TranscodeTemplate> transcodeTemplateList) {
			this.transcodeTemplateList = transcodeTemplateList;
		}

		public static class TranscodeTemplate {

			private String transcodeTemplateId;

			private String video;

			private String audio;

			private String container;

			private String muxConfig;

			private String transConfig;

			private String definition;

			private String encryptSetting;

			private String packageSetting;

			private String subtitleList;

			private String openingList;

			private String tailSlateList;

			private String templateName;

			private List<String> watermarkIds;

			public String getTranscodeTemplateId() {
				return this.transcodeTemplateId;
			}

			public void setTranscodeTemplateId(String transcodeTemplateId) {
				this.transcodeTemplateId = transcodeTemplateId;
			}

			public String getVideo() {
				return this.video;
			}

			public void setVideo(String video) {
				this.video = video;
			}

			public String getAudio() {
				return this.audio;
			}

			public void setAudio(String audio) {
				this.audio = audio;
			}

			public String getContainer() {
				return this.container;
			}

			public void setContainer(String container) {
				this.container = container;
			}

			public String getMuxConfig() {
				return this.muxConfig;
			}

			public void setMuxConfig(String muxConfig) {
				this.muxConfig = muxConfig;
			}

			public String getTransConfig() {
				return this.transConfig;
			}

			public void setTransConfig(String transConfig) {
				this.transConfig = transConfig;
			}

			public String getDefinition() {
				return this.definition;
			}

			public void setDefinition(String definition) {
				this.definition = definition;
			}

			public String getEncryptSetting() {
				return this.encryptSetting;
			}

			public void setEncryptSetting(String encryptSetting) {
				this.encryptSetting = encryptSetting;
			}

			public String getPackageSetting() {
				return this.packageSetting;
			}

			public void setPackageSetting(String packageSetting) {
				this.packageSetting = packageSetting;
			}

			public String getSubtitleList() {
				return this.subtitleList;
			}

			public void setSubtitleList(String subtitleList) {
				this.subtitleList = subtitleList;
			}

			public String getOpeningList() {
				return this.openingList;
			}

			public void setOpeningList(String openingList) {
				this.openingList = openingList;
			}

			public String getTailSlateList() {
				return this.tailSlateList;
			}

			public void setTailSlateList(String tailSlateList) {
				this.tailSlateList = tailSlateList;
			}

			public String getTemplateName() {
				return this.templateName;
			}

			public void setTemplateName(String templateName) {
				this.templateName = templateName;
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
