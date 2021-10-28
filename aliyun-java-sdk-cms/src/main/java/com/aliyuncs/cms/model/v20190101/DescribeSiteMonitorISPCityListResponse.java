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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeSiteMonitorISPCityListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSiteMonitorISPCityListResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private List<IspCity> ispCityList;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<IspCity> getIspCityList() {
		return this.ispCityList;
	}

	public void setIspCityList(List<IspCity> ispCityList) {
		this.ispCityList = ispCityList;
	}

	public static class IspCity {

		private String cityNameen;

		private String iPV4ProbeCount;

		private String city;

		private String isp;

		private String cityNamezh_CN;

		private String regionzh_CN;

		private String ispNamezh_CN;

		private String countryen;

		private String aPIProbeCount;

		private String iPV6ProbeCount;

		private String region;

		private String country;

		private String ispNameen;

		private String regionen;

		private String countryzh_CN;

		private String areazh_CN;

		private String areaen;

		private List<String> iPPool;

		public String getCityNameen() {
			return this.cityNameen;
		}

		public void setCityNameen(String cityNameen) {
			this.cityNameen = cityNameen;
		}

		public String getIPV4ProbeCount() {
			return this.iPV4ProbeCount;
		}

		public void setIPV4ProbeCount(String iPV4ProbeCount) {
			this.iPV4ProbeCount = iPV4ProbeCount;
		}

		public String getCity() {
			return this.city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public String getCityNamezh_CN() {
			return this.cityNamezh_CN;
		}

		public void setCityNamezh_CN(String cityNamezh_CN) {
			this.cityNamezh_CN = cityNamezh_CN;
		}

		public String getRegionzh_CN() {
			return this.regionzh_CN;
		}

		public void setRegionzh_CN(String regionzh_CN) {
			this.regionzh_CN = regionzh_CN;
		}

		public String getIspNamezh_CN() {
			return this.ispNamezh_CN;
		}

		public void setIspNamezh_CN(String ispNamezh_CN) {
			this.ispNamezh_CN = ispNamezh_CN;
		}

		public String getCountryen() {
			return this.countryen;
		}

		public void setCountryen(String countryen) {
			this.countryen = countryen;
		}

		public String getAPIProbeCount() {
			return this.aPIProbeCount;
		}

		public void setAPIProbeCount(String aPIProbeCount) {
			this.aPIProbeCount = aPIProbeCount;
		}

		public String getIPV6ProbeCount() {
			return this.iPV6ProbeCount;
		}

		public void setIPV6ProbeCount(String iPV6ProbeCount) {
			this.iPV6ProbeCount = iPV6ProbeCount;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getCountry() {
			return this.country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getIspNameen() {
			return this.ispNameen;
		}

		public void setIspNameen(String ispNameen) {
			this.ispNameen = ispNameen;
		}

		public String getRegionen() {
			return this.regionen;
		}

		public void setRegionen(String regionen) {
			this.regionen = regionen;
		}

		public String getCountryzh_CN() {
			return this.countryzh_CN;
		}

		public void setCountryzh_CN(String countryzh_CN) {
			this.countryzh_CN = countryzh_CN;
		}

		public String getAreazh_CN() {
			return this.areazh_CN;
		}

		public void setAreazh_CN(String areazh_CN) {
			this.areazh_CN = areazh_CN;
		}

		public String getAreaen() {
			return this.areaen;
		}

		public void setAreaen(String areaen) {
			this.areaen = areaen;
		}

		public List<String> getIPPool() {
			return this.iPPool;
		}

		public void setIPPool(List<String> iPPool) {
			this.iPPool = iPPool;
		}
	}

	@Override
	public DescribeSiteMonitorISPCityListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSiteMonitorISPCityListResponseUnmarshaller.unmarshall(this, context);
	}
}
