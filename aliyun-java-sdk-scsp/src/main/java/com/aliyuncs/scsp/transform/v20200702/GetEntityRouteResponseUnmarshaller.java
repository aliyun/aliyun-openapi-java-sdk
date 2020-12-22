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
		getEntityRouteResponse.setCode(_ctx.stringValue("GetEntityRouteResponse.Code"));
		getEntityRouteResponse.setMessage(_ctx.stringValue("GetEntityRouteResponse.Message"));
		getEntityRouteResponse.setSuccess(_ctx.booleanValue("GetEntityRouteResponse.Success"));

		Data data = new Data();
		data.setDepartmentId(_ctx.stringValue("GetEntityRouteResponse.Data.DepartmentId"));
		data.setEntityBizCode(_ctx.stringValue("GetEntityRouteResponse.Data.EntityBizCode"));
		data.setEntityBizCodeType(_ctx.stringValue("GetEntityRouteResponse.Data.EntityBizCodeType"));
		data.setEntityId(_ctx.stringValue("GetEntityRouteResponse.Data.EntityId"));
		data.setEntityName(_ctx.stringValue("GetEntityRouteResponse.Data.EntityName"));
		data.setEntityRelationNumber(_ctx.stringValue("GetEntityRouteResponse.Data.EntityRelationNumber"));
		data.setExtInfo(_ctx.stringValue("GetEntityRouteResponse.Data.ExtInfo"));
		data.setGroupId(_ctx.longValue("GetEntityRouteResponse.Data.GroupId"));
		data.setServiceId(_ctx.longValue("GetEntityRouteResponse.Data.ServiceId"));
		data.setUniqueId(_ctx.longValue("GetEntityRouteResponse.Data.UniqueId"));
		getEntityRouteResponse.setData(data);
	 
	 	return getEntityRouteResponse;
	}
}