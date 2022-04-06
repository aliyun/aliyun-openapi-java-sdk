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
import com.aliyuncs.live.transform.v20161101.AddMultiRateConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddMultiRateConfigResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private List<FailedTemplates> body;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FailedTemplates> getBody() {
		return this.body;
	}

	public void setBody(List<FailedTemplates> body) {
		this.body = body;
	}

	public static class FailedTemplates {

		private Integer audioBitrate;

		private String template;

		private Integer height;

		private String templateType;

		private Integer bandWidth;

		private Integer profile;

		private Integer audioRate;

		private String audioCodec;

		private String gop;

		private Integer width;

		private Integer videoBitrate;

		private Integer audioChannelNum;

		private Integer fps;

		private String audioProfile;

		public Integer getAudioBitrate() {
			return this.audioBitrate;
		}

		public void setAudioBitrate(Integer audioBitrate) {
			this.audioBitrate = audioBitrate;
		}

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
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

		public Integer getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(Integer bandWidth) {
			this.bandWidth = bandWidth;
		}

		public Integer getProfile() {
			return this.profile;
		}

		public void setProfile(Integer profile) {
			this.profile = profile;
		}

		public Integer getAudioRate() {
			return this.audioRate;
		}

		public void setAudioRate(Integer audioRate) {
			this.audioRate = audioRate;
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

		public Integer getWidth() {
			return this.width;
		}

		public void setWidth(Integer width) {
			this.width = width;
		}

		public Integer getVideoBitrate() {
			return this.videoBitrate;
		}

		public void setVideoBitrate(Integer videoBitrate) {
			this.videoBitrate = videoBitrate;
		}

		public Integer getAudioChannelNum() {
			return this.audioChannelNum;
		}

		public void setAudioChannelNum(Integer audioChannelNum) {
			this.audioChannelNum = audioChannelNum;
		}

		public Integer getFps() {
			return this.fps;
		}

		public void setFps(Integer fps) {
			this.fps = fps;
		}

		public String getAudioProfile() {
			return this.audioProfile;
		}

		public void setAudioProfile(String audioProfile) {
			this.audioProfile = audioProfile;
		}
	}

	@Override
	public AddMultiRateConfigResponse getInstance(UnmarshallerContext context) {
		return	AddMultiRateConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
