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

import com.aliyuncs.ens.model.v20171110.DescribeElbAvailableResourceInfoResponse;
import com.aliyuncs.ens.model.v20171110.DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeElbAvailableResourceInfoResponseUnmarshaller {

	public static DescribeElbAvailableResourceInfoResponse unmarshall(DescribeElbAvailableResourceInfoResponse describeElbAvailableResourceInfoResponse, UnmarshallerContext _ctx) {
		
		describeElbAvailableResourceInfoResponse.setRequestId(_ctx.stringValue("DescribeElbAvailableResourceInfoResponse.RequestId"));

		List<ElbAvailableResourceInfoItem> elbAvailableResourceInfo = new ArrayList<ElbAvailableResourceInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo.Length"); i++) {
			ElbAvailableResourceInfoItem elbAvailableResourceInfoItem = new ElbAvailableResourceInfoItem();
			elbAvailableResourceInfoItem.setEnsRegionId(_ctx.stringValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].EnsRegionId"));
			elbAvailableResourceInfoItem.setEnName(_ctx.stringValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].EnName"));
			elbAvailableResourceInfoItem.setArea(_ctx.stringValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].Area"));
			elbAvailableResourceInfoItem.setProvince(_ctx.stringValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].Province"));
			elbAvailableResourceInfoItem.setName(_ctx.stringValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].Name"));
			elbAvailableResourceInfoItem.setCanBuyCount(_ctx.stringValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].CanBuyCount"));

			List<String> loadBalancerSpec = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].LoadBalancerSpec.Length"); j++) {
				loadBalancerSpec.add(_ctx.stringValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].LoadBalancerSpec["+ j +"]"));
			}
			elbAvailableResourceInfoItem.setLoadBalancerSpec(loadBalancerSpec);

			List<String> ability = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].Ability.Length"); j++) {
				ability.add(_ctx.stringValue("DescribeElbAvailableResourceInfoResponse.ElbAvailableResourceInfo["+ i +"].Ability["+ j +"]"));
			}
			elbAvailableResourceInfoItem.setAbility(ability);

			elbAvailableResourceInfo.add(elbAvailableResourceInfoItem);
		}
		describeElbAvailableResourceInfoResponse.setElbAvailableResourceInfo(elbAvailableResourceInfo);
	 
	 	return describeElbAvailableResourceInfoResponse;
	}
}