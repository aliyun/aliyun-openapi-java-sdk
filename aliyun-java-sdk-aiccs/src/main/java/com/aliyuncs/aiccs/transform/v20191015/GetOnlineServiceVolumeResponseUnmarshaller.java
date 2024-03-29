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

import com.aliyuncs.aiccs.model.v20191015.GetOnlineServiceVolumeResponse;
import com.aliyuncs.aiccs.model.v20191015.GetOnlineServiceVolumeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOnlineServiceVolumeResponseUnmarshaller {

	public static GetOnlineServiceVolumeResponse unmarshall(GetOnlineServiceVolumeResponse getOnlineServiceVolumeResponse, UnmarshallerContext _ctx) {
		
		getOnlineServiceVolumeResponse.setRequestId(_ctx.stringValue("GetOnlineServiceVolumeResponse.RequestId"));
		getOnlineServiceVolumeResponse.setMessage(_ctx.stringValue("GetOnlineServiceVolumeResponse.Message"));
		getOnlineServiceVolumeResponse.setCode(_ctx.stringValue("GetOnlineServiceVolumeResponse.Code"));
		getOnlineServiceVolumeResponse.setSuccess(_ctx.stringValue("GetOnlineServiceVolumeResponse.Success"));

		Data data = new Data();
		data.setPageNum(_ctx.integerValue("GetOnlineServiceVolumeResponse.Data.PageNum"));
		data.setPageSize(_ctx.integerValue("GetOnlineServiceVolumeResponse.Data.PageSize"));
		data.setTotalNum(_ctx.integerValue("GetOnlineServiceVolumeResponse.Data.TotalNum"));
		data.setRows(_ctx.stringValue("GetOnlineServiceVolumeResponse.Data.Rows"));
		getOnlineServiceVolumeResponse.setData(data);
	 
	 	return getOnlineServiceVolumeResponse;
	}
}