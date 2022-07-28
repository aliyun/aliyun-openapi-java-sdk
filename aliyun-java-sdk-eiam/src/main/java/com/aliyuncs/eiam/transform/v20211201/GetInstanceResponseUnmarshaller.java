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

package com.aliyuncs.eiam.transform.v20211201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eiam.model.v20211201.GetInstanceResponse;
import com.aliyuncs.eiam.model.v20211201.GetInstanceResponse.Instance;
import com.aliyuncs.eiam.model.v20211201.GetInstanceResponse.Instance.CustomEndpoint;
import com.aliyuncs.eiam.model.v20211201.GetInstanceResponse.Instance.DefaultEndpoint;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetInstanceResponseUnmarshaller {

	public static GetInstanceResponse unmarshall(GetInstanceResponse getInstanceResponse, UnmarshallerContext _ctx) {
		
		getInstanceResponse.setRequestId(_ctx.stringValue("GetInstanceResponse.RequestId"));

		Instance instance = new Instance();
		instance.setInstanceId(_ctx.stringValue("GetInstanceResponse.Instance.InstanceId"));
		instance.setCreateTime(_ctx.longValue("GetInstanceResponse.Instance.CreateTime"));
		instance.setStatus(_ctx.stringValue("GetInstanceResponse.Instance.Status"));
		instance.setDescription(_ctx.stringValue("GetInstanceResponse.Instance.Description"));
		instance.setLogoUrl(_ctx.stringValue("GetInstanceResponse.Instance.LogoUrl"));
		instance.setFaviconUrl(_ctx.stringValue("GetInstanceResponse.Instance.FaviconUrl"));
		instance.setTitle(_ctx.stringValue("GetInstanceResponse.Instance.Title"));

		List<String> egressAddresses = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Instance.EgressAddresses.Length"); i++) {
			egressAddresses.add(_ctx.stringValue("GetInstanceResponse.Instance.EgressAddresses["+ i +"]"));
		}
		instance.setEgressAddresses(egressAddresses);

		DefaultEndpoint defaultEndpoint = new DefaultEndpoint();
		defaultEndpoint.setEndpoint(_ctx.stringValue("GetInstanceResponse.Instance.DefaultEndpoint.Endpoint"));
		defaultEndpoint.setStatus(_ctx.stringValue("GetInstanceResponse.Instance.DefaultEndpoint.Status"));
		instance.setDefaultEndpoint(defaultEndpoint);

		List<CustomEndpoint> customEndpoints = new ArrayList<CustomEndpoint>();
		for (int i = 0; i < _ctx.lengthValue("GetInstanceResponse.Instance.CustomEndpoints.Length"); i++) {
			CustomEndpoint customEndpoint = new CustomEndpoint();
			customEndpoint.setEndpoint(_ctx.stringValue("GetInstanceResponse.Instance.CustomEndpoints["+ i +"].Endpoint"));
			customEndpoint.setStatus(_ctx.stringValue("GetInstanceResponse.Instance.CustomEndpoints["+ i +"].Status"));

			customEndpoints.add(customEndpoint);
		}
		instance.setCustomEndpoints(customEndpoints);
		getInstanceResponse.setInstance(instance);
	 
	 	return getInstanceResponse;
	}
}