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

package com.aliyuncs.das.transform.v20200116;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.das.model.v20200116.GetErrorRequestSampleResponse;
import com.aliyuncs.das.model.v20200116.GetErrorRequestSampleResponse.Sample;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetErrorRequestSampleResponseUnmarshaller {

	public static GetErrorRequestSampleResponse unmarshall(GetErrorRequestSampleResponse getErrorRequestSampleResponse, UnmarshallerContext _ctx) {
		
		getErrorRequestSampleResponse.setRequestId(_ctx.stringValue("GetErrorRequestSampleResponse.RequestId"));
		getErrorRequestSampleResponse.setCode(_ctx.longValue("GetErrorRequestSampleResponse.Code"));
		getErrorRequestSampleResponse.setMessage(_ctx.stringValue("GetErrorRequestSampleResponse.Message"));
		getErrorRequestSampleResponse.setSuccess(_ctx.booleanValue("GetErrorRequestSampleResponse.Success"));

		List<Sample> data = new ArrayList<Sample>();
		for (int i = 0; i < _ctx.lengthValue("GetErrorRequestSampleResponse.Data.Length"); i++) {
			Sample sample = new Sample();
			sample.setSqlId(_ctx.stringValue("GetErrorRequestSampleResponse.Data["+ i +"].sqlId"));
			sample.setDatabase(_ctx.stringValue("GetErrorRequestSampleResponse.Data["+ i +"].database"));
			sample.setOriginHost(_ctx.stringValue("GetErrorRequestSampleResponse.Data["+ i +"].originHost"));
			sample.setInstanceId(_ctx.stringValue("GetErrorRequestSampleResponse.Data["+ i +"].instanceId"));
			sample.setErrorCode(_ctx.stringValue("GetErrorRequestSampleResponse.Data["+ i +"].errorCode"));
			sample.setUser(_ctx.stringValue("GetErrorRequestSampleResponse.Data["+ i +"].user"));
			sample.setSql(_ctx.stringValue("GetErrorRequestSampleResponse.Data["+ i +"].sql"));
			sample.setTimestamp(_ctx.longValue("GetErrorRequestSampleResponse.Data["+ i +"].timestamp"));

			List<String> tables = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetErrorRequestSampleResponse.Data["+ i +"].tables.Length"); j++) {
				tables.add(_ctx.stringValue("GetErrorRequestSampleResponse.Data["+ i +"].tables["+ j +"]"));
			}
			sample.setTables(tables);

			data.add(sample);
		}
		getErrorRequestSampleResponse.setData(data);
	 
	 	return getErrorRequestSampleResponse;
	}
}