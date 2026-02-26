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

package com.aliyuncs.viapi_oxs_cross.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.viapi_oxs_cross.model.v20200701.GetSDKInstanceDebugInfoResponse;
import com.aliyuncs.viapi_oxs_cross.model.v20200701.GetSDKInstanceDebugInfoResponse.Data;
import com.aliyuncs.viapi_oxs_cross.model.v20200701.GetSDKInstanceDebugInfoResponse.Data.Event;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSDKInstanceDebugInfoResponseUnmarshaller {

	public static GetSDKInstanceDebugInfoResponse unmarshall(GetSDKInstanceDebugInfoResponse getSDKInstanceDebugInfoResponse, UnmarshallerContext _ctx) {
		
		getSDKInstanceDebugInfoResponse.setRequestId(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.RequestId"));
		getSDKInstanceDebugInfoResponse.setOk(_ctx.booleanValue("GetSDKInstanceDebugInfoResponse.Ok"));
		getSDKInstanceDebugInfoResponse.setCode(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Code"));
		getSDKInstanceDebugInfoResponse.setHttpCode(_ctx.integerValue("GetSDKInstanceDebugInfoResponse.HttpCode"));
		getSDKInstanceDebugInfoResponse.setErrorMessage(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.ErrorMessage"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.Status"));
		data.setLatestBuild(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.LatestBuild"));
		data.setValidFromDate(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.ValidFromDate"));
		data.setValidToDate(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.ValidToDate"));
		data.setPlatform(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.Platform"));
		data.setCreatedAt(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.CreatedAt"));
		data.setRecipe(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.Recipe"));
		data.setUpdatedAt(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.UpdatedAt"));
		data.setInstanceId(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.InstanceId"));
		data.setBundleId(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.BundleId"));

		List<Event> events = new ArrayList<Event>();
		for (int i = 0; i < _ctx.lengthValue("GetSDKInstanceDebugInfoResponse.Data.Events.Length"); i++) {
			Event event = new Event();
			event.setTimeStamp(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.Events["+ i +"].TimeStamp"));
			event.setSuccess(_ctx.booleanValue("GetSDKInstanceDebugInfoResponse.Data.Events["+ i +"].Success"));
			event.setContent(_ctx.stringValue("GetSDKInstanceDebugInfoResponse.Data.Events["+ i +"].Content"));
			event.setId(_ctx.longValue("GetSDKInstanceDebugInfoResponse.Data.Events["+ i +"].Id"));

			events.add(event);
		}
		data.setEvents(events);
		getSDKInstanceDebugInfoResponse.setData(data);
	 
	 	return getSDKInstanceDebugInfoResponse;
	}
}