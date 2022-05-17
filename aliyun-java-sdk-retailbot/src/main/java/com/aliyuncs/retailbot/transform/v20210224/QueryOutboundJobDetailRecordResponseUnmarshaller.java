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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.QueryOutboundJobDetailRecordResponse;
import com.aliyuncs.retailbot.model.v20210224.QueryOutboundJobDetailRecordResponse.DataItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryOutboundJobDetailRecordResponseUnmarshaller {

	public static QueryOutboundJobDetailRecordResponse unmarshall(QueryOutboundJobDetailRecordResponse queryOutboundJobDetailRecordResponse, UnmarshallerContext _ctx) {
		
		queryOutboundJobDetailRecordResponse.setCode(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Code"));
		queryOutboundJobDetailRecordResponse.setMessage(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Message"));
		queryOutboundJobDetailRecordResponse.setCurrentPage(_ctx.integerValue("QueryOutboundJobDetailRecordResponse.CurrentPage"));
		queryOutboundJobDetailRecordResponse.setTotalItems(_ctx.integerValue("QueryOutboundJobDetailRecordResponse.TotalItems"));
		queryOutboundJobDetailRecordResponse.setExtData(_ctx.mapValue("QueryOutboundJobDetailRecordResponse.ExtData"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryOutboundJobDetailRecordResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].Id"));
			dataItem.setGmtCreate(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].GmtModified"));
			dataItem.setTenantId(_ctx.longValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].TenantId"));
			dataItem.setBizId(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].BizId"));
			dataItem.setBizType(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].BizType"));
			dataItem.setBatchNo(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].BatchNo"));
			dataItem.setMobileNo(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].MobileNo"));
			dataItem.setBuyerId(_ctx.longValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].BuyerId"));
			dataItem.setStatus(_ctx.integerValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].Status"));
			dataItem.setDuration(_ctx.integerValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].Duration"));
			dataItem.setCallTime(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].CallTime"));
			dataItem.setDataType(_ctx.integerValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].DataType"));
			dataItem.setBizOrderId(_ctx.longValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].BizOrderId"));
			dataItem.setSubBizOrder(_ctx.longValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].SubBizOrder"));
			dataItem.setStoreName(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].StoreName"));
			dataItem.setProductName(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].ProductName"));
			dataItem.setJobId(_ctx.longValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].JobId"));
			dataItem.setYunTaskId(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].YunTaskId"));
			dataItem.setReserve1(_ctx.integerValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].Reserve1"));
			dataItem.setReserve2(_ctx.longValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].Reserve2"));
			dataItem.setReferenceId(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].ReferenceId"));
			dataItem.setReserve4(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].Reserve4"));
			dataItem.setPlayComplete(_ctx.integerValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].PlayComplete"));
			dataItem.setExtraParams(_ctx.stringValue("QueryOutboundJobDetailRecordResponse.Data["+ i +"].ExtraParams"));

			data.add(dataItem);
		}
		queryOutboundJobDetailRecordResponse.setData(data);
	 
	 	return queryOutboundJobDetailRecordResponse;
	}
}