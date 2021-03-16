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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsUpdateCloudBoxSkuResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateCloudBoxSkuResponse extends AcsResponse {

	private String requestId;

	private String cloudBoxSkuId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCloudBoxSkuId() {
		return this.cloudBoxSkuId;
	}

	public void setCloudBoxSkuId(String cloudBoxSkuId) {
		this.cloudBoxSkuId = cloudBoxSkuId;
	}

	@Override
	public OpsUpdateCloudBoxSkuResponse getInstance(UnmarshallerContext context) {
		return	OpsUpdateCloudBoxSkuResponseUnmarshaller.unmarshall(this, context);
	}
}
