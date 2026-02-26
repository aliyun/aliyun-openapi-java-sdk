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

package com.aliyuncs.dfs.model.v20180620;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dfs.transform.v20180620.GetRegionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRegionResponse extends AcsResponse {

	private String requestId;

	private List<AvailableZone> availableZones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AvailableZone> getAvailableZones() {
		return this.availableZones;
	}

	public void setAvailableZones(List<AvailableZone> availableZones) {
		this.availableZones = availableZones;
	}

	public static class AvailableZone {

		private String zoneId;

		private List<Option> options;

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public List<Option> getOptions() {
			return this.options;
		}

		public void setOptions(List<Option> options) {
			this.options = options;
		}

		public static class Option {

			private String storageType;

			private String protocolType;

			public String getStorageType() {
				return this.storageType;
			}

			public void setStorageType(String storageType) {
				this.storageType = storageType;
			}

			public String getProtocolType() {
				return this.protocolType;
			}

			public void setProtocolType(String protocolType) {
				this.protocolType = protocolType;
			}
		}
	}

	@Override
	public GetRegionResponse getInstance(UnmarshallerContext context) {
		return	GetRegionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
