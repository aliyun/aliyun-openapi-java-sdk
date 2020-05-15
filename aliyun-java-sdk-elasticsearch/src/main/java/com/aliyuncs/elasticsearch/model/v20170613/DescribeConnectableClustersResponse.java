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
import com.aliyuncs.elasticsearch.transform.v20170613.DescribeConnectableClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConnectableClustersResponse extends AcsResponse {

	private String requestId;

	private List<ConnectableClustersInfo> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ConnectableClustersInfo> getResult() {
		return this.result;
	}

	public void setResult(List<ConnectableClustersInfo> result) {
		this.result = result;
	}

	public static class ConnectableClustersInfo {

		private String instances;

		private String networkType;

		public String getInstances() {
			return this.instances;
		}

		public void setInstances(String instances) {
			this.instances = instances;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}
	}

	@Override
	public DescribeConnectableClustersResponse getInstance(UnmarshallerContext context) {
		return	DescribeConnectableClustersResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
