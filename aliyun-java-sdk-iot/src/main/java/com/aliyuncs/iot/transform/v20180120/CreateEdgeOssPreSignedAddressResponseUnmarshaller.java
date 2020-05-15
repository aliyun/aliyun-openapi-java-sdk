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

import com.aliyuncs.iot.model.v20180120.CreateEdgeOssPreSignedAddressResponse;
import com.aliyuncs.iot.model.v20180120.CreateEdgeOssPreSignedAddressResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEdgeOssPreSignedAddressResponseUnmarshaller {

	public static CreateEdgeOssPreSignedAddressResponse unmarshall(CreateEdgeOssPreSignedAddressResponse createEdgeOssPreSignedAddressResponse, UnmarshallerContext _ctx) {
		
		createEdgeOssPreSignedAddressResponse.setRequestId(_ctx.stringValue("CreateEdgeOssPreSignedAddressResponse.RequestId"));
		createEdgeOssPreSignedAddressResponse.setSuccess(_ctx.booleanValue("CreateEdgeOssPreSignedAddressResponse.Success"));
		createEdgeOssPreSignedAddressResponse.setCode(_ctx.stringValue("CreateEdgeOssPreSignedAddressResponse.Code"));
		createEdgeOssPreSignedAddressResponse.setErrorMessage(_ctx.stringValue("CreateEdgeOssPreSignedAddressResponse.ErrorMessage"));

		Data data = new Data();
		data.setOssPreSignedAddress(_ctx.stringValue("CreateEdgeOssPreSignedAddressResponse.Data.OssPreSignedAddress"));
		data.setOssAddress(_ctx.stringValue("CreateEdgeOssPreSignedAddressResponse.Data.OssAddress"));
		createEdgeOssPreSignedAddressResponse.setData(data);
	 
	 	return createEdgeOssPreSignedAddressResponse;
	}
}