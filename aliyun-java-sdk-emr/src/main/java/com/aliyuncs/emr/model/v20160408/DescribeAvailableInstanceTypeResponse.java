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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeAvailableInstanceTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableInstanceTypeResponse extends AcsResponse {

	private String requestId;

	private List<EmrSupportInstanceType> emrSupportedInstanceTypeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EmrSupportInstanceType> getEmrSupportedInstanceTypeList() {
		return this.emrSupportedInstanceTypeList;
	}

	public void setEmrSupportedInstanceTypeList(List<EmrSupportInstanceType> emrSupportedInstanceTypeList) {
		this.emrSupportedInstanceTypeList = emrSupportedInstanceTypeList;
	}

	public static class EmrSupportInstanceType {

		private String clusterType;

		private List<ClusterNodeTypeSupportInfo> nodeTypeSupportInfoList;

		public String getClusterType() {
			return this.clusterType;
		}

		public void setClusterType(String clusterType) {
			this.clusterType = clusterType;
		}

		public List<ClusterNodeTypeSupportInfo> getNodeTypeSupportInfoList() {
			return this.nodeTypeSupportInfoList;
		}

		public void setNodeTypeSupportInfoList(List<ClusterNodeTypeSupportInfo> nodeTypeSupportInfoList) {
			this.nodeTypeSupportInfoList = nodeTypeSupportInfoList;
		}

		public static class ClusterNodeTypeSupportInfo {

			private String clusterNodeType;

			private List<String> supportInstanceTypeList;

			public String getClusterNodeType() {
				return this.clusterNodeType;
			}

			public void setClusterNodeType(String clusterNodeType) {
				this.clusterNodeType = clusterNodeType;
			}

			public List<String> getSupportInstanceTypeList() {
				return this.supportInstanceTypeList;
			}

			public void setSupportInstanceTypeList(List<String> supportInstanceTypeList) {
				this.supportInstanceTypeList = supportInstanceTypeList;
			}
		}
	}

	@Override
	public DescribeAvailableInstanceTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableInstanceTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
