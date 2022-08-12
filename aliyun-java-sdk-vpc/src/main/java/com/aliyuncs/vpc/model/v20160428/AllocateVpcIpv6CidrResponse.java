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

package com.aliyuncs.vpc.model.v20160428;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.AllocateVpcIpv6CidrResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AllocateVpcIpv6CidrResponse extends AcsResponse {

	private String ipv6CidrBlock;

	private String requestId;

	public String getIpv6CidrBlock() {
		return this.ipv6CidrBlock;
	}

	public void setIpv6CidrBlock(String ipv6CidrBlock) {
		this.ipv6CidrBlock = ipv6CidrBlock;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	@Override
	public AllocateVpcIpv6CidrResponse getInstance(UnmarshallerContext context) {
		return	AllocateVpcIpv6CidrResponseUnmarshaller.unmarshall(this, context);
	}
}
