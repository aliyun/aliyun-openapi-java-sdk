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

import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutNotificationResponse;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutNotificationResponse.Result;
import com.aliyuncs.sofa.model.v20190815.GetLinkeBahamutNotificationResponse.Result.Operator;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLinkeBahamutNotificationResponseUnmarshaller {

	public static GetLinkeBahamutNotificationResponse unmarshall(GetLinkeBahamutNotificationResponse getLinkeBahamutNotificationResponse, UnmarshallerContext _ctx) {
		
		getLinkeBahamutNotificationResponse.setRequestId(_ctx.stringValue("GetLinkeBahamutNotificationResponse.RequestId"));
		getLinkeBahamutNotificationResponse.setResultCode(_ctx.stringValue("GetLinkeBahamutNotificationResponse.ResultCode"));
		getLinkeBahamutNotificationResponse.setResultMessage(_ctx.stringValue("GetLinkeBahamutNotificationResponse.ResultMessage"));
		getLinkeBahamutNotificationResponse.setErrorMessage(_ctx.stringValue("GetLinkeBahamutNotificationResponse.ErrorMessage"));
		getLinkeBahamutNotificationResponse.setMessage(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Message"));
		getLinkeBahamutNotificationResponse.setSuccess(_ctx.booleanValue("GetLinkeBahamutNotificationResponse.Success"));

		Result result = new Result();
		result.setContent(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Content"));
		result.setCreated(_ctx.longValue("GetLinkeBahamutNotificationResponse.Result.Created"));
		result.setDeleted(_ctx.booleanValue("GetLinkeBahamutNotificationResponse.Result.Deleted"));
		result.setId(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Id"));
		result.setLastModified(_ctx.longValue("GetLinkeBahamutNotificationResponse.Result.LastModified"));
		result.setShowNotification(_ctx.booleanValue("GetLinkeBahamutNotificationResponse.Result.ShowNotification"));
		result.setTime(_ctx.longValue("GetLinkeBahamutNotificationResponse.Result.Time"));

		Operator operator = new Operator();
		operator.setAccount(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Account"));
		operator.setCreated(_ctx.longValue("GetLinkeBahamutNotificationResponse.Result.Operator.Created"));
		operator.setCustomer(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Customer"));
		operator.setDeleted(_ctx.booleanValue("GetLinkeBahamutNotificationResponse.Result.Operator.Deleted"));
		operator.setDepartment(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Department"));
		operator.setEmail(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Email"));
		operator.setEmpId(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.EmpId"));
		operator.setId(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Id"));
		operator.setLastLogin(_ctx.longValue("GetLinkeBahamutNotificationResponse.Result.Operator.LastLogin"));
		operator.setLastModified(_ctx.longValue("GetLinkeBahamutNotificationResponse.Result.Operator.LastModified"));
		operator.setName(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Name"));
		operator.setNick(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Nick"));
		operator.setUid(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Uid"));
		operator.setUniqueId(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.UniqueId"));
		operator.setWw(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Ww"));

		List<String> tenants = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetLinkeBahamutNotificationResponse.Result.Operator.Tenants.Length"); i++) {
			tenants.add(_ctx.stringValue("GetLinkeBahamutNotificationResponse.Result.Operator.Tenants["+ i +"]"));
		}
		operator.setTenants(tenants);
		result.setOperator(operator);
		getLinkeBahamutNotificationResponse.setResult(result);
	 
	 	return getLinkeBahamutNotificationResponse;
	}
}