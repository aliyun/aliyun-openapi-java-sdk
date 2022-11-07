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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcCoreTeamsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcCoreTeamsResponseUnmarshaller {

	public static GetOcCoreTeamsResponse unmarshall(GetOcCoreTeamsResponse getOcCoreTeamsResponse, UnmarshallerContext _ctx) {
		
		getOcCoreTeamsResponse.setRequestId(_ctx.stringValue("GetOcCoreTeamsResponse.RequestId"));
		getOcCoreTeamsResponse.setCode(_ctx.stringValue("GetOcCoreTeamsResponse.Code"));
		getOcCoreTeamsResponse.setSuccess(_ctx.booleanValue("GetOcCoreTeamsResponse.Success"));
		getOcCoreTeamsResponse.setMessage(_ctx.stringValue("GetOcCoreTeamsResponse.Message"));
		getOcCoreTeamsResponse.setTotalNum(_ctx.integerValue("GetOcCoreTeamsResponse.TotalNum"));
		getOcCoreTeamsResponse.setPageIndex(_ctx.integerValue("GetOcCoreTeamsResponse.PageIndex"));
		getOcCoreTeamsResponse.setPageNum(_ctx.integerValue("GetOcCoreTeamsResponse.PageNum"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcCoreTeamsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcCoreTeamsResponse.Data["+ i +"]"));
		}
		getOcCoreTeamsResponse.setData(data);
	 
	 	return getOcCoreTeamsResponse;
	}
}