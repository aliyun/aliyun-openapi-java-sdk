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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListResourceGroupsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListResourceGroupsResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListResourceGroupsResponseUnmarshaller {

	public static ListResourceGroupsResponse unmarshall(ListResourceGroupsResponse listResourceGroupsResponse, UnmarshallerContext _ctx) {
		
		listResourceGroupsResponse.setRequestId(_ctx.stringValue("ListResourceGroupsResponse.RequestId"));
		listResourceGroupsResponse.setHttpStatusCode(_ctx.integerValue("ListResourceGroupsResponse.HttpStatusCode"));
		listResourceGroupsResponse.setSuccess(_ctx.booleanValue("ListResourceGroupsResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListResourceGroupsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setIdentifier(_ctx.stringValue("ListResourceGroupsResponse.Data["+ i +"].Identifier"));
			dataItem.setCluster(_ctx.stringValue("ListResourceGroupsResponse.Data["+ i +"].Cluster"));
			dataItem.setBizExtKey(_ctx.stringValue("ListResourceGroupsResponse.Data["+ i +"].BizExtKey"));
			dataItem.setEnableKp(_ctx.booleanValue("ListResourceGroupsResponse.Data["+ i +"].EnableKp"));
			dataItem.setUpdateTime(_ctx.stringValue("ListResourceGroupsResponse.Data["+ i +"].UpdateTime"));
			dataItem.setResourceGroupType(_ctx.stringValue("ListResourceGroupsResponse.Data["+ i +"].ResourceGroupType"));
			dataItem.setMode(_ctx.stringValue("ListResourceGroupsResponse.Data["+ i +"].Mode"));
			dataItem.setSequence(_ctx.integerValue("ListResourceGroupsResponse.Data["+ i +"].Sequence"));
			dataItem.setIsDefault(_ctx.booleanValue("ListResourceGroupsResponse.Data["+ i +"].IsDefault"));
			dataItem.setCreateTime(_ctx.stringValue("ListResourceGroupsResponse.Data["+ i +"].CreateTime"));
			dataItem.setName(_ctx.stringValue("ListResourceGroupsResponse.Data["+ i +"].Name"));
			dataItem.setTenantId(_ctx.longValue("ListResourceGroupsResponse.Data["+ i +"].TenantId"));
			dataItem.setId(_ctx.longValue("ListResourceGroupsResponse.Data["+ i +"].Id"));
			dataItem.setStatus(_ctx.integerValue("ListResourceGroupsResponse.Data["+ i +"].Status"));
			dataItem.setSpecs(_ctx.mapValue("ListResourceGroupsResponse.Data["+ i +"].Specs"));

			data.add(dataItem);
		}
		listResourceGroupsResponse.setData(data);
	 
	 	return listResourceGroupsResponse;
	}
}