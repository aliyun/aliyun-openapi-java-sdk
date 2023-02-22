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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.AddClientUserDefineRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AddClientUserDefineRuleResponse extends AcsResponse {

	private String requestId;

	private UserDefineRuleAddResult userDefineRuleAddResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserDefineRuleAddResult getUserDefineRuleAddResult() {
		return this.userDefineRuleAddResult;
	}

	public void setUserDefineRuleAddResult(UserDefineRuleAddResult userDefineRuleAddResult) {
		this.userDefineRuleAddResult = userDefineRuleAddResult;
	}

	public static class UserDefineRuleAddResult {

		private String switchId;

		private Long id;

		private String platform;

		public String getSwitchId() {
			return this.switchId;
		}

		public void setSwitchId(String switchId) {
			this.switchId = switchId;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}
	}

	@Override
	public AddClientUserDefineRuleResponse getInstance(UnmarshallerContext context) {
		return	AddClientUserDefineRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
