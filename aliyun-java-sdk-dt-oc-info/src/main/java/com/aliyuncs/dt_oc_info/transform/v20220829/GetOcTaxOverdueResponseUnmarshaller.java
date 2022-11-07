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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxOverdueResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcTaxOverdueResponseUnmarshaller {

	public static GetOcTaxOverdueResponse unmarshall(GetOcTaxOverdueResponse getOcTaxOverdueResponse, UnmarshallerContext _ctx) {
		
		getOcTaxOverdueResponse.setRequestId(_ctx.stringValue("GetOcTaxOverdueResponse.RequestId"));
		getOcTaxOverdueResponse.setCode(_ctx.stringValue("GetOcTaxOverdueResponse.Code"));
		getOcTaxOverdueResponse.setSuccess(_ctx.booleanValue("GetOcTaxOverdueResponse.Success"));
		getOcTaxOverdueResponse.setMessage(_ctx.stringValue("GetOcTaxOverdueResponse.Message"));
		getOcTaxOverdueResponse.setTotalNum(_ctx.integerValue("GetOcTaxOverdueResponse.TotalNum"));
		getOcTaxOverdueResponse.setPageIndex(_ctx.integerValue("GetOcTaxOverdueResponse.PageIndex"));
		getOcTaxOverdueResponse.setPageNum(_ctx.integerValue("GetOcTaxOverdueResponse.PageNum"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcTaxOverdueResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcTaxOverdueResponse.Data["+ i +"]"));
		}
		getOcTaxOverdueResponse.setData(data);
	 
	 	return getOcTaxOverdueResponse;
	}
}