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

import com.aliyuncs.das.model.v20200116.DisableAutoResourceOptimizeRulesResponse;
import com.aliyuncs.das.model.v20200116.DisableAutoResourceOptimizeRulesResponse.Data;
import com.aliyuncs.das.model.v20200116.DisableAutoResourceOptimizeRulesResponse.Data.ConfigFailInstanceListItem;
import com.aliyuncs.das.model.v20200116.DisableAutoResourceOptimizeRulesResponse.Data.ConfigSuccessInstanceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisableAutoResourceOptimizeRulesResponseUnmarshaller {

	public static DisableAutoResourceOptimizeRulesResponse unmarshall(DisableAutoResourceOptimizeRulesResponse disableAutoResourceOptimizeRulesResponse, UnmarshallerContext _ctx) {
		
		disableAutoResourceOptimizeRulesResponse.setRequestId(_ctx.stringValue("DisableAutoResourceOptimizeRulesResponse.RequestId"));
		disableAutoResourceOptimizeRulesResponse.setCode(_ctx.longValue("DisableAutoResourceOptimizeRulesResponse.Code"));
		disableAutoResourceOptimizeRulesResponse.setMessage(_ctx.stringValue("DisableAutoResourceOptimizeRulesResponse.Message"));
		disableAutoResourceOptimizeRulesResponse.setSuccess(_ctx.booleanValue("DisableAutoResourceOptimizeRulesResponse.Success"));

		Data data = new Data();
		data.setTotalInstanceCount(_ctx.longValue("DisableAutoResourceOptimizeRulesResponse.Data.TotalInstanceCount"));
		data.setConfigSuccessInstanceCount(_ctx.longValue("DisableAutoResourceOptimizeRulesResponse.Data.ConfigSuccessInstanceCount"));
		data.setConfigFailInstanceCount(_ctx.longValue("DisableAutoResourceOptimizeRulesResponse.Data.ConfigFailInstanceCount"));

		List<ConfigSuccessInstanceListItem> configSuccessInstanceList = new ArrayList<ConfigSuccessInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("DisableAutoResourceOptimizeRulesResponse.Data.ConfigSuccessInstanceList.Length"); i++) {
			ConfigSuccessInstanceListItem configSuccessInstanceListItem = new ConfigSuccessInstanceListItem();
			configSuccessInstanceListItem.setConfigSuccess(_ctx.booleanValue("DisableAutoResourceOptimizeRulesResponse.Data.ConfigSuccessInstanceList["+ i +"].ConfigSuccess"));
			configSuccessInstanceListItem.setInstanceId(_ctx.stringValue("DisableAutoResourceOptimizeRulesResponse.Data.ConfigSuccessInstanceList["+ i +"].InstanceId"));

			configSuccessInstanceList.add(configSuccessInstanceListItem);
		}
		data.setConfigSuccessInstanceList(configSuccessInstanceList);

		List<ConfigFailInstanceListItem> configFailInstanceList = new ArrayList<ConfigFailInstanceListItem>();
		for (int i = 0; i < _ctx.lengthValue("DisableAutoResourceOptimizeRulesResponse.Data.ConfigFailInstanceList.Length"); i++) {
			ConfigFailInstanceListItem configFailInstanceListItem = new ConfigFailInstanceListItem();
			configFailInstanceListItem.setConfigSuccess(_ctx.booleanValue("DisableAutoResourceOptimizeRulesResponse.Data.ConfigFailInstanceList["+ i +"].ConfigSuccess"));
			configFailInstanceListItem.setInstanceId(_ctx.stringValue("DisableAutoResourceOptimizeRulesResponse.Data.ConfigFailInstanceList["+ i +"].InstanceId"));
			configFailInstanceListItem.setErrorMessage(_ctx.stringValue("DisableAutoResourceOptimizeRulesResponse.Data.ConfigFailInstanceList["+ i +"].ErrorMessage"));

			configFailInstanceList.add(configFailInstanceListItem);
		}
		data.setConfigFailInstanceList(configFailInstanceList);
		disableAutoResourceOptimizeRulesResponse.setData(data);
	 
	 	return disableAutoResourceOptimizeRulesResponse;
	}
}