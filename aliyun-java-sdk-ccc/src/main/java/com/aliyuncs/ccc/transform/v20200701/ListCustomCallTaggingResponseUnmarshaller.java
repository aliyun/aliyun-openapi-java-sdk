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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListCustomCallTaggingResponse;
import com.aliyuncs.ccc.model.v20200701.ListCustomCallTaggingResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListCustomCallTaggingResponse.Data.CustomCallTagging;
import com.aliyuncs.ccc.model.v20200701.ListCustomCallTaggingResponse.Data.CustomCallTagging.CallTag;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomCallTaggingResponseUnmarshaller {

	public static ListCustomCallTaggingResponse unmarshall(ListCustomCallTaggingResponse listCustomCallTaggingResponse, UnmarshallerContext _ctx) {
		
		listCustomCallTaggingResponse.setRequestId(_ctx.stringValue("ListCustomCallTaggingResponse.RequestId"));
		listCustomCallTaggingResponse.setHttpStatusCode(_ctx.integerValue("ListCustomCallTaggingResponse.HttpStatusCode"));
		listCustomCallTaggingResponse.setCode(_ctx.stringValue("ListCustomCallTaggingResponse.Code"));
		listCustomCallTaggingResponse.setMessage(_ctx.stringValue("ListCustomCallTaggingResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListCustomCallTaggingResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListCustomCallTaggingResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListCustomCallTaggingResponse.Data.TotalCount"));

		List<CustomCallTagging> list = new ArrayList<CustomCallTagging>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomCallTaggingResponse.Data.List.Length"); i++) {
			CustomCallTagging customCallTagging = new CustomCallTagging();
			customCallTagging.setInstanceId(_ctx.stringValue("ListCustomCallTaggingResponse.Data.List["+ i +"].InstanceId"));
			customCallTagging.setNumber(_ctx.stringValue("ListCustomCallTaggingResponse.Data.List["+ i +"].Number"));
			customCallTagging.setDescription(_ctx.stringValue("ListCustomCallTaggingResponse.Data.List["+ i +"].Description"));
			customCallTagging.setCreator(_ctx.stringValue("ListCustomCallTaggingResponse.Data.List["+ i +"].Creator"));
			customCallTagging.setUpdateTime(_ctx.stringValue("ListCustomCallTaggingResponse.Data.List["+ i +"].UpdateTime"));

			List<CallTag> callTagList = new ArrayList<CallTag>();
			for (int j = 0; j < _ctx.lengthValue("ListCustomCallTaggingResponse.Data.List["+ i +"].CallTagList.Length"); j++) {
				CallTag callTag = new CallTag();
				callTag.setInstanceId(_ctx.stringValue("ListCustomCallTaggingResponse.Data.List["+ i +"].CallTagList["+ j +"].InstanceId"));
				callTag.setTagName(_ctx.stringValue("ListCustomCallTaggingResponse.Data.List["+ i +"].CallTagList["+ j +"].TagName"));

				callTagList.add(callTag);
			}
			customCallTagging.setCallTagList(callTagList);

			list.add(customCallTagging);
		}
		data.setList(list);
		listCustomCallTaggingResponse.setData(data);
	 
	 	return listCustomCallTaggingResponse;
	}
}