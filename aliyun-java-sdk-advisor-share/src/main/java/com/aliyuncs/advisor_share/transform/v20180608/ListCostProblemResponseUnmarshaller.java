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

import com.aliyuncs.advisor_share.model.v20180608.ListCostProblemResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListCostProblemResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListCostProblemResponse.Data.ResultData;
import com.aliyuncs.advisor_share.model.v20180608.ListCostProblemResponse.Data.ResultData.DataListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCostProblemResponseUnmarshaller {

	public static ListCostProblemResponse unmarshall(ListCostProblemResponse listCostProblemResponse, UnmarshallerContext _ctx) {
		
		listCostProblemResponse.setSuccess(_ctx.booleanValue("ListCostProblemResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.longValue("ListCostProblemResponse.Data.PageNumber"));
		data.setPageSize(_ctx.longValue("ListCostProblemResponse.Data.PageSize"));
		data.setTotal(_ctx.longValue("ListCostProblemResponse.Data.Total"));

		ResultData resultData = new ResultData();
		resultData.setTotalCostSavings(_ctx.doubleValue("ListCostProblemResponse.Data.ResultData.TotalCostSavings"));
		resultData.setTotalOptimizeNum(_ctx.longValue("ListCostProblemResponse.Data.ResultData.TotalOptimizeNum"));
		resultData.setInspectDate(_ctx.stringValue("ListCostProblemResponse.Data.ResultData.InspectDate"));
		resultData.setTaskId(_ctx.longValue("ListCostProblemResponse.Data.ResultData.TaskId"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCostProblemResponse.Data.ResultData.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setAppNum(_ctx.longValue("ListCostProblemResponse.Data.ResultData.DataList["+ i +"].AppNum"));
			dataListItem.setCostSavings(_ctx.doubleValue("ListCostProblemResponse.Data.ResultData.DataList["+ i +"].CostSavings"));
			dataListItem.setInstanceNum(_ctx.longValue("ListCostProblemResponse.Data.ResultData.DataList["+ i +"].InstanceNum"));
			dataListItem.setOptimizeNum(_ctx.longValue("ListCostProblemResponse.Data.ResultData.DataList["+ i +"].OptimizeNum"));
			dataListItem.setProductNum(_ctx.longValue("ListCostProblemResponse.Data.ResultData.DataList["+ i +"].ProductNum"));
			dataListItem.setQueryGroupId(_ctx.stringValue("ListCostProblemResponse.Data.ResultData.DataList["+ i +"].QueryGroupId"));
			dataListItem.setQueryGroupName(_ctx.stringValue("ListCostProblemResponse.Data.ResultData.DataList["+ i +"].QueryGroupName"));

			dataList.add(dataListItem);
		}
		resultData.setDataList(dataList);
		data.setResultData(resultData);
		listCostProblemResponse.setData(data);
	 
	 	return listCostProblemResponse;
	}
}