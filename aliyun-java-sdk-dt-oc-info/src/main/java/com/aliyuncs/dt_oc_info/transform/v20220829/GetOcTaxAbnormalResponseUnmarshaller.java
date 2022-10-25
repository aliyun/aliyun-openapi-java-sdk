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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcTaxAbnormalResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcTaxAbnormalResponseUnmarshaller {

	public static GetOcTaxAbnormalResponse unmarshall(GetOcTaxAbnormalResponse getOcTaxAbnormalResponse, UnmarshallerContext _ctx) {
		
		getOcTaxAbnormalResponse.setRequestId(_ctx.stringValue("GetOcTaxAbnormalResponse.RequestId"));
		getOcTaxAbnormalResponse.setCode(_ctx.stringValue("GetOcTaxAbnormalResponse.Code"));
		getOcTaxAbnormalResponse.setSuccess(_ctx.booleanValue("GetOcTaxAbnormalResponse.Success"));
		getOcTaxAbnormalResponse.setMessage(_ctx.stringValue("GetOcTaxAbnormalResponse.Message"));
		getOcTaxAbnormalResponse.setTotalNum(_ctx.integerValue("GetOcTaxAbnormalResponse.TotalNum"));
		getOcTaxAbnormalResponse.setPageIndex(_ctx.integerValue("GetOcTaxAbnormalResponse.PageIndex"));
		getOcTaxAbnormalResponse.setPageNum(_ctx.integerValue("GetOcTaxAbnormalResponse.PageNum"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcTaxAbnormalResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcTaxAbnormalResponse.Data["+ i +"]"));
		}
		getOcTaxAbnormalResponse.setData(data);
	 
	 	return getOcTaxAbnormalResponse;
	}
}