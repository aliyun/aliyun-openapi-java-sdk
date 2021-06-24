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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsQueryRateLimitActionRulesResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsQueryRateLimitActionRulesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsQueryRateLimitActionRulesResponseUnmarshaller {

	public static OpsQueryRateLimitActionRulesResponse unmarshall(OpsQueryRateLimitActionRulesResponse opsQueryRateLimitActionRulesResponse, UnmarshallerContext _ctx) {
		
		opsQueryRateLimitActionRulesResponse.setRequestId(_ctx.stringValue("OpsQueryRateLimitActionRulesResponse.RequestId"));
		opsQueryRateLimitActionRulesResponse.setCode(_ctx.integerValue("OpsQueryRateLimitActionRulesResponse.Code"));
		opsQueryRateLimitActionRulesResponse.setMessage(_ctx.stringValue("OpsQueryRateLimitActionRulesResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("OpsQueryRateLimitActionRulesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAction(_ctx.stringValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].Action"));
			dataItem.setName(_ctx.stringValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].Name"));
			dataItem.setDesc(_ctx.stringValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].Desc"));
			dataItem.setLimitNum(_ctx.integerValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].LimitNum"));
			dataItem.setTimeWindow(_ctx.longValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].TimeWindow"));
			dataItem.setEnable(_ctx.booleanValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].Enable"));
			dataItem.setAlwaysExec(_ctx.booleanValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].AlwaysExec"));

			List<String> exclusions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].Exclusions.Length"); j++) {
				exclusions.add(_ctx.stringValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].Exclusions["+ j +"]"));
			}
			dataItem.setExclusions(exclusions);

			List<String> dimensions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].Dimensions.Length"); j++) {
				dimensions.add(_ctx.stringValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].Dimensions["+ j +"]"));
			}
			dataItem.setDimensions(dimensions);

			List<String> postActions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].PostActions.Length"); j++) {
				postActions.add(_ctx.stringValue("OpsQueryRateLimitActionRulesResponse.Data["+ i +"].PostActions["+ j +"]"));
			}
			dataItem.setPostActions(postActions);

			data.add(dataItem);
		}
		opsQueryRateLimitActionRulesResponse.setData(data);
	 
	 	return opsQueryRateLimitActionRulesResponse;
	}
}