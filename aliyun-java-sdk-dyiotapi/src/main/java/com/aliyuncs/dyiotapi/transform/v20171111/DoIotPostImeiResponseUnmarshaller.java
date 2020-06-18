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

package com.aliyuncs.dyiotapi.transform.v20171111;

import com.aliyuncs.dyiotapi.model.v20171111.DoIotPostImeiResponse;
import com.aliyuncs.dyiotapi.model.v20171111.DoIotPostImeiResponse.IotPostImei;
import com.aliyuncs.transform.UnmarshallerContext;


public class DoIotPostImeiResponseUnmarshaller {

	public static DoIotPostImeiResponse unmarshall(DoIotPostImeiResponse doIotPostImeiResponse, UnmarshallerContext _ctx) {
		
		doIotPostImeiResponse.setRequestId(_ctx.stringValue("DoIotPostImeiResponse.RequestId"));
		doIotPostImeiResponse.setCode(_ctx.stringValue("DoIotPostImeiResponse.Code"));
		doIotPostImeiResponse.setMessage(_ctx.stringValue("DoIotPostImeiResponse.Message"));

		IotPostImei iotPostImei = new IotPostImei();
		iotPostImei.setIsPostSuccess(_ctx.booleanValue("DoIotPostImeiResponse.IotPostImei.IsPostSuccess"));
		doIotPostImeiResponse.setIotPostImei(iotPostImei);
	 
	 	return doIotPostImeiResponse;
	}
}