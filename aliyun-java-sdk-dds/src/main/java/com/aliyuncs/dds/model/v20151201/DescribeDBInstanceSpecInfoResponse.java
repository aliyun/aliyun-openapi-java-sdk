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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeDBInstanceSpecInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceSpecInfoResponse extends AcsResponse {

	private String requestId;

	private String cPU;

	private String memory;

	private String description;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCPU() {
		return this.cPU;
	}

	public void setCPU(String cPU) {
		this.cPU = cPU;
	}

	public String getMemory() {
		return this.memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public DescribeDBInstanceSpecInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceSpecInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
