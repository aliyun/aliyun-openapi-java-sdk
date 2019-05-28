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
import com.aliyuncs.rds.transform.v20140815.DescribeDBInstanceProxyConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBInstanceProxyConfigurationResponse extends AcsResponse {

	private String requestId;

	private String transparentSwitchConfiguration;

	private String persistentConnectionsConfiguration;

	private String attacksProtectionConfiguration;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTransparentSwitchConfiguration() {
		return this.transparentSwitchConfiguration;
	}

	public void setTransparentSwitchConfiguration(String transparentSwitchConfiguration) {
		this.transparentSwitchConfiguration = transparentSwitchConfiguration;
	}

	public String getPersistentConnectionsConfiguration() {
		return this.persistentConnectionsConfiguration;
	}

	public void setPersistentConnectionsConfiguration(String persistentConnectionsConfiguration) {
		this.persistentConnectionsConfiguration = persistentConnectionsConfiguration;
	}

	public String getAttacksProtectionConfiguration() {
		return this.attacksProtectionConfiguration;
	}

	public void setAttacksProtectionConfiguration(String attacksProtectionConfiguration) {
		this.attacksProtectionConfiguration = attacksProtectionConfiguration;
	}

	@Override
	public DescribeDBInstanceProxyConfigurationResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBInstanceProxyConfigurationResponseUnmarshaller.unmarshall(this, context);
	}
}
