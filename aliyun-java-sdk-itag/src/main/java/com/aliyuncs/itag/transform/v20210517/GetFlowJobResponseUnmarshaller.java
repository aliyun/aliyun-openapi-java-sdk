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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.GetFlowJobResponse;
import com.aliyuncs.itag.model.v20210517.GetFlowJobResponse.Result;
import com.aliyuncs.itag.model.v20210517.GetFlowJobResponse.Result.Creator;
import com.aliyuncs.itag.model.v20210517.GetFlowJobResponse.Result.Modifier;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFlowJobResponseUnmarshaller {

	public static GetFlowJobResponse unmarshall(GetFlowJobResponse getFlowJobResponse, UnmarshallerContext _ctx) {
		
		getFlowJobResponse.setRequestId(_ctx.stringValue("GetFlowJobResponse.RequestId"));
		getFlowJobResponse.setCode(_ctx.stringValue("GetFlowJobResponse.Code"));
		getFlowJobResponse.setErrInfo(_ctx.stringValue("GetFlowJobResponse.ErrInfo"));
		getFlowJobResponse.setMsg(_ctx.stringValue("GetFlowJobResponse.Msg"));
		getFlowJobResponse.setSucc(_ctx.booleanValue("GetFlowJobResponse.Succ"));
		getFlowJobResponse.setErrorCode(_ctx.stringValue("GetFlowJobResponse.ErrorCode"));

		Result result = new Result();
		result.setRunInstId(_ctx.stringValue("GetFlowJobResponse.Result.RunInstId"));
		result.setFlowId(_ctx.stringValue("GetFlowJobResponse.Result.FlowId"));
		result.setState(_ctx.stringValue("GetFlowJobResponse.Result.State"));
		result.setRunMsg(_ctx.stringValue("GetFlowJobResponse.Result.RunMsg"));
		result.setLogView(_ctx.stringValue("GetFlowJobResponse.Result.LogView"));
		result.setRunRet(_ctx.mapValue("GetFlowJobResponse.Result.RunRet"));
		result.setGmtCreate(_ctx.stringValue("GetFlowJobResponse.Result.GmtCreate"));
		result.setGmtModified(_ctx.stringValue("GetFlowJobResponse.Result.GmtModified"));

		Creator creator = new Creator();
		creator.setUserId(_ctx.stringValue("GetFlowJobResponse.Result.Creator.UserId"));
		creator.setUserName(_ctx.stringValue("GetFlowJobResponse.Result.Creator.UserName"));
		creator.setAccountType(_ctx.stringValue("GetFlowJobResponse.Result.Creator.AccountType"));
		creator.setAccountNo(_ctx.stringValue("GetFlowJobResponse.Result.Creator.AccountNo"));
		result.setCreator(creator);

		Modifier modifier = new Modifier();
		modifier.setUserId(_ctx.stringValue("GetFlowJobResponse.Result.Modifier.UserId"));
		modifier.setUserName(_ctx.stringValue("GetFlowJobResponse.Result.Modifier.UserName"));
		modifier.setAccountType(_ctx.stringValue("GetFlowJobResponse.Result.Modifier.AccountType"));
		modifier.setAccountNo(_ctx.stringValue("GetFlowJobResponse.Result.Modifier.AccountNo"));
		result.setModifier(modifier);
		getFlowJobResponse.setResult(result);
	 
	 	return getFlowJobResponse;
	}
}