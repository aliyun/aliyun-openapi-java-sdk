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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.ListAppGroupMappingResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListAppGroupMappingResponse.AppGroupMappingDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppGroupMappingResponseUnmarshaller {

	public static ListAppGroupMappingResponse unmarshall(ListAppGroupMappingResponse listAppGroupMappingResponse, UnmarshallerContext _ctx) {
		
		listAppGroupMappingResponse.setRequestId(_ctx.stringValue("ListAppGroupMappingResponse.RequestId"));
		listAppGroupMappingResponse.setCode(_ctx.integerValue("ListAppGroupMappingResponse.Code"));
		listAppGroupMappingResponse.setPageNumber(_ctx.integerValue("ListAppGroupMappingResponse.PageNumber"));
		listAppGroupMappingResponse.setPageSize(_ctx.integerValue("ListAppGroupMappingResponse.PageSize"));
		listAppGroupMappingResponse.setTotalCount(_ctx.longValue("ListAppGroupMappingResponse.TotalCount"));
		listAppGroupMappingResponse.setErrorMsg(_ctx.stringValue("ListAppGroupMappingResponse.ErrorMsg"));

		List<AppGroupMappingDetail> data = new ArrayList<AppGroupMappingDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListAppGroupMappingResponse.Data.Length"); i++) {
			AppGroupMappingDetail appGroupMappingDetail = new AppGroupMappingDetail();
			appGroupMappingDetail.setId(_ctx.longValue("ListAppGroupMappingResponse.Data["+ i +"].Id"));
			appGroupMappingDetail.setName(_ctx.stringValue("ListAppGroupMappingResponse.Data["+ i +"].Name"));
			appGroupMappingDetail.setGroupId(_ctx.longValue("ListAppGroupMappingResponse.Data["+ i +"].GroupId"));
			appGroupMappingDetail.setAppId(_ctx.longValue("ListAppGroupMappingResponse.Data["+ i +"].AppId"));

			data.add(appGroupMappingDetail);
		}
		listAppGroupMappingResponse.setData(data);
	 
	 	return listAppGroupMappingResponse;
	}
}