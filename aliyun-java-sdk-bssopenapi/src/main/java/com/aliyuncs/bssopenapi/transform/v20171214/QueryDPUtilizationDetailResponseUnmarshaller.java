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

import com.aliyuncs.bssopenapi.model.v20171214.QueryDPUtilizationDetailResponse;
import com.aliyuncs.bssopenapi.model.v20171214.QueryDPUtilizationDetailResponse.Data;
import com.aliyuncs.bssopenapi.model.v20171214.QueryDPUtilizationDetailResponse.Data.DetailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryDPUtilizationDetailResponseUnmarshaller {

	public static QueryDPUtilizationDetailResponse unmarshall(QueryDPUtilizationDetailResponse queryDPUtilizationDetailResponse, UnmarshallerContext _ctx) {
		
		queryDPUtilizationDetailResponse.setRequestId(_ctx.stringValue("QueryDPUtilizationDetailResponse.RequestId"));
		queryDPUtilizationDetailResponse.setCode(_ctx.stringValue("QueryDPUtilizationDetailResponse.Code"));
		queryDPUtilizationDetailResponse.setMessage(_ctx.stringValue("QueryDPUtilizationDetailResponse.Message"));
		queryDPUtilizationDetailResponse.setSuccess(_ctx.booleanValue("QueryDPUtilizationDetailResponse.Success"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("QueryDPUtilizationDetailResponse.Data.NextToken"));

		List<DetailListItem> detailList = new ArrayList<DetailListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryDPUtilizationDetailResponse.Data.DetailList.Length"); i++) {
			DetailListItem detailListItem = new DetailListItem();
			detailListItem.setDeductedInstanceId(_ctx.stringValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].DeductedInstanceId"));
			detailListItem.setInstanceId(_ctx.stringValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].InstanceId"));
			detailListItem.setDeductHours(_ctx.floatValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].DeductHours"));
			detailListItem.setShareUid(_ctx.longValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].ShareUid"));
			detailListItem.setDeductDate(_ctx.stringValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].DeductDate"));
			detailListItem.setInstanceSpec(_ctx.stringValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].InstanceSpec"));
			detailListItem.setDeductedCommodityCode(_ctx.stringValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].DeductedCommodityCode"));
			detailListItem.setDeductedProductDetail(_ctx.stringValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].DeductedProductDetail"));
			detailListItem.setDeductMeasure(_ctx.floatValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].DeductMeasure"));
			detailListItem.setRegion(_ctx.stringValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].Region"));
			detailListItem.setDeductQuantity(_ctx.floatValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].DeductQuantity"));
			detailListItem.setDeductFactorTotal(_ctx.floatValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].DeductFactorTotal"));
			detailListItem.setResCode(_ctx.stringValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].ResCode"));
			detailListItem.setUid(_ctx.longValue("QueryDPUtilizationDetailResponse.Data.DetailList["+ i +"].Uid"));

			detailList.add(detailListItem);
		}
		data.setDetailList(detailList);
		queryDPUtilizationDetailResponse.setData(data);
	 
	 	return queryDPUtilizationDetailResponse;
	}
}