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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpTrademarkResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpTrademarkResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIpTrademarkResponseUnmarshaller {

	public static GetOcIpTrademarkResponse unmarshall(GetOcIpTrademarkResponse getOcIpTrademarkResponse, UnmarshallerContext _ctx) {
		
		getOcIpTrademarkResponse.setRequestId(_ctx.stringValue("GetOcIpTrademarkResponse.RequestId"));
		getOcIpTrademarkResponse.setCode(_ctx.stringValue("GetOcIpTrademarkResponse.Code"));
		getOcIpTrademarkResponse.setSuccess(_ctx.booleanValue("GetOcIpTrademarkResponse.Success"));
		getOcIpTrademarkResponse.setMessage(_ctx.stringValue("GetOcIpTrademarkResponse.Message"));
		getOcIpTrademarkResponse.setTotalNum(_ctx.integerValue("GetOcIpTrademarkResponse.TotalNum"));
		getOcIpTrademarkResponse.setPageIndex(_ctx.integerValue("GetOcIpTrademarkResponse.PageIndex"));
		getOcIpTrademarkResponse.setPageNum(_ctx.integerValue("GetOcIpTrademarkResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIpTrademarkResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].EntName"));
			dataItem.setTrademarkName(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].TrademarkName"));
			dataItem.setRegNum(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].RegNum"));
			dataItem.setTrademarkType(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].TrademarkType"));
			dataItem.setTrademarkForm(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].TrademarkForm"));
			dataItem.setTrademarkStatus(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].TrademarkStatus"));
			dataItem.setApplyDate(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].ApplyDate"));
			dataItem.setImageUrl(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].ImageUrl"));
			dataItem.setTypeName(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].TypeName"));
			dataItem.setPeriod(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].Period"));
			dataItem.setAgent(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].Agent"));
			dataItem.setRegPubNo(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].RegPubNo"));
			dataItem.setRegPubDate(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].RegPubDate"));
			dataItem.setFirstPubNo(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].FirstPubNo"));
			dataItem.setFirstPubDate(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"].FirstPubDate"));

			data.add(dataItem);
		}
		getOcIpTrademarkResponse.setData(data);
	 
	 	return getOcIpTrademarkResponse;
	}
}