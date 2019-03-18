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

package com.aliyuncs.afs.model.v20180112;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.afs.transform.v20180112.DescribeConfigNameResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeConfigNameResponse extends AcsResponse {

	private String requestId;

	private Boolean hasConfig;

	private String bizCode;

	private List<ConfigName> configNames;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getHasConfig() {
		return this.hasConfig;
	}

	public void setHasConfig(Boolean hasConfig) {
		this.hasConfig = hasConfig;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public List<ConfigName> getConfigNames() {
		return this.configNames;
	}

	public void setConfigNames(List<ConfigName> configNames) {
		this.configNames = configNames;
	}

	public static class ConfigName {

		private String aliUid;

		private String configName;

		private String refExtId;

		public String getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(String aliUid) {
			this.aliUid = aliUid;
		}

		public String getConfigName() {
			return this.configName;
		}

		public void setConfigName(String configName) {
			this.configName = configName;
		}

		public String getRefExtId() {
			return this.refExtId;
		}

		public void setRefExtId(String refExtId) {
			this.refExtId = refExtId;
		}
	}

	@Override
	public DescribeConfigNameResponse getInstance(UnmarshallerContext context) {
		return	DescribeConfigNameResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
