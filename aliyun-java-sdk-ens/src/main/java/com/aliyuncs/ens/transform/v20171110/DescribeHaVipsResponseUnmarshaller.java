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

import com.aliyuncs.ens.model.v20171110.DescribeHaVipsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeHaVipsResponse.HaVip;
import com.aliyuncs.ens.model.v20171110.DescribeHaVipsResponse.HaVip.Eip;
import com.aliyuncs.ens.model.v20171110.DescribeHaVipsResponse.HaVip.Relation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeHaVipsResponseUnmarshaller {

	public static DescribeHaVipsResponse unmarshall(DescribeHaVipsResponse describeHaVipsResponse, UnmarshallerContext _ctx) {
		
		describeHaVipsResponse.setRequestId(_ctx.stringValue("DescribeHaVipsResponse.RequestId"));
		describeHaVipsResponse.setTotalCount(_ctx.stringValue("DescribeHaVipsResponse.TotalCount"));
		describeHaVipsResponse.setPageSize(_ctx.stringValue("DescribeHaVipsResponse.PageSize"));
		describeHaVipsResponse.setPageNumber(_ctx.stringValue("DescribeHaVipsResponse.PageNumber"));

		List<HaVip> haVips = new ArrayList<HaVip>();
		for (int i = 0; i < _ctx.lengthValue("DescribeHaVipsResponse.HaVips.Length"); i++) {
			HaVip haVip = new HaVip();
			haVip.setStatus(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].Status"));
			haVip.setCreationTime(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].CreationTime"));
			haVip.setDescription(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].Description"));
			haVip.setHaVipId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].HaVipId"));
			haVip.setName(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].Name"));
			haVip.setEnsRegionId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].EnsRegionId"));
			haVip.setNetworkId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].NetworkId"));
			haVip.setVSwitchId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].VSwitchId"));
			haVip.setIpAddress(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].IpAddress"));

			List<Eip> associatedEipAddresses = new ArrayList<Eip>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedEipAddresses.Length"); j++) {
				Eip eip = new Eip();
				eip.setEipId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedEipAddresses["+ j +"].EipId"));
				eip.setEip(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedEipAddresses["+ j +"].Eip"));

				associatedEipAddresses.add(eip);
			}
			haVip.setAssociatedEipAddresses(associatedEipAddresses);

			List<Relation> associatedInstances = new ArrayList<Relation>();
			for (int j = 0; j < _ctx.lengthValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances.Length"); j++) {
				Relation relation = new Relation();
				relation.setInstanceId(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances["+ j +"].InstanceId"));
				relation.setInstanceType(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances["+ j +"].InstanceType"));
				relation.setIpAddress(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances["+ j +"].IpAddress"));
				relation.setStatus(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances["+ j +"].Status"));
				relation.setCreationTime(_ctx.stringValue("DescribeHaVipsResponse.HaVips["+ i +"].AssociatedInstances["+ j +"].CreationTime"));

				associatedInstances.add(relation);
			}
			haVip.setAssociatedInstances(associatedInstances);

			haVips.add(haVip);
		}
		describeHaVipsResponse.setHaVips(haVips);
	 
	 	return describeHaVipsResponse;
	}
}