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

import com.aliyuncs.ens.model.v20171110.DescribeDataDistResultResponse;
import com.aliyuncs.ens.model.v20171110.DescribeDataDistResultResponse.DistResult;
import com.aliyuncs.ens.model.v20171110.DescribeDataDistResultResponse.DistResult.StatusStat;
import com.aliyuncs.ens.model.v20171110.DescribeDataDistResultResponse.DistResult.StatusStat.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataDistResultResponseUnmarshaller {

	public static DescribeDataDistResultResponse unmarshall(DescribeDataDistResultResponse describeDataDistResultResponse, UnmarshallerContext _ctx) {
		
		describeDataDistResultResponse.setRequestId(_ctx.stringValue("DescribeDataDistResultResponse.RequestId"));
		describeDataDistResultResponse.setPageNumber(_ctx.integerValue("DescribeDataDistResultResponse.PageNumber"));
		describeDataDistResultResponse.setPageSize(_ctx.integerValue("DescribeDataDistResultResponse.PageSize"));
		describeDataDistResultResponse.setTotalCount(_ctx.integerValue("DescribeDataDistResultResponse.TotalCount"));

		List<DistResult> distResults = new ArrayList<DistResult>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataDistResultResponse.DistResults.Length"); i++) {
			DistResult distResult = new DistResult();
			distResult.setName(_ctx.stringValue("DescribeDataDistResultResponse.DistResults["+ i +"].Name"));
			distResult.setVersion(_ctx.stringValue("DescribeDataDistResultResponse.DistResults["+ i +"].Version"));

			List<StatusStat> statusStats = new ArrayList<StatusStat>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataDistResultResponse.DistResults["+ i +"].StatusStats.Length"); j++) {
				StatusStat statusStat = new StatusStat();
				statusStat.setInstanceCount(_ctx.stringValue("DescribeDataDistResultResponse.DistResults["+ i +"].StatusStats["+ j +"].InstanceCount"));
				statusStat.setStatus(_ctx.stringValue("DescribeDataDistResultResponse.DistResults["+ i +"].StatusStats["+ j +"].Status"));

				List<Instance> instances = new ArrayList<Instance>();
				for (int k = 0; k < _ctx.lengthValue("DescribeDataDistResultResponse.DistResults["+ i +"].StatusStats["+ j +"].Instances.Length"); k++) {
					Instance instance = new Instance();
					instance.setInstanceId(_ctx.stringValue("DescribeDataDistResultResponse.DistResults["+ i +"].StatusStats["+ j +"].Instances["+ k +"].InstanceId"));
					instance.setStartTime(_ctx.stringValue("DescribeDataDistResultResponse.DistResults["+ i +"].StatusStats["+ j +"].Instances["+ k +"].StartTime"));
					instance.setStatusDescrip(_ctx.stringValue("DescribeDataDistResultResponse.DistResults["+ i +"].StatusStats["+ j +"].Instances["+ k +"].StatusDescrip"));
					instance.setUpdateTime(_ctx.stringValue("DescribeDataDistResultResponse.DistResults["+ i +"].StatusStats["+ j +"].Instances["+ k +"].UpdateTime"));

					instances.add(instance);
				}
				statusStat.setInstances(instances);

				statusStats.add(statusStat);
			}
			distResult.setStatusStats(statusStats);

			distResults.add(distResult);
		}
		describeDataDistResultResponse.setDistResults(distResults);
	 
	 	return describeDataDistResultResponse;
	}
}