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
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmMonitorAvailableConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmMonitorAvailableConfigResponse extends AcsResponse {

	private String requestId;

	private List<Ipv4IspCityNode> ipv4IspCityNodes;

	private List<Ipv6IspCityNode> ipv6IspCityNodes;

	private List<DomainIpv4IspCityNode> domainIpv4IspCityNodes;

	private List<DomainIpv6IspCityNode> domainIpv6IspCityNodes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Ipv4IspCityNode> getIpv4IspCityNodes() {
		return this.ipv4IspCityNodes;
	}

	public void setIpv4IspCityNodes(List<Ipv4IspCityNode> ipv4IspCityNodes) {
		this.ipv4IspCityNodes = ipv4IspCityNodes;
	}

	public List<Ipv6IspCityNode> getIpv6IspCityNodes() {
		return this.ipv6IspCityNodes;
	}

	public void setIpv6IspCityNodes(List<Ipv6IspCityNode> ipv6IspCityNodes) {
		this.ipv6IspCityNodes = ipv6IspCityNodes;
	}

	public List<DomainIpv4IspCityNode> getDomainIpv4IspCityNodes() {
		return this.domainIpv4IspCityNodes;
	}

	public void setDomainIpv4IspCityNodes(List<DomainIpv4IspCityNode> domainIpv4IspCityNodes) {
		this.domainIpv4IspCityNodes = domainIpv4IspCityNodes;
	}

	public List<DomainIpv6IspCityNode> getDomainIpv6IspCityNodes() {
		return this.domainIpv6IspCityNodes;
	}

	public void setDomainIpv6IspCityNodes(List<DomainIpv6IspCityNode> domainIpv6IspCityNodes) {
		this.domainIpv6IspCityNodes = domainIpv6IspCityNodes;
	}

	public static class Ipv4IspCityNode {

		private String ispName;

		private String ispCode;

		private String cityName;

		private String cityCode;

		private Boolean defaultSelected;

		private String groupType;

		private String groupName;

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

		public String getGroupType() {
			return this.groupType;
		}

		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	public static class Ipv6IspCityNode {

		private String ispName;

		private String ispCode;

		private String cityName;

		private String cityCode;

		private Boolean defaultSelected;

		private String groupType;

		private String groupName;

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

		public String getGroupType() {
			return this.groupType;
		}

		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	public static class DomainIpv4IspCityNode {

		private String ispName;

		private String ispCode;

		private String cityName;

		private String cityCode;

		private Boolean defaultSelected;

		private String groupType;

		private String groupName;

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

		public String getGroupType() {
			return this.groupType;
		}

		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	public static class DomainIpv6IspCityNode {

		private String ispName;

		private String ispCode;

		private String cityName;

		private String cityCode;

		private Boolean defaultSelected;

		private String groupType;

		private String groupName;

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

		public String getGroupType() {
			return this.groupType;
		}

		public void setGroupType(String groupType) {
			this.groupType = groupType;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
	}

	@Override
	public DescribeDnsGtmMonitorAvailableConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmMonitorAvailableConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
