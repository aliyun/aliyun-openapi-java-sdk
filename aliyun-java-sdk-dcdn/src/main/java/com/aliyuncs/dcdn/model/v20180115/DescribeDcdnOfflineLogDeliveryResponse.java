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

package com.aliyuncs.dcdn.model.v20180115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnOfflineLogDeliveryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnOfflineLogDeliveryResponse extends AcsResponse {

	private String requestId;

	private List<Domain> domains;

	private List<Region> regions;

	private List<String> fields;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Domain> getDomains() {
		return this.domains;
	}

	public void setDomains(List<Domain> domains) {
		this.domains = domains;
	}

	public List<Region> getRegions() {
		return this.regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	public List<String> getFields() {
		return this.fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public static class Domain {

		private String domainName;

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}
	}

	public static class Region {

		private Integer ossId;

		private String ossBucketName;

		private String ossPathPrefix;

		private String dlaVcName;

		private String regionId;

		private String regionName;

		private String isOverseas;

		private String ossEndpoint;

		private String areaId;

		private String areaName;

		private String dlaDbName;

		private String dlaTableName;

		public Integer getOssId() {
			return this.ossId;
		}

		public void setOssId(Integer ossId) {
			this.ossId = ossId;
		}

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}

		public String getOssPathPrefix() {
			return this.ossPathPrefix;
		}

		public void setOssPathPrefix(String ossPathPrefix) {
			this.ossPathPrefix = ossPathPrefix;
		}

		public String getDlaVcName() {
			return this.dlaVcName;
		}

		public void setDlaVcName(String dlaVcName) {
			this.dlaVcName = dlaVcName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionName() {
			return this.regionName;
		}

		public void setRegionName(String regionName) {
			this.regionName = regionName;
		}

		public String getIsOverseas() {
			return this.isOverseas;
		}

		public void setIsOverseas(String isOverseas) {
			this.isOverseas = isOverseas;
		}

		public String getOssEndpoint() {
			return this.ossEndpoint;
		}

		public void setOssEndpoint(String ossEndpoint) {
			this.ossEndpoint = ossEndpoint;
		}

		public String getAreaId() {
			return this.areaId;
		}

		public void setAreaId(String areaId) {
			this.areaId = areaId;
		}

		public String getAreaName() {
			return this.areaName;
		}

		public void setAreaName(String areaName) {
			this.areaName = areaName;
		}

		public String getDlaDbName() {
			return this.dlaDbName;
		}

		public void setDlaDbName(String dlaDbName) {
			this.dlaDbName = dlaDbName;
		}

		public String getDlaTableName() {
			return this.dlaTableName;
		}

		public void setDlaTableName(String dlaTableName) {
			this.dlaTableName = dlaTableName;
		}
	}

	@Override
	public DescribeDcdnOfflineLogDeliveryResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnOfflineLogDeliveryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
