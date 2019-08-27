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

package com.aliyuncs.emr.transform.v20160408;

import com.aliyuncs.emr.model.v20160408.DescribeWorkspaceRepoSettingResponse;
import com.aliyuncs.emr.model.v20160408.DescribeWorkspaceRepoSettingResponse.RepoMaven;
import com.aliyuncs.emr.model.v20160408.DescribeWorkspaceRepoSettingResponse.RepoPip ;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWorkspaceRepoSettingResponseUnmarshaller {

	public static DescribeWorkspaceRepoSettingResponse unmarshall(DescribeWorkspaceRepoSettingResponse describeWorkspaceRepoSettingResponse, UnmarshallerContext _ctx) {
		
		describeWorkspaceRepoSettingResponse.setRequestId(_ctx.stringValue("DescribeWorkspaceRepoSettingResponse.RequestId"));

		RepoMaven repoMaven = new RepoMaven();
		repoMaven.setGroupId(_ctx.stringValue("DescribeWorkspaceRepoSettingResponse.RepoMaven.GroupId"));
		repoMaven.setArtifactId(_ctx.stringValue("DescribeWorkspaceRepoSettingResponse.RepoMaven.ArtifactId"));
		repoMaven.setVersion(_ctx.stringValue("DescribeWorkspaceRepoSettingResponse.RepoMaven.Version"));
		describeWorkspaceRepoSettingResponse.setRepoMaven(repoMaven);

		RepoPip  repoPip  = new RepoPip ();
		repoPip .setPackageName(_ctx.stringValue("DescribeWorkspaceRepoSettingResponse.RepoPip .PackageName"));
		repoPip .setVersion(_ctx.stringValue("DescribeWorkspaceRepoSettingResponse.RepoPip .Version"));
		describeWorkspaceRepoSettingResponse.setRepoPip (repoPip );
	 
	 	return describeWorkspaceRepoSettingResponse;
	}
}