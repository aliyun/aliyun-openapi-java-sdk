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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.CreateTairKVCacheVNodeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateTairKVCacheVNodeResponse extends AcsResponse {

	private String requestId;

	private String instanceId;

	private Long orderId;

	private String regionId;

	private String zoneId;

	private String vkName;

	private String vClusterId;

	private String nodeId;

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

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getVkName() {
		return this.vkName;
	}

	public void setVkName(String vkName) {
		this.vkName = vkName;
	}

	public String getVClusterId() {
		return this.vClusterId;
	}

	public void setVClusterId(String vClusterId) {
		this.vClusterId = vClusterId;
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	@Override
	public CreateTairKVCacheVNodeResponse getInstance(UnmarshallerContext context) {
		return	CreateTairKVCacheVNodeResponseUnmarshaller.unmarshall(this, context);
	}
}
