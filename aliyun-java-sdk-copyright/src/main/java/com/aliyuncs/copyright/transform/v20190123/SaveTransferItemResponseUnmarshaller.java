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

import com.aliyuncs.copyright.model.v20190123.SaveTransferItemResponse;
import com.aliyuncs.copyright.model.v20190123.SaveTransferItemResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveTransferItemResponseUnmarshaller {

	public static SaveTransferItemResponse unmarshall(SaveTransferItemResponse saveTransferItemResponse, UnmarshallerContext _ctx) {
		
		saveTransferItemResponse.setRequestId(_ctx.stringValue("SaveTransferItemResponse.RequestId"));
		saveTransferItemResponse.setHttpStatusCode(_ctx.integerValue("SaveTransferItemResponse.HttpStatusCode"));
		saveTransferItemResponse.setDynamicCode(_ctx.stringValue("SaveTransferItemResponse.DynamicCode"));
		saveTransferItemResponse.setDynamicMessage(_ctx.stringValue("SaveTransferItemResponse.DynamicMessage"));
		saveTransferItemResponse.setErrorMsg(_ctx.stringValue("SaveTransferItemResponse.ErrorMsg"));
		saveTransferItemResponse.setErrorCode(_ctx.stringValue("SaveTransferItemResponse.ErrorCode"));
		saveTransferItemResponse.setSuccess(_ctx.booleanValue("SaveTransferItemResponse.Success"));
		saveTransferItemResponse.setAllowRetry(_ctx.booleanValue("SaveTransferItemResponse.AllowRetry"));
		saveTransferItemResponse.setAppName(_ctx.stringValue("SaveTransferItemResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("SaveTransferItemResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("SaveTransferItemResponse.ErrorArgs["+ i +"]"));
		}
		saveTransferItemResponse.setErrorArgs(errorArgs);

		Module module = new Module();
		module.setStockId(_ctx.integerValue("SaveTransferItemResponse.Module.StockId"));
		module.setTransactionId(_ctx.stringValue("SaveTransferItemResponse.Module.TransactionId"));
		module.setTranHash(_ctx.stringValue("SaveTransferItemResponse.Module.TranHash"));
		module.setItemId(_ctx.integerValue("SaveTransferItemResponse.Module.ItemId"));
		module.setUserId(_ctx.integerValue("SaveTransferItemResponse.Module.UserId"));
		module.setNo(_ctx.stringValue("SaveTransferItemResponse.Module.No"));
		module.setAddress(_ctx.stringValue("SaveTransferItemResponse.Module.Address"));
		module.setShardId(_ctx.longValue("SaveTransferItemResponse.Module.ShardId"));
		module.setShardKey(_ctx.stringValue("SaveTransferItemResponse.Module.ShardKey"));
		saveTransferItemResponse.setModule(module);
	 
	 	return saveTransferItemResponse;
	}
}