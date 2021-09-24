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

import com.aliyuncs.mse.model.v20190531.ListEurekaInstancesResponse;
import com.aliyuncs.mse.model.v20190531.ListEurekaInstancesResponse.EurekaInstance;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEurekaInstancesResponseUnmarshaller {

	public static ListEurekaInstancesResponse unmarshall(ListEurekaInstancesResponse listEurekaInstancesResponse, UnmarshallerContext _ctx) {
		
		listEurekaInstancesResponse.setRequestId(_ctx.stringValue("ListEurekaInstancesResponse.RequestId"));
		listEurekaInstancesResponse.setHttpCode(_ctx.stringValue("ListEurekaInstancesResponse.HttpCode"));
		listEurekaInstancesResponse.setTotalCount(_ctx.integerValue("ListEurekaInstancesResponse.TotalCount"));
		listEurekaInstancesResponse.setMessage(_ctx.stringValue("ListEurekaInstancesResponse.Message"));
		listEurekaInstancesResponse.setPageSize(_ctx.integerValue("ListEurekaInstancesResponse.PageSize"));
		listEurekaInstancesResponse.setPageNumber(_ctx.integerValue("ListEurekaInstancesResponse.PageNumber"));
		listEurekaInstancesResponse.setErrorCode(_ctx.stringValue("ListEurekaInstancesResponse.ErrorCode"));
		listEurekaInstancesResponse.setSuccess(_ctx.booleanValue("ListEurekaInstancesResponse.Success"));

		List<EurekaInstance> data = new ArrayList<EurekaInstance>();
		for (int i = 0; i < _ctx.lengthValue("ListEurekaInstancesResponse.Data.Length"); i++) {
			EurekaInstance eurekaInstance = new EurekaInstance();
			eurekaInstance.setStatus(_ctx.stringValue("ListEurekaInstancesResponse.Data["+ i +"].Status"));
			eurekaInstance.setLastDirtyTimestamp(_ctx.longValue("ListEurekaInstancesResponse.Data["+ i +"].LastDirtyTimestamp"));
			eurekaInstance.setIpAddr(_ctx.stringValue("ListEurekaInstancesResponse.Data["+ i +"].IpAddr"));
			eurekaInstance.setHomePageUrl(_ctx.stringValue("ListEurekaInstancesResponse.Data["+ i +"].HomePageUrl"));
			eurekaInstance.setHostName(_ctx.stringValue("ListEurekaInstancesResponse.Data["+ i +"].HostName"));
			eurekaInstance.setInstanceId(_ctx.stringValue("ListEurekaInstancesResponse.Data["+ i +"].InstanceId"));
			eurekaInstance.setPort(_ctx.integerValue("ListEurekaInstancesResponse.Data["+ i +"].Port"));
			eurekaInstance.setSecurePort(_ctx.integerValue("ListEurekaInstancesResponse.Data["+ i +"].SecurePort"));
			eurekaInstance.setApp(_ctx.stringValue("ListEurekaInstancesResponse.Data["+ i +"].App"));
			eurekaInstance.setDurationInSecs(_ctx.integerValue("ListEurekaInstancesResponse.Data["+ i +"].DurationInSecs"));
			eurekaInstance.setLastUpdatedTimestamp(_ctx.longValue("ListEurekaInstancesResponse.Data["+ i +"].LastUpdatedTimestamp"));
			eurekaInstance.setRenewalIntervalInSecs(_ctx.integerValue("ListEurekaInstancesResponse.Data["+ i +"].RenewalIntervalInSecs"));
			eurekaInstance.setVipAddress(_ctx.stringValue("ListEurekaInstancesResponse.Data["+ i +"].VipAddress"));
			eurekaInstance.setMetadata(_ctx.mapValue("ListEurekaInstancesResponse.Data["+ i +"].Metadata"));

			data.add(eurekaInstance);
		}
		listEurekaInstancesResponse.setData(data);
	 
	 	return listEurekaInstancesResponse;
	}
}