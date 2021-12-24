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

import com.aliyuncs.sgw.model.v20180511.DescribeGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGatewayResponseUnmarshaller {

	public static DescribeGatewayResponse unmarshall(DescribeGatewayResponse describeGatewayResponse, UnmarshallerContext _ctx) {
		
		describeGatewayResponse.setRequestId(_ctx.stringValue("DescribeGatewayResponse.RequestId"));
		describeGatewayResponse.setDescription(_ctx.stringValue("DescribeGatewayResponse.Description"));
		describeGatewayResponse.setCreatedTime(_ctx.longValue("DescribeGatewayResponse.CreatedTime"));
		describeGatewayResponse.setPublicNetworkBandwidth(_ctx.integerValue("DescribeGatewayResponse.PublicNetworkBandwidth"));
		describeGatewayResponse.setDataLoadType(_ctx.stringValue("DescribeGatewayResponse.DataLoadType"));
		describeGatewayResponse.setCategory(_ctx.stringValue("DescribeGatewayResponse.Category"));
		describeGatewayResponse.setTaskId(_ctx.stringValue("DescribeGatewayResponse.TaskId"));
		describeGatewayResponse.setMessage(_ctx.stringValue("DescribeGatewayResponse.Message"));
		describeGatewayResponse.setExpireStatus(_ctx.integerValue("DescribeGatewayResponse.ExpireStatus"));
		describeGatewayResponse.setIp(_ctx.stringValue("DescribeGatewayResponse.Ip"));
		describeGatewayResponse.setGatewayType(_ctx.stringValue("DescribeGatewayResponse.GatewayType"));
		describeGatewayResponse.setStorageBundleId(_ctx.stringValue("DescribeGatewayResponse.StorageBundleId"));
		describeGatewayResponse.setGatewayClass(_ctx.stringValue("DescribeGatewayResponse.GatewayClass"));
		describeGatewayResponse.setSuccess(_ctx.booleanValue("DescribeGatewayResponse.Success"));
		describeGatewayResponse.setName(_ctx.stringValue("DescribeGatewayResponse.Name"));
		describeGatewayResponse.setIsPostPaid(_ctx.booleanValue("DescribeGatewayResponse.IsPostPaid"));
		describeGatewayResponse.setCapacity(_ctx.integerValue("DescribeGatewayResponse.Capacity"));
		describeGatewayResponse.setExpiredTime(_ctx.longValue("DescribeGatewayResponse.ExpiredTime"));
		describeGatewayResponse.setGatewayVersion(_ctx.stringValue("DescribeGatewayResponse.GatewayVersion"));
		describeGatewayResponse.setIsReleaseAfterExpiration(_ctx.booleanValue("DescribeGatewayResponse.IsReleaseAfterExpiration"));
		describeGatewayResponse.setStatus(_ctx.stringValue("DescribeGatewayResponse.Status"));
		describeGatewayResponse.setBuyURL(_ctx.stringValue("DescribeGatewayResponse.BuyURL"));
		describeGatewayResponse.setMaxThroughput(_ctx.integerValue("DescribeGatewayResponse.MaxThroughput"));
		describeGatewayResponse.setDataLoadInterval(_ctx.integerValue("DescribeGatewayResponse.DataLoadInterval"));
		describeGatewayResponse.setInnerIp(_ctx.stringValue("DescribeGatewayResponse.InnerIp"));
		describeGatewayResponse.setVSwitchId(_ctx.stringValue("DescribeGatewayResponse.VSwitchId"));
		describeGatewayResponse.setGatewayId(_ctx.stringValue("DescribeGatewayResponse.GatewayId"));
		describeGatewayResponse.setCode(_ctx.stringValue("DescribeGatewayResponse.Code"));
		describeGatewayResponse.setEcsInstanceId(_ctx.stringValue("DescribeGatewayResponse.EcsInstanceId"));
		describeGatewayResponse.setType(_ctx.stringValue("DescribeGatewayResponse.Type"));
		describeGatewayResponse.setRenewURL(_ctx.stringValue("DescribeGatewayResponse.RenewURL"));
		describeGatewayResponse.setVpcId(_ctx.stringValue("DescribeGatewayResponse.VpcId"));
		describeGatewayResponse.setSerialNumber(_ctx.stringValue("DescribeGatewayResponse.SerialNumber"));
		describeGatewayResponse.setActivatedTime(_ctx.longValue("DescribeGatewayResponse.ActivatedTime"));
		describeGatewayResponse.setElasticGateway(_ctx.booleanValue("DescribeGatewayResponse.ElasticGateway"));
		describeGatewayResponse.setCommonBuyInstanceId(_ctx.stringValue("DescribeGatewayResponse.CommonBuyInstanceId"));
		describeGatewayResponse.setInnerIpv6Ip(_ctx.stringValue("DescribeGatewayResponse.InnerIpv6Ip"));
		describeGatewayResponse.setModel(_ctx.stringValue("DescribeGatewayResponse.Model"));
		describeGatewayResponse.setLastErrorKey(_ctx.stringValue("DescribeGatewayResponse.LastErrorKey"));
		describeGatewayResponse.setLocation(_ctx.stringValue("DescribeGatewayResponse.Location"));

		List<String> elasticNodes = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGatewayResponse.ElasticNodes.Length"); i++) {
			elasticNodes.add(_ctx.stringValue("DescribeGatewayResponse.ElasticNodes["+ i +"]"));
		}
		describeGatewayResponse.setElasticNodes(elasticNodes);
	 
	 	return describeGatewayResponse;
	}
}