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

package com.aliyuncs.retailbot.transform.v20210224;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.retailbot.model.v20210224.ListSubscriptionByRobotResponse;
import com.aliyuncs.retailbot.model.v20210224.ListSubscriptionByRobotResponse.PackageDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubscriptionByRobotResponseUnmarshaller {

	public static ListSubscriptionByRobotResponse unmarshall(ListSubscriptionByRobotResponse listSubscriptionByRobotResponse, UnmarshallerContext _ctx) {
		
		listSubscriptionByRobotResponse.setRequestId(_ctx.stringValue("ListSubscriptionByRobotResponse.RequestId"));
		listSubscriptionByRobotResponse.setSuccess(_ctx.booleanValue("ListSubscriptionByRobotResponse.Success"));
		listSubscriptionByRobotResponse.setCode(_ctx.stringValue("ListSubscriptionByRobotResponse.Code"));
		listSubscriptionByRobotResponse.setMessage(_ctx.stringValue("ListSubscriptionByRobotResponse.Message"));

		List<PackageDTO> data = new ArrayList<PackageDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListSubscriptionByRobotResponse.Data.Length"); i++) {
			PackageDTO packageDTO = new PackageDTO();
			packageDTO.setRobotCode(_ctx.stringValue("ListSubscriptionByRobotResponse.Data["+ i +"].RobotCode"));
			packageDTO.setPackageCode(_ctx.stringValue("ListSubscriptionByRobotResponse.Data["+ i +"].PackageCode"));
			packageDTO.setPackageVersion(_ctx.stringValue("ListSubscriptionByRobotResponse.Data["+ i +"].PackageVersion"));

			data.add(packageDTO);
		}
		listSubscriptionByRobotResponse.setData(data);
	 
	 	return listSubscriptionByRobotResponse;
	}
}