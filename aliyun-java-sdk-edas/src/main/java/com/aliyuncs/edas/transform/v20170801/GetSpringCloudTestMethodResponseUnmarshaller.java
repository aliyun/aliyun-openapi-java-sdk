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

import com.aliyuncs.edas.model.v20170801.GetSpringCloudTestMethodResponse;
import com.aliyuncs.edas.model.v20170801.GetSpringCloudTestMethodResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSpringCloudTestMethodResponseUnmarshaller {

	public static GetSpringCloudTestMethodResponse unmarshall(GetSpringCloudTestMethodResponse getSpringCloudTestMethodResponse, UnmarshallerContext _ctx) {
		
		getSpringCloudTestMethodResponse.setCode(_ctx.integerValue("GetSpringCloudTestMethodResponse.Code"));
		getSpringCloudTestMethodResponse.setMessage(_ctx.stringValue("GetSpringCloudTestMethodResponse.Message"));
		getSpringCloudTestMethodResponse.setSuccess(_ctx.booleanValue("GetSpringCloudTestMethodResponse.Success"));

		Data data = new Data();
		data.setPath(_ctx.stringValue("GetSpringCloudTestMethodResponse.Data.Path"));
		data.setHttpHeaders(_ctx.mapValue("GetSpringCloudTestMethodResponse.Data.HttpHeaders"));
		data.setParams(_ctx.mapValue("GetSpringCloudTestMethodResponse.Data.Params"));

		List<String> requestMethods = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSpringCloudTestMethodResponse.Data.RequestMethods.Length"); i++) {
			requestMethods.add(_ctx.stringValue("GetSpringCloudTestMethodResponse.Data.RequestMethods["+ i +"]"));
		}
		data.setRequestMethods(requestMethods);

		List<String> urls = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSpringCloudTestMethodResponse.Data.Urls.Length"); i++) {
			urls.add(_ctx.stringValue("GetSpringCloudTestMethodResponse.Data.Urls["+ i +"]"));
		}
		data.setUrls(urls);
		getSpringCloudTestMethodResponse.setData(data);
	 
	 	return getSpringCloudTestMethodResponse;
	}
}