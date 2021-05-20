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

import com.aliyuncs.dts.model.v20200101.TransferPayTypeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferPayTypeResponseUnmarshaller {

	public static TransferPayTypeResponse unmarshall(TransferPayTypeResponse transferPayTypeResponse, UnmarshallerContext _ctx) {
		
		transferPayTypeResponse.setRequestId(_ctx.stringValue("TransferPayTypeResponse.RequestId"));
		transferPayTypeResponse.setCode(_ctx.stringValue("TransferPayTypeResponse.Code"));
		transferPayTypeResponse.setDynamicMessage(_ctx.stringValue("TransferPayTypeResponse.DynamicMessage"));
		transferPayTypeResponse.setErrCode(_ctx.stringValue("TransferPayTypeResponse.ErrCode"));
		transferPayTypeResponse.setErrMessage(_ctx.stringValue("TransferPayTypeResponse.ErrMessage"));
		transferPayTypeResponse.setHttpStatusCode(_ctx.integerValue("TransferPayTypeResponse.HttpStatusCode"));
		transferPayTypeResponse.setSuccess(_ctx.booleanValue("TransferPayTypeResponse.Success"));
		transferPayTypeResponse.setDtsJobId(_ctx.stringValue("TransferPayTypeResponse.DtsJobId"));
		transferPayTypeResponse.setInstanceId(_ctx.stringValue("TransferPayTypeResponse.InstanceId"));
		transferPayTypeResponse.setChargeType(_ctx.stringValue("TransferPayTypeResponse.ChargeType"));
		transferPayTypeResponse.setEndTime(_ctx.stringValue("TransferPayTypeResponse.EndTime"));
	 
	 	return transferPayTypeResponse;
	}
}