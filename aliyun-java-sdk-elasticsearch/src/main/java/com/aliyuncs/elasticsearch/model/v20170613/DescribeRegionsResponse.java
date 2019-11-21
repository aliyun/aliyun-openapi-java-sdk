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

package com.aliyuncs.elasticsearch.model.v20170613;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.elasticsearch.transform.v20170613.DescribeRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRegionsResponse extends AcsResponse {

	private String requestId;

	private List<RegionInfo> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<RegionInfo> getResult() {
		return this.result;
	}

	public void setResult(List<RegionInfo> result) {
		this.result = result;
	}

	public static class RegionInfo {

		private String regionId;

		private String regionEndpoint;

		private String localName;

		private String consoleEndpoint;

		private String status;

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getRegionEndpoint() {
			return this.regionEndpoint;
		}

		public void setRegionEndpoint(String regionEndpoint) {
			this.regionEndpoint = regionEndpoint;
		}

		public String getLocalName() {
			return this.localName;
		}

		public void setLocalName(String localName) {
			this.localName = localName;
		}

		public String getConsoleEndpoint() {
			return this.consoleEndpoint;
		}

		public void setConsoleEndpoint(String consoleEndpoint) {
			this.consoleEndpoint = consoleEndpoint;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeRegionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRegionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
