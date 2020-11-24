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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeNetworkRegionBlockResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkRegionBlockResponse extends AcsResponse {

	private String requestId;

	private Config config;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Config getConfig() {
		return this.config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	public static class Config {

		private String regionBlockSwitch;

		private List<String> countries;

		private List<String> provinces;

		public String getRegionBlockSwitch() {
			return this.regionBlockSwitch;
		}

		public void setRegionBlockSwitch(String regionBlockSwitch) {
			this.regionBlockSwitch = regionBlockSwitch;
		}

		public List<String> getCountries() {
			return this.countries;
		}

		public void setCountries(List<String> countries) {
			this.countries = countries;
		}

		public List<String> getProvinces() {
			return this.provinces;
		}

		public void setProvinces(List<String> provinces) {
			this.provinces = provinces;
		}
	}

	@Override
	public DescribeNetworkRegionBlockResponse getInstance(UnmarshallerContext context) {
		return	DescribeNetworkRegionBlockResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
