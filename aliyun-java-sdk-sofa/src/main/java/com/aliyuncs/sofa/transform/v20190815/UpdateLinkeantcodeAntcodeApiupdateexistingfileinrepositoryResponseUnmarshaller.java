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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponseUnmarshaller {

	public static UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse unmarshall(UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse, UnmarshallerContext _ctx) {
		
		updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.setRequestId(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.RequestId"));
		updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.setResultCode(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.ResultCode"));
		updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.setResultMessage(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.ResultMessage"));
		updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.setBranchCreated(_ctx.booleanValue("UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.BranchCreated"));
		updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.setBranchName(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.BranchName"));
		updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.setCommitId(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.CommitId"));
		updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.setFileName(_ctx.stringValue("UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.FileName"));
		updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse.ResponseStatusCode"));
	 
	 	return updateLinkeantcodeAntcodeApiupdateexistingfileinrepositoryResponse;
	}
}