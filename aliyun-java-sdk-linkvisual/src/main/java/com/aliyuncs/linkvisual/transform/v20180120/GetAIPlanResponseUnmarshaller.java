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

import com.aliyuncs.linkvisual.model.v20180120.GetAIPlanResponse;
import com.aliyuncs.linkvisual.model.v20180120.GetAIPlanResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIPlanResponseUnmarshaller {

	public static GetAIPlanResponse unmarshall(GetAIPlanResponse getAIPlanResponse, UnmarshallerContext _ctx) {
		
		getAIPlanResponse.setRequestId(_ctx.stringValue("GetAIPlanResponse.RequestId"));
		getAIPlanResponse.setSuccess(_ctx.booleanValue("GetAIPlanResponse.Success"));
		getAIPlanResponse.setErrorMessage(_ctx.stringValue("GetAIPlanResponse.ErrorMessage"));
		getAIPlanResponse.setCode(_ctx.stringValue("GetAIPlanResponse.Code"));

		Data data = new Data();
		data.setPlanId(_ctx.stringValue("GetAIPlanResponse.Data.PlanId"));
		data.setAppId(_ctx.stringValue("GetAIPlanResponse.Data.AppId"));
		data.setPlanTemplateId(_ctx.stringValue("GetAIPlanResponse.Data.PlanTemplateId"));
		data.setTriggerEnum(_ctx.integerValue("GetAIPlanResponse.Data.TriggerEnum"));
		data.setIntervalTiming(_ctx.integerValue("GetAIPlanResponse.Data.IntervalTiming"));
		data.setPreTiming(_ctx.longValue("GetAIPlanResponse.Data.PreTiming"));
		data.setDescription(_ctx.stringValue("GetAIPlanResponse.Data.Description"));
		getAIPlanResponse.setData(data);
	 
	 	return getAIPlanResponse;
	}
}