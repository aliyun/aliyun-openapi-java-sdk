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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.CheckResourceStockResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckResourceStockResponse extends AcsResponse {

	private String requestId;

	private List<ResourceStockModelsItem> resourceStockModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResourceStockModelsItem> getResourceStockModels() {
		return this.resourceStockModels;
	}

	public void setResourceStockModels(List<ResourceStockModelsItem> resourceStockModels) {
		this.resourceStockModels = resourceStockModels;
	}

	public static class ResourceStockModelsItem {

		private String regionId;

		private String zoneId;

		private String stockStatus;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getStockStatus() {
			return this.stockStatus;
		}

		public void setStockStatus(String stockStatus) {
			this.stockStatus = stockStatus;
		}
	}

	@Override
	public CheckResourceStockResponse getInstance(UnmarshallerContext context) {
		return	CheckResourceStockResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
