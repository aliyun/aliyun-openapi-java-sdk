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

package com.aliyuncs.dashscope.model.v20230320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dashscope.transform.v20230320.QueryOpenStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOpenStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String accessDeniedDetail;

	private Data data;

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

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<CommoditiyOpenStatus> commoditiesOpenStatus;

		public List<CommoditiyOpenStatus> getCommoditiesOpenStatus() {
			return this.commoditiesOpenStatus;
		}

		public void setCommoditiesOpenStatus(List<CommoditiyOpenStatus> commoditiesOpenStatus) {
			this.commoditiesOpenStatus = commoditiesOpenStatus;
		}

		public static class CommoditiyOpenStatus {

			private String commodity;

			private Boolean open;

			private Boolean stop;

			private String cnName;

			private String describe;

			private String detailPage;

			private String openTime;

			private String openPage;

			public String getCommodity() {
				return this.commodity;
			}

			public void setCommodity(String commodity) {
				this.commodity = commodity;
			}

			public Boolean getOpen() {
				return this.open;
			}

			public void setOpen(Boolean open) {
				this.open = open;
			}

			public Boolean getStop() {
				return this.stop;
			}

			public void setStop(Boolean stop) {
				this.stop = stop;
			}

			public String getCnName() {
				return this.cnName;
			}

			public void setCnName(String cnName) {
				this.cnName = cnName;
			}

			public String getDescribe() {
				return this.describe;
			}

			public void setDescribe(String describe) {
				this.describe = describe;
			}

			public String getDetailPage() {
				return this.detailPage;
			}

			public void setDetailPage(String detailPage) {
				this.detailPage = detailPage;
			}

			public String getOpenTime() {
				return this.openTime;
			}

			public void setOpenTime(String openTime) {
				this.openTime = openTime;
			}

			public String getOpenPage() {
				return this.openPage;
			}

			public void setOpenPage(String openPage) {
				this.openPage = openPage;
			}
		}
	}

	@Override
	public QueryOpenStatusResponse getInstance(UnmarshallerContext context) {
		return	QueryOpenStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
