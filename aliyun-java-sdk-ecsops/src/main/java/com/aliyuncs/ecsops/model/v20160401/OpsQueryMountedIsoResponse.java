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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryMountedIsoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryMountedIsoResponse extends AcsResponse {

	private String requestId;

	private String isoName;

	private String isoId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIsoName() {
		return this.isoName;
	}

	public void setIsoName(String isoName) {
		this.isoName = isoName;
	}

	public String getIsoId() {
		return this.isoId;
	}

	public void setIsoId(String isoId) {
		this.isoId = isoId;
	}

	@Override
	public OpsQueryMountedIsoResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryMountedIsoResponseUnmarshaller.unmarshall(this, context);
	}
}
