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
import com.aliyuncs.sas.transform.v20181203.DescribeAccessKeyLeakDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccessKeyLeakDetailResponse extends AcsResponse {

	private String type;

	private String githubUserPicUrl;

	private String githubUser;

	private String githubRepoName;

	private String githubFileType;

	private String remark;

	private String githubFileUpdateTime;

	private String whitelistStatus;

	private String githubFileName;

	private String source;

	private String gmtModified;

	private String asset;

	private String dealTime;

	private String requestId;

	private String accesskeyId;

	private String githubFileUrl;

	private String dealType;

	private String code;

	private String gmtCreate;

	private String githubRepoUrl;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGithubUserPicUrl() {
		return this.githubUserPicUrl;
	}

	public void setGithubUserPicUrl(String githubUserPicUrl) {
		this.githubUserPicUrl = githubUserPicUrl;
	}

	public String getGithubUser() {
		return this.githubUser;
	}

	public void setGithubUser(String githubUser) {
		this.githubUser = githubUser;
	}

	public String getGithubRepoName() {
		return this.githubRepoName;
	}

	public void setGithubRepoName(String githubRepoName) {
		this.githubRepoName = githubRepoName;
	}

	public String getGithubFileType() {
		return this.githubFileType;
	}

	public void setGithubFileType(String githubFileType) {
		this.githubFileType = githubFileType;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getGithubFileUpdateTime() {
		return this.githubFileUpdateTime;
	}

	public void setGithubFileUpdateTime(String githubFileUpdateTime) {
		this.githubFileUpdateTime = githubFileUpdateTime;
	}

	public String getWhitelistStatus() {
		return this.whitelistStatus;
	}

	public void setWhitelistStatus(String whitelistStatus) {
		this.whitelistStatus = whitelistStatus;
	}

	public String getGithubFileName() {
		return this.githubFileName;
	}

	public void setGithubFileName(String githubFileName) {
		this.githubFileName = githubFileName;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getAsset() {
		return this.asset;
	}

	public void setAsset(String asset) {
		this.asset = asset;
	}

	public String getDealTime() {
		return this.dealTime;
	}

	public void setDealTime(String dealTime) {
		this.dealTime = dealTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAccesskeyId() {
		return this.accesskeyId;
	}

	public void setAccesskeyId(String accesskeyId) {
		this.accesskeyId = accesskeyId;
	}

	public String getGithubFileUrl() {
		return this.githubFileUrl;
	}

	public void setGithubFileUrl(String githubFileUrl) {
		this.githubFileUrl = githubFileUrl;
	}

	public String getDealType() {
		return this.dealType;
	}

	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}

	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGithubRepoUrl() {
		return this.githubRepoUrl;
	}

	public void setGithubRepoUrl(String githubRepoUrl) {
		this.githubRepoUrl = githubRepoUrl;
	}

	@Override
	public DescribeAccessKeyLeakDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccessKeyLeakDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
