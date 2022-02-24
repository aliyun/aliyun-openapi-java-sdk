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

package com.aliyuncs.dt_oc_info.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20200401.GetStockListResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStockListResponseUnmarshaller {

	public static GetStockListResponse unmarshall(GetStockListResponse getStockListResponse, UnmarshallerContext _ctx) {
		
		getStockListResponse.setRequestId(_ctx.stringValue("GetStockListResponse.RequestId"));
		getStockListResponse.setCode(_ctx.integerValue("GetStockListResponse.Code"));
		getStockListResponse.setMessage(_ctx.stringValue("GetStockListResponse.Message"));
		getStockListResponse.setTotal(_ctx.integerValue("GetStockListResponse.Total"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetStockListResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetStockListResponse.Data["+ i +"]"));
		}
		getStockListResponse.setData(data);
	 
	 	return getStockListResponse;
	}
}