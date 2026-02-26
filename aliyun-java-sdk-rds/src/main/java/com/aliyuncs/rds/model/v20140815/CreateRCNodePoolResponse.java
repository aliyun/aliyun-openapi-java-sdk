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
import com.aliyuncs.rds.transform.v20140815.CreateRCNodePoolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateRCNodePoolResponse extends AcsResponse {

	private String requestId;

	private String orderId;

	private String nodePoolId;

	private List<String> instanceIdSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getNodePoolId() {
		return this.nodePoolId;
	}

	public void setNodePoolId(String nodePoolId) {
		this.nodePoolId = nodePoolId;
	}

	public List<String> getInstanceIdSets() {
		return this.instanceIdSets;
	}

	public void setInstanceIdSets(List<String> instanceIdSets) {
		this.instanceIdSets = instanceIdSets;
	}

	@Override
	public CreateRCNodePoolResponse getInstance(UnmarshallerContext context) {
		return	CreateRCNodePoolResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
