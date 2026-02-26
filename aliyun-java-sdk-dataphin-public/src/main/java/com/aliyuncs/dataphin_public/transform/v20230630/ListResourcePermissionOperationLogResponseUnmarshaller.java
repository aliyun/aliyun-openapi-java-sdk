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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionOperationLogResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionOperationLogResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionOperationLogResponse.PageResult.PermissionOperateLog;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionOperationLogResponse.PageResult.PermissionOperateLog.Account;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionOperationLogResponse.PageResult.PermissionOperateLog.Period;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionOperationLogResponse.PageResult.PermissionOperateLog.ResourceInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionOperationLogResponse.PageResult.PermissionOperateLog.ResourceInfo.BizUnitInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionOperationLogResponse.PageResult.PermissionOperateLog.ResourceInfo.ProjectInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionOperationLogResponse.PageResult.PermissionOperateLog.TargetAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourcePermissionOperationLogResponseUnmarshaller {

	public static ListResourcePermissionOperationLogResponse unmarshall(ListResourcePermissionOperationLogResponse listResourcePermissionOperationLogResponse, UnmarshallerContext _ctx) {
		
		listResourcePermissionOperationLogResponse.setRequestId(_ctx.stringValue("ListResourcePermissionOperationLogResponse.RequestId"));
		listResourcePermissionOperationLogResponse.setSuccess(_ctx.booleanValue("ListResourcePermissionOperationLogResponse.Success"));
		listResourcePermissionOperationLogResponse.setHttpStatusCode(_ctx.integerValue("ListResourcePermissionOperationLogResponse.HttpStatusCode"));
		listResourcePermissionOperationLogResponse.setCode(_ctx.stringValue("ListResourcePermissionOperationLogResponse.Code"));
		listResourcePermissionOperationLogResponse.setMessage(_ctx.stringValue("ListResourcePermissionOperationLogResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListResourcePermissionOperationLogResponse.PageResult.TotalCount"));

		List<PermissionOperateLog> data = new ArrayList<PermissionOperateLog>();
		for (int i = 0; i < _ctx.lengthValue("ListResourcePermissionOperationLogResponse.PageResult.Data.Length"); i++) {
			PermissionOperateLog permissionOperateLog = new PermissionOperateLog();
			permissionOperateLog.setOperateId(_ctx.longValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].OperateId"));
			permissionOperateLog.setOperateType(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].OperateType"));
			permissionOperateLog.setReason(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].Reason"));
			permissionOperateLog.setOperateTime(_ctx.longValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].OperateTime"));
			permissionOperateLog.setAuthScope(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].AuthScope"));

			ResourceInfo resourceInfo = new ResourceInfo();
			resourceInfo.setId(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.Id"));
			resourceInfo.setName(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.Name"));
			resourceInfo.setDisplayName(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.DisplayName"));
			resourceInfo.setType(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.Type"));
			resourceInfo.setEnv(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.Env"));

			BizUnitInfo bizUnitInfo = new BizUnitInfo();
			bizUnitInfo.setId(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.BizUnitInfo.Id"));
			bizUnitInfo.setName(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.BizUnitInfo.Name"));
			bizUnitInfo.setDisplayName(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.BizUnitInfo.DisplayName"));
			bizUnitInfo.setEnv(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.BizUnitInfo.Env"));
			resourceInfo.setBizUnitInfo(bizUnitInfo);

			ProjectInfo projectInfo = new ProjectInfo();
			projectInfo.setId(_ctx.longValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.ProjectInfo.Id"));
			projectInfo.setName(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.ProjectInfo.Name"));
			projectInfo.setDisplayName(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.ProjectInfo.DisplayName"));
			projectInfo.setEnv(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].ResourceInfo.ProjectInfo.Env"));
			resourceInfo.setProjectInfo(projectInfo);
			permissionOperateLog.setResourceInfo(resourceInfo);

			Account account = new Account();
			account.setId(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].Account.Id"));
			account.setName(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].Account.Name"));
			account.setType(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].Account.Type"));
			permissionOperateLog.setAccount(account);

			TargetAccount targetAccount = new TargetAccount();
			targetAccount.setId(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].TargetAccount.Id"));
			targetAccount.setName(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].TargetAccount.Name"));
			targetAccount.setType(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].TargetAccount.Type"));
			permissionOperateLog.setTargetAccount(targetAccount);

			Period period = new Period();
			period.setType(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].Period.Type"));
			period.setEndTime(_ctx.stringValue("ListResourcePermissionOperationLogResponse.PageResult.Data["+ i +"].Period.EndTime"));
			permissionOperateLog.setPeriod(period);

			data.add(permissionOperateLog);
		}
		pageResult.setData(data);
		listResourcePermissionOperationLogResponse.setPageResult(pageResult);
	 
	 	return listResourcePermissionOperationLogResponse;
	}
}