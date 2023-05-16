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

import com.aliyuncs.agency.model.v20180703.GetShareCustomerListResponse;
import com.aliyuncs.agency.model.v20180703.GetShareCustomerListResponse.Data;
import com.aliyuncs.agency.model.v20180703.GetShareCustomerListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetShareCustomerListResponseUnmarshaller {

	public static GetShareCustomerListResponse unmarshall(GetShareCustomerListResponse getShareCustomerListResponse, UnmarshallerContext _ctx) {
		
		getShareCustomerListResponse.setCode(_ctx.stringValue("GetShareCustomerListResponse.Code"));
		getShareCustomerListResponse.setMessage(_ctx.stringValue("GetShareCustomerListResponse.Message"));
		getShareCustomerListResponse.setSuccess(_ctx.booleanValue("GetShareCustomerListResponse.Success"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setPageSize(_ctx.integerValue("GetShareCustomerListResponse.PageInfo.PageSize"));
		pageInfo.setTotal(_ctx.integerValue("GetShareCustomerListResponse.PageInfo.Total"));
		pageInfo.setPage(_ctx.integerValue("GetShareCustomerListResponse.PageInfo.Page"));
		getShareCustomerListResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("GetShareCustomerListResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setCustomerName(_ctx.stringValue("GetShareCustomerListResponse.DataList["+ i +"].CustomerName"));
			data.setParentUid(_ctx.longValue("GetShareCustomerListResponse.DataList["+ i +"].ParentUid"));
			data.setExitOnGoingProject(_ctx.stringValue("GetShareCustomerListResponse.DataList["+ i +"].ExitOnGoingProject"));
			data.setCustomerType(_ctx.integerValue("GetShareCustomerListResponse.DataList["+ i +"].CustomerType"));
			data.setCid(_ctx.longValue("GetShareCustomerListResponse.DataList["+ i +"].Cid"));

			List<String> customerAccounts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetShareCustomerListResponse.DataList["+ i +"].CustomerAccounts.Length"); j++) {
				customerAccounts.add(_ctx.stringValue("GetShareCustomerListResponse.DataList["+ i +"].CustomerAccounts["+ j +"]"));
			}
			data.setCustomerAccounts(customerAccounts);

			List<String> customerUids = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetShareCustomerListResponse.DataList["+ i +"].CustomerUids.Length"); j++) {
				customerUids.add(_ctx.stringValue("GetShareCustomerListResponse.DataList["+ i +"].CustomerUids["+ j +"]"));
			}
			data.setCustomerUids(customerUids);

			dataList.add(data);
		}
		getShareCustomerListResponse.setDataList(dataList);
	 
	 	return getShareCustomerListResponse;
	}
}