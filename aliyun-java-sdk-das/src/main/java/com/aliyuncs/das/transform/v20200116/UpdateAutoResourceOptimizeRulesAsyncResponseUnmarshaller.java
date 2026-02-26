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

import com.aliyuncs.das.model.v20200116.UpdateAutoResourceOptimizeRulesAsyncResponse;
import com.aliyuncs.das.model.v20200116.UpdateAutoResourceOptimizeRulesAsyncResponse.Data;
import com.aliyuncs.das.model.v20200116.UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse;
import com.aliyuncs.das.model.v20200116.UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceListItem;
import com.aliyuncs.das.model.v20200116.UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAutoResourceOptimizeRulesAsyncResponseUnmarshaller {

	public static UpdateAutoResourceOptimizeRulesAsyncResponse unmarshall(UpdateAutoResourceOptimizeRulesAsyncResponse updateAutoResourceOptimizeRulesAsyncResponse, UnmarshallerContext _ctx) {
		
		updateAutoResourceOptimizeRulesAsyncResponse.setRequestId(_ctx.stringValue("UpdateAutoResourceOptimizeRulesAsyncResponse.RequestId"));
		updateAutoResourceOptimizeRulesAsyncResponse.setCode(_ctx.longValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Code"));
		updateAutoResourceOptimizeRulesAsyncResponse.setMessage(_ctx.stringValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Message"));
		updateAutoResourceOptimizeRulesAsyncResponse.setSuccess(_ctx.booleanValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Success"));

		Data data = new Data();
		data.setFail(_ctx.booleanValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.Fail"));
		data.setResultId(_ctx.stringValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ResultId"));
		data.setIsFinish(_ctx.booleanValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.IsFinish"));
		data.setState(_ctx.stringValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.State"));
		data.setComplete(_ctx.booleanValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.Complete"));
		data.setTimestamp(_ctx.longValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.Timestamp"));

		ConfigResponse configResponse = new ConfigResponse();
		configResponse.setTotalInstanceCount(_ctx.longValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.TotalInstanceCount"));
		configResponse.setConfigSuccessInstanceCount(_ctx.longValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceCount"));
		configResponse.setConfigFailInstanceCount(_ctx.longValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceCount"));

		List<ConfigSuccessInstanceListItem> configSuccessInstanceList = new ArrayList<ConfigSuccessInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceList.Length"); i++) {
			ConfigSuccessInstanceListItem configSuccessInstanceListItem = new ConfigSuccessInstanceListItem();
			configSuccessInstanceListItem.setConfigSuccess(_ctx.booleanValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceList["+ i +"].ConfigSuccess"));
			configSuccessInstanceListItem.setInstanceId(_ctx.stringValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigSuccessInstanceList["+ i +"].InstanceId"));

			configSuccessInstanceList.add(configSuccessInstanceListItem);
		}
		configResponse.setConfigSuccessInstanceList(configSuccessInstanceList);

		List<ConfigFailInstanceListItem> configFailInstanceList = new ArrayList<ConfigFailInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceList.Length"); i++) {
			ConfigFailInstanceListItem configFailInstanceListItem = new ConfigFailInstanceListItem();
			configFailInstanceListItem.setConfigSuccess(_ctx.booleanValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceList["+ i +"].ConfigSuccess"));
			configFailInstanceListItem.setInstanceId(_ctx.stringValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceList["+ i +"].InstanceId"));
			configFailInstanceListItem.setErrorMessage(_ctx.stringValue("UpdateAutoResourceOptimizeRulesAsyncResponse.Data.ConfigResponse.ConfigFailInstanceList["+ i +"].ErrorMessage"));

			configFailInstanceList.add(configFailInstanceListItem);
		}
		configResponse.setConfigFailInstanceList(configFailInstanceList);
		data.setConfigResponse(configResponse);
		updateAutoResourceOptimizeRulesAsyncResponse.setData(data);
	 
	 	return updateAutoResourceOptimizeRulesAsyncResponse;
	}
}