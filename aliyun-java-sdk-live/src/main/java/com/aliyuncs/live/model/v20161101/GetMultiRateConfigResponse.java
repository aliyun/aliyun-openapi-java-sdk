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
import com.aliyuncs.live.transform.v20161101.GetMultiRateConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMultiRateConfigResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer code;

	private String domain;

	private String app;

	private String stream;

	private String avFormat;

	private String groupId;

	private String isLazy;

	private String isTimeAlign;

	private List<Detail> templatesInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getStream() {
		return this.stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getAvFormat() {
		return this.avFormat;
	}

	public void setAvFormat(String avFormat) {
		this.avFormat = avFormat;
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getIsLazy() {
		return this.isLazy;
	}

	public void setIsLazy(String isLazy) {
		this.isLazy = isLazy;
	}

	public String getIsTimeAlign() {
		return this.isTimeAlign;
	}

	public void setIsTimeAlign(String isTimeAlign) {
		this.isTimeAlign = isTimeAlign;
	}

	public List<Detail> getTemplatesInfo() {
		return this.templatesInfo;
	}

	public void setTemplatesInfo(List<Detail> templatesInfo) {
		this.templatesInfo = templatesInfo;
	}

	public static class Detail {

		private String template;

		private String templateType;

		private Integer height;

		private Integer width;

		private Integer fps;

		private String gop;

		private Integer videoBitrate;

		private Integer profile;

		private String audioProfile;

		private String audioCodec;

		private Integer audioRate;

		private Integer audioBitrate;

		private Integer audioChannelNum;

		private Integer bandWidth;

		public String getTemplate() {
			return this.template;
		}

		public void setTemplate(String template) {
			this.template = template;
		}

		public String getTemplateType() {
			return this.templateType;
		}

		public void setTemplateType(String templateType) {
			this.templateType = templateType;
		}

		public Integer getHeight() {
			return this.height;
		}

		public void setHeight(Integer height) {
			this.height = height;
		}

		public Integer getWidth() {
			return this.width;
		}

		public void setWidth(Integer width) {
			this.width = width;
		}

		public Integer getFps() {
			return this.fps;
		}

		public void setFps(Integer fps) {
			this.fps = fps;
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

		public Integer getProfile() {
			return this.profile;
		}

		public void setProfile(Integer profile) {
			this.profile = profile;
		}

		public String getAudioProfile() {
			return this.audioProfile;
		}

		public void setAudioProfile(String audioProfile) {
			this.audioProfile = audioProfile;
		}

		public String getAudioCodec() {
			return this.audioCodec;
		}

		public void setAudioCodec(String audioCodec) {
			this.audioCodec = audioCodec;
		}

		public Integer getAudioRate() {
			return this.audioRate;
		}

		public void setAudioRate(Integer audioRate) {
			this.audioRate = audioRate;
		}

		public Integer getAudioBitrate() {
			return this.audioBitrate;
		}

		public void setAudioBitrate(Integer audioBitrate) {
			this.audioBitrate = audioBitrate;
		}

		public Integer getAudioChannelNum() {
			return this.audioChannelNum;
		}

		public void setAudioChannelNum(Integer audioChannelNum) {
			this.audioChannelNum = audioChannelNum;
		}

		public Integer getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(Integer bandWidth) {
			this.bandWidth = bandWidth;
		}
	}

	@Override
	public GetMultiRateConfigResponse getInstance(UnmarshallerContext context) {
		return	GetMultiRateConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
