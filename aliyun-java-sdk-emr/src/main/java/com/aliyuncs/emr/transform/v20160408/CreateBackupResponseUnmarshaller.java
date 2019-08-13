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

import com.aliyuncs.emr.model.v20160408.CreateBackupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateBackupResponseUnmarshaller {

	public static CreateBackupResponse unmarshall(CreateBackupResponse createBackupResponse, UnmarshallerContext _ctx) {
		
		createBackupResponse.setRequestId(_ctx.stringValue("CreateBackupResponse.RequestId"));
		createBackupResponse.setBizId(_ctx.stringValue("CreateBackupResponse.BizId"));
		createBackupResponse.setDataSourceId(_ctx.longValue("CreateBackupResponse.DataSourceId"));
		createBackupResponse.setTaskType(_ctx.stringValue("CreateBackupResponse.TaskType"));
		createBackupResponse.setTaskStatus(_ctx.stringValue("CreateBackupResponse.TaskStatus"));
		createBackupResponse.setStartTime(_ctx.longValue("CreateBackupResponse.StartTime"));
		createBackupResponse.setEndTime(_ctx.longValue("CreateBackupResponse.EndTime"));
		createBackupResponse.setTaskDetail(_ctx.stringValue("CreateBackupResponse.TaskDetail"));
		createBackupResponse.setTaskResultDetail(_ctx.stringValue("CreateBackupResponse.TaskResultDetail"));
		createBackupResponse.setTaskProcess(_ctx.integerValue("CreateBackupResponse.TaskProcess"));
		createBackupResponse.setTriggerUser(_ctx.stringValue("CreateBackupResponse.TriggerUser"));
		createBackupResponse.setTriggerType(_ctx.stringValue("CreateBackupResponse.TriggerType"));
		createBackupResponse.setGmtCreate(_ctx.longValue("CreateBackupResponse.GmtCreate"));
		createBackupResponse.setGmtModified(_ctx.longValue("CreateBackupResponse.GmtModified"));
		createBackupResponse.setClusterBizId(_ctx.stringValue("CreateBackupResponse.ClusterBizId"));
		createBackupResponse.setHostName(_ctx.stringValue("CreateBackupResponse.HostName"));
		createBackupResponse.setEcmTaskId(_ctx.longValue("CreateBackupResponse.EcmTaskId"));
	 
	 	return createBackupResponse;
	}
}