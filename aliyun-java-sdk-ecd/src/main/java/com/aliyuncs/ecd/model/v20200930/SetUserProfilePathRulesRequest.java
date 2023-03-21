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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetUserProfilePathRulesRequest extends RpcAcsRequest<SetUserProfilePathRulesResponse> {
	   

	private String userProfileRuleType;

	private String desktopGroupId;

	@SerializedName("userProfilePathRule")
	private List<UserProfilePathRule> userProfilePathRule;
	public SetUserProfilePathRulesRequest() {
		super("ecd", "2020-09-30", "SetUserProfilePathRules");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserProfileRuleType() {
		return this.userProfileRuleType;
	}

	public void setUserProfileRuleType(String userProfileRuleType) {
		this.userProfileRuleType = userProfileRuleType;
		if(userProfileRuleType != null){
			putQueryParameter("UserProfileRuleType", userProfileRuleType);
		}
	}

	public String getDesktopGroupId() {
		return this.desktopGroupId;
	}

	public void setDesktopGroupId(String desktopGroupId) {
		this.desktopGroupId = desktopGroupId;
		if(desktopGroupId != null){
			putQueryParameter("DesktopGroupId", desktopGroupId);
		}
	}

	public List<UserProfilePathRule> getUserProfilePathRule() {
		return this.userProfilePathRule;
	}

	public void setUserProfilePathRule(List<UserProfilePathRule> userProfilePathRule) {
		this.userProfilePathRule = userProfilePathRule;	
		if (userProfilePathRule != null) {
			putQueryParameter("UserProfilePathRule" , new Gson().toJson(userProfilePathRule));
		}	
	}

	public static class UserProfilePathRule {

		@SerializedName("BlackPath")
		private BlackPath blackPath;

		@SerializedName("WhitePaths")
		private List<WhitePathsItem> whitePaths;

		public BlackPath getBlackPath() {
			return this.blackPath;
		}

		public void setBlackPath(BlackPath blackPath) {
			this.blackPath = blackPath;
		}

		public List<WhitePathsItem> getWhitePaths() {
			return this.whitePaths;
		}

		public void setWhitePaths(List<WhitePathsItem> whitePaths) {
			this.whitePaths = whitePaths;
		}

		public static class BlackPath {

			@SerializedName("Path")
			private String path;

			@SerializedName("Type")
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

		public static class WhitePathsItem {

			@SerializedName("Path")
			private String path;

			@SerializedName("Type")
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

	@Override
	public Class<SetUserProfilePathRulesResponse> getResponseClass() {
		return SetUserProfilePathRulesResponse.class;
	}

}
