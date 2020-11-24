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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeWebAreaBlockConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebAreaBlockConfigsResponse extends AcsResponse {

	private String requestId;

	private List<AreaBlockConfig> areaBlockConfigs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<AreaBlockConfig> getAreaBlockConfigs() {
		return this.areaBlockConfigs;
	}

	public void setAreaBlockConfigs(List<AreaBlockConfig> areaBlockConfigs) {
		this.areaBlockConfigs = areaBlockConfigs;
	}

	public static class AreaBlockConfig {

		private String domain;

		private List<Region> regionList;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public List<Region> getRegionList() {
			return this.regionList;
		}

		public void setRegionList(List<Region> regionList) {
			this.regionList = regionList;
		}

		public static class Region {

			private Integer block;

			private String region;

			public Integer getBlock() {
				return this.block;
			}

			public void setBlock(Integer block) {
				this.block = block;
			}

			public String getRegion() {
				return this.region;
			}

			public void setRegion(String region) {
				this.region = region;
			}
		}
	}

	@Override
	public DescribeWebAreaBlockConfigsResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebAreaBlockConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
