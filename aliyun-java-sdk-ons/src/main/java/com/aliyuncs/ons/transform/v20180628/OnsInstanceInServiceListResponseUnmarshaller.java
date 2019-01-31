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

package com.aliyuncs.ons.transform.v20180628;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180628.OnsInstanceInServiceListResponse;
import com.aliyuncs.ons.model.v20180628.OnsInstanceInServiceListResponse.InstanceVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsInstanceInServiceListResponseUnmarshaller {

	public static OnsInstanceInServiceListResponse unmarshall(OnsInstanceInServiceListResponse onsInstanceInServiceListResponse, UnmarshallerContext context) {
		
		onsInstanceInServiceListResponse.setRequestId(context.stringValue("OnsInstanceInServiceListResponse.RequestId"));
		onsInstanceInServiceListResponse.setHelpUrl(context.stringValue("OnsInstanceInServiceListResponse.HelpUrl"));

		List<InstanceVO> data = new ArrayList<InstanceVO>();
		for (int i = 0; i < context.lengthValue("OnsInstanceInServiceListResponse.Data.Length"); i++) {
			InstanceVO instanceVO = new InstanceVO();
			instanceVO.setInstanceId(context.stringValue("OnsInstanceInServiceListResponse.Data["+ i +"].InstanceId"));
			instanceVO.setInstanceStatus(context.integerValue("OnsInstanceInServiceListResponse.Data["+ i +"].InstanceStatus"));
			instanceVO.setReleaseTime(context.longValue("OnsInstanceInServiceListResponse.Data["+ i +"].ReleaseTime"));
			instanceVO.setInstanceType(context.integerValue("OnsInstanceInServiceListResponse.Data["+ i +"].InstanceType"));
			instanceVO.setInstanceName(context.stringValue("OnsInstanceInServiceListResponse.Data["+ i +"].InstanceName"));

			data.add(instanceVO);
		}
		onsInstanceInServiceListResponse.setData(data);
	 
	 	return onsInstanceInServiceListResponse;
	}
}