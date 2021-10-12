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

import com.aliyuncs.dts.model.v20200101.TransferInstanceClassResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferInstanceClassResponseUnmarshaller {

	public static TransferInstanceClassResponse unmarshall(TransferInstanceClassResponse transferInstanceClassResponse, UnmarshallerContext _ctx) {
		
		transferInstanceClassResponse.setRequestId(_ctx.stringValue("TransferInstanceClassResponse.RequestId"));
		transferInstanceClassResponse.setEndTime(_ctx.stringValue("TransferInstanceClassResponse.EndTime"));
		transferInstanceClassResponse.setHttpStatusCode(_ctx.integerValue("TransferInstanceClassResponse.HttpStatusCode"));
		transferInstanceClassResponse.setDtsJobId(_ctx.stringValue("TransferInstanceClassResponse.DtsJobId"));
		transferInstanceClassResponse.setErrCode(_ctx.stringValue("TransferInstanceClassResponse.ErrCode"));
		transferInstanceClassResponse.setSuccess(_ctx.booleanValue("TransferInstanceClassResponse.Success"));
		transferInstanceClassResponse.setChargeType(_ctx.stringValue("TransferInstanceClassResponse.ChargeType"));
		transferInstanceClassResponse.setErrMessage(_ctx.stringValue("TransferInstanceClassResponse.ErrMessage"));
		transferInstanceClassResponse.setCode(_ctx.stringValue("TransferInstanceClassResponse.Code"));
		transferInstanceClassResponse.setDynamicMessage(_ctx.stringValue("TransferInstanceClassResponse.DynamicMessage"));
		transferInstanceClassResponse.setInstanceId(_ctx.stringValue("TransferInstanceClassResponse.InstanceId"));
	 
	 	return transferInstanceClassResponse;
	}
}