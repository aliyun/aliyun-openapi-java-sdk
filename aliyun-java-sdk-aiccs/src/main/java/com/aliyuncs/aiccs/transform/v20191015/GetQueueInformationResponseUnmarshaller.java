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

import com.aliyuncs.aiccs.model.v20191015.GetQueueInformationResponse;
import com.aliyuncs.aiccs.model.v20191015.GetQueueInformationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueueInformationResponseUnmarshaller {

	public static GetQueueInformationResponse unmarshall(GetQueueInformationResponse getQueueInformationResponse, UnmarshallerContext _ctx) {
		
		getQueueInformationResponse.setRequestId(_ctx.stringValue("GetQueueInformationResponse.RequestId"));
		getQueueInformationResponse.setMessage(_ctx.stringValue("GetQueueInformationResponse.Message"));
		getQueueInformationResponse.setCode(_ctx.stringValue("GetQueueInformationResponse.Code"));
		getQueueInformationResponse.setSuccess(_ctx.stringValue("GetQueueInformationResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("GetQueueInformationResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("GetQueueInformationResponse.Data.PageSize"));
		data.setTotalNum(_ctx.integerValue("GetQueueInformationResponse.Data.TotalNum"));
		data.setRows(_ctx.stringValue("GetQueueInformationResponse.Data.Rows"));
		getQueueInformationResponse.setData(data);
	 
	 	return getQueueInformationResponse;
	}
}