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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.BackupFileResponse;
import com.aliyuncs.eds_aic.model.v20230930.BackupFileResponse.BackupFileTaskList;
import com.aliyuncs.transform.UnmarshallerContext;


public class BackupFileResponseUnmarshaller {

	public static BackupFileResponse unmarshall(BackupFileResponse backupFileResponse, UnmarshallerContext _ctx) {
		
		backupFileResponse.setRequestId(_ctx.stringValue("BackupFileResponse.RequestId"));
		backupFileResponse.setCount(_ctx.longValue("BackupFileResponse.Count"));
		backupFileResponse.setTaskId(_ctx.stringValue("BackupFileResponse.TaskId"));

		List<BackupFileTaskList> data = new ArrayList<BackupFileTaskList>();
		for (int i = 0; i < _ctx.lengthValue("BackupFileResponse.Data.Length"); i++) {
			BackupFileTaskList backupFileTaskList = new BackupFileTaskList();
			backupFileTaskList.setBackupFileId(_ctx.stringValue("BackupFileResponse.Data["+ i +"].BackupFileId"));
			backupFileTaskList.setBackupFileName(_ctx.stringValue("BackupFileResponse.Data["+ i +"].BackupFileName"));
			backupFileTaskList.setAndroidInstanceId(_ctx.stringValue("BackupFileResponse.Data["+ i +"].AndroidInstanceId"));
			backupFileTaskList.setTaskId(_ctx.stringValue("BackupFileResponse.Data["+ i +"].TaskId"));

			data.add(backupFileTaskList);
		}
		backupFileResponse.setData(data);
	 
	 	return backupFileResponse;
	}
}