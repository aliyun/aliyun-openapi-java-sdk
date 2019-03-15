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

package com.aliyuncs.jarvis.transform.v20180206;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.jarvis.model.v20180206.DescribeCdnSubscriptionResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeCdnSubscriptionResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeCdnSubscriptionResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnSubscriptionResponseUnmarshaller {

	public static DescribeCdnSubscriptionResponse unmarshall(DescribeCdnSubscriptionResponse describeCdnSubscriptionResponse, UnmarshallerContext context) {
		
		describeCdnSubscriptionResponse.setRequestId(context.stringValue("DescribeCdnSubscriptionResponse.RequestId"));
		describeCdnSubscriptionResponse.setModule(context.stringValue("DescribeCdnSubscriptionResponse.Module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeCdnSubscriptionResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeCdnSubscriptionResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeCdnSubscriptionResponse.PageInfo.currentPage"));
		describeCdnSubscriptionResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeCdnSubscriptionResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setVendorAliuid(context.integerValue("DescribeCdnSubscriptionResponse.DataList["+ i +"].VendorAliuid"));
			data.setVendorName(context.stringValue("DescribeCdnSubscriptionResponse.DataList["+ i +"].VendorName"));
			data.setSafetyFactor(context.stringValue("DescribeCdnSubscriptionResponse.DataList["+ i +"].SafetyFactor"));
			data.setSubscriptionState(context.integerValue("DescribeCdnSubscriptionResponse.DataList["+ i +"].SubscriptionState"));
			data.setGmtCreate(context.stringValue("DescribeCdnSubscriptionResponse.DataList["+ i +"].GmtCreate"));
			data.setUpdateTime(context.stringValue("DescribeCdnSubscriptionResponse.DataList["+ i +"].UpdateTime"));

			dataList.add(data);
		}
		describeCdnSubscriptionResponse.setDataList(dataList);
	 
	 	return describeCdnSubscriptionResponse;
	}
}