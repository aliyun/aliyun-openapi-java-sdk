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

package com.aliyuncs.linkwan.transform.v20181230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20181230.ListGatewayOnlineRecordsResponse;
import com.aliyuncs.linkwan.model.v20181230.ListGatewayOnlineRecordsResponse.Data;
import com.aliyuncs.linkwan.model.v20181230.ListGatewayOnlineRecordsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayOnlineRecordsResponseUnmarshaller {

	public static ListGatewayOnlineRecordsResponse unmarshall(ListGatewayOnlineRecordsResponse listGatewayOnlineRecordsResponse, UnmarshallerContext context) {
		
		listGatewayOnlineRecordsResponse.setRequestId(context.stringValue("ListGatewayOnlineRecordsResponse.RequestId"));
		listGatewayOnlineRecordsResponse.setSuccess(context.booleanValue("ListGatewayOnlineRecordsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(context.longValue("ListGatewayOnlineRecordsResponse.Data.TotalCount"));

		List<Record> list = new ArrayList<Record>();
		for (int i = 0; i < context.lengthValue("ListGatewayOnlineRecordsResponse.Data.List.Length"); i++) {
			Record record = new Record();
			record.setOnlineState(context.stringValue("ListGatewayOnlineRecordsResponse.Data.List["+ i +"].OnlineState"));
			record.setStateChangedMillis(context.longValue("ListGatewayOnlineRecordsResponse.Data.List["+ i +"].StateChangedMillis"));
			record.setGwEui(context.stringValue("ListGatewayOnlineRecordsResponse.Data.List["+ i +"].GwEui"));

			list.add(record);
		}
		data.setList(list);
		listGatewayOnlineRecordsResponse.setData(data);
	 
	 	return listGatewayOnlineRecordsResponse;
	}
}