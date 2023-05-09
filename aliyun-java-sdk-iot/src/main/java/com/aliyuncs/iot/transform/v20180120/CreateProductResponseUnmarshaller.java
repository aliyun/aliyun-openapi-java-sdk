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

import com.aliyuncs.iot.model.v20180120.CreateProductResponse;
import com.aliyuncs.iot.model.v20180120.CreateProductResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateProductResponseUnmarshaller {

	public static CreateProductResponse unmarshall(CreateProductResponse createProductResponse, UnmarshallerContext _ctx) {
		
		createProductResponse.setRequestId(_ctx.stringValue("CreateProductResponse.RequestId"));
		createProductResponse.setCode(_ctx.stringValue("CreateProductResponse.Code"));
		createProductResponse.setProductKey(_ctx.stringValue("CreateProductResponse.ProductKey"));
		createProductResponse.setErrorMessage(_ctx.stringValue("CreateProductResponse.ErrorMessage"));
		createProductResponse.setSuccess(_ctx.booleanValue("CreateProductResponse.Success"));

		Data data = new Data();
		data.setAuthType(_ctx.stringValue("CreateProductResponse.Data.AuthType"));
		data.setProductKey(_ctx.stringValue("CreateProductResponse.Data.ProductKey"));
		data.setProductName(_ctx.stringValue("CreateProductResponse.Data.ProductName"));
		data.setNodeType(_ctx.integerValue("CreateProductResponse.Data.NodeType"));
		data.setDescription(_ctx.stringValue("CreateProductResponse.Data.Description"));
		data.setId2(_ctx.booleanValue("CreateProductResponse.Data.Id2"));
		data.setProductSecret(_ctx.stringValue("CreateProductResponse.Data.ProductSecret"));
		data.setProtocolType(_ctx.stringValue("CreateProductResponse.Data.ProtocolType"));
		data.setDataFormat(_ctx.integerValue("CreateProductResponse.Data.DataFormat"));
		data.setAliyunCommodityCode(_ctx.stringValue("CreateProductResponse.Data.AliyunCommodityCode"));
		createProductResponse.setData(data);
	 
	 	return createProductResponse;
	}
}