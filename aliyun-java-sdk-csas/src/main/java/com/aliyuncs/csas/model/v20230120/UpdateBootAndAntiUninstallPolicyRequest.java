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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateBootAndAntiUninstallPolicyRequest extends RpcAcsRequest<UpdateBootAndAntiUninstallPolicyResponse> {
	   

	private Boolean isAntiUninstall;

	private Boolean allowReport;

	private List<String> userGroupIds;

	private List<String> whitelistUsers;

	@SerializedName("blockContent")
	private BlockContent blockContent;

	private Boolean isBoot;
	public UpdateBootAndAntiUninstallPolicyRequest() {
		super("csas", "2023-01-20", "UpdateBootAndAntiUninstallPolicy");
		setMethod(MethodType.POST);
	}

	public Boolean getIsAntiUninstall() {
		return this.isAntiUninstall;
	}

	public void setIsAntiUninstall(Boolean isAntiUninstall) {
		this.isAntiUninstall = isAntiUninstall;
		if(isAntiUninstall != null){
			putBodyParameter("IsAntiUninstall", isAntiUninstall.toString());
		}
	}

	public Boolean getAllowReport() {
		return this.allowReport;
	}

	public void setAllowReport(Boolean allowReport) {
		this.allowReport = allowReport;
		if(allowReport != null){
			putBodyParameter("AllowReport", allowReport.toString());
		}
	}

	public List<String> getUserGroupIds() {
		return this.userGroupIds;
	}

	public void setUserGroupIds(List<String> userGroupIds) {
		this.userGroupIds = userGroupIds;	
		if (userGroupIds != null) {
			for (int depth1 = 0; depth1 < userGroupIds.size(); depth1++) {
				putBodyParameter("UserGroupIds." + (depth1 + 1) , userGroupIds.get(depth1));
			}
		}	
	}

	public List<String> getWhitelistUsers() {
		return this.whitelistUsers;
	}

	public void setWhitelistUsers(List<String> whitelistUsers) {
		this.whitelistUsers = whitelistUsers;	
		if (whitelistUsers != null) {
			for (int depth1 = 0; depth1 < whitelistUsers.size(); depth1++) {
				putBodyParameter("WhitelistUsers." + (depth1 + 1) , whitelistUsers.get(depth1));
			}
		}	
	}

	public BlockContent getBlockContent() {
		return this.blockContent;
	}

	public void setBlockContent(BlockContent blockContent) {
		this.blockContent = blockContent;	
		if (blockContent != null) {
			putBodyParameter("BlockContent" , new Gson().toJson(blockContent));
		}	
	}

	public Boolean getIsBoot() {
		return this.isBoot;
	}

	public void setIsBoot(Boolean isBoot) {
		this.isBoot = isBoot;
		if(isBoot != null){
			putBodyParameter("IsBoot", isBoot.toString());
		}
	}

	public static class BlockContent {

		@SerializedName("BlockTextZh")
		private BlockTextZh blockTextZh;

		@SerializedName("BlockTextEn")
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

			@SerializedName("MinorButtonText")
			private String minorButtonText;

			@SerializedName("MainButtonText")
			private String mainButtonText;

			@SerializedName("Title")
			private String title;

			@SerializedName("Content")
			private String content;

			public String getMinorButtonText() {
				return this.minorButtonText;
			}

			public void setMinorButtonText(String minorButtonText) {
				this.minorButtonText = minorButtonText;
			}

			public String getMainButtonText() {
				return this.mainButtonText;
			}

			public void setMainButtonText(String mainButtonText) {
				this.mainButtonText = mainButtonText;
			}

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
		}

		public static class BlockTextEn {

			@SerializedName("MinorButtonText")
			private String minorButtonText;

			@SerializedName("MainButtonText")
			private String mainButtonText;

			@SerializedName("Title")
			private String title;

			@SerializedName("Content")
			private String content;

			public String getMinorButtonText() {
				return this.minorButtonText;
			}

			public void setMinorButtonText(String minorButtonText) {
				this.minorButtonText = minorButtonText;
			}

			public String getMainButtonText() {
				return this.mainButtonText;
			}

			public void setMainButtonText(String mainButtonText) {
				this.mainButtonText = mainButtonText;
			}

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
		}
	}

	@Override
	public Class<UpdateBootAndAntiUninstallPolicyResponse> getResponseClass() {
		return UpdateBootAndAntiUninstallPolicyResponse.class;
	}

}
