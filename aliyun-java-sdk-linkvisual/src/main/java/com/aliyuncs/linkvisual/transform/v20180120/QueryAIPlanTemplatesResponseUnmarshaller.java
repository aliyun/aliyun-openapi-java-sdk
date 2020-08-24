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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryAIPlanTemplatesResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryAIPlanTemplatesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAIPlanTemplatesResponseUnmarshaller {

	public static QueryAIPlanTemplatesResponse unmarshall(QueryAIPlanTemplatesResponse queryAIPlanTemplatesResponse, UnmarshallerContext _ctx) {
		
		queryAIPlanTemplatesResponse.setRequestId(_ctx.stringValue("QueryAIPlanTemplatesResponse.RequestId"));
		queryAIPlanTemplatesResponse.setSuccess(_ctx.booleanValue("QueryAIPlanTemplatesResponse.Success"));
		queryAIPlanTemplatesResponse.setErrorMessage(_ctx.stringValue("QueryAIPlanTemplatesResponse.ErrorMessage"));
		queryAIPlanTemplatesResponse.setCode(_ctx.stringValue("QueryAIPlanTemplatesResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAIPlanTemplatesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPlanTemplateId(_ctx.stringValue("QueryAIPlanTemplatesResponse.Data["+ i +"].PlanTemplateId"));
			dataItem.setAppTemplateId(_ctx.stringValue("QueryAIPlanTemplatesResponse.Data["+ i +"].AppTemplateId"));
			dataItem.setAppVersion(_ctx.stringValue("QueryAIPlanTemplatesResponse.Data["+ i +"].AppVersion"));
			dataItem.setTriggerEnum(_ctx.integerValue("QueryAIPlanTemplatesResponse.Data["+ i +"].TriggerEnum"));
			dataItem.setDescription(_ctx.stringValue("QueryAIPlanTemplatesResponse.Data["+ i +"].Description"));
			dataItem.setIntervalTiming(_ctx.integerValue("QueryAIPlanTemplatesResponse.Data["+ i +"].IntervalTiming"));

			data.add(dataItem);
		}
		queryAIPlanTemplatesResponse.setData(data);
	 
	 	return queryAIPlanTemplatesResponse;
	}
}