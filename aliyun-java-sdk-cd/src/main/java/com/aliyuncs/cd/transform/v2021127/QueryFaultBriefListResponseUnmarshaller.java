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

package com.aliyuncs.cd.transform.v2021127;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cd.model.v2021127.QueryFaultBriefListResponse;
import com.aliyuncs.cd.model.v2021127.QueryFaultBriefListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryFaultBriefListResponseUnmarshaller {

	public static QueryFaultBriefListResponse unmarshall(QueryFaultBriefListResponse queryFaultBriefListResponse, UnmarshallerContext _ctx) {
		
		queryFaultBriefListResponse.setRequestId(_ctx.stringValue("QueryFaultBriefListResponse.RequestId"));
		queryFaultBriefListResponse.setSuccess(_ctx.booleanValue("QueryFaultBriefListResponse.Success"));
		queryFaultBriefListResponse.setMessage(_ctx.stringValue("QueryFaultBriefListResponse.Message"));
		queryFaultBriefListResponse.setCode(_ctx.stringValue("QueryFaultBriefListResponse.Code"));
		queryFaultBriefListResponse.setHttpStatusCode(_ctx.integerValue("QueryFaultBriefListResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryFaultBriefListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFaultType(_ctx.integerValue("QueryFaultBriefListResponse.Data["+ i +"].FaultType"));
			dataItem.setRecoveryNum(_ctx.integerValue("QueryFaultBriefListResponse.Data["+ i +"].RecoveryNum"));
			dataItem.setFaultNum(_ctx.integerValue("QueryFaultBriefListResponse.Data["+ i +"].FaultNum"));

			data.add(dataItem);
		}
		queryFaultBriefListResponse.setData(data);
	 
	 	return queryFaultBriefListResponse;
	}
}