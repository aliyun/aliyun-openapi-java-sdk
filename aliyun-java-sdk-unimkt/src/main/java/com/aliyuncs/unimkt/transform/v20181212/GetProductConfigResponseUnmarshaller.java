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

import com.aliyuncs.unimkt.model.v20181212.GetProductConfigResponse;
import com.aliyuncs.unimkt.model.v20181212.GetProductConfigResponse.Header;
import com.aliyuncs.unimkt.model.v20181212.GetProductConfigResponse.ResultItem;
import com.aliyuncs.unimkt.model.v20181212.GetProductConfigResponse.ResultItem.BusinessListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetProductConfigResponseUnmarshaller {

	public static GetProductConfigResponse unmarshall(GetProductConfigResponse getProductConfigResponse, UnmarshallerContext _ctx) {
		
		getProductConfigResponse.setRequestId(_ctx.stringValue("GetProductConfigResponse.RequestId"));
		getProductConfigResponse.setSuccess(_ctx.booleanValue("GetProductConfigResponse.Success"));
		getProductConfigResponse.setErrorCode(_ctx.stringValue("GetProductConfigResponse.ErrorCode"));
		getProductConfigResponse.setErrorMsg(_ctx.stringValue("GetProductConfigResponse.ErrorMsg"));

		Header header = new Header();
		header.setTraceId(_ctx.stringValue("GetProductConfigResponse.Header.TraceId"));
		header.setRpcId(_ctx.stringValue("GetProductConfigResponse.Header.RpcId"));
		header.setVersion(_ctx.stringValue("GetProductConfigResponse.Header.Version"));
		header.setCostTime(_ctx.longValue("GetProductConfigResponse.Header.CostTime"));
		getProductConfigResponse.setHeader(header);

		List<ResultItem> result = new ArrayList<ResultItem>();
		for (int i = 0; i < _ctx.lengthValue("GetProductConfigResponse.Result.Length"); i++) {
			ResultItem resultItem = new ResultItem();
			resultItem.setProductCode(_ctx.stringValue("GetProductConfigResponse.Result["+ i +"].ProductCode"));
			resultItem.setProductName(_ctx.stringValue("GetProductConfigResponse.Result["+ i +"].ProductName"));

			List<BusinessListItem> businessList = new ArrayList<BusinessListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetProductConfigResponse.Result["+ i +"].BusinessList.Length"); j++) {
				BusinessListItem businessListItem = new BusinessListItem();
				businessListItem.setBusinessCode(_ctx.stringValue("GetProductConfigResponse.Result["+ i +"].BusinessList["+ j +"].BusinessCode"));
				businessListItem.setBusinessCodeName(_ctx.stringValue("GetProductConfigResponse.Result["+ i +"].BusinessList["+ j +"].BusinessCodeName"));

				businessList.add(businessListItem);
			}
			resultItem.setBusinessList(businessList);

			result.add(resultItem);
		}
		getProductConfigResponse.setResult(result);
	 
	 	return getProductConfigResponse;
	}
}