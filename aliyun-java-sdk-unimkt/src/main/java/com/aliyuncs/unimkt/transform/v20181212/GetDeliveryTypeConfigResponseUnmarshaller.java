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

package com.aliyuncs.unimkt.transform.v20181212;

import com.aliyuncs.unimkt.model.v20181212.GetDeliveryTypeConfigResponse;
import com.aliyuncs.unimkt.model.v20181212.GetDeliveryTypeConfigResponse.Header;
import com.aliyuncs.unimkt.model.v20181212.GetDeliveryTypeConfigResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeliveryTypeConfigResponseUnmarshaller {

	public static GetDeliveryTypeConfigResponse unmarshall(GetDeliveryTypeConfigResponse getDeliveryTypeConfigResponse, UnmarshallerContext _ctx) {
		
		getDeliveryTypeConfigResponse.setRequestId(_ctx.stringValue("GetDeliveryTypeConfigResponse.RequestId"));
		getDeliveryTypeConfigResponse.setSuccess(_ctx.booleanValue("GetDeliveryTypeConfigResponse.Success"));
		getDeliveryTypeConfigResponse.setErrorCode(_ctx.stringValue("GetDeliveryTypeConfigResponse.ErrorCode"));
		getDeliveryTypeConfigResponse.setErrorMsg(_ctx.stringValue("GetDeliveryTypeConfigResponse.ErrorMsg"));
		getDeliveryTypeConfigResponse.setExt(_ctx.mapValue("GetDeliveryTypeConfigResponse.Ext"));

		Result result = new Result();
		result.setCode(_ctx.stringValue("GetDeliveryTypeConfigResponse.Result.Code"));
		result.setName(_ctx.stringValue("GetDeliveryTypeConfigResponse.Result.Name"));
		result.setDesc(_ctx.stringValue("GetDeliveryTypeConfigResponse.Result.Desc"));
		result.setAccountType(_ctx.stringValue("GetDeliveryTypeConfigResponse.Result.AccountType"));
		getDeliveryTypeConfigResponse.setResult(result);

		Header header = new Header();
		header.setTraceId(_ctx.stringValue("GetDeliveryTypeConfigResponse.Header.TraceId"));
		header.setRpcId(_ctx.stringValue("GetDeliveryTypeConfigResponse.Header.RpcId"));
		header.setVersion(_ctx.stringValue("GetDeliveryTypeConfigResponse.Header.Version"));
		header.setCostTime(_ctx.longValue("GetDeliveryTypeConfigResponse.Header.CostTime"));
		getDeliveryTypeConfigResponse.setHeader(header);
	 
	 	return getDeliveryTypeConfigResponse;
	}
}