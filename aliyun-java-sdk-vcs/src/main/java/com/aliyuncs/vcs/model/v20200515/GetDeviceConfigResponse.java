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

	private Boolean audioEnable;

	private String audioFormat;

	private String bitRate;

	private String code;

	private String deviceAddress;

	private String deviceName;

	private String encodeFormat;

	private String frameRate;

	private Integer govLength;

	private String latitude;

	private String longitude;

	private String message;

	private String oSDTimeEnable;

	private String oSDTimeType;

	private String oSDTimeX;

	private String oSDTimeY;

	private String requestId;

	private String resolution;

	private String retryInterval;

	private String deviceId;

	private String userName;

	private String passWord;

	private String protocol;

	private String serverId;

	private String serverPort;

	private String serverIp;

	private List<OSDListItem> oSDList;

	public Boolean getAudioEnable() {
		return this.audioEnable;
	}

	public void setAudioEnable(Boolean audioEnable) {
		this.audioEnable = audioEnable;
	}

	public String getAudioFormat() {
		return this.audioFormat;
	}

	public void setAudioFormat(String audioFormat) {
		this.audioFormat = audioFormat;
	}

	public String getBitRate() {
		return this.bitRate;
	}

	public void setBitRate(String bitRate) {
		this.bitRate = bitRate;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDeviceAddress() {
		return this.deviceAddress;
	}

	public void setDeviceAddress(String deviceAddress) {
		this.deviceAddress = deviceAddress;
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getEncodeFormat() {
		return this.encodeFormat;
	}

	public void setEncodeFormat(String encodeFormat) {
		this.encodeFormat = encodeFormat;
	}

	public String getFrameRate() {
		return this.frameRate;
	}

	public void setFrameRate(String frameRate) {
		this.frameRate = frameRate;
	}

	public Integer getGovLength() {
		return this.govLength;
	}

	public void setGovLength(Integer govLength) {
		this.govLength = govLength;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOSDTimeEnable() {
		return this.oSDTimeEnable;
	}

	public void setOSDTimeEnable(String oSDTimeEnable) {
		this.oSDTimeEnable = oSDTimeEnable;
	}

	public String getOSDTimeType() {
		return this.oSDTimeType;
	}

	public void setOSDTimeType(String oSDTimeType) {
		this.oSDTimeType = oSDTimeType;
	}

	public String getOSDTimeX() {
		return this.oSDTimeX;
	}

	public void setOSDTimeX(String oSDTimeX) {
		this.oSDTimeX = oSDTimeX;
	}

	public String getOSDTimeY() {
		return this.oSDTimeY;
	}

	public void setOSDTimeY(String oSDTimeY) {
		this.oSDTimeY = oSDTimeY;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResolution() {
		return this.resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getRetryInterval() {
		return this.retryInterval;
	}

	public void setRetryInterval(String retryInterval) {
		this.retryInterval = retryInterval;
	}

	public String getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return this.passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getServerId() {
		return this.serverId;
	}

	public void setServerId(String serverId) {
		this.serverId = serverId;
	}

	public String getServerPort() {
		return this.serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public List<OSDListItem> getOSDList() {
		return this.oSDList;
	}

	public void setOSDList(List<OSDListItem> oSDList) {
		this.oSDList = oSDList;
	}

	public static class OSDListItem {

		private String text;

		private String leftTopX;

		private String leftTopY;

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getLeftTopX() {
			return this.leftTopX;
		}

		public void setLeftTopX(String leftTopX) {
			this.leftTopX = leftTopX;
		}

		public String getLeftTopY() {
			return this.leftTopY;
		}

		public void setLeftTopY(String leftTopY) {
			this.leftTopY = leftTopY;
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
