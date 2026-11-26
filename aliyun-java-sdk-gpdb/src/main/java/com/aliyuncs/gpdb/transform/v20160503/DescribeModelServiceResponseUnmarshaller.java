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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeModelServiceResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeModelServiceResponseUnmarshaller {

	public static DescribeModelServiceResponse unmarshall(DescribeModelServiceResponse describeModelServiceResponse, UnmarshallerContext _ctx) {
		
		describeModelServiceResponse.setRequestId(_ctx.stringValue("DescribeModelServiceResponse.RequestId"));
		describeModelServiceResponse.setStatus(_ctx.stringValue("DescribeModelServiceResponse.Status"));
		describeModelServiceResponse.setPublicConnectUrl(_ctx.stringValue("DescribeModelServiceResponse.PublicConnectUrl"));
		describeModelServiceResponse.setPrivateConnectUrl(_ctx.stringValue("DescribeModelServiceResponse.PrivateConnectUrl"));
		describeModelServiceResponse.setModelName(_ctx.stringValue("DescribeModelServiceResponse.ModelName"));
		describeModelServiceResponse.setApiKey(_ctx.stringValue("DescribeModelServiceResponse.ApiKey"));
		describeModelServiceResponse.setDescription(_ctx.stringValue("DescribeModelServiceResponse.Description"));
		describeModelServiceResponse.setSecurityIpList(_ctx.stringValue("DescribeModelServiceResponse.SecurityIpList"));
		describeModelServiceResponse.setCreateTime(_ctx.stringValue("DescribeModelServiceResponse.CreateTime"));
		describeModelServiceResponse.setModelServiceId(_ctx.stringValue("DescribeModelServiceResponse.ModelServiceId"));
		describeModelServiceResponse.setModelParams(_ctx.mapValue("DescribeModelServiceResponse.ModelParams"));

		List<String> aiNodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeModelServiceResponse.AiNodes.Length"); i++) {
			aiNodes.add(_ctx.stringValue("DescribeModelServiceResponse.AiNodes["+ i +"]"));
		}
		describeModelServiceResponse.setAiNodes(aiNodes);
	 
	 	return describeModelServiceResponse;
	}
}