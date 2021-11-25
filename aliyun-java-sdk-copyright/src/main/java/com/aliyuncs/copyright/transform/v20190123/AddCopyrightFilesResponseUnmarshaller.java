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

package com.aliyuncs.copyright.transform.v20190123;

import com.aliyuncs.copyright.model.v20190123.AddCopyrightFilesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddCopyrightFilesResponseUnmarshaller {

	public static AddCopyrightFilesResponse unmarshall(AddCopyrightFilesResponse addCopyrightFilesResponse, UnmarshallerContext _ctx) {
		
		addCopyrightFilesResponse.setRequestId(_ctx.stringValue("AddCopyrightFilesResponse.RequestId"));
		addCopyrightFilesResponse.setToken(_ctx.stringValue("AddCopyrightFilesResponse.Token"));
		addCopyrightFilesResponse.setSuccess(_ctx.booleanValue("AddCopyrightFilesResponse.Success"));
	 
	 	return addCopyrightFilesResponse;
	}
}