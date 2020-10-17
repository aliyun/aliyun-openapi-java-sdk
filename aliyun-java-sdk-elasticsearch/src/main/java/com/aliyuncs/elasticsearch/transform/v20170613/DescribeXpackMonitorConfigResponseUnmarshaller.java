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

package com.aliyuncs.elasticsearch.transform.v20170613;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.elasticsearch.model.v20170613.DescribeXpackMonitorConfigResponse;
import com.aliyuncs.elasticsearch.model.v20170613.DescribeXpackMonitorConfigResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeXpackMonitorConfigResponseUnmarshaller {

	public static DescribeXpackMonitorConfigResponse unmarshall(DescribeXpackMonitorConfigResponse describeXpackMonitorConfigResponse, UnmarshallerContext _ctx) {
		
		describeXpackMonitorConfigResponse.setRequestId(_ctx.stringValue("DescribeXpackMonitorConfigResponse.RequestId"));

		Result result = new Result();
		result.setEsInstanceId(_ctx.stringValue("DescribeXpackMonitorConfigResponse.Result.esInstanceId"));
		result.setUserName(_ctx.stringValue("DescribeXpackMonitorConfigResponse.Result.userName"));
		result.setEnable(_ctx.booleanValue("DescribeXpackMonitorConfigResponse.Result.enable"));

		List<String> endpoints = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeXpackMonitorConfigResponse.Result.endpoints.Length"); i++) {
			endpoints.add(_ctx.stringValue("DescribeXpackMonitorConfigResponse.Result.endpoints["+ i +"]"));
		}
		result.setEndpoints(endpoints);

		List<String> pipelineIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeXpackMonitorConfigResponse.Result.pipelineIds.Length"); i++) {
			pipelineIds.add(_ctx.stringValue("DescribeXpackMonitorConfigResponse.Result.pipelineIds["+ i +"]"));
		}
		result.setPipelineIds(pipelineIds);
		describeXpackMonitorConfigResponse.setResult(result);
	 
	 	return describeXpackMonitorConfigResponse;
	}
}