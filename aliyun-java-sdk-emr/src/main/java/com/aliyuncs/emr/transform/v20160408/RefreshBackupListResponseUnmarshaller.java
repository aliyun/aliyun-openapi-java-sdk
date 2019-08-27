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

import com.aliyuncs.emr.model.v20160408.RefreshBackupListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RefreshBackupListResponseUnmarshaller {

	public static RefreshBackupListResponse unmarshall(RefreshBackupListResponse refreshBackupListResponse, UnmarshallerContext _ctx) {
		
		refreshBackupListResponse.setRequestId(_ctx.stringValue("RefreshBackupListResponse.RequestId"));
		refreshBackupListResponse.setBizId(_ctx.stringValue("RefreshBackupListResponse.BizId"));
		refreshBackupListResponse.setDataSourceId(_ctx.longValue("RefreshBackupListResponse.DataSourceId"));
		refreshBackupListResponse.setTaskType(_ctx.stringValue("RefreshBackupListResponse.TaskType"));
		refreshBackupListResponse.setTaskStatus(_ctx.stringValue("RefreshBackupListResponse.TaskStatus"));
		refreshBackupListResponse.setStartTime(_ctx.longValue("RefreshBackupListResponse.StartTime"));
		refreshBackupListResponse.setEndTime(_ctx.longValue("RefreshBackupListResponse.EndTime"));
		refreshBackupListResponse.setTaskDetail(_ctx.stringValue("RefreshBackupListResponse.TaskDetail"));
		refreshBackupListResponse.setTaskResultDetail(_ctx.stringValue("RefreshBackupListResponse.TaskResultDetail"));
		refreshBackupListResponse.setTaskProcess(_ctx.integerValue("RefreshBackupListResponse.TaskProcess"));
		refreshBackupListResponse.setTriggerUser(_ctx.stringValue("RefreshBackupListResponse.TriggerUser"));
		refreshBackupListResponse.setTriggerType(_ctx.stringValue("RefreshBackupListResponse.TriggerType"));
		refreshBackupListResponse.setGmtCreate(_ctx.longValue("RefreshBackupListResponse.GmtCreate"));
		refreshBackupListResponse.setGmtModified(_ctx.longValue("RefreshBackupListResponse.GmtModified"));
		refreshBackupListResponse.setClusterBizId(_ctx.stringValue("RefreshBackupListResponse.ClusterBizId"));
		refreshBackupListResponse.setHostName(_ctx.stringValue("RefreshBackupListResponse.HostName"));
		refreshBackupListResponse.setEcmTaskId(_ctx.longValue("RefreshBackupListResponse.EcmTaskId"));
	 
	 	return refreshBackupListResponse;
	}
}