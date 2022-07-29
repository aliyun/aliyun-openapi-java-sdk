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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.GetSyntheticTaskMonitorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSyntheticTaskMonitorsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String msg;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private Long clientType;

		private Long cityCode;

		private String city;

		private String district;

		private Long netServiceId;

		private String netServiceName;

		private Long busy;

		public Long getClientType() {
			return this.clientType;
		}

		public void setClientType(Long clientType) {
			this.clientType = clientType;
		}

		public Long getCityCode() {
			return this.cityCode;
		}

		public void setCityCode(Long cityCode) {
			this.cityCode = cityCode;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getDistrict() {
			return this.district;
		}

		public void setDistrict(String district) {
			this.district = district;
		}

		public Long getNetServiceId() {
			return this.netServiceId;
		}

		public void setNetServiceId(Long netServiceId) {
			this.netServiceId = netServiceId;
		}

		public String getNetServiceName() {
			return this.netServiceName;
		}

		public void setNetServiceName(String netServiceName) {
			this.netServiceName = netServiceName;
		}

		public Long getBusy() {
			return this.busy;
		}

		public void setBusy(Long busy) {
			this.busy = busy;
		}
	}

	@Override
	public GetSyntheticTaskMonitorsResponse getInstance(UnmarshallerContext context) {
		return	GetSyntheticTaskMonitorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
