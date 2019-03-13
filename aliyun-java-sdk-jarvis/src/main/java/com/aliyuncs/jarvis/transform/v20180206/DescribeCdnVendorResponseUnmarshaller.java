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

import com.aliyuncs.jarvis.model.v20180206.DescribeCdnVendorResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeCdnVendorResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeCdnVendorResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnVendorResponseUnmarshaller {

	public static DescribeCdnVendorResponse unmarshall(DescribeCdnVendorResponse describeCdnVendorResponse, UnmarshallerContext context) {
		
		describeCdnVendorResponse.setRequestId(context.stringValue("DescribeCdnVendorResponse.RequestId"));
		describeCdnVendorResponse.setModule(context.stringValue("DescribeCdnVendorResponse.Module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeCdnVendorResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeCdnVendorResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeCdnVendorResponse.PageInfo.currentPage"));
		describeCdnVendorResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeCdnVendorResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setVendorAliuid(context.integerValue("DescribeCdnVendorResponse.DataList["+ i +"].VendorAliuid"));
			data.setVendorName(context.stringValue("DescribeCdnVendorResponse.DataList["+ i +"].VendorName"));
			data.setSafetyFactor(context.stringValue("DescribeCdnVendorResponse.DataList["+ i +"].SafetyFactor"));
			data.setGmtCreate(context.stringValue("DescribeCdnVendorResponse.DataList["+ i +"].GmtCreate"));
			data.setUpdateTime(context.stringValue("DescribeCdnVendorResponse.DataList["+ i +"].UpdateTime"));

			dataList.add(data);
		}
		describeCdnVendorResponse.setDataList(dataList);
	 
	 	return describeCdnVendorResponse;
	}
}