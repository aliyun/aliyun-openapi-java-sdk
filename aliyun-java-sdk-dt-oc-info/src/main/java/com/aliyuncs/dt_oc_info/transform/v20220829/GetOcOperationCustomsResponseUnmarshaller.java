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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcOperationCustomsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcOperationCustomsResponseUnmarshaller {

	public static GetOcOperationCustomsResponse unmarshall(GetOcOperationCustomsResponse getOcOperationCustomsResponse, UnmarshallerContext _ctx) {
		
		getOcOperationCustomsResponse.setRequestId(_ctx.stringValue("GetOcOperationCustomsResponse.RequestId"));
		getOcOperationCustomsResponse.setCode(_ctx.stringValue("GetOcOperationCustomsResponse.Code"));
		getOcOperationCustomsResponse.setSuccess(_ctx.booleanValue("GetOcOperationCustomsResponse.Success"));
		getOcOperationCustomsResponse.setMessage(_ctx.stringValue("GetOcOperationCustomsResponse.Message"));
		getOcOperationCustomsResponse.setTotalNum(_ctx.integerValue("GetOcOperationCustomsResponse.TotalNum"));
		getOcOperationCustomsResponse.setPageIndex(_ctx.integerValue("GetOcOperationCustomsResponse.PageIndex"));
		getOcOperationCustomsResponse.setPageNum(_ctx.integerValue("GetOcOperationCustomsResponse.PageNum"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcOperationCustomsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcOperationCustomsResponse.Data["+ i +"]"));
		}
		getOcOperationCustomsResponse.setData(data);
	 
	 	return getOcOperationCustomsResponse;
	}
}