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

package com.aliyuncs.retailcloud.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailcloud.model.v20180313.DescribeServiceDetailResponse;
import com.aliyuncs.retailcloud.model.v20180313.DescribeServiceDetailResponse.Result;
import com.aliyuncs.retailcloud.model.v20180313.DescribeServiceDetailResponse.Result.ServicePortMapping;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeServiceDetailResponseUnmarshaller {

	public static DescribeServiceDetailResponse unmarshall(DescribeServiceDetailResponse describeServiceDetailResponse, UnmarshallerContext _ctx) {
		
		describeServiceDetailResponse.setRequestId(_ctx.stringValue("DescribeServiceDetailResponse.RequestId"));
		describeServiceDetailResponse.setCode(_ctx.integerValue("DescribeServiceDetailResponse.Code"));
		describeServiceDetailResponse.setErrMsg(_ctx.stringValue("DescribeServiceDetailResponse.ErrMsg"));
		describeServiceDetailResponse.setSuccess(_ctx.booleanValue("DescribeServiceDetailResponse.Success"));

		Result result = new Result();
		result.setHeadless(_ctx.booleanValue("DescribeServiceDetailResponse.Result.Headless"));
		result.setAppId(_ctx.longValue("DescribeServiceDetailResponse.Result.AppId"));
		result.setServiceId(_ctx.longValue("DescribeServiceDetailResponse.Result.ServiceId"));
		result.setK8sServiceId(_ctx.stringValue("DescribeServiceDetailResponse.Result.K8sServiceId"));
		result.setServiceType(_ctx.stringValue("DescribeServiceDetailResponse.Result.ServiceType"));
		result.setEnvId(_ctx.longValue("DescribeServiceDetailResponse.Result.EnvId"));
		result.setName(_ctx.stringValue("DescribeServiceDetailResponse.Result.Name"));
		result.setClusterIP(_ctx.stringValue("DescribeServiceDetailResponse.Result.ClusterIP"));

		List<ServicePortMapping> portMappings = new ArrayList<ServicePortMapping>();
		for (int i = 0; i < _ctx.lengthValue("DescribeServiceDetailResponse.Result.PortMappings.Length"); i++) {
			ServicePortMapping servicePortMapping = new ServicePortMapping();
			servicePortMapping.setTargetPort(_ctx.stringValue("DescribeServiceDetailResponse.Result.PortMappings["+ i +"].TargetPort"));
			servicePortMapping.setNodePort(_ctx.integerValue("DescribeServiceDetailResponse.Result.PortMappings["+ i +"].NodePort"));
			servicePortMapping.setPort(_ctx.integerValue("DescribeServiceDetailResponse.Result.PortMappings["+ i +"].Port"));
			servicePortMapping.setName(_ctx.stringValue("DescribeServiceDetailResponse.Result.PortMappings["+ i +"].Name"));
			servicePortMapping.setBizProtocol(_ctx.stringValue("DescribeServiceDetailResponse.Result.PortMappings["+ i +"].Protocol"));

			portMappings.add(servicePortMapping);
		}
		result.setPortMappings(portMappings);
		describeServiceDetailResponse.setResult(result);
	 
	 	return describeServiceDetailResponse;
	}
}