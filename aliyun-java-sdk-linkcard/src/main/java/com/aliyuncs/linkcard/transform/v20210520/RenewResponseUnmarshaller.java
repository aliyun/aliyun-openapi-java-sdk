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

package com.aliyuncs.linkcard.transform.v20210520;

import com.aliyuncs.linkcard.model.v20210520.RenewResponse;
import com.aliyuncs.linkcard.model.v20210520.RenewResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenewResponseUnmarshaller {

	public static RenewResponse unmarshall(RenewResponse renewResponse, UnmarshallerContext _ctx) {
		
		renewResponse.setRequestId(_ctx.stringValue("RenewResponse.RequestId"));
		renewResponse.setCode(_ctx.stringValue("RenewResponse.Code"));
		renewResponse.setErrorMessage(_ctx.stringValue("RenewResponse.ErrorMessage"));
		renewResponse.setLocalizedMessage(_ctx.stringValue("RenewResponse.LocalizedMessage"));
		renewResponse.setSuccess(_ctx.booleanValue("RenewResponse.Success"));

		Data data = new Data();
		data.setOrderNo(_ctx.stringValue("RenewResponse.Data.OrderNo"));
		data.setSerialNo(_ctx.stringValue("RenewResponse.Data.SerialNo"));
		renewResponse.setData(data);
	 
	 	return renewResponse;
	}
}