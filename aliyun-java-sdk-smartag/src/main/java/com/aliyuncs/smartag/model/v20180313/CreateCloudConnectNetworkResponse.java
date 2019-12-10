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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.CreateCloudConnectNetworkResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateCloudConnectNetworkResponse extends AcsResponse {

	private String requestId;

	private String ccnId;

	private String name;

	private String status;

	private String description;

	private String snatCidrBlock;

	private String cidrBlock;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCcnId() {
		return this.ccnId;
	}

	public void setCcnId(String ccnId) {
		this.ccnId = ccnId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSnatCidrBlock() {
		return this.snatCidrBlock;
	}

	public void setSnatCidrBlock(String snatCidrBlock) {
		this.snatCidrBlock = snatCidrBlock;
	}

	public String getCidrBlock() {
		return this.cidrBlock;
	}

	public void setCidrBlock(String cidrBlock) {
		this.cidrBlock = cidrBlock;
	}

	@Override
	public CreateCloudConnectNetworkResponse getInstance(UnmarshallerContext context) {
		return	CreateCloudConnectNetworkResponseUnmarshaller.unmarshall(this, context);
	}
}
