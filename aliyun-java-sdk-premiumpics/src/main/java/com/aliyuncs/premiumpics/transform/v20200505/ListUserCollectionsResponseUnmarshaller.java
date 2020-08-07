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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.ListUserCollectionsResponse;
import com.aliyuncs.premiumpics.model.v20200505.ListUserCollectionsResponse.Collections;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUserCollectionsResponseUnmarshaller {

	public static ListUserCollectionsResponse unmarshall(ListUserCollectionsResponse listUserCollectionsResponse, UnmarshallerContext _ctx) {
		
		listUserCollectionsResponse.setRequestId(_ctx.stringValue("ListUserCollectionsResponse.RequestId"));
		listUserCollectionsResponse.setSuccess(_ctx.booleanValue("ListUserCollectionsResponse.Success"));
		listUserCollectionsResponse.setErrorMsg(_ctx.stringValue("ListUserCollectionsResponse.ErrorMsg"));
		listUserCollectionsResponse.setErrorCode(_ctx.stringValue("ListUserCollectionsResponse.ErrorCode"));
		listUserCollectionsResponse.setPageSize(_ctx.integerValue("ListUserCollectionsResponse.PageSize"));
		listUserCollectionsResponse.setTotalCount(_ctx.integerValue("ListUserCollectionsResponse.TotalCount"));
		listUserCollectionsResponse.setPageNumber(_ctx.integerValue("ListUserCollectionsResponse.PageNumber"));

		List<Collections> data = new ArrayList<Collections>();
		for (int i = 0; i < _ctx.lengthValue("ListUserCollectionsResponse.Data.Length"); i++) {
			Collections collections = new Collections();
			collections.setUnitId(_ctx.stringValue("ListUserCollectionsResponse.Data["+ i +"].UnitId"));
			collections.setUnitName(_ctx.stringValue("ListUserCollectionsResponse.Data["+ i +"].UnitName"));
			collections.setImage(_ctx.stringValue("ListUserCollectionsResponse.Data["+ i +"].Image"));

			data.add(collections);
		}
		listUserCollectionsResponse.setData(data);
	 
	 	return listUserCollectionsResponse;
	}
}