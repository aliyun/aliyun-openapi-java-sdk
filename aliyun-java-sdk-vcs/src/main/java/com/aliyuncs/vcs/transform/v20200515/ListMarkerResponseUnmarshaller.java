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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListMarkerResponse;
import com.aliyuncs.vcs.model.v20200515.ListMarkerResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListMarkerResponse.Data.ListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMarkerResponseUnmarshaller {

	public static ListMarkerResponse unmarshall(ListMarkerResponse listMarkerResponse, UnmarshallerContext _ctx) {
		
		listMarkerResponse.setRequestId(_ctx.stringValue("ListMarkerResponse.RequestId"));
		listMarkerResponse.setMessage(_ctx.stringValue("ListMarkerResponse.Message"));
		listMarkerResponse.setCode(_ctx.stringValue("ListMarkerResponse.Code"));

		Data data = new Data();
		data.setTotal(_ctx.longValue("ListMarkerResponse.Data.Total"));

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListMarkerResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setGmtCreate(_ctx.stringValue("ListMarkerResponse.Data.List["+ i +"].GmtCreate"));
			listItem.setAlgorithmId(_ctx.stringValue("ListMarkerResponse.Data.List["+ i +"].AlgorithmId"));
			listItem.setContent(_ctx.stringValue("ListMarkerResponse.Data.List["+ i +"].Content"));
			listItem.setUserId(_ctx.stringValue("ListMarkerResponse.Data.List["+ i +"].UserId"));
			listItem.setGmtModified(_ctx.stringValue("ListMarkerResponse.Data.List["+ i +"].GmtModified"));
			listItem.setLabelName(_ctx.stringValue("ListMarkerResponse.Data.List["+ i +"].LabelName"));
			listItem.setLabelId(_ctx.stringValue("ListMarkerResponse.Data.List["+ i +"].LabelId"));
			listItem.setId(_ctx.stringValue("ListMarkerResponse.Data.List["+ i +"].Id"));
			listItem.setSampleId(_ctx.stringValue("ListMarkerResponse.Data.List["+ i +"].SampleId"));

			list.add(listItem);
		}
		data.setList(list);
		listMarkerResponse.setData(data);
	 
	 	return listMarkerResponse;
	}
}