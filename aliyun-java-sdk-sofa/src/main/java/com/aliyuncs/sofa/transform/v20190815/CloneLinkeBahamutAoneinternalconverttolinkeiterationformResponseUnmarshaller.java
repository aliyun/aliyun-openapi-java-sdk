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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse;
import com.aliyuncs.sofa.model.v20190815.CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponseUnmarshaller {

	public static CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse unmarshall(CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse, UnmarshallerContext _ctx) {
		
		cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.setRequestId(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.RequestId"));
		cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.setResultCode(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.ResultCode"));
		cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.setResultMessage(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.ResultMessage"));
		cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.setErrorMessage(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.ErrorMessage"));
		cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.setErrorMsgParamsMap(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.ErrorMsgParamsMap"));
		cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.setMessage(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Message"));
		cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.setResponseStatusCode(_ctx.longValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.ResponseStatusCode"));
		cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.setSuccess(_ctx.booleanValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Success"));

		Result result = new Result();
		result.setAoneCodeChangeId(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.AoneCodeChangeId"));
		result.setAppForms(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.AppForms"));
		result.setIsBranchRelease(_ctx.booleanValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.IsBranchRelease"));
		result.setIterationManager(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.IterationManager"));
		result.setName(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.Name"));
		result.setPrePubOwner(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.PrePubOwner"));
		result.setProject(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.Project"));
		result.setTestOwner(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.TestOwner"));

		List<String> users = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.Users.Length"); i++) {
			users.add(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.Users["+ i +"]"));
		}
		result.setUsers(users);

		List<String> workItems = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.WorkItems.Length"); i++) {
			workItems.add(_ctx.stringValue("CloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.Result.WorkItems["+ i +"]"));
		}
		result.setWorkItems(workItems);
		cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse.setResult(result);
	 
	 	return cloneLinkeBahamutAoneinternalconverttolinkeiterationformResponse;
	}
}