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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.GetMseSourceResponse;
import com.aliyuncs.mse.model.v20190531.GetMseSourceResponse.MseSources;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetMseSourceResponseUnmarshaller {

	public static GetMseSourceResponse unmarshall(GetMseSourceResponse getMseSourceResponse, UnmarshallerContext _ctx) {
		
		getMseSourceResponse.setRequestId(_ctx.stringValue("GetMseSourceResponse.RequestId"));
		getMseSourceResponse.setHttpStatusCode(_ctx.integerValue("GetMseSourceResponse.HttpStatusCode"));
		getMseSourceResponse.setMessage(_ctx.stringValue("GetMseSourceResponse.Message"));
		getMseSourceResponse.setCode(_ctx.integerValue("GetMseSourceResponse.Code"));
		getMseSourceResponse.setSuccess(_ctx.booleanValue("GetMseSourceResponse.Success"));

		List<MseSources> data = new ArrayList<MseSources>();
		for (int i = 0; i < _ctx.lengthValue("GetMseSourceResponse.Data.Length"); i++) {
			MseSources mseSources = new MseSources();
			mseSources.setInstanceId(_ctx.stringValue("GetMseSourceResponse.Data["+ i +"].InstanceId"));
			mseSources.setAddress(_ctx.stringValue("GetMseSourceResponse.Data["+ i +"].Address"));
			mseSources.setType(_ctx.stringValue("GetMseSourceResponse.Data["+ i +"].Type"));
			mseSources.setName(_ctx.stringValue("GetMseSourceResponse.Data["+ i +"].Name"));
			mseSources.setClusterId(_ctx.stringValue("GetMseSourceResponse.Data["+ i +"].ClusterId"));

			data.add(mseSources);
		}
		getMseSourceResponse.setData(data);
	 
	 	return getMseSourceResponse;
	}
}