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

package com.aliyuncs.pts.transform.v20190810;

import com.aliyuncs.pts.model.v20190810.ListScenariosResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListScenariosResponseUnmarshaller {

	public static ListScenariosResponse unmarshall(ListScenariosResponse listScenariosResponse, UnmarshallerContext _ctx) {
		
		listScenariosResponse.setRequestId(_ctx.stringValue("ListScenariosResponse.RequestId"));
		listScenariosResponse.setCode(_ctx.stringValue("ListScenariosResponse.Code"));
		listScenariosResponse.setMessage(_ctx.stringValue("ListScenariosResponse.Message"));
		listScenariosResponse.setRouteResponseBody(_ctx.mapValue("ListScenariosResponse.RouteResponseBody"));
		listScenariosResponse.setSuccess(_ctx.stringValue("ListScenariosResponse.Success"));
	 
	 	return listScenariosResponse;
	}
}