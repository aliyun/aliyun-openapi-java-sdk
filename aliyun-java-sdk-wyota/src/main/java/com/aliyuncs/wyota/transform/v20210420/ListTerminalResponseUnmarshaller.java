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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.ListTerminalResponse;
import com.aliyuncs.wyota.model.v20210420.ListTerminalResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTerminalResponseUnmarshaller {

	public static ListTerminalResponse unmarshall(ListTerminalResponse listTerminalResponse, UnmarshallerContext _ctx) {
		
		listTerminalResponse.setRequestId(_ctx.stringValue("ListTerminalResponse.RequestId"));
		listTerminalResponse.setNextToken(_ctx.stringValue("ListTerminalResponse.NextToken"));
		listTerminalResponse.setTotalCount(_ctx.integerValue("ListTerminalResponse.TotalCount"));
		listTerminalResponse.setSuccess(_ctx.booleanValue("ListTerminalResponse.Success"));
		listTerminalResponse.setCode(_ctx.stringValue("ListTerminalResponse.Code"));
		listTerminalResponse.setMessage(_ctx.stringValue("ListTerminalResponse.Message"));
		listTerminalResponse.setHttpStatusCode(_ctx.integerValue("ListTerminalResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTerminalResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSerialNumber(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].SerialNumber"));
			dataItem.setUuid(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].Uuid"));
			dataItem.setTerminalGroupId(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].TerminalGroupId"));
			dataItem.setModel(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].Model"));
			dataItem.setOnlineStatus(_ctx.booleanValue("ListTerminalResponse.Data["+ i +"].OnlineStatus"));
			dataItem.setLastLoginUser(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].LastLoginUser"));
			dataItem.setLocationInfo(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].LocationInfo"));
			dataItem.setIpv4(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].Ipv4"));
			dataItem.setAlias(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].Alias"));
			dataItem.setBuildId(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].BuildId"));
			dataItem.setClientType(_ctx.integerValue("ListTerminalResponse.Data["+ i +"].ClientType"));
			dataItem.setInManage(_ctx.booleanValue("ListTerminalResponse.Data["+ i +"].InManage"));
			dataItem.setLockSettings(_ctx.booleanValue("ListTerminalResponse.Data["+ i +"].LockSettings"));
			dataItem.setBindUserId(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].BindUserId"));
			dataItem.setBindUserCount(_ctx.integerValue("ListTerminalResponse.Data["+ i +"].BindUserCount"));
			dataItem.setLoginUser(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].LoginUser"));
			dataItem.setDesktopId(_ctx.stringValue("ListTerminalResponse.Data["+ i +"].DesktopId"));

			data.add(dataItem);
		}
		listTerminalResponse.setData(data);
	 
	 	return listTerminalResponse;
	}
}