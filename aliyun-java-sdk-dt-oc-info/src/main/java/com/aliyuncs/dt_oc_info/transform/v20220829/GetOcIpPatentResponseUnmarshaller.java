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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIpPatentResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIpPatentResponseUnmarshaller {

	public static GetOcIpPatentResponse unmarshall(GetOcIpPatentResponse getOcIpPatentResponse, UnmarshallerContext _ctx) {
		
		getOcIpPatentResponse.setRequestId(_ctx.stringValue("GetOcIpPatentResponse.RequestId"));
		getOcIpPatentResponse.setCode(_ctx.stringValue("GetOcIpPatentResponse.Code"));
		getOcIpPatentResponse.setSuccess(_ctx.booleanValue("GetOcIpPatentResponse.Success"));
		getOcIpPatentResponse.setMessage(_ctx.stringValue("GetOcIpPatentResponse.Message"));
		getOcIpPatentResponse.setTotalNum(_ctx.integerValue("GetOcIpPatentResponse.TotalNum"));
		getOcIpPatentResponse.setPageIndex(_ctx.integerValue("GetOcIpPatentResponse.PageIndex"));
		getOcIpPatentResponse.setPageNum(_ctx.integerValue("GetOcIpPatentResponse.PageNum"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIpPatentResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcIpPatentResponse.Data["+ i +"]"));
		}
		getOcIpPatentResponse.setData(data);
	 
	 	return getOcIpPatentResponse;
	}
}