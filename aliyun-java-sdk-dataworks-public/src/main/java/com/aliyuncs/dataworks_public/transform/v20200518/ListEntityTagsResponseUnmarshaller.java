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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListEntityTagsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListEntityTagsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEntityTagsResponseUnmarshaller {

	public static ListEntityTagsResponse unmarshall(ListEntityTagsResponse listEntityTagsResponse, UnmarshallerContext _ctx) {
		
		listEntityTagsResponse.setRequestId(_ctx.stringValue("ListEntityTagsResponse.RequestId"));
		listEntityTagsResponse.setSuccess(_ctx.booleanValue("ListEntityTagsResponse.Success"));
		listEntityTagsResponse.setErrorCode(_ctx.stringValue("ListEntityTagsResponse.ErrorCode"));
		listEntityTagsResponse.setErrorMessage(_ctx.stringValue("ListEntityTagsResponse.ErrorMessage"));
		listEntityTagsResponse.setHttpStatusCode(_ctx.integerValue("ListEntityTagsResponse.HttpStatusCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEntityTagsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setTagKey(_ctx.stringValue("ListEntityTagsResponse.Data["+ i +"].TagKey"));
			dataItem.setTagValue(_ctx.stringValue("ListEntityTagsResponse.Data["+ i +"].TagValue"));

			data.add(dataItem);
		}
		listEntityTagsResponse.setData(data);
	 
	 	return listEntityTagsResponse;
	}
}