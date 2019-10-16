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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.CreateDedicatedHostResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDedicatedHostResponse extends AcsResponse {

	private String requestId;

	private Long orderId;

	private List<DedicateHostListItem> dedicateHostList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public List<DedicateHostListItem> getDedicateHostList() {
		return this.dedicateHostList;
	}

	public void setDedicateHostList(List<DedicateHostListItem> dedicateHostList) {
		this.dedicateHostList = dedicateHostList;
	}

	public static class DedicateHostListItem {

		private String dedicatedHostId;

		public String getDedicatedHostId() {
			return this.dedicatedHostId;
		}

		public void setDedicatedHostId(String dedicatedHostId) {
			this.dedicatedHostId = dedicatedHostId;
		}
	}

	@Override
	public CreateDedicatedHostResponse getInstance(UnmarshallerContext context) {
		return	CreateDedicatedHostResponseUnmarshaller.unmarshall(this, context);
	}
}
