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

import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjectmodulesResponse;
import com.aliyuncs.sofa.model.v20190815.ListLinkeLinktProjectmodulesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLinkeLinktProjectmodulesResponseUnmarshaller {

	public static ListLinkeLinktProjectmodulesResponse unmarshall(ListLinkeLinktProjectmodulesResponse listLinkeLinktProjectmodulesResponse, UnmarshallerContext _ctx) {
		
		listLinkeLinktProjectmodulesResponse.setRequestId(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.RequestId"));
		listLinkeLinktProjectmodulesResponse.setResultCode(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.ResultCode"));
		listLinkeLinktProjectmodulesResponse.setResultMessage(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.ResultMessage"));
		listLinkeLinktProjectmodulesResponse.setErrorCode(_ctx.longValue("ListLinkeLinktProjectmodulesResponse.ErrorCode"));
		listLinkeLinktProjectmodulesResponse.setErrorMessage(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.ErrorMessage"));
		listLinkeLinktProjectmodulesResponse.setResponseStatusCode(_ctx.longValue("ListLinkeLinktProjectmodulesResponse.ResponseStatusCode"));
		listLinkeLinktProjectmodulesResponse.setSuccess(_ctx.booleanValue("ListLinkeLinktProjectmodulesResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLinkeLinktProjectmodulesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCreatedAt(_ctx.longValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].CreatedAt"));
			dataItem.setCreator(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].Creator"));
			dataItem.setDeleted(_ctx.booleanValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].Deleted"));
			dataItem.setDescription(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].Description"));
			dataItem.setId(_ctx.longValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].Id"));
			dataItem.setModifier(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].Modifier"));
			dataItem.setName(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].Name"));
			dataItem.setOwners(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].Owners"));
			dataItem.setParentId(_ctx.longValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].ParentId"));
			dataItem.setProjectSign(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].ProjectSign"));
			dataItem.setRegion(_ctx.stringValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].Region"));
			dataItem.setUpdatedAt(_ctx.longValue("ListLinkeLinktProjectmodulesResponse.Data["+ i +"].UpdatedAt"));

			data.add(dataItem);
		}
		listLinkeLinktProjectmodulesResponse.setData(data);
	 
	 	return listLinkeLinktProjectmodulesResponse;
	}
}