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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryTSOperationRecordsResponse;
import com.aliyuncs.sofa.model.v20190815.QueryTSOperationRecordsResponse.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryTSOperationRecordsResponseUnmarshaller {

	public static QueryTSOperationRecordsResponse unmarshall(QueryTSOperationRecordsResponse queryTSOperationRecordsResponse, UnmarshallerContext _ctx) {
		
		queryTSOperationRecordsResponse.setRequestId(_ctx.stringValue("QueryTSOperationRecordsResponse.RequestId"));
		queryTSOperationRecordsResponse.setResultCode(_ctx.stringValue("QueryTSOperationRecordsResponse.ResultCode"));
		queryTSOperationRecordsResponse.setResultMessage(_ctx.stringValue("QueryTSOperationRecordsResponse.ResultMessage"));
		queryTSOperationRecordsResponse.setPageNum(_ctx.longValue("QueryTSOperationRecordsResponse.PageNum"));
		queryTSOperationRecordsResponse.setPageSize(_ctx.longValue("QueryTSOperationRecordsResponse.PageSize"));
		queryTSOperationRecordsResponse.setTotalCount(_ctx.stringValue("QueryTSOperationRecordsResponse.TotalCount"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryTSOperationRecordsResponse.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setGmtOperate(_ctx.stringValue("QueryTSOperationRecordsResponse.List["+ i +"].GmtOperate"));
			listItem.setId(_ctx.stringValue("QueryTSOperationRecordsResponse.List["+ i +"].Id"));
			listItem.setInstanceId(_ctx.stringValue("QueryTSOperationRecordsResponse.List["+ i +"].InstanceId"));
			listItem.setJobName(_ctx.stringValue("QueryTSOperationRecordsResponse.List["+ i +"].JobName"));
			listItem.setOperateTime(_ctx.stringValue("QueryTSOperationRecordsResponse.List["+ i +"].OperateTime"));
			listItem.setOperation(_ctx.stringValue("QueryTSOperationRecordsResponse.List["+ i +"].Operation"));
			listItem.setOperationResult(_ctx.booleanValue("QueryTSOperationRecordsResponse.List["+ i +"].OperationResult"));
			listItem.setOperationTarget(_ctx.stringValue("QueryTSOperationRecordsResponse.List["+ i +"].OperationTarget"));
			listItem.setOperationValue(_ctx.stringValue("QueryTSOperationRecordsResponse.List["+ i +"].OperationValue"));
			listItem.setOperator(_ctx.stringValue("QueryTSOperationRecordsResponse.List["+ i +"].Operator"));

			list.add(listItem);
		}
		queryTSOperationRecordsResponse.setList(list);
	 
	 	return queryTSOperationRecordsResponse;
	}
}