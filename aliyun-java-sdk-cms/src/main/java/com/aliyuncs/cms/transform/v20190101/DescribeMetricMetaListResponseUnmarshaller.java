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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeMetricMetaListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeMetricMetaListResponse.Resource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMetricMetaListResponseUnmarshaller {

	public static DescribeMetricMetaListResponse unmarshall(DescribeMetricMetaListResponse describeMetricMetaListResponse, UnmarshallerContext _ctx) {
		
		describeMetricMetaListResponse.setRequestId(_ctx.stringValue("DescribeMetricMetaListResponse.RequestId"));
		describeMetricMetaListResponse.setSuccess(_ctx.booleanValue("DescribeMetricMetaListResponse.Success"));
		describeMetricMetaListResponse.setCode(_ctx.stringValue("DescribeMetricMetaListResponse.Code"));
		describeMetricMetaListResponse.setMessage(_ctx.stringValue("DescribeMetricMetaListResponse.Message"));
		describeMetricMetaListResponse.setTotalCount(_ctx.stringValue("DescribeMetricMetaListResponse.TotalCount"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMetricMetaListResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setNamespace(_ctx.stringValue("DescribeMetricMetaListResponse.Resources["+ i +"].Namespace"));
			resource.setMetricName(_ctx.stringValue("DescribeMetricMetaListResponse.Resources["+ i +"].MetricName"));
			resource.setStatistics(_ctx.stringValue("DescribeMetricMetaListResponse.Resources["+ i +"].Statistics"));
			resource.setUnit(_ctx.stringValue("DescribeMetricMetaListResponse.Resources["+ i +"].Unit"));
			resource.setDescription(_ctx.stringValue("DescribeMetricMetaListResponse.Resources["+ i +"].Description"));
			resource.setDimensions(_ctx.stringValue("DescribeMetricMetaListResponse.Resources["+ i +"].Dimensions"));
			resource.setPeriods(_ctx.stringValue("DescribeMetricMetaListResponse.Resources["+ i +"].Periods"));
			resource.setLabels(_ctx.stringValue("DescribeMetricMetaListResponse.Resources["+ i +"].Labels"));

			resources.add(resource);
		}
		describeMetricMetaListResponse.setResources(resources);
	 
	 	return describeMetricMetaListResponse;
	}
}