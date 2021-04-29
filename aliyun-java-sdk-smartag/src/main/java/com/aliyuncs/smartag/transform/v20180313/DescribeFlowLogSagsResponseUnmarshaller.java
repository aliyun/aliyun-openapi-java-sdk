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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeFlowLogSagsResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeFlowLogSagsResponse.Sag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeFlowLogSagsResponseUnmarshaller {

	public static DescribeFlowLogSagsResponse unmarshall(DescribeFlowLogSagsResponse describeFlowLogSagsResponse, UnmarshallerContext _ctx) {
		
		describeFlowLogSagsResponse.setRequestId(_ctx.stringValue("DescribeFlowLogSagsResponse.RequestId"));
		describeFlowLogSagsResponse.setTotalCount(_ctx.integerValue("DescribeFlowLogSagsResponse.TotalCount"));
		describeFlowLogSagsResponse.setPageSize(_ctx.integerValue("DescribeFlowLogSagsResponse.PageSize"));
		describeFlowLogSagsResponse.setPageNumber(_ctx.integerValue("DescribeFlowLogSagsResponse.PageNumber"));

		List<Sag> sags = new ArrayList<Sag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeFlowLogSagsResponse.Sags.Length"); i++) {
			Sag sag = new Sag();
			sag.setDescription(_ctx.stringValue("DescribeFlowLogSagsResponse.Sags["+ i +"].Description"));
			sag.setSmartAGId(_ctx.stringValue("DescribeFlowLogSagsResponse.Sags["+ i +"].SmartAGId"));
			sag.setName(_ctx.stringValue("DescribeFlowLogSagsResponse.Sags["+ i +"].Name"));

			sags.add(sag);
		}
		describeFlowLogSagsResponse.setSags(sags);
	 
	 	return describeFlowLogSagsResponse;
	}
}