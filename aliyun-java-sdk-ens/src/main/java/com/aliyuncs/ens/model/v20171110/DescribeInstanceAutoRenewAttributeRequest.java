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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAutoRenewAttributeRequest extends RpcAcsRequest<DescribeInstanceAutoRenewAttributeResponse> {
	
	public DescribeInstanceAutoRenewAttributeRequest() {
		super("Ens", "2017-11-10", "DescribeInstanceAutoRenewAttribute", "ens");
	}

	private String instanceIds;

	private String version;

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public String getBizVersion() {
		return this.version;
	}

	public void setBizVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	/**
	 * @deprecated use getBizVersion instead of this.
	 */
	@Deprecated
	public String getVersion() {
		return this.version;
	}

	/**
	 * @deprecated use setBizVersion instead of this.
	 */
	@Deprecated
	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putQueryParameter("Version", version);
		}
	}

	@Override
	public Class<DescribeInstanceAutoRenewAttributeResponse> getResponseClass() {
		return DescribeInstanceAutoRenewAttributeResponse.class;
	}

}
