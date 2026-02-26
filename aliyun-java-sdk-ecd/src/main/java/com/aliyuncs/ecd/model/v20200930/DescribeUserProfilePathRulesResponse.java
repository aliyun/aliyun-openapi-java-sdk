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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeUserProfilePathRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserProfilePathRulesResponse extends AcsResponse {

	private String requestId;

	private UserProfilePathRule userProfilePathRule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UserProfilePathRule getUserProfilePathRule() {
		return this.userProfilePathRule;
	}

	public void setUserProfilePathRule(UserProfilePathRule userProfilePathRule) {
		this.userProfilePathRule = userProfilePathRule;
	}

	public static class UserProfilePathRule {

		private String desktopGroupId;

		private String userProfileRuleType;

		private List<UpmPathRules> rules;

		public String getDesktopGroupId() {
			return this.desktopGroupId;
		}

		public void setDesktopGroupId(String desktopGroupId) {
			this.desktopGroupId = desktopGroupId;
		}

		public String getUserProfileRuleType() {
			return this.userProfileRuleType;
		}

		public void setUserProfileRuleType(String userProfileRuleType) {
			this.userProfileRuleType = userProfileRuleType;
		}

		public List<UpmPathRules> getRules() {
			return this.rules;
		}

		public void setRules(List<UpmPathRules> rules) {
			this.rules = rules;
		}

		public static class UpmPathRules {

			private List<WhiteList> whitePaths;

			private BlackPath blackPath;

			public List<WhiteList> getWhitePaths() {
				return this.whitePaths;
			}

			public void setWhitePaths(List<WhiteList> whitePaths) {
				this.whitePaths = whitePaths;
			}

			public BlackPath getBlackPath() {
				return this.blackPath;
			}

			public void setBlackPath(BlackPath blackPath) {
				this.blackPath = blackPath;
			}

			public static class WhiteList {

				private String path;

				private String type;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}

			public static class BlackPath {

				private String path;

				private String type;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}
			}
		}
	}

	@Override
	public DescribeUserProfilePathRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserProfilePathRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
