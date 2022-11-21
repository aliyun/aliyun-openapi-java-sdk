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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.GetVpcRouteEntrySummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetVpcRouteEntrySummaryResponse extends AcsResponse {

	private String requestId;

	private List<RouteEntrySummarysItem> routeEntrySummarys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RouteEntrySummarysItem> getRouteEntrySummarys() {
		return this.routeEntrySummarys;
	}

	public void setRouteEntrySummarys(List<RouteEntrySummarysItem> routeEntrySummarys) {
		this.routeEntrySummarys = routeEntrySummarys;
	}

	public static class RouteEntrySummarysItem {

		private String routeTableId;

		private List<EntrySummarysItem> entrySummarys;

		public String getRouteTableId() {
			return this.routeTableId;
		}

		public void setRouteTableId(String routeTableId) {
			this.routeTableId = routeTableId;
		}

		public List<EntrySummarysItem> getEntrySummarys() {
			return this.entrySummarys;
		}

		public void setEntrySummarys(List<EntrySummarysItem> entrySummarys) {
			this.entrySummarys = entrySummarys;
		}

		public static class EntrySummarysItem {

			private String routeEntryType;

			private Integer count;

			public String getRouteEntryType() {
				return this.routeEntryType;
			}

			public void setRouteEntryType(String routeEntryType) {
				this.routeEntryType = routeEntryType;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}
		}
	}

	@Override
	public GetVpcRouteEntrySummaryResponse getInstance(UnmarshallerContext context) {
		return	GetVpcRouteEntrySummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
