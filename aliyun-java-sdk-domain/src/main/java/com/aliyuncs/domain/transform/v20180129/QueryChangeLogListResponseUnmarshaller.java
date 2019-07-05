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

package com.aliyuncs.domain.transform.v20180129;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain.model.v20180129.QueryChangeLogListResponse;
import com.aliyuncs.domain.model.v20180129.QueryChangeLogListResponse.ChangeLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryChangeLogListResponseUnmarshaller {

	public static QueryChangeLogListResponse unmarshall(QueryChangeLogListResponse queryChangeLogListResponse, UnmarshallerContext _ctx) {
		
		queryChangeLogListResponse.setRequestId(_ctx.stringValue("QueryChangeLogListResponse.RequestId"));
		queryChangeLogListResponse.setTotalItemNum(_ctx.integerValue("QueryChangeLogListResponse.TotalItemNum"));
		queryChangeLogListResponse.setCurrentPageNum(_ctx.integerValue("QueryChangeLogListResponse.CurrentPageNum"));
		queryChangeLogListResponse.setTotalPageNum(_ctx.integerValue("QueryChangeLogListResponse.TotalPageNum"));
		queryChangeLogListResponse.setPageSize(_ctx.integerValue("QueryChangeLogListResponse.PageSize"));
		queryChangeLogListResponse.setPrePage(_ctx.booleanValue("QueryChangeLogListResponse.PrePage"));
		queryChangeLogListResponse.setNextPage(_ctx.booleanValue("QueryChangeLogListResponse.NextPage"));
		queryChangeLogListResponse.setResultLimit(_ctx.booleanValue("QueryChangeLogListResponse.ResultLimit"));

		List<ChangeLog> data = new ArrayList<ChangeLog>();
		for (int i = 0; i < _ctx.lengthValue("QueryChangeLogListResponse.Data.Length"); i++) {
			ChangeLog changeLog = new ChangeLog();
			changeLog.setDomainName(_ctx.stringValue("QueryChangeLogListResponse.Data["+ i +"].DomainName"));
			changeLog.setResult(_ctx.stringValue("QueryChangeLogListResponse.Data["+ i +"].Result"));
			changeLog.setOperation(_ctx.stringValue("QueryChangeLogListResponse.Data["+ i +"].Operation"));
			changeLog.setOperationIPAddress(_ctx.stringValue("QueryChangeLogListResponse.Data["+ i +"].OperationIPAddress"));
			changeLog.setDetails(_ctx.stringValue("QueryChangeLogListResponse.Data["+ i +"].Details"));
			changeLog.setTime(_ctx.stringValue("QueryChangeLogListResponse.Data["+ i +"].Time"));

			data.add(changeLog);
		}
		queryChangeLogListResponse.setData(data);
	 
	 	return queryChangeLogListResponse;
	}
}