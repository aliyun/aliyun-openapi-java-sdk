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

	public static CreateProductResponse unmarshall(CreateProductResponse createProductResponse, UnmarshallerContext context) {
		
		createProductResponse.setRequestId(context.stringValue("CreateProductResponse.RequestId"));
		createProductResponse.setSuccess(context.booleanValue("CreateProductResponse.Success"));
		createProductResponse.setCode(context.stringValue("CreateProductResponse.Code"));
		createProductResponse.setErrorMessage(context.stringValue("CreateProductResponse.ErrorMessage"));
		createProductResponse.setProductKey(context.stringValue("CreateProductResponse.ProductKey"));

		Data data = new Data();
		data.setDataFormat(context.integerValue("CreateProductResponse.Data.DataFormat"));
		data.setDescription(context.stringValue("CreateProductResponse.Data.Description"));
		data.setNodeType(context.integerValue("CreateProductResponse.Data.NodeType"));
		data.setProductKey(context.stringValue("CreateProductResponse.Data.ProductKey"));
		data.setProductName(context.stringValue("CreateProductResponse.Data.ProductName"));
		data.setAliyunCommodityCode(context.stringValue("CreateProductResponse.Data.AliyunCommodityCode"));
		data.setId2(context.booleanValue("CreateProductResponse.Data.Id2"));
		data.setProtocolType(context.stringValue("CreateProductResponse.Data.ProtocolType"));
		createProductResponse.setData(data);
	 
	 	return createProductResponse;
	}
}