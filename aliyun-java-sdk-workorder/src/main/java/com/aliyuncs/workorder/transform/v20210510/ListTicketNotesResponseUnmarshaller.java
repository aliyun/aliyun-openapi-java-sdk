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

package com.aliyuncs.workorder.transform.v20210510;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workorder.model.v20210510.ListTicketNotesResponse;
import com.aliyuncs.workorder.model.v20210510.ListTicketNotesResponse.DataItem;
import com.aliyuncs.workorder.model.v20210510.ListTicketNotesResponse.DataItem.DataInfo;
import com.aliyuncs.workorder.model.v20210510.ListTicketNotesResponse.DataItem.UserInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTicketNotesResponseUnmarshaller {

	public static ListTicketNotesResponse unmarshall(ListTicketNotesResponse listTicketNotesResponse, UnmarshallerContext _ctx) {
		
		listTicketNotesResponse.setRequestId(_ctx.stringValue("ListTicketNotesResponse.RequestId"));
		listTicketNotesResponse.setCode(_ctx.integerValue("ListTicketNotesResponse.Code"));
		listTicketNotesResponse.setMessage(_ctx.stringValue("ListTicketNotesResponse.Message"));
		listTicketNotesResponse.setSuccess(_ctx.booleanValue("ListTicketNotesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTicketNotesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setStatus(_ctx.integerValue("ListTicketNotesResponse.Data["+ i +"].Status"));
			dataItem.setCreateTime(_ctx.longValue("ListTicketNotesResponse.Data["+ i +"].CreateTime"));
			dataItem.setType(_ctx.integerValue("ListTicketNotesResponse.Data["+ i +"].Type"));
			dataItem.setDialogId(_ctx.longValue("ListTicketNotesResponse.Data["+ i +"].DialogId"));
			dataItem.setTip(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].Tip"));

			DataInfo dataInfo = new DataInfo();
			dataInfo.setContent(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].DataInfo.Content"));
			dataInfo.setSchema(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].DataInfo.Schema"));
			dataItem.setDataInfo(dataInfo);

			UserInfo userInfo = new UserInfo();
			userInfo.setUserName(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].UserInfo.UserName"));
			userInfo.setRole(_ctx.integerValue("ListTicketNotesResponse.Data["+ i +"].UserInfo.Role"));
			dataItem.setUserInfo(userInfo);

			data.add(dataItem);
		}
		listTicketNotesResponse.setData(data);
	 
	 	return listTicketNotesResponse;
	}
}