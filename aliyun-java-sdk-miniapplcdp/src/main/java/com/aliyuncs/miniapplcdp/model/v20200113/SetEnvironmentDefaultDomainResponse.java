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

package com.aliyuncs.miniapplcdp.model.v20200113;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.miniapplcdp.transform.v20200113.SetEnvironmentDefaultDomainResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SetEnvironmentDefaultDomainResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String defaultMasterDomain;

		private Boolean staticDomainApplied;

		private String defaultStaticDomain;

		private String staticDomain;

		private Boolean configChanged;

		private String masterDomain;

		private Boolean masterDomainApplied;

		public String getDefaultMasterDomain() {
			return this.defaultMasterDomain;
		}

		public void setDefaultMasterDomain(String defaultMasterDomain) {
			this.defaultMasterDomain = defaultMasterDomain;
		}

		public Boolean getStaticDomainApplied() {
			return this.staticDomainApplied;
		}

		public void setStaticDomainApplied(Boolean staticDomainApplied) {
			this.staticDomainApplied = staticDomainApplied;
		}

		public String getDefaultStaticDomain() {
			return this.defaultStaticDomain;
		}

		public void setDefaultStaticDomain(String defaultStaticDomain) {
			this.defaultStaticDomain = defaultStaticDomain;
		}

		public String getStaticDomain() {
			return this.staticDomain;
		}

		public void setStaticDomain(String staticDomain) {
			this.staticDomain = staticDomain;
		}

		public Boolean getConfigChanged() {
			return this.configChanged;
		}

		public void setConfigChanged(Boolean configChanged) {
			this.configChanged = configChanged;
		}

		public String getMasterDomain() {
			return this.masterDomain;
		}

		public void setMasterDomain(String masterDomain) {
			this.masterDomain = masterDomain;
		}

		public Boolean getMasterDomainApplied() {
			return this.masterDomainApplied;
		}

		public void setMasterDomainApplied(Boolean masterDomainApplied) {
			this.masterDomainApplied = masterDomainApplied;
		}
	}

	@Override
	public SetEnvironmentDefaultDomainResponse getInstance(UnmarshallerContext context) {
		return	SetEnvironmentDefaultDomainResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
