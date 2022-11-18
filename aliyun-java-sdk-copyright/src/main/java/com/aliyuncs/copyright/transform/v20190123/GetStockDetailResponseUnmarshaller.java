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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetStockDetailResponse;
import com.aliyuncs.copyright.model.v20190123.GetStockDetailResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStockDetailResponseUnmarshaller {

	public static GetStockDetailResponse unmarshall(GetStockDetailResponse getStockDetailResponse, UnmarshallerContext _ctx) {
		
		getStockDetailResponse.setRequestId(_ctx.stringValue("GetStockDetailResponse.RequestId"));
		getStockDetailResponse.setHttpStatusCode(_ctx.integerValue("GetStockDetailResponse.HttpStatusCode"));
		getStockDetailResponse.setDynamicCode(_ctx.stringValue("GetStockDetailResponse.DynamicCode"));
		getStockDetailResponse.setDynamicMessage(_ctx.stringValue("GetStockDetailResponse.DynamicMessage"));
		getStockDetailResponse.setErrorMsg(_ctx.stringValue("GetStockDetailResponse.ErrorMsg"));
		getStockDetailResponse.setErrorCode(_ctx.stringValue("GetStockDetailResponse.ErrorCode"));
		getStockDetailResponse.setSuccess(_ctx.booleanValue("GetStockDetailResponse.Success"));
		getStockDetailResponse.setAllowRetry(_ctx.booleanValue("GetStockDetailResponse.AllowRetry"));
		getStockDetailResponse.setAppName(_ctx.stringValue("GetStockDetailResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetStockDetailResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetStockDetailResponse.ErrorArgs["+ i +"]"));
		}
		getStockDetailResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setStockId(_ctx.integerValue("GetStockDetailResponse.Module.StockId"));
		module.setTransactionId(_ctx.stringValue("GetStockDetailResponse.Module.TransactionId"));
		module.setTranHash(_ctx.stringValue("GetStockDetailResponse.Module.TranHash"));
		module.setItemId(_ctx.integerValue("GetStockDetailResponse.Module.ItemId"));
		module.setUserId(_ctx.integerValue("GetStockDetailResponse.Module.UserId"));
		getStockDetailResponse.setModule(module);
	 
	 	return getStockDetailResponse;
	}
}