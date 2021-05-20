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

package com.aliyuncs.privatelink.transform.v20200415;

import com.aliyuncs.privatelink.model.v20200415.CheckProductOpenResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckProductOpenResponseUnmarshaller {

	public static CheckProductOpenResponse unmarshall(CheckProductOpenResponse checkProductOpenResponse, UnmarshallerContext _ctx) {
		
		checkProductOpenResponse.setRequestId(_ctx.stringValue("CheckProductOpenResponse.RequestId"));
		checkProductOpenResponse.setSuccess(_ctx.booleanValue("CheckProductOpenResponse.Success"));
	 
	 	return checkProductOpenResponse;
	}
}