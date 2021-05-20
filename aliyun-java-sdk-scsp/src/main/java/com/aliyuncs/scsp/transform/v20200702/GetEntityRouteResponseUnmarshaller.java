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

package com.aliyuncs.scsp.transform.v20200702;

import com.aliyuncs.scsp.model.v20200702.GetEntityRouteResponse;
import com.aliyuncs.scsp.model.v20200702.GetEntityRouteResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEntityRouteResponseUnmarshaller {

	public static GetEntityRouteResponse unmarshall(GetEntityRouteResponse getEntityRouteResponse, UnmarshallerContext _ctx) {
		
		getEntityRouteResponse.setRequestId(_ctx.stringValue("GetEntityRouteResponse.RequestId"));
		getEntityRouteResponse.setMessage(_ctx.stringValue("GetEntityRouteResponse.Message"));
		getEntityRouteResponse.setCode(_ctx.stringValue("GetEntityRouteResponse.Code"));
		getEntityRouteResponse.setSuccess(_ctx.booleanValue("GetEntityRouteResponse.Success"));

		Data data = new Data();
		data.setEntityBizCodeType(_ctx.stringValue("GetEntityRouteResponse.Data.EntityBizCodeType"));
		data.setGroupId(_ctx.longValue("GetEntityRouteResponse.Data.GroupId"));
		data.setEntityId(_ctx.stringValue("GetEntityRouteResponse.Data.EntityId"));
		data.setServiceId(_ctx.longValue("GetEntityRouteResponse.Data.ServiceId"));
		data.setEntityBizCode(_ctx.stringValue("GetEntityRouteResponse.Data.EntityBizCode"));
		data.setDepartmentId(_ctx.stringValue("GetEntityRouteResponse.Data.DepartmentId"));
		data.setUniqueId(_ctx.longValue("GetEntityRouteResponse.Data.UniqueId"));
		data.setEntityName(_ctx.stringValue("GetEntityRouteResponse.Data.EntityName"));
		data.setExtInfo(_ctx.stringValue("GetEntityRouteResponse.Data.ExtInfo"));
		data.setEntityRelationNumber(_ctx.stringValue("GetEntityRouteResponse.Data.EntityRelationNumber"));
		getEntityRouteResponse.setData(data);
	 
	 	return getEntityRouteResponse;
	}
}