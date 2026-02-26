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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.ListErAttachmentsResponse;
import com.aliyuncs.eflo.model.v20220530.ListErAttachmentsResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListErAttachmentsResponse.Content.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListErAttachmentsResponseUnmarshaller {

	public static ListErAttachmentsResponse unmarshall(ListErAttachmentsResponse listErAttachmentsResponse, UnmarshallerContext _ctx) {
		
		listErAttachmentsResponse.setRequestId(_ctx.stringValue("ListErAttachmentsResponse.RequestId"));
		listErAttachmentsResponse.setCode(_ctx.integerValue("ListErAttachmentsResponse.Code"));
		listErAttachmentsResponse.setMessage(_ctx.stringValue("ListErAttachmentsResponse.Message"));

		Content content = new Content();
		content.setTotal(_ctx.longValue("ListErAttachmentsResponse.Content.Total"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListErAttachmentsResponse.Content.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreateTime(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].CreateTime"));
			dataItem.setGmtModified(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].GmtModified"));
			dataItem.setMessage(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].Message"));
			dataItem.setStatus(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].Status"));
			dataItem.setRegionId(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].RegionId"));
			dataItem.setTenantId(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].TenantId"));
			dataItem.setErAttachmentName(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].ErAttachmentName"));
			dataItem.setErAttachmentId(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].ErAttachmentId"));
			dataItem.setErId(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].ErId"));
			dataItem.setInstanceType(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].InstanceType"));
			dataItem.setInstanceId(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].InstanceId"));
			dataItem.setInstanceName(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].InstanceName"));
			dataItem.setAutoReceiveAllRoute(_ctx.booleanValue("ListErAttachmentsResponse.Content.Data["+ i +"].AutoReceiveAllRoute"));
			dataItem.setAcross(_ctx.booleanValue("ListErAttachmentsResponse.Content.Data["+ i +"].Across"));
			dataItem.setResourceTenantId(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].ResourceTenantId"));
			dataItem.setResourceGroupId(_ctx.stringValue("ListErAttachmentsResponse.Content.Data["+ i +"].ResourceGroupId"));

			data.add(dataItem);
		}
		content.setData(data);
		listErAttachmentsResponse.setContent(content);
	 
	 	return listErAttachmentsResponse;
	}
}