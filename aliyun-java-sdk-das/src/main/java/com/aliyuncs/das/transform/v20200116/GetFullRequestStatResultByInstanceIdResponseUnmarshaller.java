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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetFullRequestStatResultByInstanceIdResponse;
import com.aliyuncs.das.model.v20200116.GetFullRequestStatResultByInstanceIdResponse.Data;
import com.aliyuncs.das.model.v20200116.GetFullRequestStatResultByInstanceIdResponse.Data.Result;
import com.aliyuncs.das.model.v20200116.GetFullRequestStatResultByInstanceIdResponse.Data.Result.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFullRequestStatResultByInstanceIdResponseUnmarshaller {

	public static GetFullRequestStatResultByInstanceIdResponse unmarshall(GetFullRequestStatResultByInstanceIdResponse getFullRequestStatResultByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		getFullRequestStatResultByInstanceIdResponse.setRequestId(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.RequestId"));
		getFullRequestStatResultByInstanceIdResponse.setMessage(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.Message"));
		getFullRequestStatResultByInstanceIdResponse.setCode(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Code"));
		getFullRequestStatResultByInstanceIdResponse.setSuccess(_ctx.booleanValue("GetFullRequestStatResultByInstanceIdResponse.Success"));

		Data data = new Data();
		data.setFail(_ctx.booleanValue("GetFullRequestStatResultByInstanceIdResponse.Data.Fail"));
		data.setIsFinish(_ctx.booleanValue("GetFullRequestStatResultByInstanceIdResponse.Data.IsFinish"));
		data.setResultId(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.Data.ResultId"));
		data.setState(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.Data.State"));
		data.setTimestamp(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Timestamp"));

		Result result = new Result();
		result.setTotal(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setSqlId(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].SqlId"));
			listItem.setAvgFetchRows(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgFetchRows"));
			listItem.setAvgLockWaitTime(_ctx.doubleValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgLockWaitTime"));
			listItem.setAvgLogicalRead(_ctx.doubleValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgLogicalRead"));
			listItem.setAvgPhysicalAsyncRead(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgPhysicalAsyncRead"));
			listItem.setAvgPhysicalSyncRead(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgPhysicalSyncRead"));
			listItem.setAvgExaminedRows(_ctx.doubleValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgExaminedRows"));
			listItem.setAvgReturnedRows(_ctx.doubleValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgReturnedRows"));
			listItem.setAvgUpdatedRows(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgUpdatedRows"));
			listItem.setAvgRt(_ctx.doubleValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgRt"));
			listItem.setAvgSqlCount(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].AvgSqlCount"));
			listItem.setCount(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].Count"));
			listItem.setCountRate(_ctx.doubleValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].CountRate"));
			listItem.setDatabase(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].Database"));
			listItem.setErrorCount(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].ErrorCount"));
			listItem.setFetchRows(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].FetchRows"));
			listItem.setIp(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].Ip"));
			listItem.setLockWaitTime(_ctx.doubleValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].LockWaitTime"));
			listItem.setLogicalRead(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].LogicalRead"));
			listItem.setPhysicalAsyncRead(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].PhysicalAsyncRead"));
			listItem.setPhysicalSyncRead(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].PhysicalSyncRead"));
			listItem.setPort(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].Port"));
			listItem.setPsql(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].Psql"));
			listItem.setRows(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].Rows"));
			listItem.setExaminedRows(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].ExaminedRows"));
			listItem.setRtGreaterThanOneSecondCount(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].RtGreaterThanOneSecondCount"));
			listItem.setRtRate(_ctx.doubleValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].RtRate"));
			listItem.setSqlCount(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].SqlCount"));
			listItem.setSumUpdatedRows(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].SumUpdatedRows"));
			listItem.setVersion(_ctx.longValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].Version"));
			listItem.setVpcId(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].VpcId"));

			List<String> tables = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].Tables.Length"); j++) {
				tables.add(_ctx.stringValue("GetFullRequestStatResultByInstanceIdResponse.Data.Result.List["+ i +"].Tables["+ j +"]"));
			}
			listItem.setTables(tables);

			list.add(listItem);
		}
		result.setList(list);
		data.setResult(result);
		getFullRequestStatResultByInstanceIdResponse.setData(data);
	 
	 	return getFullRequestStatResultByInstanceIdResponse;
	}
}