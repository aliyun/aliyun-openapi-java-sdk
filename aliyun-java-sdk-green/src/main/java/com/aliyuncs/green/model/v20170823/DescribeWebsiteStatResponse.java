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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeWebsiteStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebsiteStatResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<WebsiteStat> websiteStatList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<WebsiteStat> getWebsiteStatList() {
		return this.websiteStatList;
	}

	public void setWebsiteStatList(List<WebsiteStat> websiteStatList) {
		this.websiteStatList = websiteStatList;
	}

	public static class WebsiteStat {

		private String subServiceModule;

		private Integer instanceCount;

		private Integer scanCount;

		private Integer riskCount;

		public String getSubServiceModule() {
			return this.subServiceModule;
		}

		public void setSubServiceModule(String subServiceModule) {
			this.subServiceModule = subServiceModule;
		}

		public Integer getInstanceCount() {
			return this.instanceCount;
		}

		public void setInstanceCount(Integer instanceCount) {
			this.instanceCount = instanceCount;
		}

		public Integer getScanCount() {
			return this.scanCount;
		}

		public void setScanCount(Integer scanCount) {
			this.scanCount = scanCount;
		}

		public Integer getRiskCount() {
			return this.riskCount;
		}

		public void setRiskCount(Integer riskCount) {
			this.riskCount = riskCount;
		}
	}

	@Override
	public DescribeWebsiteStatResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebsiteStatResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
