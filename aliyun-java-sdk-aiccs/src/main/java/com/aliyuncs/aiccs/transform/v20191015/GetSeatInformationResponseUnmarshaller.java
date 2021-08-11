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

import com.aliyuncs.aiccs.model.v20191015.GetSeatInformationResponse;
import com.aliyuncs.aiccs.model.v20191015.GetSeatInformationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSeatInformationResponseUnmarshaller {

	public static GetSeatInformationResponse unmarshall(GetSeatInformationResponse getSeatInformationResponse, UnmarshallerContext _ctx) {
		
		getSeatInformationResponse.setRequestId(_ctx.stringValue("GetSeatInformationResponse.RequestId"));
		getSeatInformationResponse.setMessage(_ctx.stringValue("GetSeatInformationResponse.Message"));
		getSeatInformationResponse.setCode(_ctx.stringValue("GetSeatInformationResponse.Code"));
		getSeatInformationResponse.setSuccess(_ctx.stringValue("GetSeatInformationResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("GetSeatInformationResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("GetSeatInformationResponse.Data.PageSize"));
		data.setTotalNum(_ctx.integerValue("GetSeatInformationResponse.Data.TotalNum"));
		data.setRowr(_ctx.stringValue("GetSeatInformationResponse.Data.Rowr"));
		getSeatInformationResponse.setData(data);
	 
	 	return getSeatInformationResponse;
	}
}