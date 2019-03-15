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

import com.aliyuncs.jarvis.model.v20180206.DescribeCdnIpListResponse;
import com.aliyuncs.jarvis.model.v20180206.DescribeCdnIpListResponse.Data;
import com.aliyuncs.jarvis.model.v20180206.DescribeCdnIpListResponse.PageInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCdnIpListResponseUnmarshaller {

	public static DescribeCdnIpListResponse unmarshall(DescribeCdnIpListResponse describeCdnIpListResponse, UnmarshallerContext context) {
		
		describeCdnIpListResponse.setRequestId(context.stringValue("DescribeCdnIpListResponse.RequestId"));
		describeCdnIpListResponse.setModule(context.stringValue("DescribeCdnIpListResponse.Module"));

		PageInfo pageInfo = new PageInfo();
		pageInfo.setTotal(context.integerValue("DescribeCdnIpListResponse.PageInfo.total"));
		pageInfo.setPageSize(context.integerValue("DescribeCdnIpListResponse.PageInfo.pageSize"));
		pageInfo.setCurrentPage(context.integerValue("DescribeCdnIpListResponse.PageInfo.currentPage"));
		describeCdnIpListResponse.setPageInfo(pageInfo);

		List<Data> dataList = new ArrayList<Data>();
		for (int i = 0; i < context.lengthValue("DescribeCdnIpListResponse.DataList.Length"); i++) {
			Data data = new Data();
			data.setId(context.integerValue("DescribeCdnIpListResponse.DataList["+ i +"].Id"));
			data.setVendorAliuid(context.integerValue("DescribeCdnIpListResponse.DataList["+ i +"].VendorAliuid"));
			data.setIpSeg(context.stringValue("DescribeCdnIpListResponse.DataList["+ i +"].IpSeg"));
			data.setState(context.integerValue("DescribeCdnIpListResponse.DataList["+ i +"].State"));
			data.setCreateTime(context.stringValue("DescribeCdnIpListResponse.DataList["+ i +"].CreateTime"));
			data.setUpdateTime(context.stringValue("DescribeCdnIpListResponse.DataList["+ i +"].UpdateTime"));

			dataList.add(data);
		}
		describeCdnIpListResponse.setDataList(dataList);
	 
	 	return describeCdnIpListResponse;
	}
}