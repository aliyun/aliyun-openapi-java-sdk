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

package com.aliyuncs.eventbridge.transform.v20200401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eventbridge.model.v20200401.TestEventSourceConfigResponse;
import com.aliyuncs.eventbridge.model.v20200401.TestEventSourceConfigResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestEventSourceConfigResponseUnmarshaller {

	public static TestEventSourceConfigResponse unmarshall(TestEventSourceConfigResponse testEventSourceConfigResponse, UnmarshallerContext _ctx) {
		
		testEventSourceConfigResponse.setRequestId(_ctx.stringValue("TestEventSourceConfigResponse.RequestId"));
		testEventSourceConfigResponse.setCode(_ctx.stringValue("TestEventSourceConfigResponse.Code"));
		testEventSourceConfigResponse.setMessage(_ctx.stringValue("TestEventSourceConfigResponse.Message"));
		testEventSourceConfigResponse.setSuccess(_ctx.booleanValue("TestEventSourceConfigResponse.Success"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("TestEventSourceConfigResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setCheckItem(_ctx.stringValue("TestEventSourceConfigResponse.Data["+ i +"].CheckItem"));
			dataItem.setErrorMsg(_ctx.stringValue("TestEventSourceConfigResponse.Data["+ i +"].ErrorMsg"));
			dataItem.setIsSucceed(_ctx.stringValue("TestEventSourceConfigResponse.Data["+ i +"].IsSucceed"));

			data.add(dataItem);
		}
		testEventSourceConfigResponse.setData(data);
	 
	 	return testEventSourceConfigResponse;
	}
}