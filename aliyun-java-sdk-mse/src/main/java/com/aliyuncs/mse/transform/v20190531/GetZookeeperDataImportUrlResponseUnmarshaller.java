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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.GetZookeeperDataImportUrlResponse;
import com.aliyuncs.mse.model.v20190531.GetZookeeperDataImportUrlResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetZookeeperDataImportUrlResponseUnmarshaller {

	public static GetZookeeperDataImportUrlResponse unmarshall(GetZookeeperDataImportUrlResponse getZookeeperDataImportUrlResponse, UnmarshallerContext _ctx) {
		
		getZookeeperDataImportUrlResponse.setRequestId(_ctx.stringValue("GetZookeeperDataImportUrlResponse.RequestId"));
		getZookeeperDataImportUrlResponse.setSuccess(_ctx.booleanValue("GetZookeeperDataImportUrlResponse.Success"));
		getZookeeperDataImportUrlResponse.setCode(_ctx.integerValue("GetZookeeperDataImportUrlResponse.Code"));
		getZookeeperDataImportUrlResponse.setErrorCode(_ctx.stringValue("GetZookeeperDataImportUrlResponse.ErrorCode"));
		getZookeeperDataImportUrlResponse.setHttpStatusCode(_ctx.integerValue("GetZookeeperDataImportUrlResponse.HttpStatusCode"));
		getZookeeperDataImportUrlResponse.setMessage(_ctx.stringValue("GetZookeeperDataImportUrlResponse.Message"));
		getZookeeperDataImportUrlResponse.setDynamicCode(_ctx.stringValue("GetZookeeperDataImportUrlResponse.DynamicCode"));
		getZookeeperDataImportUrlResponse.setDynamicMessage(_ctx.stringValue("GetZookeeperDataImportUrlResponse.DynamicMessage"));

		Data data = new Data();
		data.setUrl(_ctx.stringValue("GetZookeeperDataImportUrlResponse.Data.Url"));
		data.setMaxSize(_ctx.stringValue("GetZookeeperDataImportUrlResponse.Data.MaxSize"));
		getZookeeperDataImportUrlResponse.setData(data);
	 
	 	return getZookeeperDataImportUrlResponse;
	}
}