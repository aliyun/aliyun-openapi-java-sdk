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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryProductListResponse;
import com.aliyuncs.iot.model.v20180120.QueryProductListResponse.Data;
import com.aliyuncs.iot.model.v20180120.QueryProductListResponse.Data.ProductInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductListResponseUnmarshaller {

	public static QueryProductListResponse unmarshall(QueryProductListResponse queryProductListResponse, UnmarshallerContext context) {
		
		queryProductListResponse.setRequestId(context.stringValue("QueryProductListResponse.RequestId"));
		queryProductListResponse.setSuccess(context.booleanValue("QueryProductListResponse.Success"));
		queryProductListResponse.setCode(context.stringValue("QueryProductListResponse.Code"));
		queryProductListResponse.setErrorMessage(context.stringValue("QueryProductListResponse.ErrorMessage"));

		Data data = new Data();
		data.setCurrentPage(context.integerValue("QueryProductListResponse.Data.CurrentPage"));
		data.setPageCount(context.integerValue("QueryProductListResponse.Data.PageCount"));
		data.setPageSize(context.integerValue("QueryProductListResponse.Data.PageSize"));
		data.setTotal(context.integerValue("QueryProductListResponse.Data.Total"));

		List<ProductInfo> list = new ArrayList<ProductInfo>();
		for (int i = 0; i < context.lengthValue("QueryProductListResponse.Data.List.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setGmtCreate(context.longValue("QueryProductListResponse.Data.List["+ i +"].GmtCreate"));
			productInfo.setDataFormat(context.integerValue("QueryProductListResponse.Data.List["+ i +"].DataFormat"));
			productInfo.setDescription(context.stringValue("QueryProductListResponse.Data.List["+ i +"].Description"));
			productInfo.setDeviceCount(context.integerValue("QueryProductListResponse.Data.List["+ i +"].DeviceCount"));
			productInfo.setNodeType(context.integerValue("QueryProductListResponse.Data.List["+ i +"].NodeType"));
			productInfo.setProductKey(context.stringValue("QueryProductListResponse.Data.List["+ i +"].ProductKey"));
			productInfo.setProductName(context.stringValue("QueryProductListResponse.Data.List["+ i +"].ProductName"));

			list.add(productInfo);
		}
		data.setList(list);
		queryProductListResponse.setData(data);
	 
	 	return queryProductListResponse;
	}
}