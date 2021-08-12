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
import com.aliyuncs.vcs.transform.v20200515.DescribeChannelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeChannelsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private Long totalPage;

		private Long pageNum;

		private Long pageSize;

		private List<Record> records;

		private List<String> unConfigList;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getTotalPage() {
			return this.totalPage;
		}

		public void setTotalPage(Long totalPage) {
			this.totalPage = totalPage;
		}

		public Long getPageNum() {
			return this.pageNum;
		}

		public void setPageNum(Long pageNum) {
			this.pageNum = pageNum;
		}

		public Long getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Long pageSize) {
			this.pageSize = pageSize;
		}

		public List<Record> getRecords() {
			return this.records;
		}

		public void setRecords(List<Record> records) {
			this.records = records;
		}

		public List<String> getUnConfigList() {
			return this.unConfigList;
		}

		public void setUnConfigList(List<String> unConfigList) {
			this.unConfigList = unConfigList;
		}

		public static class Record {

			private String corpId;

			private String serverId;

			private String serverIp;

			private String serverRealm;

			private String serverPort;

			private String deviceId;

			private String password;

			private String deviceName;

			private String deviceAddress;

			private String longitude;

			private String latitude;

			private String deviceDirection;

			private String deviceSite;

			private String deviceResolution;

			private String deviceRate;

			private String frameRate;

			private String govLength;

			private String encodeFormat;

			private String audioEnable;

			private String oSDTimeEnable;

			private String oSDTimeType;

			private String oSDTimeX;

			private String oSDTimeY;

			private String vendor;

			private String deviceType;

			private String deviceModel;

			private String inProtocol;

			private String deviceSn;

			private String datasourceType;

			private String deviceSubType;

			private String deviceIp;

			private String deviceStatus;

			private String streamStatus;

			private String streamAction;

			private String parentDeviceId;

			private String createTime;

			private String modifyTime;

			private String vap;

			public String getCorpId() {
				return this.corpId;
			}

			public void setCorpId(String corpId) {
				this.corpId = corpId;
			}

			public String getServerId() {
				return this.serverId;
			}

			public void setServerId(String serverId) {
				this.serverId = serverId;
			}

			public String getServerIp() {
				return this.serverIp;
			}

			public void setServerIp(String serverIp) {
				this.serverIp = serverIp;
			}

			public String getServerRealm() {
				return this.serverRealm;
			}

			public void setServerRealm(String serverRealm) {
				this.serverRealm = serverRealm;
			}

			public String getServerPort() {
				return this.serverPort;
			}

			public void setServerPort(String serverPort) {
				this.serverPort = serverPort;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public String getDeviceAddress() {
				return this.deviceAddress;
			}

			public void setDeviceAddress(String deviceAddress) {
				this.deviceAddress = deviceAddress;
			}

			public String getLongitude() {
				return this.longitude;
			}

			public void setLongitude(String longitude) {
				this.longitude = longitude;
			}

			public String getLatitude() {
				return this.latitude;
			}

			public void setLatitude(String latitude) {
				this.latitude = latitude;
			}

			public String getDeviceDirection() {
				return this.deviceDirection;
			}

			public void setDeviceDirection(String deviceDirection) {
				this.deviceDirection = deviceDirection;
			}

			public String getDeviceSite() {
				return this.deviceSite;
			}

			public void setDeviceSite(String deviceSite) {
				this.deviceSite = deviceSite;
			}

			public String getDeviceResolution() {
				return this.deviceResolution;
			}

			public void setDeviceResolution(String deviceResolution) {
				this.deviceResolution = deviceResolution;
			}

			public String getDeviceRate() {
				return this.deviceRate;
			}

			public void setDeviceRate(String deviceRate) {
				this.deviceRate = deviceRate;
			}

			public String getFrameRate() {
				return this.frameRate;
			}

			public void setFrameRate(String frameRate) {
				this.frameRate = frameRate;
			}

			public String getGovLength() {
				return this.govLength;
			}

			public void setGovLength(String govLength) {
				this.govLength = govLength;
			}

			public String getEncodeFormat() {
				return this.encodeFormat;
			}

			public void setEncodeFormat(String encodeFormat) {
				this.encodeFormat = encodeFormat;
			}

			public String getAudioEnable() {
				return this.audioEnable;
			}

			public void setAudioEnable(String audioEnable) {
				this.audioEnable = audioEnable;
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

			public String getVendor() {
				return this.vendor;
			}

			public void setVendor(String vendor) {
				this.vendor = vendor;
			}

			public String getDeviceType() {
				return this.deviceType;
			}

			public void setDeviceType(String deviceType) {
				this.deviceType = deviceType;
			}

			public String getDeviceModel() {
				return this.deviceModel;
			}

			public void setDeviceModel(String deviceModel) {
				this.deviceModel = deviceModel;
			}

			public String getInProtocol() {
				return this.inProtocol;
			}

			public void setInProtocol(String inProtocol) {
				this.inProtocol = inProtocol;
			}

			public String getDeviceSn() {
				return this.deviceSn;
			}

			public void setDeviceSn(String deviceSn) {
				this.deviceSn = deviceSn;
			}

			public String getDatasourceType() {
				return this.datasourceType;
			}

			public void setDatasourceType(String datasourceType) {
				this.datasourceType = datasourceType;
			}

			public String getDeviceSubType() {
				return this.deviceSubType;
			}

			public void setDeviceSubType(String deviceSubType) {
				this.deviceSubType = deviceSubType;
			}

			public String getDeviceIp() {
				return this.deviceIp;
			}

			public void setDeviceIp(String deviceIp) {
				this.deviceIp = deviceIp;
			}

			public String getDeviceStatus() {
				return this.deviceStatus;
			}

			public void setDeviceStatus(String deviceStatus) {
				this.deviceStatus = deviceStatus;
			}

			public String getStreamStatus() {
				return this.streamStatus;
			}

			public void setStreamStatus(String streamStatus) {
				this.streamStatus = streamStatus;
			}

			public String getStreamAction() {
				return this.streamAction;
			}

			public void setStreamAction(String streamAction) {
				this.streamAction = streamAction;
			}

			public String getParentDeviceId() {
				return this.parentDeviceId;
			}

			public void setParentDeviceId(String parentDeviceId) {
				this.parentDeviceId = parentDeviceId;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getVap() {
				return this.vap;
			}

			public void setVap(String vap) {
				this.vap = vap;
			}
		}
	}

	@Override
	public DescribeChannelsResponse getInstance(UnmarshallerContext context) {
		return	DescribeChannelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
