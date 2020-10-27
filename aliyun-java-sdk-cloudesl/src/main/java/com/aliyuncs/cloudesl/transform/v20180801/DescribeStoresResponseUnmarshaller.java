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

package com.aliyuncs.cloudesl.transform.v20180801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20180801.DescribeStoresResponse;
import com.aliyuncs.cloudesl.model.v20180801.DescribeStoresResponse.StoreInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStoresResponseUnmarshaller {

	public static DescribeStoresResponse unmarshall(DescribeStoresResponse describeStoresResponse, UnmarshallerContext _ctx) {
		
		describeStoresResponse.setRequestId(_ctx.stringValue("DescribeStoresResponse.RequestId"));
		describeStoresResponse.setSuccess(_ctx.booleanValue("DescribeStoresResponse.Success"));
		describeStoresResponse.setMessage(_ctx.stringValue("DescribeStoresResponse.Message"));
		describeStoresResponse.setErrorCode(_ctx.stringValue("DescribeStoresResponse.ErrorCode"));
		describeStoresResponse.setTotalCount(_ctx.integerValue("DescribeStoresResponse.TotalCount"));
		describeStoresResponse.setPageNumber(_ctx.integerValue("DescribeStoresResponse.PageNumber"));
		describeStoresResponse.setPageSize(_ctx.integerValue("DescribeStoresResponse.PageSize"));

		List<StoreInfo> stores = new ArrayList<StoreInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStoresResponse.Stores.Length"); i++) {
			StoreInfo storeInfo = new StoreInfo();
			storeInfo.setCompanyId(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].CompanyId"));
			storeInfo.setStoreId(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].StoreId"));
			storeInfo.setStoreName(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].StoreName"));
			storeInfo.setBrand(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].Brand"));
			storeInfo.setOutId(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].OutId"));
			storeInfo.setPhone(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].Phone"));
			storeInfo.setLevel(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].Level"));
			storeInfo.setGroups(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].Groups"));
			storeInfo.setComments(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].Comments"));
			storeInfo.setParentId(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].ParentId"));
			storeInfo.setGmtCreate(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].GmtCreate"));
			storeInfo.setGmtModified(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].GmtModified"));

			stores.add(storeInfo);
		}
		describeStoresResponse.setStores(stores);
	 
	 	return describeStoresResponse;
	}
}