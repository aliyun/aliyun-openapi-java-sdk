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

package com.aliyuncs.arms.transform.v20190808;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.arms.model.v20190808.UpdatePrometheusGlobalViewResponse;
import com.aliyuncs.arms.model.v20190808.UpdatePrometheusGlobalViewResponse.Data;
import com.aliyuncs.arms.model.v20190808.UpdatePrometheusGlobalViewResponse.Data.FailedInstance;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePrometheusGlobalViewResponseUnmarshaller {

	public static UpdatePrometheusGlobalViewResponse unmarshall(UpdatePrometheusGlobalViewResponse updatePrometheusGlobalViewResponse, UnmarshallerContext _ctx) {
		
		updatePrometheusGlobalViewResponse.setRequestId(_ctx.stringValue("UpdatePrometheusGlobalViewResponse.RequestId"));
		updatePrometheusGlobalViewResponse.setMessage(_ctx.stringValue("UpdatePrometheusGlobalViewResponse.Message"));
		updatePrometheusGlobalViewResponse.setCode(_ctx.integerValue("UpdatePrometheusGlobalViewResponse.Code"));

		Data data = new Data();
		data.setSuccess(_ctx.booleanValue("UpdatePrometheusGlobalViewResponse.Data.Success"));

		List<FailedInstance> failedInstances = new ArrayList<FailedInstance>();
		for (int i = 0; i < _ctx.lengthValue("UpdatePrometheusGlobalViewResponse.Data.FailedInstances.Length"); i++) {
			FailedInstance failedInstance = new FailedInstance();
			failedInstance.setSourceName(_ctx.stringValue("UpdatePrometheusGlobalViewResponse.Data.FailedInstances["+ i +"].SourceName"));
			failedInstance.setSourceType(_ctx.stringValue("UpdatePrometheusGlobalViewResponse.Data.FailedInstances["+ i +"].SourceType"));
			failedInstance.setUserId(_ctx.stringValue("UpdatePrometheusGlobalViewResponse.Data.FailedInstances["+ i +"].UserId"));
			failedInstance.setClusterId(_ctx.stringValue("UpdatePrometheusGlobalViewResponse.Data.FailedInstances["+ i +"].ClusterId"));

			failedInstances.add(failedInstance);
		}
		data.setFailedInstances(failedInstances);
		updatePrometheusGlobalViewResponse.setData(data);
	 
	 	return updatePrometheusGlobalViewResponse;
	}
}