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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import com.aliyuncs.openanalytics_open.model.v20180619.GetPolarDbInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPolarDbInstanceResponseUnmarshaller {

	public static GetPolarDbInstanceResponse unmarshall(GetPolarDbInstanceResponse getPolarDbInstanceResponse, UnmarshallerContext _ctx) {
		
		getPolarDbInstanceResponse.setRequestId(_ctx.stringValue("GetPolarDbInstanceResponse.RequestId"));
		getPolarDbInstanceResponse.setData(_ctx.stringValue("GetPolarDbInstanceResponse.Data"));
		getPolarDbInstanceResponse.setMessage(_ctx.stringValue("GetPolarDbInstanceResponse.Message"));
		getPolarDbInstanceResponse.setCode(_ctx.stringValue("GetPolarDbInstanceResponse.Code"));
		getPolarDbInstanceResponse.setHttpStatusCode(_ctx.integerValue("GetPolarDbInstanceResponse.HttpStatusCode"));
		getPolarDbInstanceResponse.setSuccess(_ctx.booleanValue("GetPolarDbInstanceResponse.Success"));
	 
	 	return getPolarDbInstanceResponse;
	}
}