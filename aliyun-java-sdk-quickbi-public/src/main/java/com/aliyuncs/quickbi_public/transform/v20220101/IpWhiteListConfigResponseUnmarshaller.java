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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.IpWhiteListConfigResponse;
import com.aliyuncs.quickbi_public.model.v20220101.IpWhiteListConfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class IpWhiteListConfigResponseUnmarshaller {

	public static IpWhiteListConfigResponse unmarshall(IpWhiteListConfigResponse ipWhiteListConfigResponse, UnmarshallerContext _ctx) {
		
		ipWhiteListConfigResponse.setRequestId(_ctx.stringValue("IpWhiteListConfigResponse.RequestId"));
		ipWhiteListConfigResponse.setSuccess(_ctx.booleanValue("IpWhiteListConfigResponse.Success"));

		Result result = new Result();

		List<String> ipWhiteList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("IpWhiteListConfigResponse.Result.IpWhiteList.Length"); i++) {
			ipWhiteList.add(_ctx.stringValue("IpWhiteListConfigResponse.Result.IpWhiteList["+ i +"]"));
		}
		result.setIpWhiteList(ipWhiteList);
		ipWhiteListConfigResponse.setResult(result);
	 
	 	return ipWhiteListConfigResponse;
	}
}