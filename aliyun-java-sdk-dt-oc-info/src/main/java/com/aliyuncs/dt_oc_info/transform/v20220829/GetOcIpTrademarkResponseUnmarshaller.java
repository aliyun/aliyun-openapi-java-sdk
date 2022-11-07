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

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIpTrademarkResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcIpTrademarkResponse.Data["+ i +"]"));
		}
		getOcIpTrademarkResponse.setData(data);
	 
	 	return getOcIpTrademarkResponse;
	}
}