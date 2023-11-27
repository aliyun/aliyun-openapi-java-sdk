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

package com.aliyuncs.ens.model.v20171110;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.CopySnapshotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CopySnapshotResponse extends AcsResponse {

	private String requestId;

	private String bizStatusCode;

	private List<AllocationIdItem> allocationId;

	private List<UnAllocationIdItem> unAllocationId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizStatusCode() {
		return this.bizStatusCode;
	}

	public void setBizStatusCode(String bizStatusCode) {
		this.bizStatusCode = bizStatusCode;
	}

	public List<AllocationIdItem> getAllocationId() {
		return this.allocationId;
	}

	public void setAllocationId(List<AllocationIdItem> allocationId) {
		this.allocationId = allocationId;
	}

	public List<UnAllocationIdItem> getUnAllocationId() {
		return this.unAllocationId;
	}

	public void setUnAllocationId(List<UnAllocationIdItem> unAllocationId) {
		this.unAllocationId = unAllocationId;
	}

	public static class AllocationIdItem {

		private String ensRegionId;

		private List<String> instanceId;

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public List<String> getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(List<String> instanceId) {
			this.instanceId = instanceId;
		}
	}

	public static class UnAllocationIdItem {

		private String ensRegionId;

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}
	}

	@Override
	public CopySnapshotResponse getInstance(UnmarshallerContext context) {
		return	CopySnapshotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
