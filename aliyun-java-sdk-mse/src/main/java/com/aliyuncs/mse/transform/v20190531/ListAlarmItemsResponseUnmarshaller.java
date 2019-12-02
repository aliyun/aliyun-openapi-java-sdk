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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ListAlarmItemsResponse;
import com.aliyuncs.mse.model.v20190531.ListAlarmItemsResponse.AlarmItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlarmItemsResponseUnmarshaller {

	public static ListAlarmItemsResponse unmarshall(ListAlarmItemsResponse listAlarmItemsResponse, UnmarshallerContext _ctx) {
		
		listAlarmItemsResponse.setRequestId(_ctx.stringValue("ListAlarmItemsResponse.RequestId"));
		listAlarmItemsResponse.setSuccess(_ctx.booleanValue("ListAlarmItemsResponse.Success"));
		listAlarmItemsResponse.setMessage(_ctx.stringValue("ListAlarmItemsResponse.Message"));
		listAlarmItemsResponse.setErrorCode(_ctx.stringValue("ListAlarmItemsResponse.ErrorCode"));
		listAlarmItemsResponse.setPageNumber(_ctx.integerValue("ListAlarmItemsResponse.PageNumber"));
		listAlarmItemsResponse.setPageSize(_ctx.integerValue("ListAlarmItemsResponse.PageSize"));
		listAlarmItemsResponse.setTotalCount(_ctx.integerValue("ListAlarmItemsResponse.TotalCount"));
		listAlarmItemsResponse.setHttpCode(_ctx.stringValue("ListAlarmItemsResponse.HttpCode"));

		List<AlarmItem> data = new ArrayList<AlarmItem>();
		for (int i = 0; i < _ctx.lengthValue("ListAlarmItemsResponse.Data.Length"); i++) {
			AlarmItem alarmItem = new AlarmItem();
			alarmItem.setAlarmCode(_ctx.stringValue("ListAlarmItemsResponse.Data["+ i +"].AlarmCode"));
			alarmItem.setAlarmDesc(_ctx.stringValue("ListAlarmItemsResponse.Data["+ i +"].AlarmDesc"));
			alarmItem.setClusterType(_ctx.stringValue("ListAlarmItemsResponse.Data["+ i +"].ClusterType"));

			data.add(alarmItem);
		}
		listAlarmItemsResponse.setData(data);
	 
	 	return listAlarmItemsResponse;
	}
}