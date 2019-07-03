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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryBatchRegisterDeviceStatusResponse;
import com.aliyuncs.iot.model.v20180120.QueryBatchRegisterDeviceStatusResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryBatchRegisterDeviceStatusResponseUnmarshaller {

	public static QueryBatchRegisterDeviceStatusResponse unmarshall(QueryBatchRegisterDeviceStatusResponse queryBatchRegisterDeviceStatusResponse, UnmarshallerContext _ctx) {
		
		queryBatchRegisterDeviceStatusResponse.setRequestId(_ctx.stringValue("QueryBatchRegisterDeviceStatusResponse.RequestId"));
		queryBatchRegisterDeviceStatusResponse.setSuccess(_ctx.booleanValue("QueryBatchRegisterDeviceStatusResponse.Success"));
		queryBatchRegisterDeviceStatusResponse.setCode(_ctx.stringValue("QueryBatchRegisterDeviceStatusResponse.Code"));
		queryBatchRegisterDeviceStatusResponse.setErrorMessage(_ctx.stringValue("QueryBatchRegisterDeviceStatusResponse.ErrorMessage"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("QueryBatchRegisterDeviceStatusResponse.Data.Status"));

		List<String> validList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryBatchRegisterDeviceStatusResponse.Data.ValidList.Length"); i++) {
			validList.add(_ctx.stringValue("QueryBatchRegisterDeviceStatusResponse.Data.ValidList["+ i +"]"));
		}
		data.setValidList(validList);

		List<String> invalidList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryBatchRegisterDeviceStatusResponse.Data.InvalidList.Length"); i++) {
			invalidList.add(_ctx.stringValue("QueryBatchRegisterDeviceStatusResponse.Data.InvalidList["+ i +"]"));
		}
		data.setInvalidList(invalidList);
		queryBatchRegisterDeviceStatusResponse.setData(data);
	 
	 	return queryBatchRegisterDeviceStatusResponse;
	}
}