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

package com.aliyuncs.cccxspaceinner.transform.v20191227;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cccxspaceinner.model.v20191227.ListGroupByIdResponse;
import com.aliyuncs.cccxspaceinner.model.v20191227.ListGroupByIdResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListGroupByIdResponseUnmarshaller {

	public static ListGroupByIdResponse unmarshall(ListGroupByIdResponse listGroupByIdResponse, UnmarshallerContext _ctx) {
		
		listGroupByIdResponse.setRequestId(_ctx.stringValue("ListGroupByIdResponse.RequestId"));
		listGroupByIdResponse.setSuccess(_ctx.booleanValue("ListGroupByIdResponse.Success"));
		listGroupByIdResponse.setCode(_ctx.stringValue("ListGroupByIdResponse.Code"));
		listGroupByIdResponse.setMessage(_ctx.stringValue("ListGroupByIdResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListGroupByIdResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setBuId(_ctx.longValue("ListGroupByIdResponse.Data["+ i +"].BuId"));
			dataItem.setGroupId(_ctx.longValue("ListGroupByIdResponse.Data["+ i +"].GroupId"));
			dataItem.setGroupName(_ctx.stringValue("ListGroupByIdResponse.Data["+ i +"].GroupName"));
			dataItem.setStatus(_ctx.integerValue("ListGroupByIdResponse.Data["+ i +"].Status"));
			dataItem.setShowName(_ctx.stringValue("ListGroupByIdResponse.Data["+ i +"].ShowName"));
			dataItem.setDescription(_ctx.stringValue("ListGroupByIdResponse.Data["+ i +"].Description"));
			dataItem.setSupportIm(_ctx.booleanValue("ListGroupByIdResponse.Data["+ i +"].SupportIm"));
			dataItem.setSupportPhone(_ctx.booleanValue("ListGroupByIdResponse.Data["+ i +"].SupportPhone"));
			dataItem.setSupportCase(_ctx.booleanValue("ListGroupByIdResponse.Data["+ i +"].SupportCase"));

			data.add(dataItem);
		}
		listGroupByIdResponse.setData(data);
	 
	 	return listGroupByIdResponse;
	}
}