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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetOnlineSeatInformationResponse;
import com.aliyuncs.aiccs.model.v20191015.GetOnlineSeatInformationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOnlineSeatInformationResponseUnmarshaller {

	public static GetOnlineSeatInformationResponse unmarshall(GetOnlineSeatInformationResponse getOnlineSeatInformationResponse, UnmarshallerContext _ctx) {
		
		getOnlineSeatInformationResponse.setRequestId(_ctx.stringValue("GetOnlineSeatInformationResponse.RequestId"));
		getOnlineSeatInformationResponse.setMessage(_ctx.stringValue("GetOnlineSeatInformationResponse.Message"));
		getOnlineSeatInformationResponse.setCode(_ctx.stringValue("GetOnlineSeatInformationResponse.Code"));
		getOnlineSeatInformationResponse.setSuccess(_ctx.stringValue("GetOnlineSeatInformationResponse.Success"));

		Data data = new Data();
		data.setTotalNum(_ctx.integerValue("GetOnlineSeatInformationResponse.Data.TotalNum"));
		data.setPageSize(_ctx.integerValue("GetOnlineSeatInformationResponse.Data.PageSize"));
		data.setPageNum(_ctx.integerValue("GetOnlineSeatInformationResponse.Data.PageNum"));
		data.setRows(_ctx.stringValue("GetOnlineSeatInformationResponse.Data.Rows"));
		getOnlineSeatInformationResponse.setData(data);
	 
	 	return getOnlineSeatInformationResponse;
	}
}