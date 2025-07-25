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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeInstanceConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceConfigResponse extends AcsResponse {

	private String config;

	private String requestId;

	private String paramReplMode;

	private String paramReplTimeout;

	private String paramNoLooseSentinelEnabled;

	private String paramSentinelCompatEnable;

	private String paramNoLooseSentinelPasswordFreeAccess;

	private String paramNoLooseSentinelPasswordFreeCommands;

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getParamReplMode() {
		return this.paramReplMode;
	}

	public void setParamReplMode(String paramReplMode) {
		this.paramReplMode = paramReplMode;
	}

	public String getParamReplTimeout() {
		return this.paramReplTimeout;
	}

	public void setParamReplTimeout(String paramReplTimeout) {
		this.paramReplTimeout = paramReplTimeout;
	}

	public String getParamNoLooseSentinelEnabled() {
		return this.paramNoLooseSentinelEnabled;
	}

	public void setParamNoLooseSentinelEnabled(String paramNoLooseSentinelEnabled) {
		this.paramNoLooseSentinelEnabled = paramNoLooseSentinelEnabled;
	}

	public String getParamSentinelCompatEnable() {
		return this.paramSentinelCompatEnable;
	}

	public void setParamSentinelCompatEnable(String paramSentinelCompatEnable) {
		this.paramSentinelCompatEnable = paramSentinelCompatEnable;
	}

	public String getParamNoLooseSentinelPasswordFreeAccess() {
		return this.paramNoLooseSentinelPasswordFreeAccess;
	}

	public void setParamNoLooseSentinelPasswordFreeAccess(String paramNoLooseSentinelPasswordFreeAccess) {
		this.paramNoLooseSentinelPasswordFreeAccess = paramNoLooseSentinelPasswordFreeAccess;
	}

	public String getParamNoLooseSentinelPasswordFreeCommands() {
		return this.paramNoLooseSentinelPasswordFreeCommands;
	}

	public void setParamNoLooseSentinelPasswordFreeCommands(String paramNoLooseSentinelPasswordFreeCommands) {
		this.paramNoLooseSentinelPasswordFreeCommands = paramNoLooseSentinelPasswordFreeCommands;
	}

	@Override
	public DescribeInstanceConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
