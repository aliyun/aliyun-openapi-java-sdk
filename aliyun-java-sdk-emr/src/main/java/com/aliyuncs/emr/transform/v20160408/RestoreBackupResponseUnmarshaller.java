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

import com.aliyuncs.emr.model.v20160408.RestoreBackupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RestoreBackupResponseUnmarshaller {

	public static RestoreBackupResponse unmarshall(RestoreBackupResponse restoreBackupResponse, UnmarshallerContext _ctx) {
		
		restoreBackupResponse.setRequestId(_ctx.stringValue("RestoreBackupResponse.RequestId"));
		restoreBackupResponse.setBizId(_ctx.stringValue("RestoreBackupResponse.BizId"));
		restoreBackupResponse.setDataSourceId(_ctx.longValue("RestoreBackupResponse.DataSourceId"));
		restoreBackupResponse.setTaskType(_ctx.stringValue("RestoreBackupResponse.TaskType"));
		restoreBackupResponse.setTaskStatus(_ctx.stringValue("RestoreBackupResponse.TaskStatus"));
		restoreBackupResponse.setStartTime(_ctx.longValue("RestoreBackupResponse.StartTime"));
		restoreBackupResponse.setEndTime(_ctx.longValue("RestoreBackupResponse.EndTime"));
		restoreBackupResponse.setTaskDetail(_ctx.stringValue("RestoreBackupResponse.TaskDetail"));
		restoreBackupResponse.setTaskResultDetail(_ctx.stringValue("RestoreBackupResponse.TaskResultDetail"));
		restoreBackupResponse.setTaskProcess(_ctx.integerValue("RestoreBackupResponse.TaskProcess"));
		restoreBackupResponse.setTriggerUser(_ctx.stringValue("RestoreBackupResponse.TriggerUser"));
		restoreBackupResponse.setTriggerType(_ctx.stringValue("RestoreBackupResponse.TriggerType"));
		restoreBackupResponse.setGmtCreate(_ctx.longValue("RestoreBackupResponse.GmtCreate"));
		restoreBackupResponse.setGmtModified(_ctx.longValue("RestoreBackupResponse.GmtModified"));
		restoreBackupResponse.setClusterBizId(_ctx.stringValue("RestoreBackupResponse.ClusterBizId"));
		restoreBackupResponse.setHostName(_ctx.stringValue("RestoreBackupResponse.HostName"));
		restoreBackupResponse.setEcmTaskId(_ctx.longValue("RestoreBackupResponse.EcmTaskId"));
	 
	 	return restoreBackupResponse;
	}
}