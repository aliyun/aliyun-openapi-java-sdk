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

package com.aliyuncs.schedulerx2.transform.v20190430;

import com.aliyuncs.schedulerx2.model.v20190430.GetAppGroupResponse;
import com.aliyuncs.schedulerx2.model.v20190430.GetAppGroupResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppGroupResponseUnmarshaller {

	public static GetAppGroupResponse unmarshall(GetAppGroupResponse getAppGroupResponse, UnmarshallerContext _ctx) {
		
		getAppGroupResponse.setRequestId(_ctx.stringValue("GetAppGroupResponse.RequestId"));
		getAppGroupResponse.setCode(_ctx.integerValue("GetAppGroupResponse.Code"));
		getAppGroupResponse.setMessage(_ctx.stringValue("GetAppGroupResponse.Message"));
		getAppGroupResponse.setSuccess(_ctx.booleanValue("GetAppGroupResponse.Success"));

		Data data = new Data();
		data.setAppName(_ctx.stringValue("GetAppGroupResponse.Data.AppName"));
		data.setDescription(_ctx.stringValue("GetAppGroupResponse.Data.Description"));
		data.setMaxJobs(_ctx.integerValue("GetAppGroupResponse.Data.MaxJobs"));
		data.setGroupId(_ctx.stringValue("GetAppGroupResponse.Data.GroupId"));
		data.setAlarmJson(_ctx.stringValue("GetAppGroupResponse.Data.AlarmJson"));
		data.setMetricsThresholdJson(_ctx.stringValue("GetAppGroupResponse.Data.MetricsThresholdJson"));
		data.setMonitorConfigJson(_ctx.stringValue("GetAppGroupResponse.Data.MonitorConfigJson"));
		data.setMaxConcurrency(_ctx.integerValue("GetAppGroupResponse.Data.MaxConcurrency"));
		data.setCurJobs(_ctx.integerValue("GetAppGroupResponse.Data.CurJobs"));
		data.setRunningInstanceNum(_ctx.integerValue("GetAppGroupResponse.Data.RunningInstanceNum"));
		data.setReadyInstanceNum(_ctx.integerValue("GetAppGroupResponse.Data.ReadyInstanceNum"));
		data.setAppGroupId(_ctx.longValue("GetAppGroupResponse.Data.AppGroupId"));
		data.setAppKey(_ctx.stringValue("GetAppGroupResponse.Data.AppKey"));
		data.setXattrs(_ctx.stringValue("GetAppGroupResponse.Data.Xattrs"));
		data.setAppVersion(_ctx.stringValue("GetAppGroupResponse.Data.AppVersion"));
		data.setNamespace(_ctx.stringValue("GetAppGroupResponse.Data.Namespace"));
		data.setMonitorContactsJson(_ctx.stringValue("GetAppGroupResponse.Data.MonitorContactsJson"));
		getAppGroupResponse.setData(data);
	 
	 	return getAppGroupResponse;
	}
}