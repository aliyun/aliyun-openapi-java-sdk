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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeTenantZonesReadResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTenantZonesReadResponse extends AcsResponse {

	private String requestId;

	private List<TenantZonesItem> tenantZones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TenantZonesItem> getTenantZones() {
		return this.tenantZones;
	}

	public void setTenantZones(List<TenantZonesItem> tenantZones) {
		this.tenantZones = tenantZones;
	}

	public static class TenantZonesItem {

		private Boolean isElectable;

		private Boolean isPrimary;

		private String zone;

		private String isReadable;

		public Boolean getIsElectable() {
			return this.isElectable;
		}

		public void setIsElectable(Boolean isElectable) {
			this.isElectable = isElectable;
		}

		public Boolean getIsPrimary() {
			return this.isPrimary;
		}

		public void setIsPrimary(Boolean isPrimary) {
			this.isPrimary = isPrimary;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public String getIsReadable() {
			return this.isReadable;
		}

		public void setIsReadable(String isReadable) {
			this.isReadable = isReadable;
		}
	}

	@Override
	public DescribeTenantZonesReadResponse getInstance(UnmarshallerContext context) {
		return	DescribeTenantZonesReadResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
