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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcFuzzSearchResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcFuzzSearchResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcFuzzSearchResponseUnmarshaller {

	public static GetOcFuzzSearchResponse unmarshall(GetOcFuzzSearchResponse getOcFuzzSearchResponse, UnmarshallerContext _ctx) {
		
		getOcFuzzSearchResponse.setRequestId(_ctx.stringValue("GetOcFuzzSearchResponse.RequestId"));
		getOcFuzzSearchResponse.setCode(_ctx.stringValue("GetOcFuzzSearchResponse.Code"));
		getOcFuzzSearchResponse.setSuccess(_ctx.booleanValue("GetOcFuzzSearchResponse.Success"));
		getOcFuzzSearchResponse.setMessage(_ctx.stringValue("GetOcFuzzSearchResponse.Message"));
		getOcFuzzSearchResponse.setTotalNum(_ctx.integerValue("GetOcFuzzSearchResponse.TotalNum"));
		getOcFuzzSearchResponse.setPageIndex(_ctx.integerValue("GetOcFuzzSearchResponse.PageIndex"));
		getOcFuzzSearchResponse.setPageNum(_ctx.integerValue("GetOcFuzzSearchResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcFuzzSearchResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEntName(_ctx.stringValue("GetOcFuzzSearchResponse.Data["+ i +"].EntName"));

			data.add(dataItem);
		}
		getOcFuzzSearchResponse.setData(data);
	 
	 	return getOcFuzzSearchResponse;
	}
}