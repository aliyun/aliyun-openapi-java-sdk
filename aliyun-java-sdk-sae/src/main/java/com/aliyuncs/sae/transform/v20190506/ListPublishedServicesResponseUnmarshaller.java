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

package com.aliyuncs.sae.transform.v20190506;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sae.model.v20190506.ListPublishedServicesResponse;
import com.aliyuncs.sae.model.v20190506.ListPublishedServicesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListPublishedServicesResponseUnmarshaller {

	public static ListPublishedServicesResponse unmarshall(ListPublishedServicesResponse listPublishedServicesResponse, UnmarshallerContext _ctx) {
		
		listPublishedServicesResponse.setRequestId(_ctx.stringValue("ListPublishedServicesResponse.RequestId"));
		listPublishedServicesResponse.setCode(_ctx.stringValue("ListPublishedServicesResponse.Code"));
		listPublishedServicesResponse.setMessage(_ctx.stringValue("ListPublishedServicesResponse.Message"));
		listPublishedServicesResponse.setSuccess(_ctx.booleanValue("ListPublishedServicesResponse.Success"));
		listPublishedServicesResponse.setErrorCode(_ctx.stringValue("ListPublishedServicesResponse.ErrorCode"));
		listPublishedServicesResponse.setTraceId(_ctx.stringValue("ListPublishedServicesResponse.TraceId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListPublishedServicesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppId(_ctx.stringValue("ListPublishedServicesResponse.Data["+ i +"].AppId"));
			dataItem.setGroup2Ip(_ctx.stringValue("ListPublishedServicesResponse.Data["+ i +"].Group2Ip"));
			dataItem.setName(_ctx.stringValue("ListPublishedServicesResponse.Data["+ i +"].Name"));
			dataItem.setType(_ctx.stringValue("ListPublishedServicesResponse.Data["+ i +"].Type"));
			dataItem.setVersion(_ctx.stringValue("ListPublishedServicesResponse.Data["+ i +"].Version"));

			List<String> groups = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPublishedServicesResponse.Data["+ i +"].Groups.Length"); j++) {
				groups.add(_ctx.stringValue("ListPublishedServicesResponse.Data["+ i +"].Groups["+ j +"]"));
			}
			dataItem.setGroups(groups);

			List<String> ips = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListPublishedServicesResponse.Data["+ i +"].Ips.Length"); j++) {
				ips.add(_ctx.stringValue("ListPublishedServicesResponse.Data["+ i +"].Ips["+ j +"]"));
			}
			dataItem.setIps(ips);

			data.add(dataItem);
		}
		listPublishedServicesResponse.setData(data);
	 
	 	return listPublishedServicesResponse;
	}
}