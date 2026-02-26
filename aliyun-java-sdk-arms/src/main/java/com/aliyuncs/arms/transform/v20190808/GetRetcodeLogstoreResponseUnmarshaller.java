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

package com.aliyuncs.arms.transform.v20190808;

import com.aliyuncs.arms.model.v20190808.GetRetcodeLogstoreResponse;
import com.aliyuncs.arms.model.v20190808.GetRetcodeLogstoreResponse.Data;
import com.aliyuncs.arms.model.v20190808.GetRetcodeLogstoreResponse.Data.RetcodeSLSConfig;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetRetcodeLogstoreResponseUnmarshaller {

	public static GetRetcodeLogstoreResponse unmarshall(GetRetcodeLogstoreResponse getRetcodeLogstoreResponse, UnmarshallerContext _ctx) {
		
		getRetcodeLogstoreResponse.setRequestId(_ctx.stringValue("GetRetcodeLogstoreResponse.RequestId"));

		Data data = new Data();
		data.setStatus(_ctx.stringValue("GetRetcodeLogstoreResponse.Data.Status"));
		data.setMessage(_ctx.stringValue("GetRetcodeLogstoreResponse.Data.Message"));

		RetcodeSLSConfig retcodeSLSConfig = new RetcodeSLSConfig();
		retcodeSLSConfig.setRegionId(_ctx.stringValue("GetRetcodeLogstoreResponse.Data.RetcodeSLSConfig.RegionId"));
		retcodeSLSConfig.setProject(_ctx.stringValue("GetRetcodeLogstoreResponse.Data.RetcodeSLSConfig.Project"));
		retcodeSLSConfig.setLogstore(_ctx.stringValue("GetRetcodeLogstoreResponse.Data.RetcodeSLSConfig.Logstore"));
		data.setRetcodeSLSConfig(retcodeSLSConfig);
		getRetcodeLogstoreResponse.setData(data);
	 
	 	return getRetcodeLogstoreResponse;
	}
}