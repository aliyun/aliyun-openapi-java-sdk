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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse unmarshall(CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.RequestId"));
		createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.ResultCode"));
		createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.ResultMessage"));
		createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.setBranch(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.Branch"));
		createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.setBranchCreated(_ctx.booleanValue("CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.BranchCreated"));
		createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.setCommitId(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.CommitId"));
		createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.setFilePath(_ctx.stringValue("CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.FilePath"));
		createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse.ResponseStatusCode"));
	 
	 	return createLinkeantcodeAntcodeProjectsidrepositoryfilesfilepathResponse;
	}
}