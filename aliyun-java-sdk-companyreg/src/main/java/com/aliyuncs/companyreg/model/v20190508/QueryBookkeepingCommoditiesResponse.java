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

package com.aliyuncs.companyreg.model.v20190508;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20190508.QueryBookkeepingCommoditiesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBookkeepingCommoditiesResponse extends AcsResponse {

	private String requestId;

	private List<BookkeepingCommodity> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BookkeepingCommodity> getData() {
		return this.data;
	}

	public void setData(List<BookkeepingCommodity> data) {
		this.data = data;
	}

	public static class BookkeepingCommodity {

		private String packageVersionValue;

		private String specCode;

		private String areaType;

		private String commodityCode;

		private String packageVersionName;

		private String cityModuleName;

		private String commodityName;

		private String packageVersionCode;

		private String ordTimeName;

		private String cityModuleValue;

		private String ordTimeCode;

		private String ordTimeValue;

		private String serviceModuleName;

		private String cityModuleCode;

		private String topOrgName;

		private String serviceModuleValue;

		private String serviceModuleCode;

		private String topOrgCode;

		public String getPackageVersionValue() {
			return this.packageVersionValue;
		}

		public void setPackageVersionValue(String packageVersionValue) {
			this.packageVersionValue = packageVersionValue;
		}

		public String getSpecCode() {
			return this.specCode;
		}

		public void setSpecCode(String specCode) {
			this.specCode = specCode;
		}

		public String getAreaType() {
			return this.areaType;
		}

		public void setAreaType(String areaType) {
			this.areaType = areaType;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}

		public String getPackageVersionName() {
			return this.packageVersionName;
		}

		public void setPackageVersionName(String packageVersionName) {
			this.packageVersionName = packageVersionName;
		}

		public String getCityModuleName() {
			return this.cityModuleName;
		}

		public void setCityModuleName(String cityModuleName) {
			this.cityModuleName = cityModuleName;
		}

		public String getCommodityName() {
			return this.commodityName;
		}

		public void setCommodityName(String commodityName) {
			this.commodityName = commodityName;
		}

		public String getPackageVersionCode() {
			return this.packageVersionCode;
		}

		public void setPackageVersionCode(String packageVersionCode) {
			this.packageVersionCode = packageVersionCode;
		}

		public String getOrdTimeName() {
			return this.ordTimeName;
		}

		public void setOrdTimeName(String ordTimeName) {
			this.ordTimeName = ordTimeName;
		}

		public String getCityModuleValue() {
			return this.cityModuleValue;
		}

		public void setCityModuleValue(String cityModuleValue) {
			this.cityModuleValue = cityModuleValue;
		}

		public String getOrdTimeCode() {
			return this.ordTimeCode;
		}

		public void setOrdTimeCode(String ordTimeCode) {
			this.ordTimeCode = ordTimeCode;
		}

		public String getOrdTimeValue() {
			return this.ordTimeValue;
		}

		public void setOrdTimeValue(String ordTimeValue) {
			this.ordTimeValue = ordTimeValue;
		}

		public String getServiceModuleName() {
			return this.serviceModuleName;
		}

		public void setServiceModuleName(String serviceModuleName) {
			this.serviceModuleName = serviceModuleName;
		}

		public String getCityModuleCode() {
			return this.cityModuleCode;
		}

		public void setCityModuleCode(String cityModuleCode) {
			this.cityModuleCode = cityModuleCode;
		}

		public String getTopOrgName() {
			return this.topOrgName;
		}

		public void setTopOrgName(String topOrgName) {
			this.topOrgName = topOrgName;
		}

		public String getServiceModuleValue() {
			return this.serviceModuleValue;
		}

		public void setServiceModuleValue(String serviceModuleValue) {
			this.serviceModuleValue = serviceModuleValue;
		}

		public String getServiceModuleCode() {
			return this.serviceModuleCode;
		}

		public void setServiceModuleCode(String serviceModuleCode) {
			this.serviceModuleCode = serviceModuleCode;
		}

		public String getTopOrgCode() {
			return this.topOrgCode;
		}

		public void setTopOrgCode(String topOrgCode) {
			this.topOrgCode = topOrgCode;
		}
	}

	@Override
	public QueryBookkeepingCommoditiesResponse getInstance(UnmarshallerContext context) {
		return	QueryBookkeepingCommoditiesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
