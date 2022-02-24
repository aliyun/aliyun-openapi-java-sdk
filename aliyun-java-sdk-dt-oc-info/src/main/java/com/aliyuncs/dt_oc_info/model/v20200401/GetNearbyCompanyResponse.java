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

package com.aliyuncs.dt_oc_info.model.v20200401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dt_oc_info.transform.v20200401.GetNearbyCompanyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNearbyCompanyResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Integer total;

	private List<DataItem> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String industry;

		private Float distance;

		private Float regLon;

		private Float regCap;

		private String corpName;

		private String regAddress;

		private Float regLat;

		private String bizStatus;

		private String oneCompId;

		public String getIndustry() {
			return this.industry;
		}

		public void setIndustry(String industry) {
			this.industry = industry;
		}

		public Float getDistance() {
			return this.distance;
		}

		public void setDistance(Float distance) {
			this.distance = distance;
		}

		public Float getRegLon() {
			return this.regLon;
		}

		public void setRegLon(Float regLon) {
			this.regLon = regLon;
		}

		public Float getRegCap() {
			return this.regCap;
		}

		public void setRegCap(Float regCap) {
			this.regCap = regCap;
		}

		public String getCorpName() {
			return this.corpName;
		}

		public void setCorpName(String corpName) {
			this.corpName = corpName;
		}

		public String getRegAddress() {
			return this.regAddress;
		}

		public void setRegAddress(String regAddress) {
			this.regAddress = regAddress;
		}

		public Float getRegLat() {
			return this.regLat;
		}

		public void setRegLat(Float regLat) {
			this.regLat = regLat;
		}

		public String getBizStatus() {
			return this.bizStatus;
		}

		public void setBizStatus(String bizStatus) {
			this.bizStatus = bizStatus;
		}

		public String getOneCompId() {
			return this.oneCompId;
		}

		public void setOneCompId(String oneCompId) {
			this.oneCompId = oneCompId;
		}
	}

	@Override
	public GetNearbyCompanyResponse getInstance(UnmarshallerContext context) {
		return	GetNearbyCompanyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
