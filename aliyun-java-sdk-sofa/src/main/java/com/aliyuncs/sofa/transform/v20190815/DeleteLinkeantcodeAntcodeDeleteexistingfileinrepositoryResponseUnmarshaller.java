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

import com.aliyuncs.sofa.model.v20190815.DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponseUnmarshaller {

	public static DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse unmarshall(DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse, UnmarshallerContext _ctx) {
		
		deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.setRequestId(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.RequestId"));
		deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.setResultCode(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.ResultCode"));
		deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.setResultMessage(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.ResultMessage"));
		deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.setBranchCreated(_ctx.booleanValue("DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.BranchCreated"));
		deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.setBranchName(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.BranchName"));
		deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.setCommitId(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.CommitId"));
		deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.setFileName(_ctx.stringValue("DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.FileName"));
		deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.setResponseStatusCode(_ctx.longValue("DeleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse.ResponseStatusCode"));
	 
	 	return deleteLinkeantcodeAntcodeDeleteexistingfileinrepositoryResponse;
	}
}