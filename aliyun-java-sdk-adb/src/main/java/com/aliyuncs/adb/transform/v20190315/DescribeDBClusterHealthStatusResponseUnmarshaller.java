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

package com.aliyuncs.adb.transform.v20190315;

import com.aliyuncs.adb.model.v20190315.DescribeDBClusterHealthStatusResponse;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterHealthStatusResponse.CS;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterHealthStatusResponse.Executor;
import com.aliyuncs.adb.model.v20190315.DescribeDBClusterHealthStatusResponse.Worker;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClusterHealthStatusResponseUnmarshaller {

	public static DescribeDBClusterHealthStatusResponse unmarshall(DescribeDBClusterHealthStatusResponse describeDBClusterHealthStatusResponse, UnmarshallerContext _ctx) {
		
		describeDBClusterHealthStatusResponse.setRequestId(_ctx.stringValue("DescribeDBClusterHealthStatusResponse.RequestId"));
		describeDBClusterHealthStatusResponse.setInstanceStatus(_ctx.stringValue("DescribeDBClusterHealthStatusResponse.InstanceStatus"));

		CS cS = new CS();
		cS.setActiveCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.CS.ActiveCount"));
		cS.setUnavailableCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.CS.UnavailableCount"));
		cS.setRiskCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.CS.RiskCount"));
		cS.setExpectedCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.CS.ExpectedCount"));
		cS.setStatus(_ctx.stringValue("DescribeDBClusterHealthStatusResponse.CS.Status"));
		describeDBClusterHealthStatusResponse.setCS(cS);

		Executor executor = new Executor();
		executor.setActiveCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.Executor.ActiveCount"));
		executor.setUnavailableCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.Executor.UnavailableCount"));
		executor.setRiskCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.Executor.RiskCount"));
		executor.setExpectedCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.Executor.ExpectedCount"));
		executor.setStatus(_ctx.stringValue("DescribeDBClusterHealthStatusResponse.Executor.Status"));
		describeDBClusterHealthStatusResponse.setExecutor(executor);

		Worker worker = new Worker();
		worker.setActiveCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.Worker.ActiveCount"));
		worker.setUnavailableCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.Worker.UnavailableCount"));
		worker.setRiskCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.Worker.RiskCount"));
		worker.setExpectedCount(_ctx.longValue("DescribeDBClusterHealthStatusResponse.Worker.ExpectedCount"));
		worker.setStatus(_ctx.stringValue("DescribeDBClusterHealthStatusResponse.Worker.Status"));
		describeDBClusterHealthStatusResponse.setWorker(worker);
	 
	 	return describeDBClusterHealthStatusResponse;
	}
}