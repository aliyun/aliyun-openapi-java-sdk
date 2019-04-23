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

package com.aliyuncs.domain_intl.transform.v20171218;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.domain_intl.model.v20171218.QueryChangeLogListResponse;
import com.aliyuncs.domain_intl.model.v20171218.QueryChangeLogListResponse.ChangeLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryChangeLogListResponseUnmarshaller {

	public static QueryChangeLogListResponse unmarshall(QueryChangeLogListResponse queryChangeLogListResponse, UnmarshallerContext context) {
		
		queryChangeLogListResponse.setRequestId(context.stringValue("QueryChangeLogListResponse.RequestId"));
		queryChangeLogListResponse.setTotalItemNum(context.integerValue("QueryChangeLogListResponse.TotalItemNum"));
		queryChangeLogListResponse.setCurrentPageNum(context.integerValue("QueryChangeLogListResponse.CurrentPageNum"));
		queryChangeLogListResponse.setTotalPageNum(context.integerValue("QueryChangeLogListResponse.TotalPageNum"));
		queryChangeLogListResponse.setPageSize(context.integerValue("QueryChangeLogListResponse.PageSize"));
		queryChangeLogListResponse.setPrePage(context.booleanValue("QueryChangeLogListResponse.PrePage"));
		queryChangeLogListResponse.setNextPage(context.booleanValue("QueryChangeLogListResponse.NextPage"));
		queryChangeLogListResponse.setResultLimit(context.booleanValue("QueryChangeLogListResponse.ResultLimit"));

		List<ChangeLog> data = new ArrayList<ChangeLog>();
		for (int i = 0; i < context.lengthValue("QueryChangeLogListResponse.Data.Length"); i++) {
			ChangeLog changeLog = new ChangeLog();
			changeLog.setDomainName(context.stringValue("QueryChangeLogListResponse.Data["+ i +"].DomainName"));
			changeLog.setResult(context.stringValue("QueryChangeLogListResponse.Data["+ i +"].Result"));
			changeLog.setOperation(context.stringValue("QueryChangeLogListResponse.Data["+ i +"].Operation"));
			changeLog.setOperationIPAddress(context.stringValue("QueryChangeLogListResponse.Data["+ i +"].OperationIPAddress"));
			changeLog.setDetails(context.stringValue("QueryChangeLogListResponse.Data["+ i +"].Details"));
			changeLog.setTime(context.stringValue("QueryChangeLogListResponse.Data["+ i +"].Time"));

			data.add(changeLog);
		}
		queryChangeLogListResponse.setData(data);
	 
	 	return queryChangeLogListResponse;
	}
}