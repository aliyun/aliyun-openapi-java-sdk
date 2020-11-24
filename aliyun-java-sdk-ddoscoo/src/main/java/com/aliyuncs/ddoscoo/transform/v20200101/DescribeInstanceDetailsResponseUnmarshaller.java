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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceDetailsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceDetailsResponse.InstanceDetail;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeInstanceDetailsResponse.InstanceDetail.EipInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceDetailsResponseUnmarshaller {

	public static DescribeInstanceDetailsResponse unmarshall(DescribeInstanceDetailsResponse describeInstanceDetailsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceDetailsResponse.setRequestId(_ctx.stringValue("DescribeInstanceDetailsResponse.RequestId"));

		List<InstanceDetail> instanceDetails = new ArrayList<InstanceDetail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceDetailsResponse.InstanceDetails.Length"); i++) {
			InstanceDetail instanceDetail = new InstanceDetail();
			instanceDetail.setInstanceId(_ctx.stringValue("DescribeInstanceDetailsResponse.InstanceDetails["+ i +"].InstanceId"));
			instanceDetail.setLine(_ctx.stringValue("DescribeInstanceDetailsResponse.InstanceDetails["+ i +"].Line"));

			List<EipInfo> eipInfos = new ArrayList<EipInfo>();
			for (int j = 0; j < _ctx.lengthValue("DescribeInstanceDetailsResponse.InstanceDetails["+ i +"].EipInfos.Length"); j++) {
				EipInfo eipInfo = new EipInfo();
				eipInfo.setEip(_ctx.stringValue("DescribeInstanceDetailsResponse.InstanceDetails["+ i +"].EipInfos["+ j +"].Eip"));
				eipInfo.setStatus(_ctx.stringValue("DescribeInstanceDetailsResponse.InstanceDetails["+ i +"].EipInfos["+ j +"].Status"));

				eipInfos.add(eipInfo);
			}
			instanceDetail.setEipInfos(eipInfos);

			instanceDetails.add(instanceDetail);
		}
		describeInstanceDetailsResponse.setInstanceDetails(instanceDetails);
	 
	 	return describeInstanceDetailsResponse;
	}
}