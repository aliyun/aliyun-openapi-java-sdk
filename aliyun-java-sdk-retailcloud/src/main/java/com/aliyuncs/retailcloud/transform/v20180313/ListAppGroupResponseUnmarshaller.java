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

import com.aliyuncs.retailcloud.model.v20180313.ListAppGroupResponse;
import com.aliyuncs.retailcloud.model.v20180313.ListAppGroupResponse.AppGroupDetail;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppGroupResponseUnmarshaller {

	public static ListAppGroupResponse unmarshall(ListAppGroupResponse listAppGroupResponse, UnmarshallerContext _ctx) {
		
		listAppGroupResponse.setRequestId(_ctx.stringValue("ListAppGroupResponse.RequestId"));
		listAppGroupResponse.setCode(_ctx.integerValue("ListAppGroupResponse.Code"));
		listAppGroupResponse.setPageNumber(_ctx.integerValue("ListAppGroupResponse.PageNumber"));
		listAppGroupResponse.setPageSize(_ctx.integerValue("ListAppGroupResponse.PageSize"));
		listAppGroupResponse.setTotalCount(_ctx.longValue("ListAppGroupResponse.TotalCount"));
		listAppGroupResponse.setErrorMsg(_ctx.stringValue("ListAppGroupResponse.ErrorMsg"));

		List<AppGroupDetail> data = new ArrayList<AppGroupDetail>();
		for (int i = 0; i < _ctx.lengthValue("ListAppGroupResponse.Data.Length"); i++) {
			AppGroupDetail appGroupDetail = new AppGroupDetail();
			appGroupDetail.setBizName(_ctx.stringValue("ListAppGroupResponse.Data["+ i +"].BizName"));
			appGroupDetail.setName(_ctx.stringValue("ListAppGroupResponse.Data["+ i +"].Name"));
			appGroupDetail.setId(_ctx.longValue("ListAppGroupResponse.Data["+ i +"].Id"));

			data.add(appGroupDetail);
		}
		listAppGroupResponse.setData(data);
	 
	 	return listAppGroupResponse;
	}
}