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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetDeviceConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceConfigResponse extends AcsResponse {

	private String encodeFormat;

	private String message;

	private String deviceId;

	private String latitude;

	private String passWord;

	private String oSDTimeY;

	private String oSDTimeEnable;

	private String serverId;

	private String deviceAddress;

	private String oSDTimeX;

	private Long govLength;

	private String protocol;

	private String audioFormat;

	private String audioEnable;

	private String frameRate;

	private String userName;

	private String requestId;

	private String serverIp;

	private String longitude;

	private String code;

	private String retryInterval;

	private String bitRate;

	private String serverPort;

	private String resolution;

	private String oSDTimeType;

	private String deviceName;

	private List<ChannelListItem> channelList;

	private List<OSDListItem> oSDList;

	public String getEncodeFormat() {
		return this.encodeFormat;
	}

	public void setEncodeFormat(String encodeFormat) {
		this.encodeFormat = encodeFormat;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getOSDTimeY() {
		return this.oSDTimeY;
	}

	public void setOSDTimeY(String oSDTimeY) {
		this.oSDTimeY = oSDTimeY;
	}

	public String getOSDTimeEnable() {
		return this.oSDTimeEnable;
	}

	public void setOSDTimeEnable(String oSDTimeEnable) {
		this.oSDTimeEnable = oSDTimeEnable;
	}

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public String getDeviceAddress() {
		return this.deviceAddress;
	}

	public void setDeviceAddress(String deviceAddress) {
		this.deviceAddress = deviceAddress;
	}

	public String getOSDTimeX() {
		return this.oSDTimeX;
	}

	public void setOSDTimeX(String oSDTimeX) {
		this.oSDTimeX = oSDTimeX;
	}

	public Long getGovLength() {
		return this.govLength;
	}

	public void setGovLength(Long govLength) {
		this.govLength = govLength;
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getAudioFormat() {
		return this.audioFormat;
	}

	public void setAudioFormat(String audioFormat) {
		this.audioFormat = audioFormat;
	}

	public String getAudioEnable() {
		return this.audioEnable;
	}

	public void setAudioEnable(String audioEnable) {
		this.audioEnable = audioEnable;
	}

	public String getFrameRate() {
		return this.frameRate;
	}

	public void setFrameRate(String frameRate) {
		this.frameRate = frameRate;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(String retryInterval) {
		this.retryInterval = retryInterval;
	}

	public String getBitRate() {
		return this.bitRate;
	}

	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
	}

	public String getServerPort() {
		return this.serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getOSDTimeType() {
		return this.oSDTimeType;
	}

	public void setOSDTimeType(String oSDTimeType) {
		this.oSDTimeType = oSDTimeType;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public List<ChannelListItem> getChannelList() {
		return this.channelList;
	}

	public void setChannelList(List<ChannelListItem> channelList) {
		this.channelList = channelList;
	}

	public List<OSDListItem> getOSDList() {
		return this.oSDList;
	}

	public void setOSDList(List<OSDListItem> oSDList) {
		this.oSDList = oSDList;
	}

	public static class ChannelListItem {

		private String sundayCaptureStrategy;

		private String mondayCaptureStrategy;

		private String channelGbId;

		private String fridayCaptureStrategy;

		private String tuesdayCaptureStrategy;

		private String wednesdayCaptureStrategy;

		private String thursdayCaptureStrategy;

		private String saturdayCaptureStrategy;

		public String getSundayCaptureStrategy() {
			return this.sundayCaptureStrategy;
		}

		public void setSundayCaptureStrategy(String sundayCaptureStrategy) {
			this.sundayCaptureStrategy = sundayCaptureStrategy;
		}

		public String getMondayCaptureStrategy() {
			return this.mondayCaptureStrategy;
		}

		public void setMondayCaptureStrategy(String mondayCaptureStrategy) {
			this.mondayCaptureStrategy = mondayCaptureStrategy;
		}

		public String getChannelGbId() {
			return this.channelGbId;
		}

		public void setChannelGbId(String channelGbId) {
			this.channelGbId = channelGbId;
		}

		public String getFridayCaptureStrategy() {
			return this.fridayCaptureStrategy;
		}

		public void setFridayCaptureStrategy(String fridayCaptureStrategy) {
			this.fridayCaptureStrategy = fridayCaptureStrategy;
		}

		public String getTuesdayCaptureStrategy() {
			return this.tuesdayCaptureStrategy;
		}

		public void setTuesdayCaptureStrategy(String tuesdayCaptureStrategy) {
			this.tuesdayCaptureStrategy = tuesdayCaptureStrategy;
		}

		public String getWednesdayCaptureStrategy() {
			return this.wednesdayCaptureStrategy;
		}

		public void setWednesdayCaptureStrategy(String wednesdayCaptureStrategy) {
			this.wednesdayCaptureStrategy = wednesdayCaptureStrategy;
		}

		public String getThursdayCaptureStrategy() {
			return this.thursdayCaptureStrategy;
		}

		public void setThursdayCaptureStrategy(String thursdayCaptureStrategy) {
			this.thursdayCaptureStrategy = thursdayCaptureStrategy;
		}

		public String getSaturdayCaptureStrategy() {
			return this.saturdayCaptureStrategy;
		}

		public void setSaturdayCaptureStrategy(String saturdayCaptureStrategy) {
			this.saturdayCaptureStrategy = saturdayCaptureStrategy;
		}
	}

	public static class OSDListItem {

		private String text;

		private String leftTopY;

		private String leftTopX;

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getLeftTopY() {
			return this.leftTopY;
		}

		public void setLeftTopY(String leftTopY) {
			this.leftTopY = leftTopY;
		}

		public String getLeftTopX() {
			return this.leftTopX;
		}

		public void setLeftTopX(String leftTopX) {
			this.leftTopX = leftTopX;
		}
	}

	@Override
	public GetDeviceConfigResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
