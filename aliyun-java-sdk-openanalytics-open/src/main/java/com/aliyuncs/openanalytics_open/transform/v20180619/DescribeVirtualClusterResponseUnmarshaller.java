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

package com.aliyuncs.openanalytics_open.transform.v20180619;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.openanalytics_open.model.v20180619.DescribeVirtualClusterResponse;
import com.aliyuncs.openanalytics_open.model.v20180619.DescribeVirtualClusterResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVirtualClusterResponseUnmarshaller {

	public static DescribeVirtualClusterResponse unmarshall(DescribeVirtualClusterResponse describeVirtualClusterResponse, UnmarshallerContext _ctx) {
		
		describeVirtualClusterResponse.setRequestId(_ctx.stringValue("DescribeVirtualClusterResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVirtualClusterResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("DescribeVirtualClusterResponse.Data["+ i +"].Name"));
			dataItem.setType(_ctx.stringValue("DescribeVirtualClusterResponse.Data["+ i +"].Type"));
			dataItem.setStatus(_ctx.stringValue("DescribeVirtualClusterResponse.Data["+ i +"].Status"));
			dataItem.setCreatorId(_ctx.stringValue("DescribeVirtualClusterResponse.Data["+ i +"].CreatorId"));
			dataItem.setCreateTime(_ctx.stringValue("DescribeVirtualClusterResponse.Data["+ i +"].CreateTime"));
			dataItem.setSparkEngineModuleName(_ctx.stringValue("DescribeVirtualClusterResponse.Data["+ i +"].SparkEngineModuleName"));
			dataItem.setDefaultExecutorSpecName(_ctx.stringValue("DescribeVirtualClusterResponse.Data["+ i +"].DefaultExecutorSpecName"));
			dataItem.setDefaultDriverSpecName(_ctx.stringValue("DescribeVirtualClusterResponse.Data["+ i +"].DefaultDriverSpecName"));
			dataItem.setDefaultExecutorNumbers(_ctx.longValue("DescribeVirtualClusterResponse.Data["+ i +"].DefaultExecutorNumbers"));
			dataItem.setSparkVersionDescription(_ctx.stringValue("DescribeVirtualClusterResponse.Data["+ i +"].SparkVersionDescription"));
			dataItem.setMaxCpu(_ctx.floatValue("DescribeVirtualClusterResponse.Data["+ i +"].MaxCpu"));
			dataItem.setMaxMemory(_ctx.floatValue("DescribeVirtualClusterResponse.Data["+ i +"].MaxMemory"));

			data.add(dataItem);
		}
		describeVirtualClusterResponse.setData(data);
	 
	 	return describeVirtualClusterResponse;
	}
}