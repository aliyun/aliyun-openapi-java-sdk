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

import com.aliyuncs.emr.model.v20160408.RemoveBackupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveBackupResponseUnmarshaller {

	public static RemoveBackupResponse unmarshall(RemoveBackupResponse removeBackupResponse, UnmarshallerContext _ctx) {
		
		removeBackupResponse.setRequestId(_ctx.stringValue("RemoveBackupResponse.RequestId"));
		removeBackupResponse.setBizId(_ctx.stringValue("RemoveBackupResponse.BizId"));
		removeBackupResponse.setDataSourceId(_ctx.longValue("RemoveBackupResponse.DataSourceId"));
		removeBackupResponse.setTaskType(_ctx.stringValue("RemoveBackupResponse.TaskType"));
		removeBackupResponse.setTaskStatus(_ctx.stringValue("RemoveBackupResponse.TaskStatus"));
		removeBackupResponse.setStartTime(_ctx.longValue("RemoveBackupResponse.StartTime"));
		removeBackupResponse.setEndTime(_ctx.longValue("RemoveBackupResponse.EndTime"));
		removeBackupResponse.setTaskDetail(_ctx.stringValue("RemoveBackupResponse.TaskDetail"));
		removeBackupResponse.setTaskResultDetail(_ctx.stringValue("RemoveBackupResponse.TaskResultDetail"));
		removeBackupResponse.setTaskProcess(_ctx.integerValue("RemoveBackupResponse.TaskProcess"));
		removeBackupResponse.setTriggerUser(_ctx.stringValue("RemoveBackupResponse.TriggerUser"));
		removeBackupResponse.setTriggerType(_ctx.stringValue("RemoveBackupResponse.TriggerType"));
		removeBackupResponse.setGmtCreate(_ctx.longValue("RemoveBackupResponse.GmtCreate"));
		removeBackupResponse.setGmtModified(_ctx.longValue("RemoveBackupResponse.GmtModified"));
		removeBackupResponse.setClusterBizId(_ctx.stringValue("RemoveBackupResponse.ClusterBizId"));
		removeBackupResponse.setHostName(_ctx.stringValue("RemoveBackupResponse.HostName"));
		removeBackupResponse.setEcmTaskId(_ctx.longValue("RemoveBackupResponse.EcmTaskId"));
	 
	 	return removeBackupResponse;
	}
}