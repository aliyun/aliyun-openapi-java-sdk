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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.ListCostDetailsResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListCostDetailsResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListCostDetailsResponse.Data.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCostDetailsResponseUnmarshaller {

	public static ListCostDetailsResponse unmarshall(ListCostDetailsResponse listCostDetailsResponse, UnmarshallerContext _ctx) {
		
		listCostDetailsResponse.setSuccess(_ctx.booleanValue("ListCostDetailsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListCostDetailsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListCostDetailsResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListCostDetailsResponse.Data.Total"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCostDetailsResponse.Data.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setAppName(_ctx.stringValue("ListCostDetailsResponse.Data.DataList["+ i +"].AppName"));
			dataListItem.setChargeType(_ctx.stringValue("ListCostDetailsResponse.Data.DataList["+ i +"].ChargeType"));
			dataListItem.setCostAfter(_ctx.doubleValue("ListCostDetailsResponse.Data.DataList["+ i +"].CostAfter"));
			dataListItem.setCostBefore(_ctx.doubleValue("ListCostDetailsResponse.Data.DataList["+ i +"].CostBefore"));
			dataListItem.setCostSavings(_ctx.doubleValue("ListCostDetailsResponse.Data.DataList["+ i +"].CostSavings"));
			dataListItem.setDepartmentName(_ctx.stringValue("ListCostDetailsResponse.Data.DataList["+ i +"].DepartmentName"));
			dataListItem.setInstanceId(_ctx.stringValue("ListCostDetailsResponse.Data.DataList["+ i +"].InstanceId"));
			dataListItem.setInstanceName(_ctx.stringValue("ListCostDetailsResponse.Data.DataList["+ i +"].InstanceName"));
			dataListItem.setProductCode(_ctx.stringValue("ListCostDetailsResponse.Data.DataList["+ i +"].ProductCode"));
			dataListItem.setInstanceClass(_ctx.stringValue("ListCostDetailsResponse.Data.DataList["+ i +"].InstanceClass"));

			dataList.add(dataListItem);
		}
		data.setDataList(dataList);
		listCostDetailsResponse.setData(data);
	 
	 	return listCostDetailsResponse;
	}
}