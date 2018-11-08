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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeRealTimeRecordDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRealTimeRecordDetailResponse extends AcsResponse {

	private String requestId;

	private List<RecordDetailInfo> recordDetailInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RecordDetailInfo> getRecordDetailInfos() {
		return this.recordDetailInfos;
	}

	public void setRecordDetailInfos(List<RecordDetailInfo> recordDetailInfos) {
		this.recordDetailInfos = recordDetailInfos;
	}

	public static class RecordDetailInfo {

		private String uid;

		private String startTime;

		private String deviceType;

		private String sDKVersion;

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getSDKVersion() {
			return this.sDKVersion;
		}

		public void setSDKVersion(String sDKVersion) {
			this.sDKVersion = sDKVersion;
		}
	}

	@Override
	public DescribeRealTimeRecordDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeRealTimeRecordDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
