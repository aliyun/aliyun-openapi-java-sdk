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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.BatchQueryVisionDeviceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BatchQueryVisionDeviceInfoResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<DeviceInfo> deviceInfoList;

		public List<DeviceInfo> getDeviceInfoList() {
			return this.deviceInfoList;
		}

		public void setDeviceInfoList(List<DeviceInfo> deviceInfoList) {
			this.deviceInfoList = deviceInfoList;
		}

		public static class DeviceInfo {

			private String description;

			private Integer deviceType;

			private String iotId;

			private GbDeviceInfo gbDeviceInfo;

			private RtmpDeviceInfo rtmpDeviceInfo;

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getDeviceType() {
				return this.deviceType;
			}

			public void setDeviceType(Integer deviceType) {
				this.deviceType = deviceType;
			}

			public String getIotId() {
				return this.iotId;
			}

			public void setIotId(String iotId) {
				this.iotId = iotId;
			}

			public GbDeviceInfo getGbDeviceInfo() {
				return this.gbDeviceInfo;
			}

			public void setGbDeviceInfo(GbDeviceInfo gbDeviceInfo) {
				this.gbDeviceInfo = gbDeviceInfo;
			}

			public RtmpDeviceInfo getRtmpDeviceInfo() {
				return this.rtmpDeviceInfo;
			}

			public void setRtmpDeviceInfo(RtmpDeviceInfo rtmpDeviceInfo) {
				this.rtmpDeviceInfo = rtmpDeviceInfo;
			}

			public static class GbDeviceInfo {

				private String gbId;

				private String password;

				private String nickName;

				private String subProductKey;

				private Integer deviceProtocol;

				private Integer netProtocol;

				public String getGbId() {
					return this.gbId;
				}

				public void setGbId(String gbId) {
					this.gbId = gbId;
				}

				public String getPassword() {
					return this.password;
				}

				public void setPassword(String password) {
					this.password = password;
				}

				public String getNickName() {
					return this.nickName;
				}

				public void setNickName(String nickName) {
					this.nickName = nickName;
				}

				public String getSubProductKey() {
					return this.subProductKey;
				}

				public void setSubProductKey(String subProductKey) {
					this.subProductKey = subProductKey;
				}

				public Integer getDeviceProtocol() {
					return this.deviceProtocol;
				}

				public void setDeviceProtocol(Integer deviceProtocol) {
					this.deviceProtocol = deviceProtocol;
				}

				public Integer getNetProtocol() {
					return this.netProtocol;
				}

				public void setNetProtocol(Integer netProtocol) {
					this.netProtocol = netProtocol;
				}
			}

			public static class RtmpDeviceInfo {

				private Integer streamStatus;

				private Integer pushKeyExpireTime;

				private String streamName;

				private String pushAuthKey;

				private String pullAuthKey;

				private Integer pullKeyExpireTime;

				private String pushUrlSample;

				public Integer getStreamStatus() {
					return this.streamStatus;
				}

				public void setStreamStatus(Integer streamStatus) {
					this.streamStatus = streamStatus;
				}

				public Integer getPushKeyExpireTime() {
					return this.pushKeyExpireTime;
				}

				public void setPushKeyExpireTime(Integer pushKeyExpireTime) {
					this.pushKeyExpireTime = pushKeyExpireTime;
				}

				public String getStreamName() {
					return this.streamName;
				}

				public void setStreamName(String streamName) {
					this.streamName = streamName;
				}

				public String getPushAuthKey() {
					return this.pushAuthKey;
				}

				public void setPushAuthKey(String pushAuthKey) {
					this.pushAuthKey = pushAuthKey;
				}

				public String getPullAuthKey() {
					return this.pullAuthKey;
				}

				public void setPullAuthKey(String pullAuthKey) {
					this.pullAuthKey = pullAuthKey;
				}

				public Integer getPullKeyExpireTime() {
					return this.pullKeyExpireTime;
				}

				public void setPullKeyExpireTime(Integer pullKeyExpireTime) {
					this.pullKeyExpireTime = pullKeyExpireTime;
				}

				public String getPushUrlSample() {
					return this.pushUrlSample;
				}

				public void setPushUrlSample(String pushUrlSample) {
					this.pushUrlSample = pushUrlSample;
				}
			}
		}
	}

	@Override
	public BatchQueryVisionDeviceInfoResponse getInstance(UnmarshallerContext context) {
		return	BatchQueryVisionDeviceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
