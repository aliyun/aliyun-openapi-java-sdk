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

package com.aliyuncs.hitsdb.model.v20200615;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hitsdb.transform.v20200615.GetLindormV2StreamEngineInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLindormV2StreamEngineInfoResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private List<ResourceGroup> resourceGroupList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public List<ResourceGroup> getResourceGroupList() {
		return this.resourceGroupList;
	}

	public void setResourceGroupList(List<ResourceGroup> resourceGroupList) {
		this.resourceGroupList = resourceGroupList;
	}

	public static class ResourceGroup {

		private String status;

		private Integer quantity;

		private String spec;

		private String specId;

		private String resourceGroupName;

		private List<String> jmIpList;

		private List<String> sgIpList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public String getSpecId() {
			return this.specId;
		}

		public void setSpecId(String specId) {
			this.specId = specId;
		}

		public String getResourceGroupName() {
			return this.resourceGroupName;
		}

		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}

		public List<String> getJmIpList() {
			return this.jmIpList;
		}

		public void setJmIpList(List<String> jmIpList) {
			this.jmIpList = jmIpList;
		}

		public List<String> getSgIpList() {
			return this.sgIpList;
		}

		public void setSgIpList(List<String> sgIpList) {
			this.sgIpList = sgIpList;
		}
	}

	@Override
	public GetLindormV2StreamEngineInfoResponse getInstance(UnmarshallerContext context) {
		return	GetLindormV2StreamEngineInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
