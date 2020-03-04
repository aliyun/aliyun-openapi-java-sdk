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

package com.aliyuncs.amqp_open.transform.v20191212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.amqp_open.model.v20191212.ListInstancesResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListInstancesResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListInstancesResponse.Data.InstanceVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));

		Data data = new Data();
		data.setMaxResults(_ctx.integerValue("ListInstancesResponse.Data.MaxResults"));
		data.setNextToken(_ctx.stringValue("ListInstancesResponse.Data.NextToken"));

		List<InstanceVO> instances = new ArrayList<InstanceVO>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Data.Instances.Length"); i++) {
			InstanceVO instanceVO = new InstanceVO();
			instanceVO.setInstanceId(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].InstanceId"));
			instanceVO.setInstanceName(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].InstanceName"));
			instanceVO.setInstanceType(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].InstanceType"));
			instanceVO.setStatus(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].Status"));
			instanceVO.setOrderType(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].OrderType"));
			instanceVO.setOrderCreateTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].OrderCreateTime"));
			instanceVO.setExpireTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].ExpireTime"));
			instanceVO.setAutoRenewInstance(_ctx.booleanValue("ListInstancesResponse.Data.Instances["+ i +"].AutoRenewInstance"));
			instanceVO.setSupportEIP(_ctx.booleanValue("ListInstancesResponse.Data.Instances["+ i +"].SupportEIP"));
			instanceVO.setPrivateEndpoint(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].PrivateEndpoint"));
			instanceVO.setPublicEndpoint(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].PublicEndpoint"));

			instances.add(instanceVO);
		}
		data.setInstances(instances);
		listInstancesResponse.setData(data);
	 
	 	return listInstancesResponse;
	}
}