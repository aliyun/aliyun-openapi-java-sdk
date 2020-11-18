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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRtcChannelDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRtcChannelDetailResponse extends AcsResponse {

	private String requestId;

	private String channelId;

	private Long pageSize;

	private Long pageNo;

	private Long totalCnt;

	private List<Detail> channelInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getChannelId() {
		return this.channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}

	public Long getTotalCnt() {
		return this.totalCnt;
	}

	public void setTotalCnt(Long totalCnt) {
		this.totalCnt = totalCnt;
	}

	public List<Detail> getChannelInfo() {
		return this.channelInfo;
	}

	public void setChannelInfo(List<Detail> channelInfo) {
		this.channelInfo = channelInfo;
	}

	public static class Detail {

		private String sid;

		private String uid;

		private String joinTime;

		private String leaveTime;

		private String sdkVersion;

		private String platform;

		private String oS;

		private String deviceType;

		public String getSid() {
			return this.sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getJoinTime() {
			return this.joinTime;
		}

		public void setJoinTime(String joinTime) {
			this.joinTime = joinTime;
		}

		public String getLeaveTime() {
			return this.leaveTime;
		}

		public void setLeaveTime(String leaveTime) {
			this.leaveTime = leaveTime;
		}

		public String getSdkVersion() {
			return this.sdkVersion;
		}

		public void setSdkVersion(String sdkVersion) {
			this.sdkVersion = sdkVersion;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getOS() {
			return this.oS;
		}

		public void setOS(String oS) {
			this.oS = oS;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}
	}

	@Override
	public DescribeRtcChannelDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeRtcChannelDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
