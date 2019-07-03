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

import com.aliyuncs.iot.model.v20180120.QueryProductResponse;
import com.aliyuncs.iot.model.v20180120.QueryProductResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryProductResponseUnmarshaller {

	public static QueryProductResponse unmarshall(QueryProductResponse queryProductResponse, UnmarshallerContext _ctx) {
		
		queryProductResponse.setRequestId(_ctx.stringValue("QueryProductResponse.RequestId"));
		queryProductResponse.setSuccess(_ctx.booleanValue("QueryProductResponse.Success"));
		queryProductResponse.setCode(_ctx.stringValue("QueryProductResponse.Code"));
		queryProductResponse.setErrorMessage(_ctx.stringValue("QueryProductResponse.ErrorMessage"));

		Data data = new Data();
		data.setGmtCreate(_ctx.longValue("QueryProductResponse.Data.GmtCreate"));
		data.setDataFormat(_ctx.integerValue("QueryProductResponse.Data.DataFormat"));
		data.setDescription(_ctx.stringValue("QueryProductResponse.Data.Description"));
		data.setDeviceCount(_ctx.integerValue("QueryProductResponse.Data.DeviceCount"));
		data.setNodeType(_ctx.integerValue("QueryProductResponse.Data.NodeType"));
		data.setProductKey(_ctx.stringValue("QueryProductResponse.Data.ProductKey"));
		data.setProductName(_ctx.stringValue("QueryProductResponse.Data.ProductName"));
		data.setProductSecret(_ctx.stringValue("QueryProductResponse.Data.ProductSecret"));
		data.setCategoryName(_ctx.stringValue("QueryProductResponse.Data.CategoryName"));
		data.setCategoryKey(_ctx.stringValue("QueryProductResponse.Data.CategoryKey"));
		data.setAliyunCommodityCode(_ctx.stringValue("QueryProductResponse.Data.AliyunCommodityCode"));
		data.setId2(_ctx.booleanValue("QueryProductResponse.Data.Id2"));
		data.setProtocolType(_ctx.stringValue("QueryProductResponse.Data.ProtocolType"));
		data.setProductStatus(_ctx.stringValue("QueryProductResponse.Data.ProductStatus"));
		data.setOwner(_ctx.booleanValue("QueryProductResponse.Data.Owner"));
		data.setNetType(_ctx.integerValue("QueryProductResponse.Data.NetType"));
		queryProductResponse.setData(data);
	 
	 	return queryProductResponse;
	}
}