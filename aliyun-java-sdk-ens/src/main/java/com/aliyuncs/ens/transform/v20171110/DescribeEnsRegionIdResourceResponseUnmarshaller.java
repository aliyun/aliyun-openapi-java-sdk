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

import com.aliyuncs.ens.model.v20171110.DescribeEnsRegionIdResourceResponse;
import com.aliyuncs.ens.model.v20171110.DescribeEnsRegionIdResourceResponse.EnsRegionIdResource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEnsRegionIdResourceResponseUnmarshaller {

	public static DescribeEnsRegionIdResourceResponse unmarshall(DescribeEnsRegionIdResourceResponse describeEnsRegionIdResourceResponse, UnmarshallerContext _ctx) {
		
		describeEnsRegionIdResourceResponse.setRequestId(_ctx.stringValue("DescribeEnsRegionIdResourceResponse.RequestId"));
		describeEnsRegionIdResourceResponse.setTotalCount(_ctx.integerValue("DescribeEnsRegionIdResourceResponse.TotalCount"));
		describeEnsRegionIdResourceResponse.setPageNumber(_ctx.integerValue("DescribeEnsRegionIdResourceResponse.PageNumber"));
		describeEnsRegionIdResourceResponse.setPageSize(_ctx.integerValue("DescribeEnsRegionIdResourceResponse.PageSize"));

		List<EnsRegionIdResource> ensRegionIdResources = new ArrayList<EnsRegionIdResource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources.Length"); i++) {
			EnsRegionIdResource ensRegionIdResource = new EnsRegionIdResource();
			ensRegionIdResource.setArea(_ctx.stringValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources["+ i +"].Area"));
			ensRegionIdResource.setAreaCode(_ctx.stringValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources["+ i +"].AreaCode"));
			ensRegionIdResource.setEnsRegionId(_ctx.stringValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources["+ i +"].EnsRegionId"));
			ensRegionIdResource.setEnsRegionIdName(_ctx.stringValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources["+ i +"].EnsRegionIdName"));
			ensRegionIdResource.setVCpu(_ctx.integerValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources["+ i +"].VCpu"));
			ensRegionIdResource.setInternetBandwidth(_ctx.integerValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources["+ i +"].InternetBandwidth"));
			ensRegionIdResource.setIsp(_ctx.stringValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources["+ i +"].Isp"));
			ensRegionIdResource.setBizDate(_ctx.stringValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources["+ i +"].BizDate"));
			ensRegionIdResource.setInstanceCount(_ctx.integerValue("DescribeEnsRegionIdResourceResponse.EnsRegionIdResources["+ i +"].InstanceCount"));

			ensRegionIdResources.add(ensRegionIdResource);
		}
		describeEnsRegionIdResourceResponse.setEnsRegionIdResources(ensRegionIdResources);
	 
	 	return describeEnsRegionIdResourceResponse;
	}
}