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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeEpnBandWidthDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEpnBandWidthDataResponse extends AcsResponse {

	private String requestId;

	private MonitorData monitorData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public MonitorData getMonitorData() {
		return this.monitorData;
	}

	public void setMonitorData(MonitorData monitorData) {
		this.monitorData = monitorData;
	}

	public static class MonitorData {

		private Long maxDownBandWidth;

		private Long maxUpBandWidth;

		private List<BandWidthMonitorDataItem> bandWidthMonitorData;

		public Long getMaxDownBandWidth() {
			return this.maxDownBandWidth;
		}

		public void setMaxDownBandWidth(Long maxDownBandWidth) {
			this.maxDownBandWidth = maxDownBandWidth;
		}

		public Long getMaxUpBandWidth() {
			return this.maxUpBandWidth;
		}

		public void setMaxUpBandWidth(Long maxUpBandWidth) {
			this.maxUpBandWidth = maxUpBandWidth;
		}

		public List<BandWidthMonitorDataItem> getBandWidthMonitorData() {
			return this.bandWidthMonitorData;
		}

		public void setBandWidthMonitorData(List<BandWidthMonitorDataItem> bandWidthMonitorData) {
			this.bandWidthMonitorData = bandWidthMonitorData;
		}

		public static class BandWidthMonitorDataItem {

			private Long upBandWidth;

			private Long internetTX;

			private Long downBandWidth;

			private Long internetRX;

			private String timeStamp;

			public Long getUpBandWidth() {
				return this.upBandWidth;
			}

			public void setUpBandWidth(Long upBandWidth) {
				this.upBandWidth = upBandWidth;
			}

			public Long getInternetTX() {
				return this.internetTX;
			}

			public void setInternetTX(Long internetTX) {
				this.internetTX = internetTX;
			}

			public Long getDownBandWidth() {
				return this.downBandWidth;
			}

			public void setDownBandWidth(Long downBandWidth) {
				this.downBandWidth = downBandWidth;
			}

			public Long getInternetRX() {
				return this.internetRX;
			}

			public void setInternetRX(Long internetRX) {
				this.internetRX = internetRX;
			}

			public String getTimeStamp() {
				return this.timeStamp;
			}

			public void setTimeStamp(String timeStamp) {
				this.timeStamp = timeStamp;
			}
		}
	}

	@Override
	public DescribeEpnBandWidthDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeEpnBandWidthDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
