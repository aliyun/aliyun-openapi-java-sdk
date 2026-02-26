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

import com.aliyuncs.dataphin_public.model.v20230630.ListSubmitRecordsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListSubmitRecordsResponse.ListResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListSubmitRecordsResponse.ListResult.SubmitRecordInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubmitRecordsResponseUnmarshaller {

	public static ListSubmitRecordsResponse unmarshall(ListSubmitRecordsResponse listSubmitRecordsResponse, UnmarshallerContext _ctx) {
		
		listSubmitRecordsResponse.setRequestId(_ctx.stringValue("ListSubmitRecordsResponse.RequestId"));
		listSubmitRecordsResponse.setSuccess(_ctx.booleanValue("ListSubmitRecordsResponse.Success"));
		listSubmitRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListSubmitRecordsResponse.HttpStatusCode"));
		listSubmitRecordsResponse.setCode(_ctx.stringValue("ListSubmitRecordsResponse.Code"));
		listSubmitRecordsResponse.setMessage(_ctx.stringValue("ListSubmitRecordsResponse.Message"));

		ListResult listResult = new ListResult();
		listResult.setTotalCount(_ctx.integerValue("ListSubmitRecordsResponse.ListResult.TotalCount"));

		List<SubmitRecordInfo> data = new ArrayList<SubmitRecordInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListSubmitRecordsResponse.ListResult.Data.Length"); i++) {
			SubmitRecordInfo submitRecordInfo = new SubmitRecordInfo();
			submitRecordInfo.setId(_ctx.longValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].Id"));
			submitRecordInfo.setProjectId(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].ProjectId"));
			submitRecordInfo.setSubmitter(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].Submitter"));
			submitRecordInfo.setSubmitterName(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].SubmitterName"));
			submitRecordInfo.setGmtCreate(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].GmtCreate"));
			submitRecordInfo.setGmtModify(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].GmtModify"));
			submitRecordInfo.setChangeType(_ctx.integerValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].ChangeType"));
			submitRecordInfo.setObjectType(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].ObjectType"));
			submitRecordInfo.setObjectName(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].ObjectName"));
			submitRecordInfo.setObjectId(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].ObjectId"));
			submitRecordInfo.setNodeId(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].NodeId"));
			submitRecordInfo.setObjectVersion(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].ObjectVersion"));
			submitRecordInfo.setSubmitComment(_ctx.stringValue("ListSubmitRecordsResponse.ListResult.Data["+ i +"].SubmitComment"));

			data.add(submitRecordInfo);
		}
		listResult.setData(data);
		listSubmitRecordsResponse.setListResult(listResult);
	 
	 	return listSubmitRecordsResponse;
	}
}