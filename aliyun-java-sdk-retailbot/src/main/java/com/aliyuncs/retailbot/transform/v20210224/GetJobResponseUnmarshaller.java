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

package com.aliyuncs.retailbot.transform.v20210224;

import com.aliyuncs.retailbot.model.v20210224.GetJobResponse;
import com.aliyuncs.retailbot.model.v20210224.GetJobResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetJobResponseUnmarshaller {

	public static GetJobResponse unmarshall(GetJobResponse getJobResponse, UnmarshallerContext _ctx) {
		
		getJobResponse.setRequestId(_ctx.stringValue("GetJobResponse.RequestId"));
		getJobResponse.setSuccess(_ctx.booleanValue("GetJobResponse.Success"));
		getJobResponse.setCode(_ctx.stringValue("GetJobResponse.Code"));
		getJobResponse.setMessage(_ctx.stringValue("GetJobResponse.Message"));

		Data data = new Data();
		data.setConfig(_ctx.stringValue("GetJobResponse.Data.Config"));
		data.setTenantId(_ctx.longValue("GetJobResponse.Data.TenantId"));
		data.setId(_ctx.longValue("GetJobResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("GetJobResponse.Data.GmtCreate"));
		data.setGmtModified(_ctx.longValue("GetJobResponse.Data.GmtModified"));
		data.setInstanceId(_ctx.stringValue("GetJobResponse.Data.InstanceId"));
		data.setShopId(_ctx.stringValue("GetJobResponse.Data.ShopId"));
		data.setAppCode(_ctx.stringValue("GetJobResponse.Data.AppCode"));
		data.setAppVersion(_ctx.stringValue("GetJobResponse.Data.AppVersion"));
		data.setJobName(_ctx.stringValue("GetJobResponse.Data.JobName"));
		data.setStatus(_ctx.integerValue("GetJobResponse.Data.Status"));
		data.setStartTime(_ctx.longValue("GetJobResponse.Data.StartTime"));
		data.setEndTime(_ctx.longValue("GetJobResponse.Data.EndTime"));
		getJobResponse.setData(data);
	 
	 	return getJobResponse;
	}
}