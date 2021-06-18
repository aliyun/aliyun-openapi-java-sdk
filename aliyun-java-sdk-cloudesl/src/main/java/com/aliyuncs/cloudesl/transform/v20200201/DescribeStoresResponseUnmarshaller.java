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

package com.aliyuncs.cloudesl.transform.v20200201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudesl.model.v20200201.DescribeStoresResponse;
import com.aliyuncs.cloudesl.model.v20200201.DescribeStoresResponse.StoreInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeStoresResponseUnmarshaller {

	public static DescribeStoresResponse unmarshall(DescribeStoresResponse describeStoresResponse, UnmarshallerContext _ctx) {
		
		describeStoresResponse.setRequestId(_ctx.stringValue("DescribeStoresResponse.RequestId"));
		describeStoresResponse.setErrorMessage(_ctx.stringValue("DescribeStoresResponse.ErrorMessage"));
		describeStoresResponse.setErrorCode(_ctx.stringValue("DescribeStoresResponse.ErrorCode"));
		describeStoresResponse.setTotalCount(_ctx.integerValue("DescribeStoresResponse.TotalCount"));
		describeStoresResponse.setMessage(_ctx.stringValue("DescribeStoresResponse.Message"));
		describeStoresResponse.setPageSize(_ctx.integerValue("DescribeStoresResponse.PageSize"));
		describeStoresResponse.setDynamicCode(_ctx.stringValue("DescribeStoresResponse.DynamicCode"));
		describeStoresResponse.setCode(_ctx.stringValue("DescribeStoresResponse.Code"));
		describeStoresResponse.setPageNumber(_ctx.integerValue("DescribeStoresResponse.PageNumber"));
		describeStoresResponse.setDynamicMessage(_ctx.stringValue("DescribeStoresResponse.DynamicMessage"));
		describeStoresResponse.setSuccess(_ctx.booleanValue("DescribeStoresResponse.Success"));

		List<StoreInfo> stores = new ArrayList<StoreInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeStoresResponse.Stores.Length"); i++) {
			StoreInfo storeInfo = new StoreInfo();
			storeInfo.setStoreName(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].StoreName"));
			storeInfo.setStoreId(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].StoreId"));
			storeInfo.setGmtCreate(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].GmtCreate"));
			storeInfo.setParentId(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].ParentId"));
			storeInfo.setUserStoreCode(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].UserStoreCode"));
			storeInfo.setGmtModified(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].GmtModified"));
			storeInfo.setPhone(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].Phone"));
			storeInfo.setLevel(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].Level"));
			storeInfo.setTemplateVersion(_ctx.stringValue("DescribeStoresResponse.Stores["+ i +"].TemplateVersion"));

			stores.add(storeInfo);
		}
		describeStoresResponse.setStores(stores);
	 
	 	return describeStoresResponse;
	}
}