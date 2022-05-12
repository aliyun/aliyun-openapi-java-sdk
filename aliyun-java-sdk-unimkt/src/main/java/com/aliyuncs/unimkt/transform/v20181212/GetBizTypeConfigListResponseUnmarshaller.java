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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.unimkt.model.v20181212.GetBizTypeConfigListResponse;
import com.aliyuncs.unimkt.model.v20181212.GetBizTypeConfigListResponse.Header;
import com.aliyuncs.unimkt.model.v20181212.GetBizTypeConfigListResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBizTypeConfigListResponseUnmarshaller {

	public static GetBizTypeConfigListResponse unmarshall(GetBizTypeConfigListResponse getBizTypeConfigListResponse, UnmarshallerContext _ctx) {
		
		getBizTypeConfigListResponse.setRequestId(_ctx.stringValue("GetBizTypeConfigListResponse.RequestId"));
		getBizTypeConfigListResponse.setSuccess(_ctx.booleanValue("GetBizTypeConfigListResponse.Success"));
		getBizTypeConfigListResponse.setErrorCode(_ctx.stringValue("GetBizTypeConfigListResponse.ErrorCode"));
		getBizTypeConfigListResponse.setErrorMsg(_ctx.stringValue("GetBizTypeConfigListResponse.ErrorMsg"));
		getBizTypeConfigListResponse.setExt(_ctx.mapValue("GetBizTypeConfigListResponse.Ext"));

		Header header = new Header();
		header.setTraceId(_ctx.stringValue("GetBizTypeConfigListResponse.Header.TraceId"));
		header.setRpcId(_ctx.stringValue("GetBizTypeConfigListResponse.Header.RpcId"));
		header.setVersion(_ctx.stringValue("GetBizTypeConfigListResponse.Header.Version"));
		header.setCostTime(_ctx.longValue("GetBizTypeConfigListResponse.Header.CostTime"));
		getBizTypeConfigListResponse.setHeader(header);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBizTypeConfigListResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCode(_ctx.stringValue("GetBizTypeConfigListResponse.Result["+ i +"].Code"));
			resultItem.setName(_ctx.stringValue("GetBizTypeConfigListResponse.Result["+ i +"].Name"));
			resultItem.setDesc(_ctx.stringValue("GetBizTypeConfigListResponse.Result["+ i +"].Desc"));
			resultItem.setAccountType(_ctx.stringValue("GetBizTypeConfigListResponse.Result["+ i +"].AccountType"));
			resultItem.setChargeType(_ctx.stringValue("GetBizTypeConfigListResponse.Result["+ i +"].ChargeType"));
			resultItem.setTransactionMode(_ctx.stringValue("GetBizTypeConfigListResponse.Result["+ i +"].TransactionMode"));

			result.add(resultItem);
		}
		getBizTypeConfigListResponse.setResult(result);
	 
	 	return getBizTypeConfigListResponse;
	}
}