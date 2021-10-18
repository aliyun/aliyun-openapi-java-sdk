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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.GetIstioTestMethodResponse;
import com.aliyuncs.edas.model.v20170801.GetIstioTestMethodResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetIstioTestMethodResponseUnmarshaller {

	public static GetIstioTestMethodResponse unmarshall(GetIstioTestMethodResponse getIstioTestMethodResponse, UnmarshallerContext _ctx) {
		
		getIstioTestMethodResponse.setRequestId(_ctx.stringValue("GetIstioTestMethodResponse.RequestId"));
		getIstioTestMethodResponse.setMessage(_ctx.stringValue("GetIstioTestMethodResponse.Message"));
		getIstioTestMethodResponse.setHttpStatusCode(_ctx.integerValue("GetIstioTestMethodResponse.HttpStatusCode"));
		getIstioTestMethodResponse.setCode(_ctx.integerValue("GetIstioTestMethodResponse.Code"));
		getIstioTestMethodResponse.setSuccess(_ctx.booleanValue("GetIstioTestMethodResponse.Success"));

		Data data = new Data();
		data.setHttpHeaders(_ctx.mapValue("GetIstioTestMethodResponse.Data.HttpHeaders"));
		data.setParams(_ctx.mapValue("GetIstioTestMethodResponse.Data.Params"));
		data.setPath(_ctx.stringValue("GetIstioTestMethodResponse.Data.Path"));

		List<String> urls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIstioTestMethodResponse.Data.Urls.Length"); i++) {
			urls.add(_ctx.stringValue("GetIstioTestMethodResponse.Data.Urls["+ i +"]"));
		}
		data.setUrls(urls);

		List<String> requestMethods = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetIstioTestMethodResponse.Data.RequestMethods.Length"); i++) {
			requestMethods.add(_ctx.stringValue("GetIstioTestMethodResponse.Data.RequestMethods["+ i +"]"));
		}
		data.setRequestMethods(requestMethods);
		getIstioTestMethodResponse.setData(data);
	 
	 	return getIstioTestMethodResponse;
	}
}