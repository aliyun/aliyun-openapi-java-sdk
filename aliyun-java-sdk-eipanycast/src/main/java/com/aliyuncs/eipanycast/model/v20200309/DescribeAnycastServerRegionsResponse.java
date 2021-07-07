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

package com.aliyuncs.eipanycast.model.v20200309;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eipanycast.transform.v20200309.DescribeAnycastServerRegionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnycastServerRegionsResponse extends AcsResponse {

	private String requestId;

	private String count;

	private List<AnycastServerRegion> anycastServerRegionList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCount() {
		return this.count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public List<AnycastServerRegion> getAnycastServerRegionList() {
		return this.anycastServerRegionList;
	}

	public void setAnycastServerRegionList(List<AnycastServerRegion> anycastServerRegionList) {
		this.anycastServerRegionList = anycastServerRegionList;
	}

	public static class AnycastServerRegion {

		private String regionId;

		private String regionName;

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
	}

	@Override
	public DescribeAnycastServerRegionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAnycastServerRegionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
