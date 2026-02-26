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
import com.aliyuncs.arms.transform.v20190808.GetSyntheticMonitorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSyntheticMonitorsResponse extends AcsResponse {

	private String requestId;

	private Long code;

	private String message;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String country;

		private String region;

		private String city;

		private String cityCode;

		private String operator;

		private String operatorCode;

		private Integer clientType;

		private Boolean canBeSelected;

		private String available;

		private Integer ipv6;

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getCityCode() {
			return this.cityCode;
		}

		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}

		public String getOperatorCode() {
			return this.operatorCode;
		}

		public void setOperatorCode(String operatorCode) {
			this.operatorCode = operatorCode;
		}

		public Integer getClientType() {
			return this.clientType;
		}

		public void setClientType(Integer clientType) {
			this.clientType = clientType;
		}

		public Boolean getCanBeSelected() {
			return this.canBeSelected;
		}

		public void setCanBeSelected(Boolean canBeSelected) {
			this.canBeSelected = canBeSelected;
		}

		public String getAvailable() {
			return this.available;
		}

		public void setAvailable(String available) {
			this.available = available;
		}

		public Integer getIpv6() {
			return this.ipv6;
		}

		public void setIpv6(Integer ipv6) {
			this.ipv6 = ipv6;
		}
	}

	@Override
	public GetSyntheticMonitorsResponse getInstance(UnmarshallerContext context) {
		return	GetSyntheticMonitorsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
