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
		queryCostUnitResourceResponse.setSuccess(_ctx.booleanValue("QueryCostUnitResourceResponse.Success"));
		queryCostUnitResourceResponse.setCode(_ctx.stringValue("QueryCostUnitResourceResponse.Code"));
		queryCostUnitResourceResponse.setMessage(_ctx.stringValue("QueryCostUnitResourceResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("QueryCostUnitResourceResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("QueryCostUnitResourceResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("QueryCostUnitResourceResponse.Data.TotalCount"));

		CostUnit costUnit = new CostUnit();
		costUnit.setOwnerUid(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnit.OwnerUid"));
		costUnit.setParentUnitId(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnit.ParentUnitId"));
		costUnit.setUnitId(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnit.UnitId"));
		costUnit.setUnitName(_ctx.stringValue("QueryCostUnitResourceResponse.Data.CostUnit.UnitName"));
		data.setCostUnit(costUnit);

		CostUnitStatisInfo costUnitStatisInfo = new CostUnitStatisInfo();
		costUnitStatisInfo.setResourceCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.ResourceCount"));
		costUnitStatisInfo.setResourceGroupCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.ResourceGroupCount"));
		costUnitStatisInfo.setSubUnitCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.SubUnitCount"));
		costUnitStatisInfo.setUserCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.UserCount"));
		costUnitStatisInfo.setTotalResourceCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.TotalResourceCount"));
		costUnitStatisInfo.setTotalUserCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.TotalUserCount"));
		costUnitStatisInfo.setTotalResourceGroupCount(_ctx.longValue("QueryCostUnitResourceResponse.Data.CostUnitStatisInfo.TotalResourceGroupCount"));
		data.setCostUnitStatisInfo(costUnitStatisInfo);

		List<ResourceInstanceList> resourceInstanceDtoList = new ArrayList<ResourceInstanceList>();
		for (int i = 0; i < _ctx.lengthValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList.Length"); i++) {
			ResourceInstanceList resourceInstanceList = new ResourceInstanceList();
			resourceInstanceList.setResourceUserId(_ctx.longValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceUserId"));
			resourceInstanceList.setResourceId(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceId"));
			resourceInstanceList.setCommodityCode(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].CommodityCode"));
			resourceInstanceList.setResourceUserName(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceUserName"));
			resourceInstanceList.setCommodityName(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].CommodityName"));
			resourceInstanceList.setResourceGroup(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceGroup"));
			resourceInstanceList.setResourceTag(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceTag"));
			resourceInstanceList.setResourceNick(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceNick"));
			resourceInstanceList.setResourceType(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceType"));
			resourceInstanceList.setResourceStatus(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ResourceStatus"));
			resourceInstanceList.setRelatedResources(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].RelatedResources"));
			resourceInstanceList.setApportionCode(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ApportionCode"));
			resourceInstanceList.setApportionName(_ctx.stringValue("QueryCostUnitResourceResponse.Data.ResourceInstanceDtoList["+ i +"].ApportionName"));

			resourceInstanceDtoList.add(resourceInstanceList);
		}
		data.setResourceInstanceDtoList(resourceInstanceDtoList);
		queryCostUnitResourceResponse.setData(data);
	 
	 	return queryCostUnitResourceResponse;
	}
}