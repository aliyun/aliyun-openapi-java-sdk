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

package com.aliyuncs.sgw.transform.v20180511;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sgw.model.v20180511.DescribeGatewaysResponse;
import com.aliyuncs.sgw.model.v20180511.DescribeGatewaysResponse.Gateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewaysResponseUnmarshaller {

	public static DescribeGatewaysResponse unmarshall(DescribeGatewaysResponse describeGatewaysResponse, UnmarshallerContext _ctx) {
		
		describeGatewaysResponse.setRequestId(_ctx.stringValue("DescribeGatewaysResponse.RequestId"));
		describeGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeGatewaysResponse.TotalCount"));
		describeGatewaysResponse.setMessage(_ctx.stringValue("DescribeGatewaysResponse.Message"));
		describeGatewaysResponse.setPageSize(_ctx.integerValue("DescribeGatewaysResponse.PageSize"));
		describeGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeGatewaysResponse.PageNumber"));
		describeGatewaysResponse.setCode(_ctx.stringValue("DescribeGatewaysResponse.Code"));
		describeGatewaysResponse.setSuccess(_ctx.booleanValue("DescribeGatewaysResponse.Success"));

		List<Gateway> gateways = new ArrayList<Gateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewaysResponse.Gateways.Length"); i++) {
			Gateway gateway = new Gateway();
			gateway.setVpcId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].VpcId"));
			gateway.setStatus(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].Status"));
			gateway.setSerialNumber(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].SerialNumber"));
			gateway.setType(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].Type"));
			gateway.setCapacity(_ctx.integerValue("DescribeGatewaysResponse.Gateways["+ i +"].Capacity"));
			gateway.setGatewayId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].GatewayId"));
			gateway.setIsReleaseAfterExpiration(_ctx.booleanValue("DescribeGatewaysResponse.Gateways["+ i +"].IsReleaseAfterExpiration"));
			gateway.setGatewayType(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].GatewayType"));
			gateway.setBuyURL(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].BuyURL"));
			gateway.setEcsInstanceId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].EcsInstanceId"));
			gateway.setMaxThroughput(_ctx.integerValue("DescribeGatewaysResponse.Gateways["+ i +"].MaxThroughput"));
			gateway.setGatewayClass(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].GatewayClass"));
			gateway.setInnerIp(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].InnerIp"));
			gateway.setDescription(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].Description"));
			gateway.setName(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].Name"));
			gateway.setInnerIpv6Ip(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].InnerIpv6Ip"));
			gateway.setCreatedTime(_ctx.longValue("DescribeGatewaysResponse.Gateways["+ i +"].CreatedTime"));
			gateway.setExpireStatus(_ctx.integerValue("DescribeGatewaysResponse.Gateways["+ i +"].ExpireStatus"));
			gateway.setDataLoadInterval(_ctx.integerValue("DescribeGatewaysResponse.Gateways["+ i +"].DataLoadInterval"));
			gateway.setRenewURL(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].RenewURL"));
			gateway.setIsPostPaid(_ctx.booleanValue("DescribeGatewaysResponse.Gateways["+ i +"].IsPostPaid"));
			gateway.setPublicNetworkBandwidth(_ctx.integerValue("DescribeGatewaysResponse.Gateways["+ i +"].PublicNetworkBandwidth"));
			gateway.setStorageBundleId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].StorageBundleId"));
			gateway.setIp(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].Ip"));
			gateway.setLastErrorKey(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].LastErrorKey"));
			gateway.setModel(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].Model"));
			gateway.setVSwitchId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].VSwitchId"));
			gateway.setCommonBuyInstanceId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].CommonBuyInstanceId"));
			gateway.setExpiredTime(_ctx.longValue("DescribeGatewaysResponse.Gateways["+ i +"].ExpiredTime"));
			gateway.setGatewayVersion(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].GatewayVersion"));
			gateway.setDataLoadType(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].DataLoadType"));
			gateway.setElasticGateway(_ctx.booleanValue("DescribeGatewaysResponse.Gateways["+ i +"].ElasticGateway"));
			gateway.setCategory(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].Category"));
			gateway.setActivatedTime(_ctx.longValue("DescribeGatewaysResponse.Gateways["+ i +"].ActivatedTime"));
			gateway.setTaskId(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].TaskId"));
			gateway.setLocation(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].Location"));

			List<String> elasticNodes = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGatewaysResponse.Gateways["+ i +"].ElasticNodes.Length"); j++) {
				elasticNodes.add(_ctx.stringValue("DescribeGatewaysResponse.Gateways["+ i +"].ElasticNodes["+ j +"]"));
			}
			gateway.setElasticNodes(elasticNodes);

			gateways.add(gateway);
		}
		describeGatewaysResponse.setGateways(gateways);
	 
	 	return describeGatewaysResponse;
	}
}