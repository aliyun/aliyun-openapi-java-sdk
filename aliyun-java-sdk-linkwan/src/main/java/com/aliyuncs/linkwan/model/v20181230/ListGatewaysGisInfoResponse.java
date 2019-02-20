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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.ListGatewaysGisInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewaysGisInfoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<GatewayGisInfo> data;

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

	public List<GatewayGisInfo> getData() {
		return this.data;
	}

	public void setData(List<GatewayGisInfo> data) {
		this.data = data;
	}

	public static class GatewayGisInfo {

		private String gwEui;

		private String gisCoordinateSystem;

		private Float longitude;

		private Float latitude;

		private Long freqBandPlanGroupId;

		private String name;

		private String onlineState;

		private String gisSourceType;

		private Boolean enabled;

		public String getGwEui() {
			return this.gwEui;
		}

		public void setGwEui(String gwEui) {
			this.gwEui = gwEui;
		}

		public String getGisCoordinateSystem() {
			return this.gisCoordinateSystem;
		}

		public void setGisCoordinateSystem(String gisCoordinateSystem) {
			this.gisCoordinateSystem = gisCoordinateSystem;
		}

		public Float getLongitude() {
			return this.longitude;
		}

		public void setLongitude(Float longitude) {
			this.longitude = longitude;
		}

		public Float getLatitude() {
			return this.latitude;
		}

		public void setLatitude(Float latitude) {
			this.latitude = latitude;
		}

		public Long getFreqBandPlanGroupId() {
			return this.freqBandPlanGroupId;
		}

		public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
			this.freqBandPlanGroupId = freqBandPlanGroupId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOnlineState() {
			return this.onlineState;
		}

		public void setOnlineState(String onlineState) {
			this.onlineState = onlineState;
		}

		public String getGisSourceType() {
			return this.gisSourceType;
		}

		public void setGisSourceType(String gisSourceType) {
			this.gisSourceType = gisSourceType;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}
	}

	@Override
	public ListGatewaysGisInfoResponse getInstance(UnmarshallerContext context) {
		return	ListGatewaysGisInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
