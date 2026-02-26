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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.ListDataSetResponse;
import com.aliyuncs.qualitycheck.model.v20190115.ListDataSetResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSetResponseUnmarshaller {

	public static ListDataSetResponse unmarshall(ListDataSetResponse listDataSetResponse, UnmarshallerContext _ctx) {
		
		listDataSetResponse.setRequestId(_ctx.stringValue("ListDataSetResponse.RequestId"));
		listDataSetResponse.setCount(_ctx.integerValue("ListDataSetResponse.Count"));
		listDataSetResponse.setCurrentPage(_ctx.integerValue("ListDataSetResponse.CurrentPage"));
		listDataSetResponse.setPageSize(_ctx.integerValue("ListDataSetResponse.PageSize"));
		listDataSetResponse.setPageNumber(_ctx.integerValue("ListDataSetResponse.PageNumber"));
		listDataSetResponse.setSuccess(_ctx.booleanValue("ListDataSetResponse.Success"));
		listDataSetResponse.setCode(_ctx.stringValue("ListDataSetResponse.Code"));
		listDataSetResponse.setMessage(_ctx.stringValue("ListDataSetResponse.Message"));
		listDataSetResponse.setHttpStatusCode(_ctx.integerValue("ListDataSetResponse.HttpStatusCode"));

		List<String> messages = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSetResponse.Messages.Length"); i++) {
			messages.add(_ctx.stringValue("ListDataSetResponse.Messages["+ i +"]"));
		}
		listDataSetResponse.setMessages(messages);

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSetResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setSetId(_ctx.longValue("ListDataSetResponse.Data["+ i +"].SetId"));
			dataItem.setSetName(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].SetName"));
			dataItem.setSetDomain(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].SetDomain"));
			dataItem.setSetRoleArn(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].SetRoleArn"));
			dataItem.setSetBucketName(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].SetBucketName"));
			dataItem.setSetFolderName(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].SetFolderName"));
			dataItem.setSetNumber(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].SetNumber"));
			dataItem.setRoleConfigStatus(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].RoleConfigStatus"));
			dataItem.setChannelId0(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].ChannelId0"));
			dataItem.setChannelId1(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].ChannelId1"));
			dataItem.setRoleConfigTask(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].RoleConfigTask"));
			dataItem.setIsDelete(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].IsDelete"));
			dataItem.setCreateTime(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].CreateTime"));
			dataItem.setUpdateTime(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].UpdateTime"));
			dataItem.setChannelType(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].ChannelType"));
			dataItem.setSubDir(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].SubDir"));
			dataItem.setCreateType(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].CreateType"));
			dataItem.setUserGroup(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].UserGroup"));
			dataItem.setRoleConfigProp(_ctx.stringValue("ListDataSetResponse.Data["+ i +"].RoleConfigProp"));
			dataItem.setAutoTranscoding(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].AutoTranscoding"));
			dataItem.setSetType(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].SetType"));
			dataItem.setDataSetType(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].DataSetType"));
			dataItem.setSourceDataType(_ctx.integerValue("ListDataSetResponse.Data["+ i +"].SourceDataType"));

			data.add(dataItem);
		}
		listDataSetResponse.setData(data);
	 
	 	return listDataSetResponse;
	}
}