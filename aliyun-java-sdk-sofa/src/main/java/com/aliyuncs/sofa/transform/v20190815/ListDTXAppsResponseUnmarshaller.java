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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ListDTXAppsResponse;
import com.aliyuncs.sofa.model.v20190815.ListDTXAppsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDTXAppsResponseUnmarshaller {

	public static ListDTXAppsResponse unmarshall(ListDTXAppsResponse listDTXAppsResponse, UnmarshallerContext _ctx) {
		
		listDTXAppsResponse.setRequestId(_ctx.stringValue("ListDTXAppsResponse.RequestId"));
		listDTXAppsResponse.setResultCode(_ctx.stringValue("ListDTXAppsResponse.ResultCode"));
		listDTXAppsResponse.setResultMessage(_ctx.stringValue("ListDTXAppsResponse.ResultMessage"));
		listDTXAppsResponse.setCurrentPage(_ctx.longValue("ListDTXAppsResponse.CurrentPage"));
		listDTXAppsResponse.setPageSize(_ctx.longValue("ListDTXAppsResponse.PageSize"));
		listDTXAppsResponse.setSuccess(_ctx.booleanValue("ListDTXAppsResponse.Success"));
		listDTXAppsResponse.setTotal(_ctx.longValue("ListDTXAppsResponse.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDTXAppsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppName(_ctx.stringValue("ListDTXAppsResponse.Data["+ i +"].AppName"));
			dataItem.setExceptionTotal(_ctx.longValue("ListDTXAppsResponse.Data["+ i +"].ExceptionTotal"));
			dataItem.setGmtCreate(_ctx.stringValue("ListDTXAppsResponse.Data["+ i +"].GmtCreate"));
			dataItem.setTodayTotal(_ctx.longValue("ListDTXAppsResponse.Data["+ i +"].TodayTotal"));

			List<String> initiator = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDTXAppsResponse.Data["+ i +"].Initiator.Length"); j++) {
				initiator.add(_ctx.stringValue("ListDTXAppsResponse.Data["+ i +"].Initiator["+ j +"]"));
			}
			dataItem.setInitiator(initiator);

			List<String> participator = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDTXAppsResponse.Data["+ i +"].Participator.Length"); j++) {
				participator.add(_ctx.stringValue("ListDTXAppsResponse.Data["+ i +"].Participator["+ j +"]"));
			}
			dataItem.setParticipator(participator);

			data.add(dataItem);
		}
		listDTXAppsResponse.setData(data);
	 
	 	return listDTXAppsResponse;
	}
}