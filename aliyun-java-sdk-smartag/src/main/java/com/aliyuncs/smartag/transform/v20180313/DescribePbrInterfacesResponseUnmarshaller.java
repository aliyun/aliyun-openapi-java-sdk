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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribePbrInterfacesResponse;
import com.aliyuncs.smartag.model.v20180313.DescribePbrInterfacesResponse.PbrInterface;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePbrInterfacesResponseUnmarshaller {

	public static DescribePbrInterfacesResponse unmarshall(DescribePbrInterfacesResponse describePbrInterfacesResponse, UnmarshallerContext _ctx) {
		
		describePbrInterfacesResponse.setRequestId(_ctx.stringValue("DescribePbrInterfacesResponse.RequestId"));
		describePbrInterfacesResponse.setTotalCount(_ctx.integerValue("DescribePbrInterfacesResponse.TotalCount"));

		List<PbrInterface> pbrInterfaces = new ArrayList<PbrInterface>();
		for (int i = 0; i < _ctx.lengthValue("DescribePbrInterfacesResponse.PbrInterfaces.Length"); i++) {
			PbrInterface pbrInterface = new PbrInterface();
			pbrInterface.setInterfaceName(_ctx.stringValue("DescribePbrInterfacesResponse.PbrInterfaces["+ i +"].InterfaceName"));
			pbrInterface.setHealthCheckInstanceId(_ctx.stringValue("DescribePbrInterfacesResponse.PbrInterfaces["+ i +"].HealthCheckInstanceId"));
			pbrInterface.setPriority(_ctx.integerValue("DescribePbrInterfacesResponse.PbrInterfaces["+ i +"].Priority"));
			pbrInterface.setAction(_ctx.stringValue("DescribePbrInterfacesResponse.PbrInterfaces["+ i +"].Action"));

			pbrInterfaces.add(pbrInterface);
		}
		describePbrInterfacesResponse.setPbrInterfaces(pbrInterfaces);
	 
	 	return describePbrInterfacesResponse;
	}
}