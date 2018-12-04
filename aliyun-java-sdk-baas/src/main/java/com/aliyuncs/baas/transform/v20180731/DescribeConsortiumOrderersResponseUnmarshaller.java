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

package com.aliyuncs.baas.transform.v20180731;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.baas.model.v20180731.DescribeConsortiumOrderersResponse;
import com.aliyuncs.baas.model.v20180731.DescribeConsortiumOrderersResponse.Orderer;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeConsortiumOrderersResponseUnmarshaller {

	public static DescribeConsortiumOrderersResponse unmarshall(DescribeConsortiumOrderersResponse describeConsortiumOrderersResponse, UnmarshallerContext context) {
		
		describeConsortiumOrderersResponse.setRequestId(context.stringValue("DescribeConsortiumOrderersResponse.RequestId"));
		describeConsortiumOrderersResponse.setSuccess(context.booleanValue("DescribeConsortiumOrderersResponse.Success"));
		describeConsortiumOrderersResponse.setErrorCode(context.integerValue("DescribeConsortiumOrderersResponse.ErrorCode"));

		List<Orderer> result = new ArrayList<Orderer>();
		for (int i = 0; i < context.lengthValue("DescribeConsortiumOrderersResponse.Result.Length"); i++) {
			Orderer orderer = new Orderer();
			orderer.setName(context.stringValue("DescribeConsortiumOrderersResponse.Result["+ i +"].Name"));
			orderer.setDomain(context.stringValue("DescribeConsortiumOrderersResponse.Result["+ i +"].Domain"));
			orderer.setPort(context.integerValue("DescribeConsortiumOrderersResponse.Result["+ i +"].Port"));
			orderer.setInstanceType(context.stringValue("DescribeConsortiumOrderersResponse.Result["+ i +"].InstanceType"));
			orderer.setCreateTime(context.stringValue("DescribeConsortiumOrderersResponse.Result["+ i +"].CreateTime"));
			orderer.setUpdateTime(context.stringValue("DescribeConsortiumOrderersResponse.Result["+ i +"].UpdateTime"));

			result.add(orderer);
		}
		describeConsortiumOrderersResponse.setResult(result);
	 
	 	return describeConsortiumOrderersResponse;
	}
}