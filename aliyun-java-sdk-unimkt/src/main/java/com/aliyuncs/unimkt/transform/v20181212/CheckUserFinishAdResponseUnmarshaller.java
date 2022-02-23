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

import com.aliyuncs.unimkt.model.v20181212.CheckUserFinishAdResponse;
import com.aliyuncs.unimkt.model.v20181212.CheckUserFinishAdResponse.Header;
import com.aliyuncs.unimkt.model.v20181212.CheckUserFinishAdResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckUserFinishAdResponseUnmarshaller {

	public static CheckUserFinishAdResponse unmarshall(CheckUserFinishAdResponse checkUserFinishAdResponse, UnmarshallerContext _ctx) {
		
		checkUserFinishAdResponse.setExt(_ctx.mapValue("CheckUserFinishAdResponse.Ext"));
		checkUserFinishAdResponse.setErrorMsg(_ctx.stringValue("CheckUserFinishAdResponse.ErrorMsg"));
		checkUserFinishAdResponse.setErrorCode(_ctx.stringValue("CheckUserFinishAdResponse.ErrorCode"));
		checkUserFinishAdResponse.setSuccess(_ctx.booleanValue("CheckUserFinishAdResponse.Success"));

		Header header = new Header();
		header.setCostTime(_ctx.longValue("CheckUserFinishAdResponse.Header.CostTime"));
		header.setVersion(_ctx.stringValue("CheckUserFinishAdResponse.Header.Version"));
		header.setRpcId(_ctx.stringValue("CheckUserFinishAdResponse.Header.RpcId"));
		header.setTraceId(_ctx.stringValue("CheckUserFinishAdResponse.Header.TraceId"));
		checkUserFinishAdResponse.setHeader(header);

		Result result = new Result();
		result.setSuccess(_ctx.booleanValue("CheckUserFinishAdResponse.Result.success"));
		checkUserFinishAdResponse.setResult(result);
	 
	 	return checkUserFinishAdResponse;
	}
}