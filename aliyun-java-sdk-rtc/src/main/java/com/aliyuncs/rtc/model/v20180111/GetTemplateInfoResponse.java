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

package com.aliyuncs.rtc.model.v20180111;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.GetTemplateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTemplateInfoResponse extends AcsResponse {

	private String requestId;

	private Integer mixMode;

	private Integer serviceMode;

	private String callBack;

	private Integer maxMixStreamCount;

	private Integer mediaConfig;

	private LayOut layOut;

	private RecordConfig recordConfig;

	private LiveConfig liveConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getMixMode() {
		return this.mixMode;
	}

	public void setMixMode(Integer mixMode) {
		this.mixMode = mixMode;
	}

	public Integer getServiceMode() {
		return this.serviceMode;
	}

	public void setServiceMode(Integer serviceMode) {
		this.serviceMode = serviceMode;
	}

	public String getCallBack() {
		return this.callBack;
	}

	public void setCallBack(String callBack) {
		this.callBack = callBack;
	}

	public Integer getMaxMixStreamCount() {
		return this.maxMixStreamCount;
	}

	public void setMaxMixStreamCount(Integer maxMixStreamCount) {
		this.maxMixStreamCount = maxMixStreamCount;
	}

	public Integer getMediaConfig() {
		return this.mediaConfig;
	}

	public void setMediaConfig(Integer mediaConfig) {
		this.mediaConfig = mediaConfig;
	}

	public LayOut getLayOut() {
		return this.layOut;
	}

	public void setLayOut(LayOut layOut) {
		this.layOut = layOut;
	}

	public RecordConfig getRecordConfig() {
		return this.recordConfig;
	}

	public void setRecordConfig(RecordConfig recordConfig) {
		this.recordConfig = recordConfig;
	}

	public LiveConfig getLiveConfig() {
		return this.liveConfig;
	}

	public void setLiveConfig(LiveConfig liveConfig) {
		this.liveConfig = liveConfig;
	}

	public static class LayOut {

		private String color;

		private Integer cutmode;

		private Integer layoutID;

		public String getColor() {
			return this.color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public Integer getCutmode() {
			return this.cutmode;
		}

		public void setCutmode(Integer cutmode) {
			this.cutmode = cutmode;
		}

		public Integer getLayoutID() {
			return this.layoutID;
		}

		public void setLayoutID(Integer layoutID) {
			this.layoutID = layoutID;
		}
	}

	public static class RecordConfig {

		private String storageType;

		private Integer fileFormat;

		private String ossEndpoint;

		private String ossBucket;

		private Integer vodTranscodeGroupId;

		public String getStorageType() {
			return this.storageType;
		}

		public void setStorageType(String storageType) {
			this.storageType = storageType;
		}

		public Integer getFileFormat() {
			return this.fileFormat;
		}

		public void setFileFormat(Integer fileFormat) {
			this.fileFormat = fileFormat;
		}

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public String getOssBucket() {
			return this.ossBucket;
		}

		public void setOssBucket(String ossBucket) {
			this.ossBucket = ossBucket;
		}

		public Integer getVodTranscodeGroupId() {
			return this.vodTranscodeGroupId;
		}

		public void setVodTranscodeGroupId(Integer vodTranscodeGroupId) {
			this.vodTranscodeGroupId = vodTranscodeGroupId;
		}
	}

	public static class LiveConfig {

		private String domainName;

		private String appName;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}
	}

	@Override
	public GetTemplateInfoResponse getInstance(UnmarshallerContext context) {
		return	GetTemplateInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
