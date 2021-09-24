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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QueryClusterSpecificationResponse;
import com.aliyuncs.mse.model.v20190531.QueryClusterSpecificationResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryClusterSpecificationResponseUnmarshaller {

	public static QueryClusterSpecificationResponse unmarshall(QueryClusterSpecificationResponse queryClusterSpecificationResponse, UnmarshallerContext _ctx) {
		
		queryClusterSpecificationResponse.setRequestId(_ctx.stringValue("QueryClusterSpecificationResponse.RequestId"));
		queryClusterSpecificationResponse.setHttpStatusCode(_ctx.integerValue("QueryClusterSpecificationResponse.HttpStatusCode"));
		queryClusterSpecificationResponse.setSuccess(_ctx.booleanValue("QueryClusterSpecificationResponse.Success"));
		queryClusterSpecificationResponse.setErrorCode(_ctx.stringValue("QueryClusterSpecificationResponse.ErrorCode"));
		queryClusterSpecificationResponse.setCode(_ctx.integerValue("QueryClusterSpecificationResponse.Code"));
		queryClusterSpecificationResponse.setMessage(_ctx.stringValue("QueryClusterSpecificationResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryClusterSpecificationResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setClusterSpecificationName(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].ClusterSpecificationName"));
			dataItem.setDiskCapacity(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].DiskCapacity"));
			dataItem.setMemoryCapacity(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].MemoryCapacity"));
			dataItem.setInstanceCount(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].InstanceCount"));
			dataItem.setMaxTps(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].MaxTps"));
			dataItem.setMaxCon(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].MaxCon"));
			dataItem.setCpuCapacity(_ctx.stringValue("QueryClusterSpecificationResponse.Data["+ i +"].CpuCapacity"));

			data.add(dataItem);
		}
		queryClusterSpecificationResponse.setData(data);
	 
	 	return queryClusterSpecificationResponse;
	}
}