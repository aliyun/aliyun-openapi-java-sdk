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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetPatentOverviewInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatentOverviewInfoResponse extends AcsResponse {

	private Boolean success;

	private String requestId;

	private List<DataItem> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String userType;

		private Integer waiguanCount;

		private Integer total;

		private Integer shiyongCount;

		private Integer famingCount;

		public String getUserType() {
			return this.userType;
		}

		public void setUserType(String userType) {
			this.userType = userType;
		}

		public Integer getWaiguanCount() {
			return this.waiguanCount;
		}

		public void setWaiguanCount(Integer waiguanCount) {
			this.waiguanCount = waiguanCount;
		}

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getShiyongCount() {
			return this.shiyongCount;
		}

		public void setShiyongCount(Integer shiyongCount) {
			this.shiyongCount = shiyongCount;
		}

		public Integer getFamingCount() {
			return this.famingCount;
		}

		public void setFamingCount(Integer famingCount) {
			this.famingCount = famingCount;
		}
	}

	@Override
	public GetPatentOverviewInfoResponse getInstance(UnmarshallerContext context) {
		return	GetPatentOverviewInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
