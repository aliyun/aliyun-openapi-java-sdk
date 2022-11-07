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

package com.aliyuncs.workorder.transform.v20210610;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.workorder.model.v20210610.ListTicketNotesResponse;
import com.aliyuncs.workorder.model.v20210610.ListTicketNotesResponse.DataItem;
import com.aliyuncs.workorder.model.v20210610.ListTicketNotesResponse.DataItem.AttachmentsItem;
import com.aliyuncs.workorder.model.v20210610.ListTicketNotesResponse.DataItem.Dialog;
import com.aliyuncs.workorder.model.v20210610.ListTicketNotesResponse.DataItem.User;
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
			dataItem.setType(_ctx.integerValue("ListTicketNotesResponse.Data["+ i +"].Type"));
			dataItem.setStatus(_ctx.integerValue("ListTicketNotesResponse.Data["+ i +"].Status"));
			dataItem.setTip(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].Tip"));
			dataItem.setDialogId(_ctx.longValue("ListTicketNotesResponse.Data["+ i +"].DialogId"));
			dataItem.setCreateTime(_ctx.longValue("ListTicketNotesResponse.Data["+ i +"].CreateTime"));

			Dialog dialog = new Dialog();
			dialog.setSchema(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].Dialog.Schema"));
			dialog.setContent(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].Dialog.Content"));
			dataItem.setDialog(dialog);

			User user = new User();
			user.setRole(_ctx.integerValue("ListTicketNotesResponse.Data["+ i +"].User.Role"));
			user.setName(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].User.Name"));
			dataItem.setUser(user);

			List<AttachmentsItem> attachments = new ArrayList<AttachmentsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListTicketNotesResponse.Data["+ i +"].Attachments.Length"); j++) {
				AttachmentsItem attachmentsItem = new AttachmentsItem();
				attachmentsItem.setName(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].Attachments["+ j +"].Name"));
				attachmentsItem.setUrl(_ctx.stringValue("ListTicketNotesResponse.Data["+ i +"].Attachments["+ j +"].Url"));

				attachments.add(attachmentsItem);
			}
			dataItem.setAttachments(attachments);

			data.add(dataItem);
		}
		listTicketNotesResponse.setData(data);
	 
	 	return listTicketNotesResponse;
	}
}