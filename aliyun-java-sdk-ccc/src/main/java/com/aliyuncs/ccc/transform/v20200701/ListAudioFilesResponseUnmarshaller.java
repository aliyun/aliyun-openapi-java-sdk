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

import com.aliyuncs.ccc.model.v20200701.ListAudioFilesResponse;
import com.aliyuncs.ccc.model.v20200701.ListAudioFilesResponse.Data;
import com.aliyuncs.ccc.model.v20200701.ListAudioFilesResponse.Data.ContactFlow;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAudioFilesResponseUnmarshaller {

	public static ListAudioFilesResponse unmarshall(ListAudioFilesResponse listAudioFilesResponse, UnmarshallerContext _ctx) {
		
		listAudioFilesResponse.setRequestId(_ctx.stringValue("ListAudioFilesResponse.RequestId"));
		listAudioFilesResponse.setHttpStatusCode(_ctx.integerValue("ListAudioFilesResponse.HttpStatusCode"));
		listAudioFilesResponse.setCode(_ctx.stringValue("ListAudioFilesResponse.Code"));
		listAudioFilesResponse.setMessage(_ctx.stringValue("ListAudioFilesResponse.Message"));
		listAudioFilesResponse.setPublished(_ctx.booleanValue("ListAudioFilesResponse.Published"));
		listAudioFilesResponse.setMainFlow(_ctx.booleanValue("ListAudioFilesResponse.MainFlow"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListAudioFilesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListAudioFilesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListAudioFilesResponse.Data.TotalCount"));

		List<ContactFlow> list = new ArrayList<ContactFlow>();
		for (int i = 0; i < _ctx.lengthValue("ListAudioFilesResponse.Data.List.Length"); i++) {
			ContactFlow contactFlow = new ContactFlow();
			contactFlow.setAudioFileName(_ctx.stringValue("ListAudioFilesResponse.Data.List["+ i +"].AudioFileName"));
			contactFlow.setOssFileKey(_ctx.stringValue("ListAudioFilesResponse.Data.List["+ i +"].OssFileKey"));
			contactFlow.setUpdatedTime(_ctx.stringValue("ListAudioFilesResponse.Data.List["+ i +"].UpdatedTime"));
			contactFlow.setAudioResourceId(_ctx.stringValue("ListAudioFilesResponse.Data.List["+ i +"].AudioResourceId"));
			contactFlow.setInstanceId(_ctx.stringValue("ListAudioFilesResponse.Data.List["+ i +"].InstanceId"));
			contactFlow.setName(_ctx.stringValue("ListAudioFilesResponse.Data.List["+ i +"].Name"));
			contactFlow.setCreatedTime(_ctx.stringValue("ListAudioFilesResponse.Data.List["+ i +"].CreatedTime"));

			list.add(contactFlow);
		}
		data.setList(list);
		listAudioFilesResponse.setData(data);
	 
	 	return listAudioFilesResponse;
	}
}