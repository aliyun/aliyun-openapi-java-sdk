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

package com.aliyuncs.cloud_siem.transform.v20220616;

import com.aliyuncs.cloud_siem.model.v20220616.GetStorageResponse;
import com.aliyuncs.cloud_siem.model.v20220616.GetStorageResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetStorageResponseUnmarshaller {

	public static GetStorageResponse unmarshall(GetStorageResponse getStorageResponse, UnmarshallerContext _ctx) {
		
		getStorageResponse.setRequestId(_ctx.stringValue("GetStorageResponse.RequestId"));
		getStorageResponse.setSuccess(_ctx.booleanValue("GetStorageResponse.Success"));
		getStorageResponse.setCode(_ctx.integerValue("GetStorageResponse.Code"));
		getStorageResponse.setMessage(_ctx.stringValue("GetStorageResponse.Message"));
		getStorageResponse.setErrCode(_ctx.stringValue("GetStorageResponse.ErrCode"));
		getStorageResponse.setDyCode(_ctx.stringValue("GetStorageResponse.DyCode"));
		getStorageResponse.setDyMessage(_ctx.stringValue("GetStorageResponse.DyMessage"));

		Data data = new Data();
		data.setTtl(_ctx.integerValue("GetStorageResponse.Data.Ttl"));
		data.setRegion(_ctx.stringValue("GetStorageResponse.Data.Region"));
		data.setDisplayRegion(_ctx.booleanValue("GetStorageResponse.Data.DisplayRegion"));
		data.setCanOperate(_ctx.booleanValue("GetStorageResponse.Data.CanOperate"));
		getStorageResponse.setData(data);
	 
	 	return getStorageResponse;
	}
}