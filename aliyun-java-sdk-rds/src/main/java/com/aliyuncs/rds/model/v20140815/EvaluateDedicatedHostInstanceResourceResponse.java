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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.EvaluateDedicatedHostInstanceResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EvaluateDedicatedHostInstanceResourceResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceClass;

	private Integer available;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(String dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
	}

	public Integer getAvailable() {
		return this.available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	@Override
	public EvaluateDedicatedHostInstanceResourceResponse getInstance(UnmarshallerContext context) {
		return	EvaluateDedicatedHostInstanceResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
