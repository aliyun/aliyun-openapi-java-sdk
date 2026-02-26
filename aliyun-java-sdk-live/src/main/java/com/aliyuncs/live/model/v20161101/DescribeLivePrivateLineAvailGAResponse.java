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
import com.aliyuncs.live.transform.v20161101.DescribeLivePrivateLineAvailGAResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLivePrivateLineAvailGAResponse extends AcsResponse {

	private String requestId;

	private List<LivePrivateLineAvailGA> livePrivateLineAvailGAs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LivePrivateLineAvailGA> getLivePrivateLineAvailGAs() {
		return this.livePrivateLineAvailGAs;
	}

	public void setLivePrivateLineAvailGAs(List<LivePrivateLineAvailGA> livePrivateLineAvailGAs) {
		this.livePrivateLineAvailGAs = livePrivateLineAvailGAs;
	}

	public static class LivePrivateLineAvailGA {

		private String accelerationArea;

		private String accelerationType;

		private String appName;

		private String bindingStatus;

		private String domainName;

		private String iP;

		private String instanceId;

		private String status;

		private String streamName;

		private String uid;

		private String videoCenter;

		public String getAccelerationArea() {
			return this.accelerationArea;
		}

		public void setAccelerationArea(String accelerationArea) {
			this.accelerationArea = accelerationArea;
		}

		public String getAccelerationType() {
			return this.accelerationType;
		}

		public void setAccelerationType(String accelerationType) {
			this.accelerationType = accelerationType;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getBindingStatus() {
			return this.bindingStatus;
		}

		public void setBindingStatus(String bindingStatus) {
			this.bindingStatus = bindingStatus;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getIP() {
			return this.iP;
		}

		public void setIP(String iP) {
			this.iP = iP;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getStreamName() {
			return this.streamName;
		}

		public void setStreamName(String streamName) {
			this.streamName = streamName;
		}

		public String getUid() {
			return this.uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public String getVideoCenter() {
			return this.videoCenter;
		}

		public void setVideoCenter(String videoCenter) {
			this.videoCenter = videoCenter;
		}
	}

	@Override
	public DescribeLivePrivateLineAvailGAResponse getInstance(UnmarshallerContext context) {
		return	DescribeLivePrivateLineAvailGAResponseUnmarshaller.unmarshall(this, context);
	}
}
