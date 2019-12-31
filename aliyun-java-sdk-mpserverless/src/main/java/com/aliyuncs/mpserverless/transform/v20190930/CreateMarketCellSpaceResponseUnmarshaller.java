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

package com.aliyuncs.mpserverless.transform.v20190930;

import com.aliyuncs.mpserverless.model.v20190930.CreateMarketCellSpaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateMarketCellSpaceResponseUnmarshaller {

	public static CreateMarketCellSpaceResponse unmarshall(CreateMarketCellSpaceResponse createMarketCellSpaceResponse, UnmarshallerContext _ctx) {
		
		createMarketCellSpaceResponse.setRequestId(_ctx.stringValue("CreateMarketCellSpaceResponse.RequestId"));
		createMarketCellSpaceResponse.setHttpStatusCode(_ctx.stringValue("CreateMarketCellSpaceResponse.HttpStatusCode"));
		createMarketCellSpaceResponse.setSuccess(_ctx.booleanValue("CreateMarketCellSpaceResponse.Success"));
		createMarketCellSpaceResponse.setCode(_ctx.stringValue("CreateMarketCellSpaceResponse.Code"));
		createMarketCellSpaceResponse.setMessage(_ctx.stringValue("CreateMarketCellSpaceResponse.Message"));
		createMarketCellSpaceResponse.setData(_ctx.booleanValue("CreateMarketCellSpaceResponse.Data"));
	 
	 	return createMarketCellSpaceResponse;
	}
}