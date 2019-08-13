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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.ListApmApplicationResponse;
import com.aliyuncs.emr.model.v20160408.ListApmApplicationResponse.ApmAppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApmApplicationResponseUnmarshaller {

	public static ListApmApplicationResponse unmarshall(ListApmApplicationResponse listApmApplicationResponse, UnmarshallerContext _ctx) {
		
		listApmApplicationResponse.setRequestId(_ctx.stringValue("ListApmApplicationResponse.RequestId"));
		listApmApplicationResponse.setTotal(_ctx.integerValue("ListApmApplicationResponse.Total"));
		listApmApplicationResponse.setPageSize(_ctx.integerValue("ListApmApplicationResponse.PageSize"));
		listApmApplicationResponse.setPageNumber(_ctx.integerValue("ListApmApplicationResponse.PageNumber"));

		List<ApmAppInfo> apmAppInfoList = new ArrayList<ApmAppInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListApmApplicationResponse.ApmAppInfoList.Length"); i++) {
			ApmAppInfo apmAppInfo = new ApmAppInfo();
			apmAppInfo.setApplicationId(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].ApplicationId"));
			apmAppInfo.setClusterBizId(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].ClusterBizId"));
			apmAppInfo.setApplicationType(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].ApplicationType"));
			apmAppInfo.setName(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].Name"));
			apmAppInfo.setState(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].State"));
			apmAppInfo.setFinalStatus(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].FinalStatus"));
			apmAppInfo.setQueue(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].Queue"));
			apmAppInfo.setUser(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].User"));
			apmAppInfo.setAllocatedVcore(_ctx.longValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].AllocatedVcore"));
			apmAppInfo.setAllocatedMemory(_ctx.longValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].AllocatedMemory"));
			apmAppInfo.setProgress(_ctx.floatValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].Progress"));
			apmAppInfo.setVcoreSeconds(_ctx.longValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].VcoreSeconds"));
			apmAppInfo.setMemorySeconds(_ctx.longValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].MemorySeconds"));
			apmAppInfo.setStartTime(_ctx.longValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].StartTime"));
			apmAppInfo.setSubmitTime(_ctx.longValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].SubmitTime"));
			apmAppInfo.setFinishedTime(_ctx.longValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].FinishedTime"));
			apmAppInfo.setDuration(_ctx.integerValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].Duration"));
			apmAppInfo.setDiagnostics(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].Diagnostics"));
			apmAppInfo.setClusterUsagePercent(_ctx.floatValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].ClusterUsagePercent"));
			apmAppInfo.setQueueUsagePercent(_ctx.floatValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].QueueUsagePercent"));
			apmAppInfo.setRunningContainers(_ctx.integerValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].RunningContainers"));
			apmAppInfo.setRunningDuration(_ctx.integerValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].RunningDuration"));
			apmAppInfo.setResourceRequests(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].ResourceRequests"));
			apmAppInfo.setDiagnoseResult(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].DiagnoseResult"));
			apmAppInfo.setDiagnoseCode(_ctx.stringValue("ListApmApplicationResponse.ApmAppInfoList["+ i +"].DiagnoseCode"));

			apmAppInfoList.add(apmAppInfo);
		}
		listApmApplicationResponse.setApmAppInfoList(apmAppInfoList);
	 
	 	return listApmApplicationResponse;
	}
}