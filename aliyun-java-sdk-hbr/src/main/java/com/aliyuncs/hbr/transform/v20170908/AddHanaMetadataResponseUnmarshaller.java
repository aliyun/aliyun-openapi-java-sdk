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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.AddHanaMetadataResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddHanaMetadataResponseUnmarshaller {

	public static AddHanaMetadataResponse unmarshall(AddHanaMetadataResponse addHanaMetadataResponse, UnmarshallerContext _ctx) {
		
		addHanaMetadataResponse.setRequestId(_ctx.stringValue("AddHanaMetadataResponse.RequestId"));
		addHanaMetadataResponse.setSuccess(_ctx.booleanValue("AddHanaMetadataResponse.Success"));
		addHanaMetadataResponse.setCode(_ctx.stringValue("AddHanaMetadataResponse.Code"));
		addHanaMetadataResponse.setMessage(_ctx.stringValue("AddHanaMetadataResponse.Message"));
	 
	 	return addHanaMetadataResponse;
	}
}