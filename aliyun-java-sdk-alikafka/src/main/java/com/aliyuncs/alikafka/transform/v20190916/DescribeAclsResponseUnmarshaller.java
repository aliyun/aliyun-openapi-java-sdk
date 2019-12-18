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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.DescribeAclsResponse;
import com.aliyuncs.alikafka.model.v20190916.DescribeAclsResponse.KafkaAclVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAclsResponseUnmarshaller {

	public static DescribeAclsResponse unmarshall(DescribeAclsResponse describeAclsResponse, UnmarshallerContext _ctx) {
		
		describeAclsResponse.setRequestId(_ctx.stringValue("DescribeAclsResponse.RequestId"));
		describeAclsResponse.setSuccess(_ctx.booleanValue("DescribeAclsResponse.Success"));
		describeAclsResponse.setCode(_ctx.integerValue("DescribeAclsResponse.Code"));
		describeAclsResponse.setMessage(_ctx.stringValue("DescribeAclsResponse.Message"));

		List<KafkaAclVO> kafkaAclList = new ArrayList<KafkaAclVO>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAclsResponse.KafkaAclList.Length"); i++) {
			KafkaAclVO kafkaAclVO = new KafkaAclVO();
			kafkaAclVO.setUsername(_ctx.stringValue("DescribeAclsResponse.KafkaAclList["+ i +"].Username"));
			kafkaAclVO.setAclResourceType(_ctx.stringValue("DescribeAclsResponse.KafkaAclList["+ i +"].AclResourceType"));
			kafkaAclVO.setAclResourceName(_ctx.stringValue("DescribeAclsResponse.KafkaAclList["+ i +"].AclResourceName"));
			kafkaAclVO.setAclResourcePatternType(_ctx.stringValue("DescribeAclsResponse.KafkaAclList["+ i +"].AclResourcePatternType"));
			kafkaAclVO.setHost(_ctx.stringValue("DescribeAclsResponse.KafkaAclList["+ i +"].Host"));
			kafkaAclVO.setAclOperationType(_ctx.stringValue("DescribeAclsResponse.KafkaAclList["+ i +"].AclOperationType"));

			kafkaAclList.add(kafkaAclVO);
		}
		describeAclsResponse.setKafkaAclList(kafkaAclList);
	 
	 	return describeAclsResponse;
	}
}