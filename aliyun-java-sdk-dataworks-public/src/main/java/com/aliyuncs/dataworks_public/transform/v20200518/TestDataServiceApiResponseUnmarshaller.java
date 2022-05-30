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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.TestDataServiceApiResponse;
import com.aliyuncs.dataworks_public.model.v20200518.TestDataServiceApiResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class TestDataServiceApiResponseUnmarshaller {

	public static TestDataServiceApiResponse unmarshall(TestDataServiceApiResponse testDataServiceApiResponse, UnmarshallerContext _ctx) {
		
		testDataServiceApiResponse.setRequestId(_ctx.stringValue("TestDataServiceApiResponse.RequestId"));

		Data data = new Data();
		data.setTestId(_ctx.stringValue("TestDataServiceApiResponse.Data.TestId"));
		testDataServiceApiResponse.setData(data);
	 
	 	return testDataServiceApiResponse;
	}
}