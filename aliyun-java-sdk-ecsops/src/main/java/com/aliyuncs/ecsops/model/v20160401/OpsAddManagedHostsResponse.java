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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsAddManagedHostsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsAddManagedHostsResponse extends AcsResponse {

	private String requestId;

	private List<String> instanceId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(List<String> instanceId) {
		this.instanceId = instanceId;
	}

	@Override
	public OpsAddManagedHostsResponse getInstance(UnmarshallerContext context) {
		return	OpsAddManagedHostsResponseUnmarshaller.unmarshall(this, context);
	}
}
