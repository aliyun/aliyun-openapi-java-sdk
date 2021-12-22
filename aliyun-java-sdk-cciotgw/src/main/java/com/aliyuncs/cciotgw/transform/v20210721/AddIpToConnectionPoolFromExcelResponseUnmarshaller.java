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

package com.aliyuncs.cciotgw.transform.v20210721;

import com.aliyuncs.cciotgw.model.v20210721.AddIpToConnectionPoolFromExcelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddIpToConnectionPoolFromExcelResponseUnmarshaller {

	public static AddIpToConnectionPoolFromExcelResponse unmarshall(AddIpToConnectionPoolFromExcelResponse addIpToConnectionPoolFromExcelResponse, UnmarshallerContext _ctx) {
		
		addIpToConnectionPoolFromExcelResponse.setRequestId(_ctx.stringValue("AddIpToConnectionPoolFromExcelResponse.RequestId"));
		addIpToConnectionPoolFromExcelResponse.setCode(_ctx.stringValue("AddIpToConnectionPoolFromExcelResponse.Code"));
		addIpToConnectionPoolFromExcelResponse.setMessage(_ctx.stringValue("AddIpToConnectionPoolFromExcelResponse.Message"));
		addIpToConnectionPoolFromExcelResponse.setSuccess(_ctx.stringValue("AddIpToConnectionPoolFromExcelResponse.Success"));
		addIpToConnectionPoolFromExcelResponse.setAsynToken(_ctx.stringValue("AddIpToConnectionPoolFromExcelResponse.AsynToken"));
	 
	 	return addIpToConnectionPoolFromExcelResponse;
	}
}