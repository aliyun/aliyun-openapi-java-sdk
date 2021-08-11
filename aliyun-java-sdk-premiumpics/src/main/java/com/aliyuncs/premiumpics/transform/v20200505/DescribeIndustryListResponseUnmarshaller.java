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

package com.aliyuncs.premiumpics.transform.v20200505;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.premiumpics.model.v20200505.DescribeIndustryListResponse;
import com.aliyuncs.premiumpics.model.v20200505.DescribeIndustryListResponse.Industries;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIndustryListResponseUnmarshaller {

	public static DescribeIndustryListResponse unmarshall(DescribeIndustryListResponse describeIndustryListResponse, UnmarshallerContext _ctx) {
		
		describeIndustryListResponse.setRequestId(_ctx.stringValue("DescribeIndustryListResponse.RequestId"));
		describeIndustryListResponse.setSuccess(_ctx.booleanValue("DescribeIndustryListResponse.Success"));

		List<Industries> data = new ArrayList<Industries>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIndustryListResponse.Data.Length"); i++) {
			Industries industries = new Industries();
			industries.setName(_ctx.stringValue("DescribeIndustryListResponse.Data["+ i +"].Name"));
			industries.setDescription(_ctx.stringValue("DescribeIndustryListResponse.Data["+ i +"].Description"));
			industries.setIndustryId(_ctx.stringValue("DescribeIndustryListResponse.Data["+ i +"].IndustryId"));

			data.add(industries);
		}
		describeIndustryListResponse.setData(data);
	 
	 	return describeIndustryListResponse;
	}
}