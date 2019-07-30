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
import com.aliyuncs.ens.transform.v20171110.DescribeUserBandWidthDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserBandWidthDataResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private List<MonitorDataItem> monitorData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public List<MonitorDataItem> getMonitorData() {
		return this.monitorData;
	}

	public void setMonitorData(List<MonitorDataItem> monitorData) {
		this.monitorData = monitorData;
	}

	public static class MonitorDataItem {

		private String maxDownBandWidth;

		private String maxUpBandWidth;

		private List<BandWidthMonitorDataItem> bandWidthMonitorData;

		public String getMaxDownBandWidth() {
			return this.maxDownBandWidth;
		}

		public void setMaxDownBandWidth(String maxDownBandWidth) {
			this.maxDownBandWidth = maxDownBandWidth;
		}

		public String getMaxUpBandWidth() {
			return this.maxUpBandWidth;
		}

		public void setMaxUpBandWidth(String maxUpBandWidth) {
			this.maxUpBandWidth = maxUpBandWidth;
		}

		public List<BandWidthMonitorDataItem> getBandWidthMonitorData() {
			return this.bandWidthMonitorData;
		}

		public void setBandWidthMonitorData(List<BandWidthMonitorDataItem> bandWidthMonitorData) {
			this.bandWidthMonitorData = bandWidthMonitorData;
		}

		public static class BandWidthMonitorDataItem {

			private Integer upBandWidth;

			private Integer downBandWidth;

			private Integer internetTX;

			private Integer internetRX;

			private String timeStamp;

			public Integer getUpBandWidth() {
				return this.upBandWidth;
			}

			public void setUpBandWidth(Integer upBandWidth) {
				this.upBandWidth = upBandWidth;
			}

			public Integer getDownBandWidth() {
				return this.downBandWidth;
			}

			public void setDownBandWidth(Integer downBandWidth) {
				this.downBandWidth = downBandWidth;
			}

			public Integer getInternetTX() {
				return this.internetTX;
			}

			public void setInternetTX(Integer internetTX) {
				this.internetTX = internetTX;
			}

			public Integer getInternetRX() {
				return this.internetRX;
			}

			public void setInternetRX(Integer internetRX) {
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
	public DescribeUserBandWidthDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserBandWidthDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
