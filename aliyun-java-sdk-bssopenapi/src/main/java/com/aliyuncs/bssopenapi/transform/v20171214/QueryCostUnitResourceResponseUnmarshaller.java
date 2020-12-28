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

package com.aliyuncs.bssopenapi.transform.v20171214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bssopenapi.model.v20171214.QueryCostUnitResourceResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCostUnitResourceResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCostUnitResourceResponse.Data.CostUnit;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCostUnitResourceResponse.Data.CostUnitStatisInfo;
import com.aliyuncs.bssopenapi.model.v20171214.QueryCostUnitResourceResponse.Data.ResourceInstanceList;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCostUnitResourceResponseUnmarshaller {

	public static QueryCostUnitResourceResponse unmarshall(QueryCostUnitResourceResponse queryCostUnitResourceResponse, UnmarshallerContext _ctx) {
		
		queryCostUnitResourceResponse.setRequestId(_ctx.stringValue("QueryCostUnitResourceResponse.RequestId"));
		queryCostUnitResourceResponse.setMessage(_ctx.stringValue("QueryCostUnitResourceResponse.Message"));
		queryCostUnitResourceResponse.setCode(_ctx.stringValue("QueryCostUnitResourceResponse.Code"));
		queryCostUnitResourceResponse.setSuccess(_ctx.booleanValue("QueryCostUnitResourceResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("QueryCostUnitResourceResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("QueryCostUnitResourceResponse.Data.PageSize"));
		data.setPageNum(_ctx.integerValue("QueryCostUnitResourceResponse.Data.PageNum"));

		CostUnit costUnit = new CostUnit();
		costUnit.setUnitId(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnit.UnitId"));
		costUnit.setParentUnitId(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnit.ParentUnitId"));
		costUnit.setOwnerUid(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnit.OwnerUid"));
		costUnit.setUnitName(_ctx.stringValue("QueryCostUnitResourceResponse.Data.CostUnit.UnitName"));
		data.setCostUnit(costUnit);

		CostUnitStatisInfo costUnitStatisInfo = new CostUnitStatisInfo();
		costUnitStatisInfo.setSubUnitCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.SubUnitCount"));
		costUnitStatisInfo.setTotalResourceGroupCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.TotalResourceGroupCount"));
		costUnitStatisInfo.setTotalResourceCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.TotalResourceCount"));
		costUnitStatisInfo.setUserCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.UserCount"));
		costUnitStatisInfo.setResourceCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.ResourceCount"));
		costUnitStatisInfo.setTotalUserCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.TotalUserCount"));
		costUnitStatisInfo.setResourceGroupCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.ResourceGroupCount"));
		data.setCostUnitStatisInfo(costUnitStatisInfo);

		List<ResourceInstanceList> resourceInstanceDtoList = new ArrayList<ResourceInstanceList>();
		for (int i = 0; i < _ctx.lengthValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList.Length"); i++) {
			ResourceInstanceList resourceInstanceList = new ResourceInstanceList();
			resourceInstanceList.setResourceUserId(_ctx.longValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceUserId"));
			resourceInstanceList.setResourceTag(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceTag"));
			resourceInstanceList.setRelatedResources(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].RelatedResources"));
			resourceInstanceList.setApportionName(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ApportionName"));
			resourceInstanceList.setResourceId(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceId"));
			resourceInstanceList.setCommodityCode(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].CommodityCode"));
			resourceInstanceList.setResourceStatus(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceStatus"));
			resourceInstanceList.setResourceType(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceType"));
			resourceInstanceList.setResourceUserName(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceUserName"));
			resourceInstanceList.setResourceNick(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceNick"));
			resourceInstanceList.setResourceGroup(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceGroup"));
			resourceInstanceList.setCommodityName(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].CommodityName"));
			resourceInstanceList.setApportionCode(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ApportionCode"));

			resourceInstanceDtoList.add(resourceInstanceList);
		}
		data.setResourceInstanceDtoList(resourceInstanceDtoList);
		queryCostUnitResourceResponse.setData(data);
	 
	 	return queryCostUnitResourceResponse;
	}
}