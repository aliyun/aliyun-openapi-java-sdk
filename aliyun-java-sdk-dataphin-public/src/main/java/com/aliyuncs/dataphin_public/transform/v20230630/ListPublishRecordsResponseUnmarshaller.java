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

import com.aliyuncs.dataphin_public.model.v20230630.ListPublishRecordsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListPublishRecordsResponse.ListResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListPublishRecordsResponse.ListResult.PublishRecordInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPublishRecordsResponseUnmarshaller {

	public static ListPublishRecordsResponse unmarshall(ListPublishRecordsResponse listPublishRecordsResponse, UnmarshallerContext _ctx) {
		
		listPublishRecordsResponse.setRequestId(_ctx.stringValue("ListPublishRecordsResponse.RequestId"));
		listPublishRecordsResponse.setMessage(_ctx.stringValue("ListPublishRecordsResponse.Message"));
		listPublishRecordsResponse.setHttpStatusCode(_ctx.integerValue("ListPublishRecordsResponse.HttpStatusCode"));
		listPublishRecordsResponse.setCode(_ctx.stringValue("ListPublishRecordsResponse.Code"));
		listPublishRecordsResponse.setSuccess(_ctx.booleanValue("ListPublishRecordsResponse.Success"));

		ListResult listResult = new ListResult();
		listResult.setTotalCount(_ctx.integerValue("ListPublishRecordsResponse.ListResult.TotalCount"));

		List<PublishRecordInfo> data = new ArrayList<PublishRecordInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListPublishRecordsResponse.ListResult.Data.Length"); i++) {
			PublishRecordInfo publishRecordInfo = new PublishRecordInfo();
			publishRecordInfo.setObjectId(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].ObjectId"));
			publishRecordInfo.setProjectId(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].ProjectId"));
			publishRecordInfo.setPublisher(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].Publisher"));
			publishRecordInfo.setObjectName(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].ObjectName"));
			publishRecordInfo.setObjectType(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].ObjectType"));
			publishRecordInfo.setObjectVersion(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].ObjectVersion"));
			publishRecordInfo.setGmtCreate(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].GmtCreate"));
			publishRecordInfo.setFinishTime(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].FinishTime"));
			publishRecordInfo.setChangeType(_ctx.integerValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].ChangeType"));
			publishRecordInfo.setGmtModify(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].GmtModify"));
			publishRecordInfo.setPublisherName(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].PublisherName"));
			publishRecordInfo.setNodeId(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].NodeId"));
			publishRecordInfo.setId(_ctx.longValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].Id"));
			publishRecordInfo.setErrorMessage(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].ErrorMessage"));
			publishRecordInfo.setPublishName(_ctx.stringValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].PublishName"));
			publishRecordInfo.setPublishStatus(_ctx.integerValue("ListPublishRecordsResponse.ListResult.Data["+ i +"].PublishStatus"));

			data.add(publishRecordInfo);
		}
		listResult.setData(data);
		listPublishRecordsResponse.setListResult(listResult);
	 
	 	return listPublishRecordsResponse;
	}
}