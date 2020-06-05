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

import com.aliyuncs.bssopenapi.model.v20171214.QueryRIUtilizationDetailResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryRIUtilizationDetailResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryRIUtilizationDetailResponse.Data.DetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryRIUtilizationDetailResponseUnmarshaller {

	public static QueryRIUtilizationDetailResponse unmarshall(QueryRIUtilizationDetailResponse queryRIUtilizationDetailResponse, UnmarshallerContext _ctx) {
		
		queryRIUtilizationDetailResponse.setRequestId(_ctx.stringValue("QueryRIUtilizationDetailResponse.RequestId"));
		queryRIUtilizationDetailResponse.setSuccess(_ctx.booleanValue("QueryRIUtilizationDetailResponse.Success"));
		queryRIUtilizationDetailResponse.setCode(_ctx.stringValue("QueryRIUtilizationDetailResponse.Code"));
		queryRIUtilizationDetailResponse.setMessage(_ctx.stringValue("QueryRIUtilizationDetailResponse.Message"));

		Data data = new Data();
		data.setPageNum(_ctx.longValue("QueryRIUtilizationDetailResponse.Data.PageNum"));
		data.setPageSize(_ctx.longValue("QueryRIUtilizationDetailResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("QueryRIUtilizationDetailResponse.Data.TotalCount"));

		List<DetailListItem> detailList = new ArrayList<DetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryRIUtilizationDetailResponse.Data.DetailList.Length"); i++) {
			DetailListItem detailListItem = new DetailListItem();
			detailListItem.setRIInstanceId(_ctx.stringValue("QueryRIUtilizationDetailResponse.Data.DetailList["+ i +"].RIInstanceId"));
			detailListItem.setInstanceSpec(_ctx.stringValue("QueryRIUtilizationDetailResponse.Data.DetailList["+ i +"].InstanceSpec"));
			detailListItem.setDeductedInstanceId(_ctx.stringValue("QueryRIUtilizationDetailResponse.Data.DetailList["+ i +"].DeductedInstanceId"));
			detailListItem.setDeductedCommodityCode(_ctx.stringValue("QueryRIUtilizationDetailResponse.Data.DetailList["+ i +"].DeductedCommodityCode"));
			detailListItem.setDeductDate(_ctx.stringValue("QueryRIUtilizationDetailResponse.Data.DetailList["+ i +"].DeductDate"));
			detailListItem.setDeductHours(_ctx.stringValue("QueryRIUtilizationDetailResponse.Data.DetailList["+ i +"].DeductHours"));
			detailListItem.setDeductedProductDetail(_ctx.stringValue("QueryRIUtilizationDetailResponse.Data.DetailList["+ i +"].DeductedProductDetail"));
			detailListItem.setDeductQuantity(_ctx.floatValue("QueryRIUtilizationDetailResponse.Data.DetailList["+ i +"].DeductQuantity"));
			detailListItem.setDeductFactorTotal(_ctx.floatValue("QueryRIUtilizationDetailResponse.Data.DetailList["+ i +"].DeductFactorTotal"));

			detailList.add(detailListItem);
		}
		data.setDetailList(detailList);
		queryRIUtilizationDetailResponse.setData(data);
	 
	 	return queryRIUtilizationDetailResponse;
	}
}