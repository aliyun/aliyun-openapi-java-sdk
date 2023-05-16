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

import com.aliyuncs.agency.model.v20180703.GetDailyBillListResponse;
import com.aliyuncs.agency.model.v20180703.GetDailyBillListResponse.BigBillJson;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDailyBillListResponseUnmarshaller {

	public static GetDailyBillListResponse unmarshall(GetDailyBillListResponse getDailyBillListResponse, UnmarshallerContext _ctx) {
		
		getDailyBillListResponse.setCode(_ctx.stringValue("GetDailyBillListResponse.Code"));
		getDailyBillListResponse.setMessage(_ctx.stringValue("GetDailyBillListResponse.Message"));
		getDailyBillListResponse.setSuccess(_ctx.booleanValue("GetDailyBillListResponse.Success"));

		BigBillJson bigBillJson = new BigBillJson();
		bigBillJson.setUserType(_ctx.stringValue("GetDailyBillListResponse.BigBillJson.UserType"));
		bigBillJson.setProductType(_ctx.stringValue("GetDailyBillListResponse.BigBillJson.ProductType"));
		bigBillJson.setBillType(_ctx.stringValue("GetDailyBillListResponse.BigBillJson.BillType"));
		bigBillJson.setBillLinkCSV(_ctx.stringValue("GetDailyBillListResponse.BigBillJson.BillLinkCSV"));
		bigBillJson.setBillTime(_ctx.stringValue("GetDailyBillListResponse.BigBillJson.BillTime"));
		bigBillJson.setBillLinkXLSX(_ctx.stringValue("GetDailyBillListResponse.BigBillJson.BillLinkXLSX"));
		getDailyBillListResponse.setBigBillJson(bigBillJson);
	 
	 	return getDailyBillListResponse;
	}
}