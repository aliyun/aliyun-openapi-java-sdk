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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.scsp.model.v20200702.GetEntityRouteListResponse;
import com.aliyuncs.scsp.model.v20200702.GetEntityRouteListResponse.Data;
import com.aliyuncs.scsp.model.v20200702.GetEntityRouteListResponse.Data.EntityRouteListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetEntityRouteListResponseUnmarshaller {

	public static GetEntityRouteListResponse unmarshall(GetEntityRouteListResponse getEntityRouteListResponse, UnmarshallerContext _ctx) {
		
		getEntityRouteListResponse.setRequestId(_ctx.stringValue("GetEntityRouteListResponse.RequestId"));
		getEntityRouteListResponse.setMessage(_ctx.stringValue("GetEntityRouteListResponse.Message"));
		getEntityRouteListResponse.setCode(_ctx.stringValue("GetEntityRouteListResponse.Code"));
		getEntityRouteListResponse.setSuccess(_ctx.booleanValue("GetEntityRouteListResponse.Success"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("GetEntityRouteListResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("GetEntityRouteListResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("GetEntityRouteListResponse.Data.Total"));

		List<EntityRouteListItem> entityRouteList = new ArrayList<EntityRouteListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetEntityRouteListResponse.Data.EntityRouteList.Length"); i++) {
			EntityRouteListItem entityRouteListItem = new EntityRouteListItem();
			entityRouteListItem.setEntityBizCodeType(_ctx.stringValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].EntityBizCodeType"));
			entityRouteListItem.setGroupId(_ctx.stringValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].GroupId"));
			entityRouteListItem.setEntityId(_ctx.stringValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].EntityId"));
			entityRouteListItem.setServiceId(_ctx.stringValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].ServiceId"));
			entityRouteListItem.setDepartmentId(_ctx.stringValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].DepartmentId"));
			entityRouteListItem.setEntityBizCode(_ctx.stringValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].EntityBizCode"));
			entityRouteListItem.setUniqueId(_ctx.longValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].UniqueId"));
			entityRouteListItem.setEntityName(_ctx.stringValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].EntityName"));
			entityRouteListItem.setExtInfo(_ctx.stringValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].ExtInfo"));
			entityRouteListItem.setEntityRelationNumber(_ctx.stringValue("GetEntityRouteListResponse.Data.EntityRouteList["+ i +"].EntityRelationNumber"));

			entityRouteList.add(entityRouteListItem);
		}
		data.setEntityRouteList(entityRouteList);
		getEntityRouteListResponse.setData(data);
	 
	 	return getEntityRouteListResponse;
	}
}