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

import com.aliyuncs.sofa.model.v20190815.CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponseUnmarshaller {

	public static CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse unmarshall(CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse, UnmarshallerContext _ctx) {
		
		createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.setRequestId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.RequestId"));
		createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.setResultCode(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.ResultCode"));
		createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.setResultMessage(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.ResultMessage"));
		createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.setBranchCreated(_ctx.booleanValue("CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.BranchCreated"));
		createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.setBranchName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.BranchName"));
		createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.setCommitId(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.CommitId"));
		createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.setFileName(_ctx.stringValue("CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.FileName"));
		createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.setResponseStatusCode(_ctx.longValue("CreateLinkeantcodeAntcodeCreatenewfileinrepositoryResponse.ResponseStatusCode"));
	 
	 	return createLinkeantcodeAntcodeCreatenewfileinrepositoryResponse;
	}
}