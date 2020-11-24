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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeWebAccessModeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebAccessModeResponse extends AcsResponse {

	private String requestId;

	private List<DomainMode> domainModes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainMode> getDomainModes() {
		return this.domainModes;
	}

	public void setDomainModes(List<DomainMode> domainModes) {
		this.domainModes = domainModes;
	}

	public static class DomainMode {

		private String domain;

		private Integer accessMode;

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public Integer getAccessMode() {
			return this.accessMode;
		}

		public void setAccessMode(Integer accessMode) {
			this.accessMode = accessMode;
		}
	}

	@Override
	public DescribeWebAccessModeResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebAccessModeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
