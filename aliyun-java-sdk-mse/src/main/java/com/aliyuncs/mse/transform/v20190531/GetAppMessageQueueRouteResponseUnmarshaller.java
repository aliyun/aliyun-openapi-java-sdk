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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetAppMessageQueueRouteResponse;
import com.aliyuncs.mse.model.v20190531.GetAppMessageQueueRouteResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAppMessageQueueRouteResponseUnmarshaller {

	public static GetAppMessageQueueRouteResponse unmarshall(GetAppMessageQueueRouteResponse getAppMessageQueueRouteResponse, UnmarshallerContext _ctx) {
		
		getAppMessageQueueRouteResponse.setRequestId(_ctx.stringValue("GetAppMessageQueueRouteResponse.RequestId"));
		getAppMessageQueueRouteResponse.setHttpStatusCode(_ctx.integerValue("GetAppMessageQueueRouteResponse.HttpStatusCode"));
		getAppMessageQueueRouteResponse.setMessage(_ctx.stringValue("GetAppMessageQueueRouteResponse.Message"));
		getAppMessageQueueRouteResponse.setCode(_ctx.integerValue("GetAppMessageQueueRouteResponse.Code"));
		getAppMessageQueueRouteResponse.setSuccess(_ctx.booleanValue("GetAppMessageQueueRouteResponse.Success"));

		Data data = new Data();
		data.setAppId(_ctx.stringValue("GetAppMessageQueueRouteResponse.Data.AppId"));
		data.setRegion(_ctx.stringValue("GetAppMessageQueueRouteResponse.Data.Region"));
		data.setEnable(_ctx.booleanValue("GetAppMessageQueueRouteResponse.Data.Enable"));

		List<String> tags = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetAppMessageQueueRouteResponse.Data.Tags.Length"); i++) {
			tags.add(_ctx.stringValue("GetAppMessageQueueRouteResponse.Data.Tags["+ i +"]"));
		}
		data.setTags(tags);
		getAppMessageQueueRouteResponse.setData(data);
	 
	 	return getAppMessageQueueRouteResponse;
	}
}