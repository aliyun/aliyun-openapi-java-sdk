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

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcOperationBiddingResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcOperationBiddingResponse.Data["+ i +"]"));
		}
		getOcOperationBiddingResponse.setData(data);
	 
	 	return getOcOperationBiddingResponse;
	}
}