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

package com.aliyuncs.agency.transform.v20180703;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.agency.model.v20180703.GetShareAccountListResponse;
import com.aliyuncs.agency.model.v20180703.GetShareAccountListResponse.Data;
import com.aliyuncs.agency.model.v20180703.GetShareAccountListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetShareAccountListResponseUnmarshaller {

	public static GetShareAccountListResponse unmarshall(GetShareAccountListResponse getShareAccountListResponse, UnmarshallerContext _ctx) {
		
		getShareAccountListResponse.setCode(_ctx.stringValue("GetShareAccountListResponse.Code"));
		getShareAccountListResponse.setMessage(_ctx.stringValue("GetShareAccountListResponse.Message"));
		getShareAccountListResponse.setSuccess(_ctx.booleanValue("GetShareAccountListResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("GetShareAccountListResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetShareAccountListResponse.PageInfo.Total"));
		pageInfo.setPage(_ctx.integerValue("GetShareAccountListResponse.PageInfo.Page"));
		getShareAccountListResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetShareAccountListResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setCustomerAccount(_ctx.stringValue("GetShareAccountListResponse.DataList["+ i +"].CustomerAccount"));
			data.setCid(_ctx.longValue("GetShareAccountListResponse.DataList["+ i +"].Cid"));
			data.setCustomerPhone(_ctx.stringValue("GetShareAccountListResponse.DataList["+ i +"].CustomerPhone"));
			data.setCustomerName(_ctx.stringValue("GetShareAccountListResponse.DataList["+ i +"].CustomerName"));
			data.setParentUid(_ctx.longValue("GetShareAccountListResponse.DataList["+ i +"].ParentUid"));
			data.setCloudAccount(_ctx.stringValue("GetShareAccountListResponse.DataList["+ i +"].CloudAccount"));
			data.setUid(_ctx.longValue("GetShareAccountListResponse.DataList["+ i +"].Uid"));

			dataList.add(data);
		}
		getShareAccountListResponse.setDataList(dataList);
	 
	 	return getShareAccountListResponse;
	}
}