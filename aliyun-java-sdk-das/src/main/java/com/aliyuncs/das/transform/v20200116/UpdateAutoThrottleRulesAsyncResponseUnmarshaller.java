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

import com.aliyuncs.das.model.v20200116.UpdateAutoThrottleRulesAsyncResponse;
import com.aliyuncs.das.model.v20200116.UpdateAutoThrottleRulesAsyncResponse.Data;
import com.aliyuncs.das.model.v20200116.UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse;
import com.aliyuncs.das.model.v20200116.UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceListItem;
import com.aliyuncs.das.model.v20200116.UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAutoThrottleRulesAsyncResponseUnmarshaller {

	public static UpdateAutoThrottleRulesAsyncResponse unmarshall(UpdateAutoThrottleRulesAsyncResponse updateAutoThrottleRulesAsyncResponse, UnmarshallerContext _ctx) {
		
		updateAutoThrottleRulesAsyncResponse.setRequestId(_ctx.stringValue("UpdateAutoThrottleRulesAsyncResponse.RequestId"));
		updateAutoThrottleRulesAsyncResponse.setCode(_ctx.longValue("UpdateAutoThrottleRulesAsyncResponse.Code"));
		updateAutoThrottleRulesAsyncResponse.setMessage(_ctx.stringValue("UpdateAutoThrottleRulesAsyncResponse.Message"));
		updateAutoThrottleRulesAsyncResponse.setSuccess(_ctx.booleanValue("UpdateAutoThrottleRulesAsyncResponse.Success"));

		Data data = new Data();
		data.setFail(_ctx.booleanValue("UpdateAutoThrottleRulesAsyncResponse.Data.Fail"));
		data.setResultId(_ctx.stringValue("UpdateAutoThrottleRulesAsyncResponse.Data.ResultId"));
		data.setIsFinish(_ctx.booleanValue("UpdateAutoThrottleRulesAsyncResponse.Data.IsFinish"));
		data.setState(_ctx.stringValue("UpdateAutoThrottleRulesAsyncResponse.Data.State"));
		data.setComplete(_ctx.booleanValue("UpdateAutoThrottleRulesAsyncResponse.Data.Complete"));
		data.setTimestamp(_ctx.longValue("UpdateAutoThrottleRulesAsyncResponse.Data.Timestamp"));

		ConfigResponse configResponse = new ConfigResponse();
		configResponse.setTotalInstanceCount(_ctx.longValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.TotalInstanceCount"));
		configResponse.setConfigSuccessInstanceCount(_ctx.longValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceCount"));
		configResponse.setConfigFailInstanceCount(_ctx.longValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceCount"));

		List<ConfigSuccessInstanceListItem> configSuccessInstanceList = new ArrayList<ConfigSuccessInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceList.Length"); i++) {
			ConfigSuccessInstanceListItem configSuccessInstanceListItem = new ConfigSuccessInstanceListItem();
			configSuccessInstanceListItem.setConfigSuccess(_ctx.booleanValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceList["+ i +"].ConfigSuccess"));
			configSuccessInstanceListItem.setInstanceId(_ctx.stringValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceList["+ i +"].InstanceId"));

			configSuccessInstanceList.add(configSuccessInstanceListItem);
		}
		configResponse.setConfigSuccessInstanceList(configSuccessInstanceList);

		List<ConfigFailInstanceListItem> configFailInstanceList = new ArrayList<ConfigFailInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceList.Length"); i++) {
			ConfigFailInstanceListItem configFailInstanceListItem = new ConfigFailInstanceListItem();
			configFailInstanceListItem.setConfigSuccess(_ctx.booleanValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceList["+ i +"].ConfigSuccess"));
			configFailInstanceListItem.setInstanceId(_ctx.stringValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceList["+ i +"].InstanceId"));
			configFailInstanceListItem.setErrorMessage(_ctx.stringValue("UpdateAutoThrottleRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceList["+ i +"].ErrorMessage"));

			configFailInstanceList.add(configFailInstanceListItem);
		}
		configResponse.setConfigFailInstanceList(configFailInstanceList);
		data.setConfigResponse(configResponse);
		updateAutoThrottleRulesAsyncResponse.setData(data);
	 
	 	return updateAutoThrottleRulesAsyncResponse;
	}
}