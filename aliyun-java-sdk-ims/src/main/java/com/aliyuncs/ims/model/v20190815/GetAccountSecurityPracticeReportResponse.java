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

package com.aliyuncs.ims.model.v20190815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.GetAccountSecurityPracticeReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountSecurityPracticeReportResponse extends AcsResponse {

	private String requestId;

	private AccountSecurityPracticeInfo accountSecurityPracticeInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public AccountSecurityPracticeInfo getAccountSecurityPracticeInfo() {
		return this.accountSecurityPracticeInfo;
	}

	public void setAccountSecurityPracticeInfo(AccountSecurityPracticeInfo accountSecurityPracticeInfo) {
		this.accountSecurityPracticeInfo = accountSecurityPracticeInfo;
	}

	public static class AccountSecurityPracticeInfo {

		private Integer score;

		private AccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo;

		public Integer getScore() {
			return this.score;
		}

		public void setScore(Integer score) {
			this.score = score;
		}

		public AccountSecurityPracticeUserInfo getAccountSecurityPracticeUserInfo() {
			return this.accountSecurityPracticeUserInfo;
		}

		public void setAccountSecurityPracticeUserInfo(AccountSecurityPracticeUserInfo accountSecurityPracticeUserInfo) {
			this.accountSecurityPracticeUserInfo = accountSecurityPracticeUserInfo;
		}

		public static class AccountSecurityPracticeUserInfo {

			private Integer unusedAkNum;

			private Integer subUserWithUnusedAccessKey;

			private Integer rootWithAccessKey;

			private Integer subUser;

			private Boolean bindMfa;

			private Integer oldAkNum;

			private String subUserPwdLevel;

			private Integer subUserWithOldAccessKey;

			private Integer subUserBindMfa;

			public Integer getUnusedAkNum() {
				return this.unusedAkNum;
			}

			public void setUnusedAkNum(Integer unusedAkNum) {
				this.unusedAkNum = unusedAkNum;
			}

			public Integer getSubUserWithUnusedAccessKey() {
				return this.subUserWithUnusedAccessKey;
			}

			public void setSubUserWithUnusedAccessKey(Integer subUserWithUnusedAccessKey) {
				this.subUserWithUnusedAccessKey = subUserWithUnusedAccessKey;
			}

			public Integer getRootWithAccessKey() {
				return this.rootWithAccessKey;
			}

			public void setRootWithAccessKey(Integer rootWithAccessKey) {
				this.rootWithAccessKey = rootWithAccessKey;
			}

			public Integer getSubUser() {
				return this.subUser;
			}

			public void setSubUser(Integer subUser) {
				this.subUser = subUser;
			}

			public Boolean getBindMfa() {
				return this.bindMfa;
			}

			public void setBindMfa(Boolean bindMfa) {
				this.bindMfa = bindMfa;
			}

			public Integer getOldAkNum() {
				return this.oldAkNum;
			}

			public void setOldAkNum(Integer oldAkNum) {
				this.oldAkNum = oldAkNum;
			}

			public String getSubUserPwdLevel() {
				return this.subUserPwdLevel;
			}

			public void setSubUserPwdLevel(String subUserPwdLevel) {
				this.subUserPwdLevel = subUserPwdLevel;
			}

			public Integer getSubUserWithOldAccessKey() {
				return this.subUserWithOldAccessKey;
			}

			public void setSubUserWithOldAccessKey(Integer subUserWithOldAccessKey) {
				this.subUserWithOldAccessKey = subUserWithOldAccessKey;
			}

			public Integer getSubUserBindMfa() {
				return this.subUserBindMfa;
			}

			public void setSubUserBindMfa(Integer subUserBindMfa) {
				this.subUserBindMfa = subUserBindMfa;
			}
		}
	}

	@Override
	public GetAccountSecurityPracticeReportResponse getInstance(UnmarshallerContext context) {
		return	GetAccountSecurityPracticeReportResponseUnmarshaller.unmarshall(this, context);
	}
}
