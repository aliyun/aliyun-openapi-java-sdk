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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.KillProcessListResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.KillProcessListResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class KillProcessListResponseUnmarshaller {

	public static KillProcessListResponse unmarshall(KillProcessListResponse killProcessListResponse, UnmarshallerContext _ctx) {
		
		killProcessListResponse.setRequestId(_ctx.stringValue("KillProcessListResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("KillProcessListResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSessionId(_ctx.longValue("KillProcessListResponse.Data["+ i +"].SessionId"));
			dataItem.setServerIp(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].ServerIp"));
			dataItem.setStatus(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].Status"));
			dataItem.setErrorMessage(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].ErrorMessage"));
			dataItem.setClientIp(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].ClientIp"));
			dataItem.setTenantId(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].TenantId"));
			dataItem.setUser(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].User"));
			dataItem.setDatabase(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].Database"));
			dataItem.setSqlText(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].SqlText"));
			dataItem.setCommand(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].Command"));
			dataItem.setExecuteTime(_ctx.stringValue("KillProcessListResponse.Data["+ i +"].ExecuteTime"));

			data.add(dataItem);
		}
		killProcessListResponse.setData(data);
	 
	 	return killProcessListResponse;
	}
}