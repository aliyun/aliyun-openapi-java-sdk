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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcOperationBiddingResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcOperationBiddingResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcOperationBiddingResponseUnmarshaller {

	public static GetOcOperationBiddingResponse unmarshall(GetOcOperationBiddingResponse getOcOperationBiddingResponse, UnmarshallerContext _ctx) {
		
		getOcOperationBiddingResponse.setRequestId(_ctx.stringValue("GetOcOperationBiddingResponse.RequestId"));
		getOcOperationBiddingResponse.setCode(_ctx.stringValue("GetOcOperationBiddingResponse.Code"));
		getOcOperationBiddingResponse.setSuccess(_ctx.booleanValue("GetOcOperationBiddingResponse.Success"));
		getOcOperationBiddingResponse.setMessage(_ctx.stringValue("GetOcOperationBiddingResponse.Message"));
		getOcOperationBiddingResponse.setTotalNum(_ctx.integerValue("GetOcOperationBiddingResponse.TotalNum"));
		getOcOperationBiddingResponse.setPageIndex(_ctx.integerValue("GetOcOperationBiddingResponse.PageIndex"));
		getOcOperationBiddingResponse.setPageNum(_ctx.integerValue("GetOcOperationBiddingResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcOperationBiddingResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].EntName"));
			dataItem.setBidTitle(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].BidTitle"));
			dataItem.setBidType(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].BidType"));
			dataItem.setRegionName(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].RegionName"));
			dataItem.setBidIndustry(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].BidIndustry"));
			dataItem.setPublicDate(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].PublicDate"));
			dataItem.setProjectNum(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].ProjectNum"));
			dataItem.setProjectName(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].ProjectName"));
			dataItem.setProjectAmount(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].ProjectAmount"));
			dataItem.setTenderEntName(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].TenderEntName"));
			dataItem.setAgentEntName(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].AgentEntName"));
			dataItem.setWinnerEntName(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].WinnerEntName"));
			dataItem.setContent(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].Content"));
			dataItem.setInfoType(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].InfoType"));
			dataItem.setSubType(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].SubType"));
			dataItem.setOpeningTime(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"].OpeningTime"));

			data.add(dataItem);
		}
		getOcOperationBiddingResponse.setData(data);
	 
	 	return getOcOperationBiddingResponse;
	}
}