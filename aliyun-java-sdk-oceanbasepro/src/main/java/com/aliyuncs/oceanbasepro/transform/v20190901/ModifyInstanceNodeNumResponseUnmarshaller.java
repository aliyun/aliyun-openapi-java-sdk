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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import com.aliyuncs.oceanbasepro.model.v20190901.ModifyInstanceNodeNumResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.ModifyInstanceNodeNumResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ModifyInstanceNodeNumResponseUnmarshaller {

	public static ModifyInstanceNodeNumResponse unmarshall(ModifyInstanceNodeNumResponse modifyInstanceNodeNumResponse, UnmarshallerContext _ctx) {
		
		modifyInstanceNodeNumResponse.setRequestId(_ctx.stringValue("ModifyInstanceNodeNumResponse.RequestId"));

		Data data = new Data();
		data.setOrderId(_ctx.stringValue("ModifyInstanceNodeNumResponse.Data.OrderId"));
		data.setDryRunResult(_ctx.booleanValue("ModifyInstanceNodeNumResponse.Data.DryRunResult"));
		modifyInstanceNodeNumResponse.setData(data);
	 
	 	return modifyInstanceNodeNumResponse;
	}
}