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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.GetPagedInstanceResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.GetPagedInstanceResponse.Data;
import com.aliyuncs.dms_enterprise.model.v20181101.GetPagedInstanceResponse.Data.InstanceItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPagedInstanceResponseUnmarshaller {

	public static GetPagedInstanceResponse unmarshall(GetPagedInstanceResponse getPagedInstanceResponse, UnmarshallerContext _ctx) {
		
		getPagedInstanceResponse.setRequestId(_ctx.stringValue("GetPagedInstanceResponse.RequestId"));
		getPagedInstanceResponse.setTraceId(_ctx.stringValue("GetPagedInstanceResponse.TraceId"));
		getPagedInstanceResponse.setSuccess(_ctx.booleanValue("GetPagedInstanceResponse.Success"));
		getPagedInstanceResponse.setErrorMessage(_ctx.stringValue("GetPagedInstanceResponse.ErrorMessage"));
		getPagedInstanceResponse.setErrorCode(_ctx.stringValue("GetPagedInstanceResponse.ErrorCode"));
		getPagedInstanceResponse.setPageIndex(_ctx.longValue("GetPagedInstanceResponse.PageIndex"));
		getPagedInstanceResponse.setPageSize(_ctx.longValue("GetPagedInstanceResponse.PageSize"));
		getPagedInstanceResponse.setTotal(_ctx.longValue("GetPagedInstanceResponse.Total"));

		Data data = new Data();

		List<InstanceItem> instance = new ArrayList<InstanceItem>();
		for (int i = 0; i < _ctx.lengthValue("GetPagedInstanceResponse.Data.Instance.Length"); i++) {
			InstanceItem instanceItem = new InstanceItem();
			instanceItem.setBusinessTime(_ctx.stringValue("GetPagedInstanceResponse.Data.Instance["+ i +"].BusinessTime"));
			instanceItem.setCheckStatus(_ctx.longValue("GetPagedInstanceResponse.Data.Instance["+ i +"].CheckStatus"));
			instanceItem.setDagId(_ctx.longValue("GetPagedInstanceResponse.Data.Instance["+ i +"].DagId"));
			instanceItem.setDelete(_ctx.stringValue("GetPagedInstanceResponse.Data.Instance["+ i +"].Delete"));
			instanceItem.setEndTime(_ctx.stringValue("GetPagedInstanceResponse.Data.Instance["+ i +"].EndTime"));
			instanceItem.setGmtCreate(_ctx.stringValue("GetPagedInstanceResponse.Data.Instance["+ i +"].GmtCreate"));
			instanceItem.setGmtModified(_ctx.stringValue("GetPagedInstanceResponse.Data.Instance["+ i +"].GmtModified"));
			instanceItem.setHistoryDagId(_ctx.longValue("GetPagedInstanceResponse.Data.Instance["+ i +"].HistoryDagId"));
			instanceItem.setId(_ctx.longValue("GetPagedInstanceResponse.Data.Instance["+ i +"].Id"));
			instanceItem.setLastRunningContext(_ctx.stringValue("GetPagedInstanceResponse.Data.Instance["+ i +"].LastRunningContext"));
			instanceItem.setMsg(_ctx.stringValue("GetPagedInstanceResponse.Data.Instance["+ i +"].Msg"));
			instanceItem.setStatus(_ctx.longValue("GetPagedInstanceResponse.Data.Instance["+ i +"].Status"));
			instanceItem.setTaskType(_ctx.longValue("GetPagedInstanceResponse.Data.Instance["+ i +"].TaskType"));
			instanceItem.setTenantId(_ctx.stringValue("GetPagedInstanceResponse.Data.Instance["+ i +"].TenantId"));
			instanceItem.setTriggerType(_ctx.longValue("GetPagedInstanceResponse.Data.Instance["+ i +"].TriggerType"));
			instanceItem.setVersion(_ctx.stringValue("GetPagedInstanceResponse.Data.Instance["+ i +"].Version"));

			instance.add(instanceItem);
		}
		data.setInstance(instance);
		getPagedInstanceResponse.setData(data);
	 
	 	return getPagedInstanceResponse;
	}
}