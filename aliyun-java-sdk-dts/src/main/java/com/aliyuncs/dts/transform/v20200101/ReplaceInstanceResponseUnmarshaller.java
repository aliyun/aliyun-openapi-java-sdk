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

package com.aliyuncs.dts.transform.v20200101;

import com.aliyuncs.dts.model.v20200101.ReplaceInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReplaceInstanceResponseUnmarshaller {

	public static ReplaceInstanceResponse unmarshall(ReplaceInstanceResponse replaceInstanceResponse, UnmarshallerContext _ctx) {
		
		replaceInstanceResponse.setRequestId(_ctx.stringValue("ReplaceInstanceResponse.RequestId"));
		replaceInstanceResponse.setCode(_ctx.stringValue("ReplaceInstanceResponse.Code"));
		replaceInstanceResponse.setDynamicMessage(_ctx.stringValue("ReplaceInstanceResponse.DynamicMessage"));
		replaceInstanceResponse.setErrCode(_ctx.stringValue("ReplaceInstanceResponse.ErrCode"));
		replaceInstanceResponse.setErrMessage(_ctx.stringValue("ReplaceInstanceResponse.ErrMessage"));
		replaceInstanceResponse.setHttpStatusCode(_ctx.integerValue("ReplaceInstanceResponse.HttpStatusCode"));
		replaceInstanceResponse.setSuccess(_ctx.booleanValue("ReplaceInstanceResponse.Success"));
		replaceInstanceResponse.setDtsJobId(_ctx.stringValue("ReplaceInstanceResponse.DtsJobId"));
		replaceInstanceResponse.setInstanceId(_ctx.stringValue("ReplaceInstanceResponse.InstanceId"));
		replaceInstanceResponse.setChargeType(_ctx.stringValue("ReplaceInstanceResponse.ChargeType"));
		replaceInstanceResponse.setEndTime(_ctx.stringValue("ReplaceInstanceResponse.EndTime"));
	 
	 	return replaceInstanceResponse;
	}
}