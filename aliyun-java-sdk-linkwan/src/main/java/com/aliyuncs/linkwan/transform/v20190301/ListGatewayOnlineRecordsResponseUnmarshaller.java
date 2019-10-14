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

package com.aliyuncs.linkwan.transform.v20190301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkwan.model.v20190301.ListGatewayOnlineRecordsResponse;
import com.aliyuncs.linkwan.model.v20190301.ListGatewayOnlineRecordsResponse.Data;
import com.aliyuncs.linkwan.model.v20190301.ListGatewayOnlineRecordsResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGatewayOnlineRecordsResponseUnmarshaller {

	public static ListGatewayOnlineRecordsResponse unmarshall(ListGatewayOnlineRecordsResponse listGatewayOnlineRecordsResponse, UnmarshallerContext _ctx) {
		
		listGatewayOnlineRecordsResponse.setRequestId(_ctx.stringValue("ListGatewayOnlineRecordsResponse.RequestId"));
		listGatewayOnlineRecordsResponse.setSuccess(_ctx.booleanValue("ListGatewayOnlineRecordsResponse.Success"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("ListGatewayOnlineRecordsResponse.Data.TotalCount"));

		List<Record> list = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("ListGatewayOnlineRecordsResponse.Data.List.Length"); i++) {
			Record record = new Record();
			record.setOnlineState(_ctx.stringValue("ListGatewayOnlineRecordsResponse.Data.List["+ i +"].OnlineState"));
			record.setStateChangedMillis(_ctx.longValue("ListGatewayOnlineRecordsResponse.Data.List["+ i +"].StateChangedMillis"));
			record.setGwEui(_ctx.stringValue("ListGatewayOnlineRecordsResponse.Data.List["+ i +"].GwEui"));

			list.add(record);
		}
		data.setList(list);
		listGatewayOnlineRecordsResponse.setData(data);
	 
	 	return listGatewayOnlineRecordsResponse;
	}
}