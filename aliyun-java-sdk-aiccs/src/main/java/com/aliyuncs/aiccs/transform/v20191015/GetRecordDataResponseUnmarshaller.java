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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.GetRecordDataResponse;
import com.aliyuncs.aiccs.model.v20191015.GetRecordDataResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRecordDataResponseUnmarshaller {

	public static GetRecordDataResponse unmarshall(GetRecordDataResponse getRecordDataResponse, UnmarshallerContext _ctx) {
		
		getRecordDataResponse.setRequestId(_ctx.stringValue("GetRecordDataResponse.RequestId"));
		getRecordDataResponse.setSuccess(_ctx.booleanValue("GetRecordDataResponse.Success"));
		getRecordDataResponse.setCode(_ctx.stringValue("GetRecordDataResponse.Code"));
		getRecordDataResponse.setMessage(_ctx.stringValue("GetRecordDataResponse.Message"));

		Data data = new Data();
		data.setAcid(_ctx.stringValue("GetRecordDataResponse.Data.Acid"));
		data.setOssLink(_ctx.stringValue("GetRecordDataResponse.Data.OssLink"));
		getRecordDataResponse.setData(data);
	 
	 	return getRecordDataResponse;
	}
}