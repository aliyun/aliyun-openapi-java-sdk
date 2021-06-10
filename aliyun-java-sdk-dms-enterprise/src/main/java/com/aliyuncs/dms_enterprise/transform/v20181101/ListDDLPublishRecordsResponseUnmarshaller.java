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

import com.aliyuncs.dms_enterprise.model.v20181101.ListDDLPublishRecordsResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDDLPublishRecordsResponse.DDLPublishRecord;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDDLPublishRecordsResponse.DDLPublishRecord.PublishTaskInfo;
import com.aliyuncs.dms_enterprise.model.v20181101.ListDDLPublishRecordsResponse.DDLPublishRecord.PublishTaskInfo.PublishJob;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDDLPublishRecordsResponseUnmarshaller {

	public static ListDDLPublishRecordsResponse unmarshall(ListDDLPublishRecordsResponse listDDLPublishRecordsResponse, UnmarshallerContext _ctx) {
		
		listDDLPublishRecordsResponse.setRequestId(_ctx.stringValue("ListDDLPublishRecordsResponse.RequestId"));
		listDDLPublishRecordsResponse.setSuccess(_ctx.booleanValue("ListDDLPublishRecordsResponse.Success"));
		listDDLPublishRecordsResponse.setErrorMessage(_ctx.stringValue("ListDDLPublishRecordsResponse.ErrorMessage"));
		listDDLPublishRecordsResponse.setErrorCode(_ctx.stringValue("ListDDLPublishRecordsResponse.ErrorCode"));

		List<DDLPublishRecord> dDLPublishRecordList = new ArrayList<DDLPublishRecord>();
		for (int i = 0; i < _ctx.lengthValue("ListDDLPublishRecordsResponse.DDLPublishRecordList.Length"); i++) {
			DDLPublishRecord dDLPublishRecord = new DDLPublishRecord();
			dDLPublishRecord.setAuditStatus(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].AuditStatus"));
			dDLPublishRecord.setAuditExpireTime(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].AuditExpireTime"));
			dDLPublishRecord.setCreatorId(_ctx.longValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].CreatorId"));
			dDLPublishRecord.setFinality(_ctx.booleanValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].Finality"));
			dDLPublishRecord.setFinalityReason(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].FinalityReason"));
			dDLPublishRecord.setPublishStatus(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishStatus"));
			dDLPublishRecord.setRiskLevel(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].RiskLevel"));
			dDLPublishRecord.setStatusDesc(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].StatusDesc"));
			dDLPublishRecord.setWorkflowInstanceId(_ctx.longValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].WorkflowInstanceId"));

			List<PublishTaskInfo> publishTaskInfoList = new ArrayList<PublishTaskInfo>();
			for (int j = 0; j < _ctx.lengthValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList.Length"); j++) {
				PublishTaskInfo publishTaskInfo = new PublishTaskInfo();
				publishTaskInfo.setDbId(_ctx.longValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].DbId"));
				publishTaskInfo.setLogic(_ctx.booleanValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].Logic"));
				publishTaskInfo.setPlanTime(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].PlanTime"));
				publishTaskInfo.setPublishStrategy(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].PublishStrategy"));
				publishTaskInfo.setStatusDesc(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].StatusDesc"));
				publishTaskInfo.setTaskJobStatus(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].TaskJobStatus"));

				List<PublishJob> publishJobList = new ArrayList<PublishJob>();
				for (int k = 0; k < _ctx.lengthValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].PublishJobList.Length"); k++) {
					PublishJob publishJob = new PublishJob();
					publishJob.setExecuteCount(_ctx.longValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].PublishJobList["+ k +"].ExecuteCount"));
					publishJob.setScripts(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].PublishJobList["+ k +"].Scripts"));
					publishJob.setTableName(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].PublishJobList["+ k +"].TableName"));
					publishJob.setStatusDesc(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].PublishJobList["+ k +"].StatusDesc"));
					publishJob.setTaskJobStatus(_ctx.stringValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].PublishJobList["+ k +"].TaskJobStatus"));
					publishJob.setDBTaskGroupId(_ctx.longValue("ListDDLPublishRecordsResponse.DDLPublishRecordList["+ i +"].PublishTaskInfoList["+ j +"].PublishJobList["+ k +"].DBTaskGroupId"));

					publishJobList.add(publishJob);
				}
				publishTaskInfo.setPublishJobList(publishJobList);

				publishTaskInfoList.add(publishTaskInfo);
			}
			dDLPublishRecord.setPublishTaskInfoList(publishTaskInfoList);

			dDLPublishRecordList.add(dDLPublishRecord);
		}
		listDDLPublishRecordsResponse.setDDLPublishRecordList(dDLPublishRecordList);
	 
	 	return listDDLPublishRecordsResponse;
	}
}