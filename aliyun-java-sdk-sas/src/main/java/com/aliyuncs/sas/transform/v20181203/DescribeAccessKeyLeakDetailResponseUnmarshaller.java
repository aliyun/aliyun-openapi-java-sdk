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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeAccessKeyLeakDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessKeyLeakDetailResponseUnmarshaller {

	public static DescribeAccessKeyLeakDetailResponse unmarshall(DescribeAccessKeyLeakDetailResponse describeAccessKeyLeakDetailResponse, UnmarshallerContext _ctx) {
		
		describeAccessKeyLeakDetailResponse.setRequestId(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.RequestId"));
		describeAccessKeyLeakDetailResponse.setType(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.Type"));
		describeAccessKeyLeakDetailResponse.setGithubUserPicUrl(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GithubUserPicUrl"));
		describeAccessKeyLeakDetailResponse.setGithubUser(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GithubUser"));
		describeAccessKeyLeakDetailResponse.setGithubRepoName(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GithubRepoName"));
		describeAccessKeyLeakDetailResponse.setGithubFileType(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GithubFileType"));
		describeAccessKeyLeakDetailResponse.setRemark(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.Remark"));
		describeAccessKeyLeakDetailResponse.setGithubFileUpdateTime(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GithubFileUpdateTime"));
		describeAccessKeyLeakDetailResponse.setWhitelistStatus(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.WhitelistStatus"));
		describeAccessKeyLeakDetailResponse.setGithubFileName(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GithubFileName"));
		describeAccessKeyLeakDetailResponse.setSource(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.Source"));
		describeAccessKeyLeakDetailResponse.setGmtModified(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GmtModified"));
		describeAccessKeyLeakDetailResponse.setAsset(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.Asset"));
		describeAccessKeyLeakDetailResponse.setDealTime(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.DealTime"));
		describeAccessKeyLeakDetailResponse.setAccesskeyId(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.AccesskeyId"));
		describeAccessKeyLeakDetailResponse.setGithubFileUrl(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GithubFileUrl"));
		describeAccessKeyLeakDetailResponse.setDealType(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.DealType"));
		describeAccessKeyLeakDetailResponse.setCode(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.Code"));
		describeAccessKeyLeakDetailResponse.setGmtCreate(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GmtCreate"));
		describeAccessKeyLeakDetailResponse.setGithubRepoUrl(_ctx.stringValue("DescribeAccessKeyLeakDetailResponse.GithubRepoUrl"));
	 
	 	return describeAccessKeyLeakDetailResponse;
	}
}