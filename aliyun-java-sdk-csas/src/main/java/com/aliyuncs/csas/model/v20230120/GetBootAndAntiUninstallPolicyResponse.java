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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.GetBootAndAntiUninstallPolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetBootAndAntiUninstallPolicyResponse extends AcsResponse {

	private String requestId;

	private Strategy strategy;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Strategy getStrategy() {
		return this.strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public static class Strategy {

		private String createTime;

		private String updateTime;

		private Boolean isBoot;

		private Boolean isAntiUninstall;

		private Boolean allowReport;

		private String policyId;

		private String reportProcessId;

		private List<String> whitelistUsers;

		private List<String> userGroupIds;

		private BlockContent blockContent;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Boolean getIsBoot() {
			return this.isBoot;
		}

		public void setIsBoot(Boolean isBoot) {
			this.isBoot = isBoot;
		}

		public Boolean getIsAntiUninstall() {
			return this.isAntiUninstall;
		}

		public void setIsAntiUninstall(Boolean isAntiUninstall) {
			this.isAntiUninstall = isAntiUninstall;
		}

		public Boolean getAllowReport() {
			return this.allowReport;
		}

		public void setAllowReport(Boolean allowReport) {
			this.allowReport = allowReport;
		}

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getReportProcessId() {
			return this.reportProcessId;
		}

		public void setReportProcessId(String reportProcessId) {
			this.reportProcessId = reportProcessId;
		}

		public List<String> getWhitelistUsers() {
			return this.whitelistUsers;
		}

		public void setWhitelistUsers(List<String> whitelistUsers) {
			this.whitelistUsers = whitelistUsers;
		}

		public List<String> getUserGroupIds() {
			return this.userGroupIds;
		}

		public void setUserGroupIds(List<String> userGroupIds) {
			this.userGroupIds = userGroupIds;
		}

		public BlockContent getBlockContent() {
			return this.blockContent;
		}

		public void setBlockContent(BlockContent blockContent) {
			this.blockContent = blockContent;
		}

		public static class BlockContent {

			private BlockTextZh blockTextZh;

			private BlockTextEn blockTextEn;

			public BlockTextZh getBlockTextZh() {
				return this.blockTextZh;
			}

			public void setBlockTextZh(BlockTextZh blockTextZh) {
				this.blockTextZh = blockTextZh;
			}

			public BlockTextEn getBlockTextEn() {
				return this.blockTextEn;
			}

			public void setBlockTextEn(BlockTextEn blockTextEn) {
				this.blockTextEn = blockTextEn;
			}

			public static class BlockTextZh {

				private String title;

				private String content;

				private String mainButtonText;

				private String minorButtonText;

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getMainButtonText() {
					return this.mainButtonText;
				}

				public void setMainButtonText(String mainButtonText) {
					this.mainButtonText = mainButtonText;
				}

				public String getMinorButtonText() {
					return this.minorButtonText;
				}

				public void setMinorButtonText(String minorButtonText) {
					this.minorButtonText = minorButtonText;
				}
			}

			public static class BlockTextEn {

				private String title;

				private String content;

				private String mainButtonText;

				private String minorButtonText;

				public String getTitle() {
					return this.title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				public String getContent() {
					return this.content;
				}

				public void setContent(String content) {
					this.content = content;
				}

				public String getMainButtonText() {
					return this.mainButtonText;
				}

				public void setMainButtonText(String mainButtonText) {
					this.mainButtonText = mainButtonText;
				}

				public String getMinorButtonText() {
					return this.minorButtonText;
				}

				public void setMinorButtonText(String minorButtonText) {
					this.minorButtonText = minorButtonText;
				}
			}
		}
	}

	@Override
	public GetBootAndAntiUninstallPolicyResponse getInstance(UnmarshallerContext context) {
		return	GetBootAndAntiUninstallPolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
