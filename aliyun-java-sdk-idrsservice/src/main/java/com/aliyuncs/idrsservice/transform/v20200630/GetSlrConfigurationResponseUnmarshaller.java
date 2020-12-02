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

package com.aliyuncs.idrsservice.transform.v20200630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.idrsservice.model.v20200630.GetSlrConfigurationResponse;
import com.aliyuncs.idrsservice.model.v20200630.GetSlrConfigurationResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetSlrConfigurationResponseUnmarshaller {

	public static GetSlrConfigurationResponse unmarshall(GetSlrConfigurationResponse getSlrConfigurationResponse, UnmarshallerContext _ctx) {
		
		getSlrConfigurationResponse.setRequestId(_ctx.stringValue("GetSlrConfigurationResponse.RequestId"));
		getSlrConfigurationResponse.setCode(_ctx.stringValue("GetSlrConfigurationResponse.Code"));
		getSlrConfigurationResponse.setMessage(_ctx.stringValue("GetSlrConfigurationResponse.Message"));

		Data data = new Data();
		data.setMqSubscribe(_ctx.booleanValue("GetSlrConfigurationResponse.Data.MqSubscribe"));
		data.setMqEndpoint(_ctx.stringValue("GetSlrConfigurationResponse.Data.MqEndpoint"));
		data.setMqInstanceId(_ctx.stringValue("GetSlrConfigurationResponse.Data.MqInstanceId"));
		data.setMqTopic(_ctx.stringValue("GetSlrConfigurationResponse.Data.MqTopic"));
		data.setMqGroupId(_ctx.stringValue("GetSlrConfigurationResponse.Data.MqGroupId"));

		List<String> mqEventList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetSlrConfigurationResponse.Data.MqEventList.Length"); i++) {
			mqEventList.add(_ctx.stringValue("GetSlrConfigurationResponse.Data.MqEventList["+ i +"]"));
		}
		data.setMqEventList(mqEventList);
		getSlrConfigurationResponse.setData(data);
	 
	 	return getSlrConfigurationResponse;
	}
}