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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeAuctionResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcJusticeAuctionResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcJusticeAuctionResponseUnmarshaller {

	public static GetOcJusticeAuctionResponse unmarshall(GetOcJusticeAuctionResponse getOcJusticeAuctionResponse, UnmarshallerContext _ctx) {
		
		getOcJusticeAuctionResponse.setRequestId(_ctx.stringValue("GetOcJusticeAuctionResponse.RequestId"));
		getOcJusticeAuctionResponse.setCode(_ctx.stringValue("GetOcJusticeAuctionResponse.Code"));
		getOcJusticeAuctionResponse.setSuccess(_ctx.booleanValue("GetOcJusticeAuctionResponse.Success"));
		getOcJusticeAuctionResponse.setMessage(_ctx.stringValue("GetOcJusticeAuctionResponse.Message"));
		getOcJusticeAuctionResponse.setTotalNum(_ctx.integerValue("GetOcJusticeAuctionResponse.TotalNum"));
		getOcJusticeAuctionResponse.setPageIndex(_ctx.integerValue("GetOcJusticeAuctionResponse.PageIndex"));
		getOcJusticeAuctionResponse.setPageNum(_ctx.integerValue("GetOcJusticeAuctionResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcJusticeAuctionResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].EntName"));
			dataItem.setAuctionName(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].AuctionName"));
			dataItem.setCourt(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].Court"));
			dataItem.setAuctionDate(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].AuctionDate"));
			dataItem.setStartPrice(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].StartPrice"));
			dataItem.setEstPrice(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].EstPrice"));
			dataItem.setOwner(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].Owner"));
			dataItem.setRestrict(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].Restrict"));
			dataItem.setCertificate(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].Certificate"));
			dataItem.setDocument(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].Document"));
			dataItem.setBasis(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].Basis"));
			dataItem.setDescription(_ctx.stringValue("GetOcJusticeAuctionResponse.Data["+ i +"].Description"));

			data.add(dataItem);
		}
		getOcJusticeAuctionResponse.setData(data);
	 
	 	return getOcJusticeAuctionResponse;
	}
}