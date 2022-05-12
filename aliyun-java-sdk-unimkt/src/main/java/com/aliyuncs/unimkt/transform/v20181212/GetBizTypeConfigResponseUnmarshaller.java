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

import com.aliyuncs.unimkt.model.v20181212.GetBizTypeConfigResponse;
import com.aliyuncs.unimkt.model.v20181212.GetBizTypeConfigResponse.Header;
import com.aliyuncs.unimkt.model.v20181212.GetBizTypeConfigResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBizTypeConfigResponseUnmarshaller {

	public static GetBizTypeConfigResponse unmarshall(GetBizTypeConfigResponse getBizTypeConfigResponse, UnmarshallerContext _ctx) {
		
		getBizTypeConfigResponse.setRequestId(_ctx.stringValue("GetBizTypeConfigResponse.RequestId"));
		getBizTypeConfigResponse.setSuccess(_ctx.booleanValue("GetBizTypeConfigResponse.Success"));
		getBizTypeConfigResponse.setErrorCode(_ctx.stringValue("GetBizTypeConfigResponse.ErrorCode"));
		getBizTypeConfigResponse.setErrorMsg(_ctx.stringValue("GetBizTypeConfigResponse.ErrorMsg"));
		getBizTypeConfigResponse.setExt(_ctx.mapValue("GetBizTypeConfigResponse.Ext"));

		Result result = new Result();
		result.setCode(_ctx.stringValue("GetBizTypeConfigResponse.Result.Code"));
		result.setName(_ctx.stringValue("GetBizTypeConfigResponse.Result.Name"));
		result.setDesc(_ctx.stringValue("GetBizTypeConfigResponse.Result.Desc"));
		result.setAccountType(_ctx.stringValue("GetBizTypeConfigResponse.Result.AccountType"));
		result.setChargeType(_ctx.stringValue("GetBizTypeConfigResponse.Result.ChargeType"));
		result.setTransactionMode(_ctx.stringValue("GetBizTypeConfigResponse.Result.TransactionMode"));
		getBizTypeConfigResponse.setResult(result);

		Header header = new Header();
		header.setTraceId(_ctx.stringValue("GetBizTypeConfigResponse.Header.TraceId"));
		header.setRpcId(_ctx.stringValue("GetBizTypeConfigResponse.Header.RpcId"));
		header.setVersion(_ctx.stringValue("GetBizTypeConfigResponse.Header.Version"));
		header.setCostTime(_ctx.longValue("GetBizTypeConfigResponse.Header.CostTime"));
		getBizTypeConfigResponse.setHeader(header);
	 
	 	return getBizTypeConfigResponse;
	}
}