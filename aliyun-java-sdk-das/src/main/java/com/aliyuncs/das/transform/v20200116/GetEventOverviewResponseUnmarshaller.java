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

import com.aliyuncs.das.model.v20200116.GetEventOverviewResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEventOverviewResponseUnmarshaller {

	public static GetEventOverviewResponse unmarshall(GetEventOverviewResponse getEventOverviewResponse, UnmarshallerContext _ctx) {
		
		getEventOverviewResponse.setRequestId(_ctx.stringValue("GetEventOverviewResponse.RequestId"));
		getEventOverviewResponse.setMessage(_ctx.stringValue("GetEventOverviewResponse.Message"));
		getEventOverviewResponse.setData(_ctx.stringValue("GetEventOverviewResponse.Data"));
		getEventOverviewResponse.setCode(_ctx.stringValue("GetEventOverviewResponse.Code"));
		getEventOverviewResponse.setSuccess(_ctx.stringValue("GetEventOverviewResponse.Success"));
	 
	 	return getEventOverviewResponse;
	}
}