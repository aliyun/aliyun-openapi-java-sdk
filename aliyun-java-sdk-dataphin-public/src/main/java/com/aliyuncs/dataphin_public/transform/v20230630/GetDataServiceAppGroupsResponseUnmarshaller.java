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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppGroupsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetDataServiceAppGroupsResponse.AppGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDataServiceAppGroupsResponseUnmarshaller {

	public static GetDataServiceAppGroupsResponse unmarshall(GetDataServiceAppGroupsResponse getDataServiceAppGroupsResponse, UnmarshallerContext _ctx) {
		
		getDataServiceAppGroupsResponse.setRequestId(_ctx.stringValue("GetDataServiceAppGroupsResponse.RequestId"));
		getDataServiceAppGroupsResponse.setSuccess(_ctx.booleanValue("GetDataServiceAppGroupsResponse.Success"));
		getDataServiceAppGroupsResponse.setHttpStatusCode(_ctx.integerValue("GetDataServiceAppGroupsResponse.HttpStatusCode"));
		getDataServiceAppGroupsResponse.setCode(_ctx.stringValue("GetDataServiceAppGroupsResponse.Code"));
		getDataServiceAppGroupsResponse.setMessage(_ctx.stringValue("GetDataServiceAppGroupsResponse.Message"));

		List<AppGroup> appGroupList = new ArrayList<AppGroup>();
		for (int i = 0; i < _ctx.lengthValue("GetDataServiceAppGroupsResponse.AppGroupList.Length"); i++) {
			AppGroup appGroup = new AppGroup();
			appGroup.setId(_ctx.integerValue("GetDataServiceAppGroupsResponse.AppGroupList["+ i +"].Id"));
			appGroup.setName(_ctx.stringValue("GetDataServiceAppGroupsResponse.AppGroupList["+ i +"].Name"));

			appGroupList.add(appGroup);
		}
		getDataServiceAppGroupsResponse.setAppGroupList(appGroupList);
	 
	 	return getDataServiceAppGroupsResponse;
	}
}