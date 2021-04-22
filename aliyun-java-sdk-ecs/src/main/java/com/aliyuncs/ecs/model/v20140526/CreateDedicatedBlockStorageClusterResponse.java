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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.CreateDedicatedBlockStorageClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateDedicatedBlockStorageClusterResponse extends AcsResponse {

	private String requestId;

	private String dedicatedBlockStorageClusterOrderId;

	private String dedicatedBlockStorageClusterId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDedicatedBlockStorageClusterOrderId() {
		return this.dedicatedBlockStorageClusterOrderId;
	}

	public void setDedicatedBlockStorageClusterOrderId(String dedicatedBlockStorageClusterOrderId) {
		this.dedicatedBlockStorageClusterOrderId = dedicatedBlockStorageClusterOrderId;
	}

	public String getDedicatedBlockStorageClusterId() {
		return this.dedicatedBlockStorageClusterId;
	}

	public void setDedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
		this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
	}

	@Override
	public CreateDedicatedBlockStorageClusterResponse getInstance(UnmarshallerContext context) {
		return	CreateDedicatedBlockStorageClusterResponseUnmarshaller.unmarshall(this, context);
	}
}
