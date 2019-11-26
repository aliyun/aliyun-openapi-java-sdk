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

package com.aliyuncs.aligreen_console.transform.v20191115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aligreen_console.model.v20191115.ListSfaceAuditTasksResponse;
import com.aliyuncs.aligreen_console.model.v20191115.ListSfaceAuditTasksResponse.AuditTask;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSfaceAuditTasksResponseUnmarshaller {

	public static ListSfaceAuditTasksResponse unmarshall(ListSfaceAuditTasksResponse listSfaceAuditTasksResponse, UnmarshallerContext _ctx) {
		
		listSfaceAuditTasksResponse.setRequestId(_ctx.stringValue("ListSfaceAuditTasksResponse.RequestId"));

		List<AuditTask> tasks = new ArrayList<AuditTask>();
		for (int i = 0; i < _ctx.lengthValue("ListSfaceAuditTasksResponse.Tasks.Length"); i++) {
			AuditTask auditTask = new AuditTask();
			auditTask.setDataId(_ctx.stringValue("ListSfaceAuditTasksResponse.Tasks["+ i +"].DataId"));
			auditTask.setStatus(_ctx.stringValue("ListSfaceAuditTasksResponse.Tasks["+ i +"].Status"));
			auditTask.setReason(_ctx.stringValue("ListSfaceAuditTasksResponse.Tasks["+ i +"].Reason"));
			auditTask.setAction(_ctx.stringValue("ListSfaceAuditTasksResponse.Tasks["+ i +"].Action"));
			auditTask.setPersonId(_ctx.stringValue("ListSfaceAuditTasksResponse.Tasks["+ i +"].PersonId"));
			auditTask.setFaceId(_ctx.stringValue("ListSfaceAuditTasksResponse.Tasks["+ i +"].FaceId"));

			tasks.add(auditTask);
		}
		listSfaceAuditTasksResponse.setTasks(tasks);
	 
	 	return listSfaceAuditTasksResponse;
	}
}