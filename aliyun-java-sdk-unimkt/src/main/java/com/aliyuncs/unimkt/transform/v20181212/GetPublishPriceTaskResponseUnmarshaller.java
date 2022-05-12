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

import com.aliyuncs.unimkt.model.v20181212.GetPublishPriceTaskResponse;
import com.aliyuncs.unimkt.model.v20181212.GetPublishPriceTaskResponse.Header;
import com.aliyuncs.unimkt.model.v20181212.GetPublishPriceTaskResponse.Result;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPublishPriceTaskResponseUnmarshaller {

	public static GetPublishPriceTaskResponse unmarshall(GetPublishPriceTaskResponse getPublishPriceTaskResponse, UnmarshallerContext _ctx) {
		
		getPublishPriceTaskResponse.setRequestId(_ctx.stringValue("GetPublishPriceTaskResponse.RequestId"));
		getPublishPriceTaskResponse.setSuccess(_ctx.booleanValue("GetPublishPriceTaskResponse.Success"));
		getPublishPriceTaskResponse.setErrorCode(_ctx.stringValue("GetPublishPriceTaskResponse.ErrorCode"));
		getPublishPriceTaskResponse.setErrorMsg(_ctx.stringValue("GetPublishPriceTaskResponse.ErrorMsg"));
		getPublishPriceTaskResponse.setExt(_ctx.mapValue("GetPublishPriceTaskResponse.Ext"));

		Result result = new Result();
		result.setId(_ctx.longValue("GetPublishPriceTaskResponse.Result.Id"));
		result.setTaskId(_ctx.stringValue("GetPublishPriceTaskResponse.Result.TaskId"));
		result.setType(_ctx.stringValue("GetPublishPriceTaskResponse.Result.Type"));
		result.setAccountType(_ctx.stringValue("GetPublishPriceTaskResponse.Result.AccountType"));
		result.setCode(_ctx.stringValue("GetPublishPriceTaskResponse.Result.Code"));
		result.setVersion(_ctx.stringValue("GetPublishPriceTaskResponse.Result.Version"));
		result.setName(_ctx.stringValue("GetPublishPriceTaskResponse.Result.Name"));
		result.setRemarks(_ctx.stringValue("GetPublishPriceTaskResponse.Result.Remarks"));
		result.setCatalogPrice(_ctx.longValue("GetPublishPriceTaskResponse.Result.CatalogPrice"));
		result.setBpmsProcInsId(_ctx.stringValue("GetPublishPriceTaskResponse.Result.BpmsProcInsId"));
		result.setBpmsProcId(_ctx.stringValue("GetPublishPriceTaskResponse.Result.BpmsProcId"));
		result.setApprover(_ctx.stringValue("GetPublishPriceTaskResponse.Result.Approver"));
		result.setDeleteFlag(_ctx.stringValue("GetPublishPriceTaskResponse.Result.DeleteFlag"));
		getPublishPriceTaskResponse.setResult(result);

		Header header = new Header();
		header.setTraceId(_ctx.stringValue("GetPublishPriceTaskResponse.Header.TraceId"));
		header.setRpcId(_ctx.stringValue("GetPublishPriceTaskResponse.Header.RpcId"));
		header.setVersion(_ctx.stringValue("GetPublishPriceTaskResponse.Header.Version"));
		header.setCostTime(_ctx.longValue("GetPublishPriceTaskResponse.Header.CostTime"));
		getPublishPriceTaskResponse.setHeader(header);
	 
	 	return getPublishPriceTaskResponse;
	}
}