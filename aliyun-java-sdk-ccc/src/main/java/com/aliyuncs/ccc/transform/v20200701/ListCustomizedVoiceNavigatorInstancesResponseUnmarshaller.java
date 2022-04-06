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

package com.aliyuncs.ccc.transform.v20200701;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ccc.model.v20200701.ListCustomizedVoiceNavigatorInstancesResponse;
import com.aliyuncs.ccc.model.v20200701.ListCustomizedVoiceNavigatorInstancesResponse.CustomizedVoiceNavigatorInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomizedVoiceNavigatorInstancesResponseUnmarshaller {

	public static ListCustomizedVoiceNavigatorInstancesResponse unmarshall(ListCustomizedVoiceNavigatorInstancesResponse listCustomizedVoiceNavigatorInstancesResponse, UnmarshallerContext _ctx) {
		
		listCustomizedVoiceNavigatorInstancesResponse.setRequestId(_ctx.stringValue("ListCustomizedVoiceNavigatorInstancesResponse.RequestId"));
		listCustomizedVoiceNavigatorInstancesResponse.setCode(_ctx.stringValue("ListCustomizedVoiceNavigatorInstancesResponse.Code"));
		listCustomizedVoiceNavigatorInstancesResponse.setHttpStatusCode(_ctx.integerValue("ListCustomizedVoiceNavigatorInstancesResponse.HttpStatusCode"));
		listCustomizedVoiceNavigatorInstancesResponse.setMessage(_ctx.stringValue("ListCustomizedVoiceNavigatorInstancesResponse.Message"));

		List<String> params = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomizedVoiceNavigatorInstancesResponse.Params.Length"); i++) {
			params.add(_ctx.stringValue("ListCustomizedVoiceNavigatorInstancesResponse.Params["+ i +"]"));
		}
		listCustomizedVoiceNavigatorInstancesResponse.setParams(params);

		List<CustomizedVoiceNavigatorInstance> data = new ArrayList<CustomizedVoiceNavigatorInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomizedVoiceNavigatorInstancesResponse.Data.Length"); i++) {
			CustomizedVoiceNavigatorInstance customizedVoiceNavigatorInstance = new CustomizedVoiceNavigatorInstance();
			customizedVoiceNavigatorInstance.setInstanceId(_ctx.stringValue("ListCustomizedVoiceNavigatorInstancesResponse.Data["+ i +"].InstanceId"));
			customizedVoiceNavigatorInstance.setInstanceName(_ctx.stringValue("ListCustomizedVoiceNavigatorInstancesResponse.Data["+ i +"].InstanceName"));
			customizedVoiceNavigatorInstance.setNumber(_ctx.stringValue("ListCustomizedVoiceNavigatorInstancesResponse.Data["+ i +"].Number"));

			data.add(customizedVoiceNavigatorInstance);
		}
		listCustomizedVoiceNavigatorInstancesResponse.setData(data);
	 
	 	return listCustomizedVoiceNavigatorInstancesResponse;
	}
}