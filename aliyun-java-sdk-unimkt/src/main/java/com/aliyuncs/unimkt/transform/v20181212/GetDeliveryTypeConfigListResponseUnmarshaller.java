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

import com.aliyuncs.unimkt.model.v20181212.GetDeliveryTypeConfigListResponse;
import com.aliyuncs.unimkt.model.v20181212.GetDeliveryTypeConfigListResponse.Header;
import com.aliyuncs.unimkt.model.v20181212.GetDeliveryTypeConfigListResponse.ResultItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDeliveryTypeConfigListResponseUnmarshaller {

	public static GetDeliveryTypeConfigListResponse unmarshall(GetDeliveryTypeConfigListResponse getDeliveryTypeConfigListResponse, UnmarshallerContext _ctx) {
		
		getDeliveryTypeConfigListResponse.setRequestId(_ctx.stringValue("GetDeliveryTypeConfigListResponse.RequestId"));
		getDeliveryTypeConfigListResponse.setSuccess(_ctx.booleanValue("GetDeliveryTypeConfigListResponse.Success"));
		getDeliveryTypeConfigListResponse.setErrorCode(_ctx.stringValue("GetDeliveryTypeConfigListResponse.ErrorCode"));
		getDeliveryTypeConfigListResponse.setErrorMsg(_ctx.stringValue("GetDeliveryTypeConfigListResponse.ErrorMsg"));
		getDeliveryTypeConfigListResponse.setExt(_ctx.mapValue("GetDeliveryTypeConfigListResponse.Ext"));

		Header header = new Header();
		header.setTraceId(_ctx.stringValue("GetDeliveryTypeConfigListResponse.Header.TraceId"));
		header.setRpcId(_ctx.stringValue("GetDeliveryTypeConfigListResponse.Header.RpcId"));
		header.setVersion(_ctx.stringValue("GetDeliveryTypeConfigListResponse.Header.Version"));
		header.setCostTime(_ctx.longValue("GetDeliveryTypeConfigListResponse.Header.CostTime"));
		getDeliveryTypeConfigListResponse.setHeader(header);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetDeliveryTypeConfigListResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setCode(_ctx.stringValue("GetDeliveryTypeConfigListResponse.Result["+ i +"].Code"));
			resultItem.setName(_ctx.stringValue("GetDeliveryTypeConfigListResponse.Result["+ i +"].Name"));
			resultItem.setDesc(_ctx.stringValue("GetDeliveryTypeConfigListResponse.Result["+ i +"].Desc"));
			resultItem.setAccountType(_ctx.stringValue("GetDeliveryTypeConfigListResponse.Result["+ i +"].AccountType"));

			result.add(resultItem);
		}
		getDeliveryTypeConfigListResponse.setResult(result);
	 
	 	return getDeliveryTypeConfigListResponse;
	}
}