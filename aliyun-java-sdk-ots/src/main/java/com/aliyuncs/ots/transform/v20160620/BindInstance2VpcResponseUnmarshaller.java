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

package com.aliyuncs.ots.transform.v20160620;

import com.aliyuncs.ots.model.v20160620.BindInstance2VpcResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class BindInstance2VpcResponseUnmarshaller {

	public static BindInstance2VpcResponse unmarshall(BindInstance2VpcResponse bindInstance2VpcResponse, UnmarshallerContext _ctx) {
		
		bindInstance2VpcResponse.setRequestId(_ctx.stringValue("BindInstance2VpcResponse.RequestId"));
		bindInstance2VpcResponse.setEndpoint(_ctx.stringValue("BindInstance2VpcResponse.Endpoint"));
		bindInstance2VpcResponse.setDomain(_ctx.stringValue("BindInstance2VpcResponse.Domain"));
	 
	 	return bindInstance2VpcResponse;
	}
}