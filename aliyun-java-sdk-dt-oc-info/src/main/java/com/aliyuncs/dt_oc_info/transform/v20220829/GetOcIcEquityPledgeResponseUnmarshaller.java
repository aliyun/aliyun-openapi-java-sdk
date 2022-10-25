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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcEquityPledgeResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcEquityPledgeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcEquityPledgeResponseUnmarshaller {

	public static GetOcIcEquityPledgeResponse unmarshall(GetOcIcEquityPledgeResponse getOcIcEquityPledgeResponse, UnmarshallerContext _ctx) {
		
		getOcIcEquityPledgeResponse.setRequestId(_ctx.stringValue("GetOcIcEquityPledgeResponse.RequestId"));
		getOcIcEquityPledgeResponse.setCode(_ctx.stringValue("GetOcIcEquityPledgeResponse.Code"));
		getOcIcEquityPledgeResponse.setSuccess(_ctx.booleanValue("GetOcIcEquityPledgeResponse.Success"));
		getOcIcEquityPledgeResponse.setMessage(_ctx.stringValue("GetOcIcEquityPledgeResponse.Message"));
		getOcIcEquityPledgeResponse.setTotalNum(_ctx.integerValue("GetOcIcEquityPledgeResponse.TotalNum"));
		getOcIcEquityPledgeResponse.setPageIndex(_ctx.integerValue("GetOcIcEquityPledgeResponse.PageIndex"));
		getOcIcEquityPledgeResponse.setPageNum(_ctx.integerValue("GetOcIcEquityPledgeResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcEquityPledgeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setNumber(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].Number"));
			dataItem.setPledgor(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].Pledgor"));
			dataItem.setRelatedComp(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].RelatedComp"));
			dataItem.setPawnee(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].Pawnee"));
			dataItem.setRegDate(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].RegDate"));
			dataItem.setStatus(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].Status"));
			dataItem.setPledgorAmount(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].PledgorAmount"));
			dataItem.setPawneeIdentifyNo(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].PawneeIdentifyNo"));
			dataItem.setPledgorIdentifyNo(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].PledgorIdentifyNo"));
			dataItem.setPublicDate(_ctx.stringValue("GetOcIcEquityPledgeResponse.Data["+ i +"].PublicDate"));

			data.add(dataItem);
		}
		getOcIcEquityPledgeResponse.setData(data);
	 
	 	return getOcIcEquityPledgeResponse;
	}
}