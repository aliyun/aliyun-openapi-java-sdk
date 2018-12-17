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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStoresResponseUnmarshaller {

	public static DescribeStoresResponse unmarshall(DescribeStoresResponse describeStoresResponse, UnmarshallerContext context) {
		
		describeStoresResponse.setRequestId(context.stringValue("DescribeStoresResponse.RequestId"));
		describeStoresResponse.setSuccess(context.booleanValue("DescribeStoresResponse.Success"));
		describeStoresResponse.setMessage(context.stringValue("DescribeStoresResponse.Message"));
		describeStoresResponse.setErrorCode(context.stringValue("DescribeStoresResponse.ErrorCode"));
		describeStoresResponse.setTotalCount(context.integerValue("DescribeStoresResponse.TotalCount"));
		describeStoresResponse.setPageNumber(context.integerValue("DescribeStoresResponse.PageNumber"));
		describeStoresResponse.setPageSize(context.integerValue("DescribeStoresResponse.PageSize"));

		List<StoreInfo> stores = new ArrayList<StoreInfo>();
		for (int i = 0; i < context.lengthValue("DescribeStoresResponse.Stores.Length"); i++) {
			StoreInfo storeInfo = new StoreInfo();
			storeInfo.setCompanyId(context.stringValue("DescribeStoresResponse.Stores["+ i +"].CompanyId"));
			storeInfo.setStoreId(context.stringValue("DescribeStoresResponse.Stores["+ i +"].StoreId"));
			storeInfo.setStoreName(context.stringValue("DescribeStoresResponse.Stores["+ i +"].StoreName"));
			storeInfo.setBrand(context.stringValue("DescribeStoresResponse.Stores["+ i +"].Brand"));
			storeInfo.setOutId(context.stringValue("DescribeStoresResponse.Stores["+ i +"].OutId"));
			storeInfo.setPhone(context.stringValue("DescribeStoresResponse.Stores["+ i +"].Phone"));
			storeInfo.setLevel(context.stringValue("DescribeStoresResponse.Stores["+ i +"].Level"));
			storeInfo.setGroups(context.stringValue("DescribeStoresResponse.Stores["+ i +"].Groups"));
			storeInfo.setComments(context.stringValue("DescribeStoresResponse.Stores["+ i +"].Comments"));
			storeInfo.setParentId(context.stringValue("DescribeStoresResponse.Stores["+ i +"].ParentId"));
			storeInfo.setGmtCreate(context.stringValue("DescribeStoresResponse.Stores["+ i +"].GmtCreate"));
			storeInfo.setGmtModified(context.stringValue("DescribeStoresResponse.Stores["+ i +"].GmtModified"));

			stores.add(storeInfo);
		}
		describeStoresResponse.setStores(stores);
	 
	 	return describeStoresResponse;
	}
}