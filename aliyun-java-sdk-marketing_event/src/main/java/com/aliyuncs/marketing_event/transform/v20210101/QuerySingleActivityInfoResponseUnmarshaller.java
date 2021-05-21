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

import com.aliyuncs.marketing_event.model.v20210101.QuerySingleActivityInfoResponse;
import com.aliyuncs.marketing_event.model.v20210101.QuerySingleActivityInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySingleActivityInfoResponseUnmarshaller {

	public static QuerySingleActivityInfoResponse unmarshall(QuerySingleActivityInfoResponse querySingleActivityInfoResponse, UnmarshallerContext _ctx) {
		
		querySingleActivityInfoResponse.setRequestId(_ctx.stringValue("QuerySingleActivityInfoResponse.RequestId"));
		querySingleActivityInfoResponse.setCode(_ctx.stringValue("QuerySingleActivityInfoResponse.Code"));
		querySingleActivityInfoResponse.setSuccess(_ctx.booleanValue("QuerySingleActivityInfoResponse.Success"));
		querySingleActivityInfoResponse.setMessage(_ctx.stringValue("QuerySingleActivityInfoResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QuerySingleActivityInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("QuerySingleActivityInfoResponse.Data["+ i +"].Id"));
			dataItem.setActivityId(_ctx.longValue("QuerySingleActivityInfoResponse.Data["+ i +"].ActivityId"));
			dataItem.setCustomerName(_ctx.stringValue("QuerySingleActivityInfoResponse.Data["+ i +"].CustomerName"));
			dataItem.setMobile(_ctx.stringValue("QuerySingleActivityInfoResponse.Data["+ i +"].Mobile"));
			dataItem.setCompanyName(_ctx.stringValue("QuerySingleActivityInfoResponse.Data["+ i +"].CompanyName"));
			dataItem.setQRCode(_ctx.stringValue("QuerySingleActivityInfoResponse.Data["+ i +"].QRCode"));
			dataItem.setChannelName(_ctx.stringValue("QuerySingleActivityInfoResponse.Data["+ i +"].ChannelName"));
			dataItem.setIsVipCustomer(_ctx.stringValue("QuerySingleActivityInfoResponse.Data["+ i +"].IsVipCustomer"));
			dataItem.setReportFields(_ctx.stringValue("QuerySingleActivityInfoResponse.Data["+ i +"].ReportFields"));
			dataItem.setEmail(_ctx.stringValue("QuerySingleActivityInfoResponse.Data["+ i +"].Email"));

			data.add(dataItem);
		}
		querySingleActivityInfoResponse.setData(data);
	 
	 	return querySingleActivityInfoResponse;
	}
}