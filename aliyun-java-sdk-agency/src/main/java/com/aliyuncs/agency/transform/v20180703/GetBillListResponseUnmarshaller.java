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

import com.aliyuncs.agency.model.v20180703.GetBillListResponse;
import com.aliyuncs.agency.model.v20180703.GetBillListResponse.PageInfo;
import com.aliyuncs.agency.model.v20180703.GetBillListResponse.PopBillJson;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBillListResponseUnmarshaller {

	public static GetBillListResponse unmarshall(GetBillListResponse getBillListResponse, UnmarshallerContext _ctx) {
		
		getBillListResponse.setCode(_ctx.stringValue("GetBillListResponse.Code"));
		getBillListResponse.setMessage(_ctx.stringValue("GetBillListResponse.Message"));
		getBillListResponse.setSuccess(_ctx.booleanValue("GetBillListResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("GetBillListResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetBillListResponse.PageInfo.Total"));
		pageInfo.setPage(_ctx.integerValue("GetBillListResponse.PageInfo.Page"));
		getBillListResponse.setPageInfo(pageInfo);

		List<PopBillJson> data = new ArrayList<PopBillJson>();
		for (int i = 0; i < _ctx.lengthValue("GetBillListResponse.Data.Length"); i++) {
			PopBillJson popBillJson = new PopBillJson();
			popBillJson.setBillId(_ctx.longValue("GetBillListResponse.Data["+ i +"].BillId"));
			popBillJson.setProductName(_ctx.stringValue("GetBillListResponse.Data["+ i +"].ProductName"));
			popBillJson.setPayStatus(_ctx.longValue("GetBillListResponse.Data["+ i +"].PayStatus"));
			popBillJson.setPostpayBillDetail(_ctx.stringValue("GetBillListResponse.Data["+ i +"].PostpayBillDetail"));
			popBillJson.setRamUid(_ctx.longValue("GetBillListResponse.Data["+ i +"].RamUid"));
			popBillJson.setGmtPay(_ctx.stringValue("GetBillListResponse.Data["+ i +"].GmtPay"));
			popBillJson.setCloudAccount(_ctx.stringValue("GetBillListResponse.Data["+ i +"].CloudAccount"));
			popBillJson.setFee(_ctx.stringValue("GetBillListResponse.Data["+ i +"].Fee"));

			data.add(popBillJson);
		}
		getBillListResponse.setData(data);
	 
	 	return getBillListResponse;
	}
}