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

package com.aliyuncs.marketing_event.transform.v20210101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.marketing_event.model.v20210101.QueryAllActivityInfoResponse;
import com.aliyuncs.marketing_event.model.v20210101.QueryAllActivityInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryAllActivityInfoResponseUnmarshaller {

	public static QueryAllActivityInfoResponse unmarshall(QueryAllActivityInfoResponse queryAllActivityInfoResponse, UnmarshallerContext _ctx) {
		
		queryAllActivityInfoResponse.setRequestId(_ctx.stringValue("QueryAllActivityInfoResponse.RequestId"));
		queryAllActivityInfoResponse.setCode(_ctx.stringValue("QueryAllActivityInfoResponse.Code"));
		queryAllActivityInfoResponse.setSuccess(_ctx.booleanValue("QueryAllActivityInfoResponse.Success"));
		queryAllActivityInfoResponse.setMessage(_ctx.stringValue("QueryAllActivityInfoResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryAllActivityInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("QueryAllActivityInfoResponse.Data["+ i +"].Id"));
			dataItem.setActivityId(_ctx.longValue("QueryAllActivityInfoResponse.Data["+ i +"].ActivityId"));
			dataItem.setCustomerName(_ctx.stringValue("QueryAllActivityInfoResponse.Data["+ i +"].CustomerName"));
			dataItem.setMobile(_ctx.stringValue("QueryAllActivityInfoResponse.Data["+ i +"].Mobile"));
			dataItem.setCompanyName(_ctx.stringValue("QueryAllActivityInfoResponse.Data["+ i +"].CompanyName"));
			dataItem.setQRCode(_ctx.stringValue("QueryAllActivityInfoResponse.Data["+ i +"].QRCode"));
			dataItem.setChannelName(_ctx.stringValue("QueryAllActivityInfoResponse.Data["+ i +"].ChannelName"));
			dataItem.setIsVipCustomer(_ctx.stringValue("QueryAllActivityInfoResponse.Data["+ i +"].IsVipCustomer"));
			dataItem.setReportFields(_ctx.stringValue("QueryAllActivityInfoResponse.Data["+ i +"].ReportFields"));
			dataItem.setEmail(_ctx.stringValue("QueryAllActivityInfoResponse.Data["+ i +"].Email"));

			data.add(dataItem);
		}
		queryAllActivityInfoResponse.setData(data);
	 
	 	return queryAllActivityInfoResponse;
	}
}