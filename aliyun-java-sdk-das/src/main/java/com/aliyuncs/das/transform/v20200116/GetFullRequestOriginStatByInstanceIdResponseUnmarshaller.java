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

import com.aliyuncs.das.model.v20200116.GetFullRequestOriginStatByInstanceIdResponse;
import com.aliyuncs.das.model.v20200116.GetFullRequestOriginStatByInstanceIdResponse.Data;
import com.aliyuncs.das.model.v20200116.GetFullRequestOriginStatByInstanceIdResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFullRequestOriginStatByInstanceIdResponseUnmarshaller {

	public static GetFullRequestOriginStatByInstanceIdResponse unmarshall(GetFullRequestOriginStatByInstanceIdResponse getFullRequestOriginStatByInstanceIdResponse, UnmarshallerContext _ctx) {
		
		getFullRequestOriginStatByInstanceIdResponse.setRequestId(_ctx.stringValue("GetFullRequestOriginStatByInstanceIdResponse.RequestId"));
		getFullRequestOriginStatByInstanceIdResponse.setMessage(_ctx.stringValue("GetFullRequestOriginStatByInstanceIdResponse.Message"));
		getFullRequestOriginStatByInstanceIdResponse.setCode(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Code"));
		getFullRequestOriginStatByInstanceIdResponse.setSuccess(_ctx.booleanValue("GetFullRequestOriginStatByInstanceIdResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setKey(_ctx.stringValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].Key"));
			listItem.setAvgFetchRows(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgFetchRows"));
			listItem.setAvgLockWaitTime(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgLockWaitTime"));
			listItem.setAvgLogicalRead(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgLogicalRead"));
			listItem.setAvgPhysicalAsyncRead(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgPhysicalAsyncRead"));
			listItem.setAvgPhysicalSyncRead(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgPhysicalSyncRead"));
			listItem.setAvgRows(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgRows"));
			listItem.setAvgExaminedRows(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgExaminedRows"));
			listItem.setAvgReturnedRows(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgReturnedRows"));
			listItem.setAvgUpdatedRows(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgUpdatedRows"));
			listItem.setAvgRt(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgRt"));
			listItem.setAvgSqlCount(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].AvgSqlCount"));
			listItem.setCount(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].Count"));
			listItem.setCountRate(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].CountRate"));
			listItem.setDatabase(_ctx.stringValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].Database"));
			listItem.setErrorCount(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].ErrorCount"));
			listItem.setFetchRows(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].FetchRows"));
			listItem.setIp(_ctx.stringValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].Ip"));
			listItem.setLockWaitTime(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].LockWaitTime"));
			listItem.setLogicalRead(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].LogicalRead"));
			listItem.setOriginHost(_ctx.stringValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].OriginHost"));
			listItem.setPhysicalAsyncRead(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].PhysicalAsyncRead"));
			listItem.setPhysicalSyncRead(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].PhysicalSyncRead"));
			listItem.setPort(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].Port"));
			listItem.setRows(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].Rows"));
			listItem.setExaminedRows(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].ExaminedRows"));
			listItem.setRtGreaterThanOneSecondCount(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].RtGreaterThanOneSecondCount"));
			listItem.setRtRate(_ctx.doubleValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].RtRate"));
			listItem.setSqlCount(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].SqlCount"));
			listItem.setSumUpdatedRows(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].SumUpdatedRows"));
			listItem.setVersion(_ctx.longValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].Version"));
			listItem.setVpcId(_ctx.stringValue("GetFullRequestOriginStatByInstanceIdResponse.Data.List["+ i +"].VpcId"));

			list.add(listItem);
		}
		data.setList(list);
		getFullRequestOriginStatByInstanceIdResponse.setData(data);
	 
	 	return getFullRequestOriginStatByInstanceIdResponse;
	}
}