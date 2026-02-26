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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.ListQueryRaspAppInfoResponse;
import com.aliyuncs.sas.model.v20181203.ListQueryRaspAppInfoResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListQueryRaspAppInfoResponseUnmarshaller {

	public static ListQueryRaspAppInfoResponse unmarshall(ListQueryRaspAppInfoResponse listQueryRaspAppInfoResponse, UnmarshallerContext _ctx) {
		
		listQueryRaspAppInfoResponse.setRequestId(_ctx.stringValue("ListQueryRaspAppInfoResponse.RequestId"));
		listQueryRaspAppInfoResponse.setSuccess(_ctx.booleanValue("ListQueryRaspAppInfoResponse.Success"));
		listQueryRaspAppInfoResponse.setCode(_ctx.stringValue("ListQueryRaspAppInfoResponse.Code"));
		listQueryRaspAppInfoResponse.setMessage(_ctx.stringValue("ListQueryRaspAppInfoResponse.Message"));
		listQueryRaspAppInfoResponse.setHttpStatusCode(_ctx.integerValue("ListQueryRaspAppInfoResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListQueryRaspAppInfoResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setUuid(_ctx.stringValue("ListQueryRaspAppInfoResponse.Data["+ i +"].Uuid"));
			dataItem.setRaspStatus(_ctx.stringValue("ListQueryRaspAppInfoResponse.Data["+ i +"].RaspStatus"));
			dataItem.setRaspAppName(_ctx.stringValue("ListQueryRaspAppInfoResponse.Data["+ i +"].RaspAppName"));
			dataItem.setRaspOnlineStatus(_ctx.integerValue("ListQueryRaspAppInfoResponse.Data["+ i +"].RaspOnlineStatus"));
			dataItem.setResult(_ctx.stringValue("ListQueryRaspAppInfoResponse.Data["+ i +"].Result"));

			data.add(dataItem);
		}
		listQueryRaspAppInfoResponse.setData(data);
	 
	 	return listQueryRaspAppInfoResponse;
	}
}