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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsResponse.TrafficControl;
import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsResponse.TrafficControl.SpecialPolicy;
import com.aliyuncs.cloudapi.model.v20160714.DescribeTrafficControlsResponse.TrafficControl.SpecialPolicy.Special;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTrafficControlsResponseUnmarshaller {

	public static DescribeTrafficControlsResponse unmarshall(DescribeTrafficControlsResponse describeTrafficControlsResponse, UnmarshallerContext _ctx) {
		
		describeTrafficControlsResponse.setRequestId(_ctx.stringValue("DescribeTrafficControlsResponse.RequestId"));
		describeTrafficControlsResponse.setTotalCount(_ctx.integerValue("DescribeTrafficControlsResponse.TotalCount"));
		describeTrafficControlsResponse.setPageSize(_ctx.integerValue("DescribeTrafficControlsResponse.PageSize"));
		describeTrafficControlsResponse.setPageNumber(_ctx.integerValue("DescribeTrafficControlsResponse.PageNumber"));

		List<TrafficControl> trafficControls = new ArrayList<TrafficControl>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrafficControlsResponse.TrafficControls.Length"); i++) {
			TrafficControl trafficControl = new TrafficControl();
			trafficControl.setTrafficControlId(_ctx.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].TrafficControlId"));
			trafficControl.setTrafficControlName(_ctx.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].TrafficControlName"));
			trafficControl.setDescription(_ctx.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].Description"));
			trafficControl.setTrafficControlUnit(_ctx.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].TrafficControlUnit"));
			trafficControl.setApiDefault(_ctx.integerValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].ApiDefault"));
			trafficControl.setUserDefault(_ctx.integerValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].UserDefault"));
			trafficControl.setAppDefault(_ctx.integerValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].AppDefault"));
			trafficControl.setCreatedTime(_ctx.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].CreatedTime"));
			trafficControl.setModifiedTime(_ctx.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].ModifiedTime"));

			List<SpecialPolicy> specialPolicies = new ArrayList<SpecialPolicy>();
			for (int j = 0; j < _ctx.lengthValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies.Length"); j++) {
				SpecialPolicy specialPolicy = new SpecialPolicy();
				specialPolicy.setSpecialType(_ctx.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies["+ j +"].SpecialType"));

				List<Special> specials = new ArrayList<Special>();
				for (int k = 0; k < _ctx.lengthValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies["+ j +"].Specials.Length"); k++) {
					Special special = new Special();
					special.setSpecialKey(_ctx.stringValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies["+ j +"].Specials["+ k +"].SpecialKey"));
					special.setTrafficValue(_ctx.integerValue("DescribeTrafficControlsResponse.TrafficControls["+ i +"].SpecialPolicies["+ j +"].Specials["+ k +"].TrafficValue"));

					specials.add(special);
				}
				specialPolicy.setSpecials(specials);

				specialPolicies.add(specialPolicy);
			}
			trafficControl.setSpecialPolicies(specialPolicies);

			trafficControls.add(trafficControl);
		}
		describeTrafficControlsResponse.setTrafficControls(trafficControls);
	 
	 	return describeTrafficControlsResponse;
	}
}