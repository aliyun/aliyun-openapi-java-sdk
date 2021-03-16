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

import com.aliyuncs.ens.model.v20171110.DescribeEnsRegionsResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsRegionsResponse.EnsRegionsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsRegionsResponseUnmarshaller {

	public static DescribeEnsRegionsResponse unmarshall(DescribeEnsRegionsResponse describeEnsRegionsResponse, UnmarshallerContext _ctx) {
		
		describeEnsRegionsResponse.setRequestId(_ctx.stringValue("DescribeEnsRegionsResponse.RequestId"));
		describeEnsRegionsResponse.setCode(_ctx.integerValue("DescribeEnsRegionsResponse.Code"));

		List<EnsRegionsItem> ensRegions = new ArrayList<EnsRegionsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsRegionsResponse.EnsRegions.Length"); i++) {
			EnsRegionsItem ensRegionsItem = new EnsRegionsItem();
			ensRegionsItem.setArea(_ctx.stringValue("DescribeEnsRegionsResponse.EnsRegions["+ i +"].Area"));
			ensRegionsItem.setEnName(_ctx.stringValue("DescribeEnsRegionsResponse.EnsRegions["+ i +"].EnName"));
			ensRegionsItem.setEnsRegionId(_ctx.stringValue("DescribeEnsRegionsResponse.EnsRegions["+ i +"].EnsRegionId"));
			ensRegionsItem.setProvince(_ctx.stringValue("DescribeEnsRegionsResponse.EnsRegions["+ i +"].Province"));
			ensRegionsItem.setName(_ctx.stringValue("DescribeEnsRegionsResponse.EnsRegions["+ i +"].Name"));

			ensRegions.add(ensRegionsItem);
		}
		describeEnsRegionsResponse.setEnsRegions(ensRegions);
	 
	 	return describeEnsRegionsResponse;
	}
}