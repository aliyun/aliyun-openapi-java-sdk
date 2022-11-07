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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.SetCdnDomainStagingConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetCdnDomainStagingConfigResponse extends AcsResponse {

	private String requestId;

	private List<DomainConfigModel> domainConfigList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainConfigModel> getDomainConfigList() {
		return this.domainConfigList;
	}

	public void setDomainConfigList(List<DomainConfigModel> domainConfigList) {
		this.domainConfigList = domainConfigList;
	}

	public static class DomainConfigModel {

		private Long configId;

		private String domainName;

		private String functionName;

		public Long getConfigId() {
			return this.configId;
		}

		public void setConfigId(Long configId) {
			this.configId = configId;
		}

		public String getDomainName() {
			return this.domainName;
		}

		public void setDomainName(String domainName) {
			this.domainName = domainName;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}
	}

	@Override
	public SetCdnDomainStagingConfigResponse getInstance(UnmarshallerContext context) {
		return	SetCdnDomainStagingConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
