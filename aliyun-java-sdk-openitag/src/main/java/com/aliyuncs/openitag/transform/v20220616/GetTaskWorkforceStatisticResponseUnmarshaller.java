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

package com.aliyuncs.openitag.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openitag.model.v20220616.GetTaskWorkforceStatisticResponse;
import com.aliyuncs.openitag.model.v20220616.GetTaskWorkforceStatisticResponse.UsersStatisticItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetTaskWorkforceStatisticResponseUnmarshaller {

	public static GetTaskWorkforceStatisticResponse unmarshall(GetTaskWorkforceStatisticResponse getTaskWorkforceStatisticResponse, UnmarshallerContext _ctx) {
		
		getTaskWorkforceStatisticResponse.setRequestId(_ctx.stringValue("GetTaskWorkforceStatisticResponse.RequestId"));
		getTaskWorkforceStatisticResponse.setCode(_ctx.integerValue("GetTaskWorkforceStatisticResponse.Code"));
		getTaskWorkforceStatisticResponse.setMessage(_ctx.stringValue("GetTaskWorkforceStatisticResponse.Message"));
		getTaskWorkforceStatisticResponse.setDetails(_ctx.stringValue("GetTaskWorkforceStatisticResponse.Details"));
		getTaskWorkforceStatisticResponse.setSuccess(_ctx.booleanValue("GetTaskWorkforceStatisticResponse.Success"));
		getTaskWorkforceStatisticResponse.setPageNumber(_ctx.integerValue("GetTaskWorkforceStatisticResponse.PageNumber"));
		getTaskWorkforceStatisticResponse.setPageSize(_ctx.integerValue("GetTaskWorkforceStatisticResponse.PageSize"));
		getTaskWorkforceStatisticResponse.setTotalPage(_ctx.integerValue("GetTaskWorkforceStatisticResponse.TotalPage"));
		getTaskWorkforceStatisticResponse.setTotalCount(_ctx.integerValue("GetTaskWorkforceStatisticResponse.TotalCount"));
		getTaskWorkforceStatisticResponse.setErrorCode(_ctx.stringValue("GetTaskWorkforceStatisticResponse.ErrorCode"));

		List<UsersStatisticItem> usersStatistic = new ArrayList<UsersStatisticItem>();
		for (int i = 0; i < _ctx.lengthValue("GetTaskWorkforceStatisticResponse.UsersStatistic.Length"); i++) {
			UsersStatisticItem usersStatisticItem = new UsersStatisticItem();
			usersStatisticItem.setUserId(_ctx.stringValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].UserId"));
			usersStatisticItem.setTotalMarkItemsCount(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].TotalMarkItemsCount"));
			usersStatisticItem.setAcceptedMarkItemsCount(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].AcceptedMarkItemsCount"));
			usersStatisticItem.setMarkTime(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].MarkTime"));
			usersStatisticItem.setMarkEfficiency(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].MarkEfficiency"));
			usersStatisticItem.setCheckCount(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].CheckCount"));
			usersStatisticItem.setCheckedAcceptedCount(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].CheckedAcceptedCount"));
			usersStatisticItem.setCheckedAccuracy(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].CheckedAccuracy"));
			usersStatisticItem.setSamplingAccuracy(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].SamplingAccuracy"));
			usersStatisticItem.setSamplingCount(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].SamplingCount"));
			usersStatisticItem.setSamplingErrorCount(_ctx.floatValue("GetTaskWorkforceStatisticResponse.UsersStatistic["+ i +"].SamplingErrorCount"));

			usersStatistic.add(usersStatisticItem);
		}
		getTaskWorkforceStatisticResponse.setUsersStatistic(usersStatistic);
	 
	 	return getTaskWorkforceStatisticResponse;
	}
}