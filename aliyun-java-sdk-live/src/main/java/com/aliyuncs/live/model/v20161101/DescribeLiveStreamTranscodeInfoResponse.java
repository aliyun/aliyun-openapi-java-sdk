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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeLiveStreamTranscodeInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLiveStreamTranscodeInfoResponse extends AcsResponse {

	private String requestId;

	private List<DomainTranscodeInfo> domainTranscodeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainTranscodeInfo> getDomainTranscodeList() {
		return this.domainTranscodeList;
	}

	public void setDomainTranscodeList(List<DomainTranscodeInfo> domainTranscodeList) {
		this.domainTranscodeList = domainTranscodeList;
	}

	public static class DomainTranscodeInfo {

		private String transcodeApp;

		private String transcodeTemplate;

		private String transcodeName;

		private CustomTranscodeParameters customTranscodeParameters;

		private EncryptParameters encryptParameters;

		public String getTranscodeApp() {
			return this.transcodeApp;
		}

		public void setTranscodeApp(String transcodeApp) {
			this.transcodeApp = transcodeApp;
		}

		public String getTranscodeTemplate() {
			return this.transcodeTemplate;
		}

		public void setTranscodeTemplate(String transcodeTemplate) {
			this.transcodeTemplate = transcodeTemplate;
		}

		public String getTranscodeName() {
			return this.transcodeName;
		}

		public void setTranscodeName(String transcodeName) {
			this.transcodeName = transcodeName;
		}

		public CustomTranscodeParameters getCustomTranscodeParameters() {
			return this.customTranscodeParameters;
		}

		public void setCustomTranscodeParameters(CustomTranscodeParameters customTranscodeParameters) {
			this.customTranscodeParameters = customTranscodeParameters;
		}

		public EncryptParameters getEncryptParameters() {
			return this.encryptParameters;
		}

		public void setEncryptParameters(EncryptParameters encryptParameters) {
			this.encryptParameters = encryptParameters;
		}

		public static class CustomTranscodeParameters {

			private String videoProfile;

			private Integer audioBitrate;

			private String rtsFlag;

			private Integer height;

			private String templateType;

			private String bframes;

			private Integer audioRate;

			private Integer fPS;

			private String audioCodec;

			private String gop;

			private Integer videoBitrate;

			private Integer width;

			private Integer audioChannelNum;

			private String audioProfile;

			public String getVideoProfile() {
				return this.videoProfile;
			}

			public void setVideoProfile(String videoProfile) {
				this.videoProfile = videoProfile;
			}

			public Integer getAudioBitrate() {
				return this.audioBitrate;
			}

			public void setAudioBitrate(Integer audioBitrate) {
				this.audioBitrate = audioBitrate;
			}

			public String getRtsFlag() {
				return this.rtsFlag;
			}

			public void setRtsFlag(String rtsFlag) {
				this.rtsFlag = rtsFlag;
			}

			public Integer getHeight() {
				return this.height;
			}

			public void setHeight(Integer height) {
				this.height = height;
			}

			public String getTemplateType() {
				return this.templateType;
			}

			public void setTemplateType(String templateType) {
				this.templateType = templateType;
			}

			public String getBframes() {
				return this.bframes;
			}

			public void setBframes(String bframes) {
				this.bframes = bframes;
			}

			public Integer getAudioRate() {
				return this.audioRate;
			}

			public void setAudioRate(Integer audioRate) {
				this.audioRate = audioRate;
			}

			public Integer getFPS() {
				return this.fPS;
			}

			public void setFPS(Integer fPS) {
				this.fPS = fPS;
			}

			public String getAudioCodec() {
				return this.audioCodec;
			}

			public void setAudioCodec(String audioCodec) {
				this.audioCodec = audioCodec;
			}

			public String getGop() {
				return this.gop;
			}

			public void setGop(String gop) {
				this.gop = gop;
			}

			public Integer getVideoBitrate() {
				return this.videoBitrate;
			}

			public void setVideoBitrate(Integer videoBitrate) {
				this.videoBitrate = videoBitrate;
			}

			public Integer getWidth() {
				return this.width;
			}

			public void setWidth(Integer width) {
				this.width = width;
			}

			public Integer getAudioChannelNum() {
				return this.audioChannelNum;
			}

			public void setAudioChannelNum(Integer audioChannelNum) {
				this.audioChannelNum = audioChannelNum;
			}

			public String getAudioProfile() {
				return this.audioProfile;
			}

			public void setAudioProfile(String audioProfile) {
				this.audioProfile = audioProfile;
			}
		}

		public static class EncryptParameters {

			private String encryptType;

			private String kmsKeyID;

			private String kmsKeyExpireInterval;

			public String getEncryptType() {
				return this.encryptType;
			}

			public void setEncryptType(String encryptType) {
				this.encryptType = encryptType;
			}

			public String getKmsKeyID() {
				return this.kmsKeyID;
			}

			public void setKmsKeyID(String kmsKeyID) {
				this.kmsKeyID = kmsKeyID;
			}

			public String getKmsKeyExpireInterval() {
				return this.kmsKeyExpireInterval;
			}

			public void setKmsKeyExpireInterval(String kmsKeyExpireInterval) {
				this.kmsKeyExpireInterval = kmsKeyExpireInterval;
			}
		}
	}

	@Override
	public DescribeLiveStreamTranscodeInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeLiveStreamTranscodeInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
