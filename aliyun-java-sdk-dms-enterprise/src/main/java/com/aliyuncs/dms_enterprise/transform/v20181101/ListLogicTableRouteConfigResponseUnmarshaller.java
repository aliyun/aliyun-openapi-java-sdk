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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListLogicTableRouteConfigResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListLogicTableRouteConfigResponse.LogicTableRouteConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLogicTableRouteConfigResponseUnmarshaller {

	public static ListLogicTableRouteConfigResponse unmarshall(ListLogicTableRouteConfigResponse listLogicTableRouteConfigResponse, UnmarshallerContext _ctx) {
		
		listLogicTableRouteConfigResponse.setRequestId(_ctx.stringValue("ListLogicTableRouteConfigResponse.RequestId"));
		listLogicTableRouteConfigResponse.setErrorCode(_ctx.stringValue("ListLogicTableRouteConfigResponse.ErrorCode"));
		listLogicTableRouteConfigResponse.setErrorMessage(_ctx.stringValue("ListLogicTableRouteConfigResponse.ErrorMessage"));
		listLogicTableRouteConfigResponse.setSuccess(_ctx.booleanValue("ListLogicTableRouteConfigResponse.Success"));

		List<LogicTableRouteConfig> logicTableRouteConfigList = new ArrayList<LogicTableRouteConfig>();
		for (int i = 0; i < _ctx.lengthValue("ListLogicTableRouteConfigResponse.LogicTableRouteConfigList.Length"); i++) {
			LogicTableRouteConfig logicTableRouteConfig = new LogicTableRouteConfig();
			logicTableRouteConfig.setRouteKey(_ctx.stringValue("ListLogicTableRouteConfigResponse.LogicTableRouteConfigList["+ i +"].RouteKey"));
			logicTableRouteConfig.setRouteExpr(_ctx.stringValue("ListLogicTableRouteConfigResponse.LogicTableRouteConfigList["+ i +"].RouteExpr"));
			logicTableRouteConfig.setTableId(_ctx.longValue("ListLogicTableRouteConfigResponse.LogicTableRouteConfigList["+ i +"].TableId"));

			logicTableRouteConfigList.add(logicTableRouteConfig);
		}
		listLogicTableRouteConfigResponse.setLogicTableRouteConfigList(logicTableRouteConfigList);
	 
	 	return listLogicTableRouteConfigResponse;
	}
}