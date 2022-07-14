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

package com.aliyuncs.imarketing.transform.v20220704;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imarketing.model.v20220704.GetBrandPageResponse;
import com.aliyuncs.imarketing.model.v20220704.GetBrandPageResponse.Data;
import com.aliyuncs.imarketing.model.v20220704.GetBrandPageResponse.Data.ListItem;
import com.aliyuncs.imarketing.model.v20220704.GetBrandPageResponse.Data.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBrandPageResponseUnmarshaller {

	public static GetBrandPageResponse unmarshall(GetBrandPageResponse getBrandPageResponse, UnmarshallerContext _ctx) {
		
		getBrandPageResponse.setRequestId(_ctx.stringValue("GetBrandPageResponse.RequestId"));
		getBrandPageResponse.setCode(_ctx.longValue("GetBrandPageResponse.Code"));
		getBrandPageResponse.setSuccess(_ctx.booleanValue("GetBrandPageResponse.Success"));

		Data data = new Data();

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPage(_ctx.integerValue("GetBrandPageResponse.Data.PageInfo.Page"));
		pageInfo.setPageSize(_ctx.integerValue("GetBrandPageResponse.Data.PageInfo.PageSize"));
		pageInfo.setTotalNumber(_ctx.integerValue("GetBrandPageResponse.Data.PageInfo.TotalNumber"));
		data.setPageInfo(pageInfo);

		List<ListItem> list = new ArrayList<ListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBrandPageResponse.Data.List.Length"); i++) {
			ListItem listItem = new ListItem();
			listItem.setAccountNo(_ctx.stringValue("GetBrandPageResponse.Data.List["+ i +"].AccountNo"));
			listItem.setAccountType(_ctx.stringValue("GetBrandPageResponse.Data.List["+ i +"].AccountType"));
			listItem.setCompany(_ctx.stringValue("GetBrandPageResponse.Data.List["+ i +"].Company"));
			listItem.setMainId(_ctx.longValue("GetBrandPageResponse.Data.List["+ i +"].MainId"));
			listItem.setMainName(_ctx.stringValue("GetBrandPageResponse.Data.List["+ i +"].MainName"));
			listItem.setParentMainId(_ctx.longValue("GetBrandPageResponse.Data.List["+ i +"].ParentMainId"));

			list.add(listItem);
		}
		data.setList(list);
		getBrandPageResponse.setData(data);
	 
	 	return getBrandPageResponse;
	}
}