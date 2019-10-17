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
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductListResponseUnmarshaller {

	public static QueryProductListResponse unmarshall(QueryProductListResponse queryProductListResponse, UnmarshallerContext _ctx) {
		
		queryProductListResponse.setRequestId(_ctx.stringValue("QueryProductListResponse.RequestId"));
		queryProductListResponse.setSuccess(_ctx.booleanValue("QueryProductListResponse.Success"));
		queryProductListResponse.setCode(_ctx.stringValue("QueryProductListResponse.Code"));
		queryProductListResponse.setErrorMessage(_ctx.stringValue("QueryProductListResponse.ErrorMessage"));

		Data data = new Data();
		data.setCurrentPage(_ctx.integerValue("QueryProductListResponse.Data.CurrentPage"));
		data.setPageCount(_ctx.integerValue("QueryProductListResponse.Data.PageCount"));
		data.setPageSize(_ctx.integerValue("QueryProductListResponse.Data.PageSize"));
		data.setTotal(_ctx.integerValue("QueryProductListResponse.Data.Total"));

		List<ProductInfo> list = new ArrayList<ProductInfo>();
		for (int i = 0; i < _ctx.lengthValue("QueryProductListResponse.Data.List.Length"); i++) {
			ProductInfo productInfo = new ProductInfo();
			productInfo.setGmtCreate(_ctx.longValue("QueryProductListResponse.Data.List["+ i +"].GmtCreate"));
			productInfo.setDataFormat(_ctx.integerValue("QueryProductListResponse.Data.List["+ i +"].DataFormat"));
			productInfo.setDescription(_ctx.stringValue("QueryProductListResponse.Data.List["+ i +"].Description"));
			productInfo.setDeviceCount(_ctx.integerValue("QueryProductListResponse.Data.List["+ i +"].DeviceCount"));
			productInfo.setNodeType(_ctx.integerValue("QueryProductListResponse.Data.List["+ i +"].NodeType"));
			productInfo.setProductKey(_ctx.stringValue("QueryProductListResponse.Data.List["+ i +"].ProductKey"));
			productInfo.setProductName(_ctx.stringValue("QueryProductListResponse.Data.List["+ i +"].ProductName"));
			productInfo.setAuthType(_ctx.stringValue("QueryProductListResponse.Data.List["+ i +"].AuthType"));

			list.add(productInfo);
		}
		data.setList(list);
		queryProductListResponse.setData(data);
	 
	 	return queryProductListResponse;
	}
}