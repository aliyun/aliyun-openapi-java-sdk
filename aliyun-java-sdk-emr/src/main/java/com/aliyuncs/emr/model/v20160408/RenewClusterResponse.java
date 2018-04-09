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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.RenewClusterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RenewClusterResponse extends AcsResponse {

	private String requestId;

	private String ecsOrderIdList;

	private String emrOrderIdList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getEcsOrderIdList() {
		return this.ecsOrderIdList;
	}

	public void setEcsOrderIdList(String ecsOrderIdList) {
		this.ecsOrderIdList = ecsOrderIdList;
	}

	public String getEmrOrderIdList() {
		return this.emrOrderIdList;
	}

	public void setEmrOrderIdList(String emrOrderIdList) {
		this.emrOrderIdList = emrOrderIdList;
	}

	@Override
	public RenewClusterResponse getInstance(UnmarshallerContext context) {
		return	RenewClusterResponseUnmarshaller.unmarshall(this, context);
	}
}
