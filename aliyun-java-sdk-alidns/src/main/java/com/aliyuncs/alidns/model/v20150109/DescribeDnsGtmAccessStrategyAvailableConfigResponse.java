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
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsGtmAccessStrategyAvailableConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsGtmAccessStrategyAvailableConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean suggestSetDefaultLine;

	private List<Ipv4AddrPool> ipv4AddrPools;

	private List<Line> lines;

	private List<Ipv6AddrPool> ipv6AddrPools;

	private List<DomainAddrPool> domainAddrPools;

	private List<String> selectedIpv4Lines;

	private List<String> selectedIpv6Lines;

	private List<String> selectedDomainLines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuggestSetDefaultLine() {
		return this.suggestSetDefaultLine;
	}

	public void setSuggestSetDefaultLine(Boolean suggestSetDefaultLine) {
		this.suggestSetDefaultLine = suggestSetDefaultLine;
	}

	public List<Ipv4AddrPool> getIpv4AddrPools() {
		return this.ipv4AddrPools;
	}

	public void setIpv4AddrPools(List<Ipv4AddrPool> ipv4AddrPools) {
		this.ipv4AddrPools = ipv4AddrPools;
	}

	public List<Line> getLines() {
		return this.lines;
	}

	public void setLines(List<Line> lines) {
		this.lines = lines;
	}

	public List<Ipv6AddrPool> getIpv6AddrPools() {
		return this.ipv6AddrPools;
	}

	public void setIpv6AddrPools(List<Ipv6AddrPool> ipv6AddrPools) {
		this.ipv6AddrPools = ipv6AddrPools;
	}

	public List<DomainAddrPool> getDomainAddrPools() {
		return this.domainAddrPools;
	}

	public void setDomainAddrPools(List<DomainAddrPool> domainAddrPools) {
		this.domainAddrPools = domainAddrPools;
	}

	public List<String> getSelectedIpv4Lines() {
		return this.selectedIpv4Lines;
	}

	public void setSelectedIpv4Lines(List<String> selectedIpv4Lines) {
		this.selectedIpv4Lines = selectedIpv4Lines;
	}

	public List<String> getSelectedIpv6Lines() {
		return this.selectedIpv6Lines;
	}

	public void setSelectedIpv6Lines(List<String> selectedIpv6Lines) {
		this.selectedIpv6Lines = selectedIpv6Lines;
	}

	public List<String> getSelectedDomainLines() {
		return this.selectedDomainLines;
	}

	public void setSelectedDomainLines(List<String> selectedDomainLines) {
		this.selectedDomainLines = selectedDomainLines;
	}

	public static class Ipv4AddrPool {

		private String id;

		private String name;

		private Integer addrCount;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAddrCount() {
			return this.addrCount;
		}

		public void setAddrCount(Integer addrCount) {
			this.addrCount = addrCount;
		}
	}

	public static class Line {

		private String lineCode;

		private String lineName;

		private String groupCode;

		private String groupName;

		private String fatherCode;

		public String getLineCode() {
			return this.lineCode;
		}

		public void setLineCode(String lineCode) {
			this.lineCode = lineCode;
		}

		public String getLineName() {
			return this.lineName;
		}

		public void setLineName(String lineName) {
			this.lineName = lineName;
		}

		public String getGroupCode() {
			return this.groupCode;
		}

		public void setGroupCode(String groupCode) {
			this.groupCode = groupCode;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getFatherCode() {
			return this.fatherCode;
		}

		public void setFatherCode(String fatherCode) {
			this.fatherCode = fatherCode;
		}
	}

	public static class Ipv6AddrPool {

		private String id;

		private String name;

		private Integer addrCount;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAddrCount() {
			return this.addrCount;
		}

		public void setAddrCount(Integer addrCount) {
			this.addrCount = addrCount;
		}
	}

	public static class DomainAddrPool {

		private String id;

		private String name;

		private Integer addrCount;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAddrCount() {
			return this.addrCount;
		}

		public void setAddrCount(Integer addrCount) {
			this.addrCount = addrCount;
		}
	}

	@Override
	public DescribeDnsGtmAccessStrategyAvailableConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsGtmAccessStrategyAvailableConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
