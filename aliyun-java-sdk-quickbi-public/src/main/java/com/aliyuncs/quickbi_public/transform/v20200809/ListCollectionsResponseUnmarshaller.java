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

package com.aliyuncs.quickbi_public.transform.v20200809;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20200809.ListCollectionsResponse;
import com.aliyuncs.quickbi_public.model.v20200809.ListCollectionsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCollectionsResponseUnmarshaller {

	public static ListCollectionsResponse unmarshall(ListCollectionsResponse listCollectionsResponse, UnmarshallerContext _ctx) {
		
		listCollectionsResponse.setRequestId(_ctx.stringValue("ListCollectionsResponse.RequestId"));
		listCollectionsResponse.setSuccess(_ctx.booleanValue("ListCollectionsResponse.Success"));

		List<Data> result = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("ListCollectionsResponse.Result.Length"); i++) {
			Data data = new Data();
			data.setFavoriteId(_ctx.integerValue("ListCollectionsResponse.Result["+ i +"].FavoriteId"));
			data.setOwnerId(_ctx.stringValue("ListCollectionsResponse.Result["+ i +"].OwnerId"));
			data.setWorksId(_ctx.stringValue("ListCollectionsResponse.Result["+ i +"].WorksId"));
			data.setWorksName(_ctx.stringValue("ListCollectionsResponse.Result["+ i +"].WorksName"));
			data.setWorksType(_ctx.stringValue("ListCollectionsResponse.Result["+ i +"].WorksType"));
			data.setWorkspaceId(_ctx.stringValue("ListCollectionsResponse.Result["+ i +"].WorkspaceId"));
			data.setWorkspaceName(_ctx.stringValue("ListCollectionsResponse.Result["+ i +"].WorkspaceName"));

			result.add(data);
		}
		listCollectionsResponse.setResult(result);
	 
	 	return listCollectionsResponse;
	}
}