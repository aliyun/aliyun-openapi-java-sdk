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

package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeGtmMonitorAvailableConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGtmMonitorAvailableConfigResponse extends AcsResponse {

	private String requestId;

	private List<IspCityNode> ispCityNodes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<IspCityNode> getIspCityNodes() {
		return this.ispCityNodes;
	}

	public void setIspCityNodes(List<IspCityNode> ispCityNodes) {
		this.ispCityNodes = ispCityNodes;
	}

	public static class IspCityNode {

		private String ispName;

		private String ispCode;

		private String cityName;

		private String cityCode;

		private Boolean defaultSelected;

		private Boolean mainland;

		public String getIspName() {
			return this.ispName;
		}

		public void setIspName(String ispName) {
			this.ispName = ispName;
		}

		public String getIspCode() {
			return this.ispCode;
		}

		public void setIspCode(String ispCode) {
			this.ispCode = ispCode;
		}

		public String getCityName() {
			return this.cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public String getCityCode() {
			return this.cityCode;
		}

		public void setCityCode(String cityCode) {
			this.cityCode = cityCode;
		}

		public Boolean getDefaultSelected() {
			return this.defaultSelected;
		}

		public void setDefaultSelected(Boolean defaultSelected) {
			this.defaultSelected = defaultSelected;
		}

		public Boolean getMainland() {
			return this.mainland;
		}

		public void setMainland(Boolean mainland) {
			this.mainland = mainland;
		}
	}

	@Override
	public DescribeGtmMonitorAvailableConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeGtmMonitorAvailableConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
