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

import com.aliyuncs.edas.model.v20170801.GetServiceListPageResponse;
import com.aliyuncs.edas.model.v20170801.GetServiceListPageResponse.Data;
import com.aliyuncs.edas.model.v20170801.GetServiceListPageResponse.Data.MseServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetServiceListPageResponseUnmarshaller {

	public static GetServiceListPageResponse unmarshall(GetServiceListPageResponse getServiceListPageResponse, UnmarshallerContext _ctx) {
		
		getServiceListPageResponse.setCode(_ctx.integerValue("GetServiceListPageResponse.Code"));
		getServiceListPageResponse.setMessage(_ctx.stringValue("GetServiceListPageResponse.Message"));
		getServiceListPageResponse.setSuccess(_ctx.booleanValue("GetServiceListPageResponse.Success"));

		Data data = new Data();
		data.setSize(_ctx.integerValue("GetServiceListPageResponse.Data.Size"));
		data.setTotalElements(_ctx.integerValue("GetServiceListPageResponse.Data.TotalElements"));
		data.setTotalPages(_ctx.integerValue("GetServiceListPageResponse.Data.TotalPages"));

		List<MseServiceResponse> content = new ArrayList<MseServiceResponse>();
		for (int i = 0; i < _ctx.lengthValue("GetServiceListPageResponse.Data.Content.Length"); i++) {
			MseServiceResponse mseServiceResponse = new MseServiceResponse();
			mseServiceResponse.setServiceId(_ctx.stringValue("GetServiceListPageResponse.Data.Content["+ i +"].ServiceId"));
			mseServiceResponse.setServiceName(_ctx.stringValue("GetServiceListPageResponse.Data.Content["+ i +"].ServiceName"));
			mseServiceResponse.setVersion(_ctx.stringValue("GetServiceListPageResponse.Data.Content["+ i +"].Version"));
			mseServiceResponse.setGroup(_ctx.stringValue("GetServiceListPageResponse.Data.Content["+ i +"].Group"));
			mseServiceResponse.setEdasAppId(_ctx.stringValue("GetServiceListPageResponse.Data.Content["+ i +"].EdasAppId"));
			mseServiceResponse.setEdasAppName(_ctx.stringValue("GetServiceListPageResponse.Data.Content["+ i +"].EdasAppName"));
			mseServiceResponse.setInstanceNum(_ctx.integerValue("GetServiceListPageResponse.Data.Content["+ i +"].InstanceNum"));
			mseServiceResponse.setRegisterType(_ctx.stringValue("GetServiceListPageResponse.Data.Content["+ i +"].RegisterType"));

			content.add(mseServiceResponse);
		}
		data.setContent(content);
		getServiceListPageResponse.setData(data);
	 
	 	return getServiceListPageResponse;
	}
}