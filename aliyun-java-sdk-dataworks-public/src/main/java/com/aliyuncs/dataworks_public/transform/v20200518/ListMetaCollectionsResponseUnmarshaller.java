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

import com.aliyuncs.dataworks_public.model.v20200518.ListMetaCollectionsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListMetaCollectionsResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMetaCollectionsResponseUnmarshaller {

	public static ListMetaCollectionsResponse unmarshall(ListMetaCollectionsResponse listMetaCollectionsResponse, UnmarshallerContext _ctx) {
		
		listMetaCollectionsResponse.setRequestId(_ctx.stringValue("ListMetaCollectionsResponse.RequestId"));
		listMetaCollectionsResponse.setSuccess(_ctx.booleanValue("ListMetaCollectionsResponse.Success"));
		listMetaCollectionsResponse.setErrorCode(_ctx.stringValue("ListMetaCollectionsResponse.ErrorCode"));
		listMetaCollectionsResponse.setErrorMessage(_ctx.stringValue("ListMetaCollectionsResponse.ErrorMessage"));
		listMetaCollectionsResponse.setHttpStatusCode(_ctx.integerValue("ListMetaCollectionsResponse.HttpStatusCode"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListMetaCollectionsResponse.Data.NextToken"));

		List<String> collectionList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListMetaCollectionsResponse.Data.CollectionList.Length"); i++) {
			collectionList.add(_ctx.stringValue("ListMetaCollectionsResponse.Data.CollectionList["+ i +"]"));
		}
		data.setCollectionList(collectionList);
		listMetaCollectionsResponse.setData(data);
	 
	 	return listMetaCollectionsResponse;
	}
}