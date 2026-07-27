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

import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse.PageResult.ResourcePermissionRecord;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse.PageResult.ResourcePermissionRecord.Period;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse.PageResult.ResourcePermissionRecord.PermissionPeriod;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse.PageResult.ResourcePermissionRecord.PermissionPeriod.Period1;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse.PageResult.ResourcePermissionRecord.ResourceInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse.PageResult.ResourcePermissionRecord.ResourceInfo.BizUnitInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse.PageResult.ResourcePermissionRecord.ResourceInfo.ProjectInfo;
import com.aliyuncs.dataphin_public.model.v20230630.ListResourcePermissionsResponse.PageResult.ResourcePermissionRecord.TargetAccount;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourcePermissionsResponseUnmarshaller {

	public static ListResourcePermissionsResponse unmarshall(ListResourcePermissionsResponse listResourcePermissionsResponse, UnmarshallerContext _ctx) {
		
		listResourcePermissionsResponse.setRequestId(_ctx.stringValue("ListResourcePermissionsResponse.RequestId"));
		listResourcePermissionsResponse.setMessage(_ctx.stringValue("ListResourcePermissionsResponse.Message"));
		listResourcePermissionsResponse.setHttpStatusCode(_ctx.integerValue("ListResourcePermissionsResponse.HttpStatusCode"));
		listResourcePermissionsResponse.setCode(_ctx.stringValue("ListResourcePermissionsResponse.Code"));
		listResourcePermissionsResponse.setSuccess(_ctx.booleanValue("ListResourcePermissionsResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListResourcePermissionsResponse.PageResult.TotalCount"));

		List<ResourcePermissionRecord> data = new ArrayList<ResourcePermissionRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListResourcePermissionsResponse.PageResult.Data.Length"); i++) {
			ResourcePermissionRecord resourcePermissionRecord = new ResourcePermissionRecord();
			resourcePermissionRecord.setAuthScope(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].AuthScope"));
			resourcePermissionRecord.setRecordId(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].RecordId"));

			ResourceInfo resourceInfo = new ResourceInfo();
			resourceInfo.setType(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.Type"));
			resourceInfo.setDisplayName(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.DisplayName"));
			resourceInfo.setId(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.Id"));
			resourceInfo.setEnv(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.Env"));
			resourceInfo.setName(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.Name"));

			BizUnitInfo bizUnitInfo = new BizUnitInfo();
			bizUnitInfo.setDisplayName(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.BizUnitInfo.DisplayName"));
			bizUnitInfo.setId(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.BizUnitInfo.Id"));
			bizUnitInfo.setEnv(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.BizUnitInfo.Env"));
			bizUnitInfo.setName(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.BizUnitInfo.Name"));
			resourceInfo.setBizUnitInfo(bizUnitInfo);

			ProjectInfo projectInfo = new ProjectInfo();
			projectInfo.setDisplayName(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.ProjectInfo.DisplayName"));
			projectInfo.setId(_ctx.longValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.ProjectInfo.Id"));
			projectInfo.setEnv(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.ProjectInfo.Env"));
			projectInfo.setName(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].ResourceInfo.ProjectInfo.Name"));
			resourceInfo.setProjectInfo(projectInfo);
			resourcePermissionRecord.setResourceInfo(resourceInfo);

			Period period = new Period();
			period.setType(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].Period.Type"));
			period.setEndTime(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].Period.EndTime"));
			resourcePermissionRecord.setPeriod(period);

			TargetAccount targetAccount = new TargetAccount();
			targetAccount.setType(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].TargetAccount.Type"));
			targetAccount.setId(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].TargetAccount.Id"));
			targetAccount.setName(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].TargetAccount.Name"));
			resourcePermissionRecord.setTargetAccount(targetAccount);

			List<PermissionPeriod> permissionPeriodList = new ArrayList<PermissionPeriod>();
			for (int j = 0; j < _ctx.lengthValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].PermissionPeriodList.Length"); j++) {
				PermissionPeriod permissionPeriod = new PermissionPeriod();
				permissionPeriod.setPermissionType(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].PermissionPeriodList["+ j +"].PermissionType"));

				Period1 period1 = new Period1();
				period1.setType(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].PermissionPeriodList["+ j +"].Period.Type"));
				period1.setEndTime(_ctx.stringValue("ListResourcePermissionsResponse.PageResult.Data["+ i +"].PermissionPeriodList["+ j +"].Period.EndTime"));
				permissionPeriod.setPeriod1(period1);

				permissionPeriodList.add(permissionPeriod);
			}
			resourcePermissionRecord.setPermissionPeriodList(permissionPeriodList);

			data.add(resourcePermissionRecord);
		}
		pageResult.setData(data);
		listResourcePermissionsResponse.setPageResult(pageResult);
	 
	 	return listResourcePermissionsResponse;
	}
}