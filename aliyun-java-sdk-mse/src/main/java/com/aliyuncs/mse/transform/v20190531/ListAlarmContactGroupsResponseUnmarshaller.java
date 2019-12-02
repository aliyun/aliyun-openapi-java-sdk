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

import com.aliyuncs.mse.model.v20190531.ListAlarmContactGroupsResponse;
import com.aliyuncs.mse.model.v20190531.ListAlarmContactGroupsResponse.AlarmContactGroupModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAlarmContactGroupsResponseUnmarshaller {

	public static ListAlarmContactGroupsResponse unmarshall(ListAlarmContactGroupsResponse listAlarmContactGroupsResponse, UnmarshallerContext _ctx) {
		
		listAlarmContactGroupsResponse.setRequestId(_ctx.stringValue("ListAlarmContactGroupsResponse.RequestId"));
		listAlarmContactGroupsResponse.setSuccess(_ctx.booleanValue("ListAlarmContactGroupsResponse.Success"));
		listAlarmContactGroupsResponse.setMessage(_ctx.stringValue("ListAlarmContactGroupsResponse.Message"));
		listAlarmContactGroupsResponse.setErrorCode(_ctx.stringValue("ListAlarmContactGroupsResponse.ErrorCode"));
		listAlarmContactGroupsResponse.setPageNumber(_ctx.integerValue("ListAlarmContactGroupsResponse.PageNumber"));
		listAlarmContactGroupsResponse.setPageSize(_ctx.integerValue("ListAlarmContactGroupsResponse.PageSize"));
		listAlarmContactGroupsResponse.setTotalCount(_ctx.integerValue("ListAlarmContactGroupsResponse.TotalCount"));
		listAlarmContactGroupsResponse.setHttpCode(_ctx.stringValue("ListAlarmContactGroupsResponse.HttpCode"));

		List<AlarmContactGroupModel> data = new ArrayList<AlarmContactGroupModel>();
		for (int i = 0; i < _ctx.lengthValue("ListAlarmContactGroupsResponse.Data.Length"); i++) {
			AlarmContactGroupModel alarmContactGroupModel = new AlarmContactGroupModel();
			alarmContactGroupModel.setContactGroupName(_ctx.stringValue("ListAlarmContactGroupsResponse.Data["+ i +"].ContactGroupName"));
			alarmContactGroupModel.setContactGroupId(_ctx.stringValue("ListAlarmContactGroupsResponse.Data["+ i +"].ContactGroupId"));

			data.add(alarmContactGroupModel);
		}
		listAlarmContactGroupsResponse.setData(data);
	 
	 	return listAlarmContactGroupsResponse;
	}
}