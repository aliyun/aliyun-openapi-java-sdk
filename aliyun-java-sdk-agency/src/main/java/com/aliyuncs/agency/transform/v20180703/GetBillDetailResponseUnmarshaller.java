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

package com.aliyuncs.agency.transform.v20180703;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180703.GetBillDetailResponse;
import com.aliyuncs.agency.model.v20180703.GetBillDetailResponse.Data;
import com.aliyuncs.agency.model.v20180703.GetBillDetailResponse.Data.RegionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBillDetailResponseUnmarshaller {

	public static GetBillDetailResponse unmarshall(GetBillDetailResponse getBillDetailResponse, UnmarshallerContext _ctx) {
		
		getBillDetailResponse.setCode(_ctx.stringValue("GetBillDetailResponse.Code"));
		getBillDetailResponse.setMessage(_ctx.stringValue("GetBillDetailResponse.Message"));
		getBillDetailResponse.setSuccess(_ctx.booleanValue("GetBillDetailResponse.Success"));

		Data data = new Data();
		data.setOffering(_ctx.stringValue("GetBillDetailResponse.Data.Offering"));
		data.setBillId(_ctx.stringValue("GetBillDetailResponse.Data.BillId"));
		data.setPayStatus(_ctx.stringValue("GetBillDetailResponse.Data.PayStatus"));
		data.setBillStartTime(_ctx.stringValue("GetBillDetailResponse.Data.BillStartTime"));
		data.setProductCode(_ctx.stringValue("GetBillDetailResponse.Data.ProductCode"));
		data.setBillEndTime(_ctx.stringValue("GetBillDetailResponse.Data.BillEndTime"));
		data.setPeriod(_ctx.stringValue("GetBillDetailResponse.Data.Period"));

		List<RegionInfo> regionInfoList = new ArrayList<RegionInfo>();
		for (int i = 0; i < _ctx.lengthValue("GetBillDetailResponse.Data.RegionInfoList.Length"); i++) {
			RegionInfo regionInfo = new RegionInfo();
			regionInfo.setTotalFee(_ctx.stringValue("GetBillDetailResponse.Data.RegionInfoList["+ i +"].TotalFee"));
			regionInfo.setRegionCode(_ctx.stringValue("GetBillDetailResponse.Data.RegionInfoList["+ i +"].RegionCode"));
			regionInfo.setYouhuiquanPayAmount(_ctx.stringValue("GetBillDetailResponse.Data.RegionInfoList["+ i +"].YouhuiquanPayAmount"));
			regionInfo.setDiscountFee(_ctx.stringValue("GetBillDetailResponse.Data.RegionInfoList["+ i +"].DiscountFee"));
			regionInfo.setRequirePayAmount(_ctx.stringValue("GetBillDetailResponse.Data.RegionInfoList["+ i +"].RequirePayAmount"));

			regionInfoList.add(regionInfo);
		}
		data.setRegionInfoList(regionInfoList);
		getBillDetailResponse.setData(data);
	 
	 	return getBillDetailResponse;
	}
}