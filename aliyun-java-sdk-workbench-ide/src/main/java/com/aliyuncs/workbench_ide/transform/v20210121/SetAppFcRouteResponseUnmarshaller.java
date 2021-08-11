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

package com.aliyuncs.workbench_ide.transform.v20210121;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workbench_ide.model.v20210121.SetAppFcRouteResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetAppFcRouteResponseUnmarshaller {

	public static SetAppFcRouteResponse unmarshall(SetAppFcRouteResponse setAppFcRouteResponse, UnmarshallerContext _ctx) {
		
		setAppFcRouteResponse.setRequestId(_ctx.stringValue("SetAppFcRouteResponse.RequestId"));
		setAppFcRouteResponse.setCode(_ctx.stringValue("SetAppFcRouteResponse.Code"));
		setAppFcRouteResponse.setMessage(_ctx.stringValue("SetAppFcRouteResponse.Message"));

		List<Map<Object, Object>> data = _ctx.listMapValue("SetAppFcRouteResponse.Data");
		setAppFcRouteResponse.setData(data);
	 
	 	return setAppFcRouteResponse;
	}
}