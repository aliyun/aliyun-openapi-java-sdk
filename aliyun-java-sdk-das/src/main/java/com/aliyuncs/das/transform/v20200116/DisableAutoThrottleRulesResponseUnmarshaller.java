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

import com.aliyuncs.das.model.v20200116.DisableAutoThrottleRulesResponse;
import com.aliyuncs.das.model.v20200116.DisableAutoThrottleRulesResponse.Data;
import com.aliyuncs.das.model.v20200116.DisableAutoThrottleRulesResponse.Data.ConfigFailInstanceListItem;
import com.aliyuncs.das.model.v20200116.DisableAutoThrottleRulesResponse.Data.ConfigSuccessInstanceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableAutoThrottleRulesResponseUnmarshaller {

	public static DisableAutoThrottleRulesResponse unmarshall(DisableAutoThrottleRulesResponse disableAutoThrottleRulesResponse, UnmarshallerContext _ctx) {
		
		disableAutoThrottleRulesResponse.setRequestId(_ctx.stringValue("DisableAutoThrottleRulesResponse.RequestId"));
		disableAutoThrottleRulesResponse.setCode(_ctx.longValue("DisableAutoThrottleRulesResponse.Code"));
		disableAutoThrottleRulesResponse.setMessage(_ctx.stringValue("DisableAutoThrottleRulesResponse.Message"));
		disableAutoThrottleRulesResponse.setSuccess(_ctx.booleanValue("DisableAutoThrottleRulesResponse.Success"));

		Data data = new Data();
		data.setTotalInstanceCount(_ctx.longValue("DisableAutoThrottleRulesResponse.Data.TotalInstanceCount"));
		data.setConfigSuccessInstanceCount(_ctx.longValue("DisableAutoThrottleRulesResponse.Data.ConfigSuccessInstanceCount"));
		data.setConfigFailInstanceCount(_ctx.longValue("DisableAutoThrottleRulesResponse.Data.ConfigFailInstanceCount"));

		List<ConfigSuccessInstanceListItem> configSuccessInstanceList = new ArrayList<ConfigSuccessInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("DisableAutoThrottleRulesResponse.Data.ConfigSuccessInstanceList.Length"); i++) {
			ConfigSuccessInstanceListItem configSuccessInstanceListItem = new ConfigSuccessInstanceListItem();
			configSuccessInstanceListItem.setConfigSuccess(_ctx.booleanValue("DisableAutoThrottleRulesResponse.Data.ConfigSuccessInstanceList["+ i +"].ConfigSuccess"));
			configSuccessInstanceListItem.setInstanceId(_ctx.stringValue("DisableAutoThrottleRulesResponse.Data.ConfigSuccessInstanceList["+ i +"].InstanceId"));

			configSuccessInstanceList.add(configSuccessInstanceListItem);
		}
		data.setConfigSuccessInstanceList(configSuccessInstanceList);

		List<ConfigFailInstanceListItem> configFailInstanceList = new ArrayList<ConfigFailInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("DisableAutoThrottleRulesResponse.Data.ConfigFailInstanceList.Length"); i++) {
			ConfigFailInstanceListItem configFailInstanceListItem = new ConfigFailInstanceListItem();
			configFailInstanceListItem.setConfigSuccess(_ctx.booleanValue("DisableAutoThrottleRulesResponse.Data.ConfigFailInstanceList["+ i +"].ConfigSuccess"));
			configFailInstanceListItem.setInstanceId(_ctx.stringValue("DisableAutoThrottleRulesResponse.Data.ConfigFailInstanceList["+ i +"].InstanceId"));
			configFailInstanceListItem.setErrorMessage(_ctx.stringValue("DisableAutoThrottleRulesResponse.Data.ConfigFailInstanceList["+ i +"].ErrorMessage"));

			configFailInstanceList.add(configFailInstanceListItem);
		}
		data.setConfigFailInstanceList(configFailInstanceList);
		disableAutoThrottleRulesResponse.setData(data);
	 
	 	return disableAutoThrottleRulesResponse;
	}
}