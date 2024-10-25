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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeInstanceBandwidthDetailResponse;
import com.aliyuncs.ens.model.v20171110.DescribeInstanceBandwidthDetailResponse.Bandwidth;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceBandwidthDetailResponseUnmarshaller {

	public static DescribeInstanceBandwidthDetailResponse unmarshall(DescribeInstanceBandwidthDetailResponse describeInstanceBandwidthDetailResponse, UnmarshallerContext _ctx) {
		
		describeInstanceBandwidthDetailResponse.setRequestId(_ctx.stringValue("DescribeInstanceBandwidthDetailResponse.RequestId"));
		describeInstanceBandwidthDetailResponse.setPageNumber(_ctx.integerValue("DescribeInstanceBandwidthDetailResponse.PageNumber"));
		describeInstanceBandwidthDetailResponse.setPageSize(_ctx.integerValue("DescribeInstanceBandwidthDetailResponse.PageSize"));
		describeInstanceBandwidthDetailResponse.setTotalCount(_ctx.integerValue("DescribeInstanceBandwidthDetailResponse.TotalCount"));

		List<Bandwidth> bandwidths = new ArrayList<Bandwidth>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceBandwidthDetailResponse.Bandwidths.Length"); i++) {
			Bandwidth bandwidth = new Bandwidth();
			bandwidth.setInstanceId(_ctx.stringValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].InstanceId"));
			bandwidth.setServiceType(_ctx.stringValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].ServiceType"));
			bandwidth.setInstanceType(_ctx.stringValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].InstanceType"));
			bandwidth.setAliUid(_ctx.longValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].AliUid"));
			bandwidth.setEnsRegionId(_ctx.stringValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].EnsRegionId"));
			bandwidth.setTxBw(_ctx.longValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].TxBw"));
			bandwidth.setRxBw(_ctx.longValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].RxBw"));
			bandwidth.setIp(_ctx.stringValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].Ip"));
			bandwidth.setIsp(_ctx.stringValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].Isp"));
			bandwidth.setFlowType(_ctx.integerValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].FlowType"));
			bandwidth.setBizTime(_ctx.stringValue("DescribeInstanceBandwidthDetailResponse.Bandwidths["+ i +"].BizTime"));

			bandwidths.add(bandwidth);
		}
		describeInstanceBandwidthDetailResponse.setBandwidths(bandwidths);
	 
	 	return describeInstanceBandwidthDetailResponse;
	}
}