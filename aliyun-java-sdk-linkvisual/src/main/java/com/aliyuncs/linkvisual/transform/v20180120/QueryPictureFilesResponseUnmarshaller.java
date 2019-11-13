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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.QueryPictureFilesResponse;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureFilesResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.QueryPictureFilesResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryPictureFilesResponseUnmarshaller {

	public static QueryPictureFilesResponse unmarshall(QueryPictureFilesResponse queryPictureFilesResponse, UnmarshallerContext _ctx) {
		
		queryPictureFilesResponse.setRequestId(_ctx.stringValue("QueryPictureFilesResponse.RequestId"));
		queryPictureFilesResponse.setSuccess(_ctx.booleanValue("QueryPictureFilesResponse.Success"));
		queryPictureFilesResponse.setErrorMessage(_ctx.stringValue("QueryPictureFilesResponse.ErrorMessage"));
		queryPictureFilesResponse.setCode(_ctx.stringValue("QueryPictureFilesResponse.Code"));

		Data data = new Data();
		data.setPageSize(_ctx.integerValue("QueryPictureFilesResponse.Data.PageSize"));
		data.setPage(_ctx.integerValue("QueryPictureFilesResponse.Data.Page"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryPictureFilesResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setIotId(_ctx.stringValue("QueryPictureFilesResponse.Data.List["+ i +"].IotId"));
			listItem.setPicCreateTime(_ctx.longValue("QueryPictureFilesResponse.Data.List["+ i +"].PicCreateTime"));
			listItem.setPicId(_ctx.stringValue("QueryPictureFilesResponse.Data.List["+ i +"].PicId"));
			listItem.setPicUrl(_ctx.stringValue("QueryPictureFilesResponse.Data.List["+ i +"].PicUrl"));
			listItem.setThumbUrl(_ctx.stringValue("QueryPictureFilesResponse.Data.List["+ i +"].ThumbUrl"));

			list.add(listItem);
		}
		data.setList(list);
		queryPictureFilesResponse.setData(data);
	 
	 	return queryPictureFilesResponse;
	}
}