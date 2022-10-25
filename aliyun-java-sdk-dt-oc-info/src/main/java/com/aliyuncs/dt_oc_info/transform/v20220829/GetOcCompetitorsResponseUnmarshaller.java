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

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcCompetitorsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcCompetitorsResponseUnmarshaller {

	public static GetOcCompetitorsResponse unmarshall(GetOcCompetitorsResponse getOcCompetitorsResponse, UnmarshallerContext _ctx) {
		
		getOcCompetitorsResponse.setRequestId(_ctx.stringValue("GetOcCompetitorsResponse.RequestId"));
		getOcCompetitorsResponse.setCode(_ctx.stringValue("GetOcCompetitorsResponse.Code"));
		getOcCompetitorsResponse.setSuccess(_ctx.booleanValue("GetOcCompetitorsResponse.Success"));
		getOcCompetitorsResponse.setMessage(_ctx.stringValue("GetOcCompetitorsResponse.Message"));
		getOcCompetitorsResponse.setTotalNum(_ctx.integerValue("GetOcCompetitorsResponse.TotalNum"));
		getOcCompetitorsResponse.setPageIndex(_ctx.integerValue("GetOcCompetitorsResponse.PageIndex"));
		getOcCompetitorsResponse.setPageNum(_ctx.integerValue("GetOcCompetitorsResponse.PageNum"));

		List<String> data = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetOcCompetitorsResponse.Data.Length"); i++) {
			data.add(_ctx.stringValue("GetOcCompetitorsResponse.Data["+ i +"]"));
		}
		getOcCompetitorsResponse.setData(data);
	 
	 	return getOcCompetitorsResponse;
	}
}