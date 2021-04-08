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

package com.aliyuncs.aiccs.transform.v20191015;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aiccs.model.v20191015.GetInstanceListResponse;
import com.aliyuncs.aiccs.model.v20191015.GetInstanceListResponse.CommodityInstancesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceListResponseUnmarshaller {

	public static GetInstanceListResponse unmarshall(GetInstanceListResponse getInstanceListResponse, UnmarshallerContext _ctx) {
		
		getInstanceListResponse.setRequestId(_ctx.stringValue("GetInstanceListResponse.RequestId"));
		getInstanceListResponse.setTotalCount(_ctx.integerValue("GetInstanceListResponse.TotalCount"));
		getInstanceListResponse.setPageSize(_ctx.integerValue("GetInstanceListResponse.PageSize"));
		getInstanceListResponse.setMessage(_ctx.stringValue("GetInstanceListResponse.Message"));
		getInstanceListResponse.setPageNumber(_ctx.integerValue("GetInstanceListResponse.PageNumber"));
		getInstanceListResponse.setHttpStatusCode(_ctx.integerValue("GetInstanceListResponse.HttpStatusCode"));
		getInstanceListResponse.setCode(_ctx.stringValue("GetInstanceListResponse.Code"));
		getInstanceListResponse.setSuccess(_ctx.booleanValue("GetInstanceListResponse.Success"));

		List<CommodityInstancesItem> commodityInstances = new ArrayList<CommodityInstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceListResponse.CommodityInstances.Length"); i++) {
			CommodityInstancesItem commodityInstancesItem = new CommodityInstancesItem();
			commodityInstancesItem.setInstanceId(_ctx.stringValue("GetInstanceListResponse.CommodityInstances["+ i +"].InstanceId"));
			commodityInstancesItem.setName(_ctx.stringValue("GetInstanceListResponse.CommodityInstances["+ i +"].Name"));

			commodityInstances.add(commodityInstancesItem);
		}
		getInstanceListResponse.setCommodityInstances(commodityInstances);
	 
	 	return getInstanceListResponse;
	}
}