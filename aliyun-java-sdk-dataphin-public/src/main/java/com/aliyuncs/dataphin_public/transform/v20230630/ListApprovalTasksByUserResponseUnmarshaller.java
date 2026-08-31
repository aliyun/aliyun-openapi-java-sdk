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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListApprovalTasksByUserResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListApprovalTasksByUserResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListApprovalTasksByUserResponse.PageResult.ApprovalTaskInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListApprovalTasksByUserResponseUnmarshaller {

	public static ListApprovalTasksByUserResponse unmarshall(ListApprovalTasksByUserResponse listApprovalTasksByUserResponse, UnmarshallerContext _ctx) {
		
		listApprovalTasksByUserResponse.setRequestId(_ctx.stringValue("ListApprovalTasksByUserResponse.RequestId"));
		listApprovalTasksByUserResponse.setMessage(_ctx.stringValue("ListApprovalTasksByUserResponse.Message"));
		listApprovalTasksByUserResponse.setHttpStatusCode(_ctx.integerValue("ListApprovalTasksByUserResponse.HttpStatusCode"));
		listApprovalTasksByUserResponse.setCode(_ctx.stringValue("ListApprovalTasksByUserResponse.Code"));
		listApprovalTasksByUserResponse.setSuccess(_ctx.booleanValue("ListApprovalTasksByUserResponse.Success"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListApprovalTasksByUserResponse.PageResult.TotalCount"));

		List<ApprovalTaskInfo> taskList = new ArrayList<ApprovalTaskInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListApprovalTasksByUserResponse.PageResult.TaskList.Length"); i++) {
			ApprovalTaskInfo approvalTaskInfo = new ApprovalTaskInfo();
			approvalTaskInfo.setStatus(_ctx.stringValue("ListApprovalTasksByUserResponse.PageResult.TaskList["+ i +"].Status"));
			approvalTaskInfo.setSubmittedAt(_ctx.stringValue("ListApprovalTasksByUserResponse.PageResult.TaskList["+ i +"].SubmittedAt"));
			approvalTaskInfo.setApplicantId(_ctx.stringValue("ListApprovalTasksByUserResponse.PageResult.TaskList["+ i +"].ApplicantId"));
			approvalTaskInfo.setRelationType(_ctx.stringValue("ListApprovalTasksByUserResponse.PageResult.TaskList["+ i +"].RelationType"));
			approvalTaskInfo.setApplicantName(_ctx.stringValue("ListApprovalTasksByUserResponse.PageResult.TaskList["+ i +"].ApplicantName"));
			approvalTaskInfo.setApprovalType(_ctx.stringValue("ListApprovalTasksByUserResponse.PageResult.TaskList["+ i +"].ApprovalType"));
			approvalTaskInfo.setTitle(_ctx.stringValue("ListApprovalTasksByUserResponse.PageResult.TaskList["+ i +"].Title"));
			approvalTaskInfo.setId(_ctx.longValue("ListApprovalTasksByUserResponse.PageResult.TaskList["+ i +"].Id"));
			approvalTaskInfo.setSourceSystem(_ctx.stringValue("ListApprovalTasksByUserResponse.PageResult.TaskList["+ i +"].SourceSystem"));

			taskList.add(approvalTaskInfo);
		}
		pageResult.setTaskList(taskList);
		listApprovalTasksByUserResponse.setPageResult(pageResult);
	 
	 	return listApprovalTasksByUserResponse;
	}
}