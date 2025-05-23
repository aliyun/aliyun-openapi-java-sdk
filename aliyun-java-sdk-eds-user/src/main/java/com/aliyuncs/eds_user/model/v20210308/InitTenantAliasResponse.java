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

package com.aliyuncs.eds_user.model.v20210308;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_user.transform.v20210308.InitTenantAliasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InitTenantAliasResponse extends AcsResponse {

	private String requestId;

	private String data;

	private AliasInfo aliasInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public AliasInfo getAliasInfo() {
		return this.aliasInfo;
	}

	public void setAliasInfo(AliasInfo aliasInfo) {
		this.aliasInfo = aliasInfo;
	}

	public static class AliasInfo {

		private String aliasSourceType;

		private Boolean aliasEditable;

		private String aliasEditDisabledReason;

		private String nextModifyTime;

		public String getAliasSourceType() {
			return this.aliasSourceType;
		}

		public void setAliasSourceType(String aliasSourceType) {
			this.aliasSourceType = aliasSourceType;
		}

		public Boolean getAliasEditable() {
			return this.aliasEditable;
		}

		public void setAliasEditable(Boolean aliasEditable) {
			this.aliasEditable = aliasEditable;
		}

		public String getAliasEditDisabledReason() {
			return this.aliasEditDisabledReason;
		}

		public void setAliasEditDisabledReason(String aliasEditDisabledReason) {
			this.aliasEditDisabledReason = aliasEditDisabledReason;
		}

		public String getNextModifyTime() {
			return this.nextModifyTime;
		}

		public void setNextModifyTime(String nextModifyTime) {
			this.nextModifyTime = nextModifyTime;
		}
	}

	@Override
	public InitTenantAliasResponse getInstance(UnmarshallerContext context) {
		return	InitTenantAliasResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
