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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxGeneralTaxpayerResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcTaxGeneralTaxpayerResponseUnmarshaller {

	public static GetOcTaxGeneralTaxpayerResponse unmarshall(GetOcTaxGeneralTaxpayerResponse getOcTaxGeneralTaxpayerResponse, UnmarshallerContext _ctx) {
		
		getOcTaxGeneralTaxpayerResponse.setRequestId(_ctx.stringValue("GetOcTaxGeneralTaxpayerResponse.RequestId"));
		getOcTaxGeneralTaxpayerResponse.setCode(_ctx.stringValue("GetOcTaxGeneralTaxpayerResponse.Code"));
		getOcTaxGeneralTaxpayerResponse.setSuccess(_ctx.booleanValue("GetOcTaxGeneralTaxpayerResponse.Success"));
		getOcTaxGeneralTaxpayerResponse.setMessage(_ctx.stringValue("GetOcTaxGeneralTaxpayerResponse.Message"));
		getOcTaxGeneralTaxpayerResponse.setTotalNum(_ctx.integerValue("GetOcTaxGeneralTaxpayerResponse.TotalNum"));
		getOcTaxGeneralTaxpayerResponse.setPageIndex(_ctx.integerValue("GetOcTaxGeneralTaxpayerResponse.PageIndex"));
		getOcTaxGeneralTaxpayerResponse.setPageNum(_ctx.integerValue("GetOcTaxGeneralTaxpayerResponse.PageNum"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcTaxGeneralTaxpayerResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcTaxGeneralTaxpayerResponse.Data["+ i +"]"));
		}
		getOcTaxGeneralTaxpayerResponse.setData(data);
	 
	 	return getOcTaxGeneralTaxpayerResponse;
	}
}