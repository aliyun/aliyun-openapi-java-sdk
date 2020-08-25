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

import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAoneinternalworkitemResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateLinkeBahamutAoneinternalworkitemResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateLinkeBahamutAoneinternalworkitemResponseUnmarshaller {

	public static UpdateLinkeBahamutAoneinternalworkitemResponse unmarshall(UpdateLinkeBahamutAoneinternalworkitemResponse updateLinkeBahamutAoneinternalworkitemResponse, UnmarshallerContext _ctx) {
		
		updateLinkeBahamutAoneinternalworkitemResponse.setRequestId(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.RequestId"));
		updateLinkeBahamutAoneinternalworkitemResponse.setResultCode(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.ResultCode"));
		updateLinkeBahamutAoneinternalworkitemResponse.setResultMessage(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.ResultMessage"));
		updateLinkeBahamutAoneinternalworkitemResponse.setErrorMessage(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.ErrorMessage"));
		updateLinkeBahamutAoneinternalworkitemResponse.setErrorMsgParamsMap(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.ErrorMsgParamsMap"));
		updateLinkeBahamutAoneinternalworkitemResponse.setMessage(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Message"));
		updateLinkeBahamutAoneinternalworkitemResponse.setResponseStatusCode(_ctx.longValue("UpdateLinkeBahamutAoneinternalworkitemResponse.ResponseStatusCode"));
		updateLinkeBahamutAoneinternalworkitemResponse.setSuccess(_ctx.booleanValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Success"));

		Result result = new Result();
		result.setAkProjectId(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.AkProjectId"));
		result.setAssignedTo(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.AssignedTo"));
		result.setAssignedToStaffId(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.AssignedToStaffId"));
		result.setCreatedAt(_ctx.longValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.CreatedAt"));
		result.setId(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.Id"));
		result.setLink(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.Link"));
		result.setOtherJson(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.OtherJson"));
		result.setPriority(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.Priority"));
		result.setPriorityId(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.PriorityId"));
		result.setProjectId(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.ProjectId"));
		result.setStamp(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.Stamp"));
		result.setStatus(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.Status"));
		result.setStatusId(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.StatusId"));
		result.setStatusStage(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.StatusStage"));
		result.setSubject(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.Subject"));
		result.setUser(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.User"));
		result.setUserId(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.UserId"));
		result.setUserStaffId(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.UserStaffId"));

		List<String> cfsList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.CfsList.Length"); i++) {
			cfsList.add(_ctx.stringValue("UpdateLinkeBahamutAoneinternalworkitemResponse.Result.CfsList["+ i +"]"));
		}
		result.setCfsList(cfsList);
		updateLinkeBahamutAoneinternalworkitemResponse.setResult(result);
	 
	 	return updateLinkeBahamutAoneinternalworkitemResponse;
	}
}