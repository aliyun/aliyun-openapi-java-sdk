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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.OperateInstanceResponse;
import com.aliyuncs.dataphin_public.model.v20230630.OperateInstanceResponse.InstanceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateInstanceResponseUnmarshaller {

	public static OperateInstanceResponse unmarshall(OperateInstanceResponse operateInstanceResponse, UnmarshallerContext _ctx) {
		
		operateInstanceResponse.setRequestId(_ctx.stringValue("OperateInstanceResponse.RequestId"));
		operateInstanceResponse.setSuccess(_ctx.booleanValue("OperateInstanceResponse.Success"));
		operateInstanceResponse.setHttpStatusCode(_ctx.integerValue("OperateInstanceResponse.HttpStatusCode"));
		operateInstanceResponse.setCode(_ctx.stringValue("OperateInstanceResponse.Code"));
		operateInstanceResponse.setMessage(_ctx.stringValue("OperateInstanceResponse.Message"));

		List<InstanceStatus> instanceStatusList = new ArrayList<InstanceStatus>();
		for (int i = 0; i < _ctx.lengthValue("OperateInstanceResponse.InstanceStatusList.Length"); i++) {
			InstanceStatus instanceStatus = new InstanceStatus();
			instanceStatus.setId(_ctx.stringValue("OperateInstanceResponse.InstanceStatusList["+ i +"].Id"));
			instanceStatus.setName(_ctx.stringValue("OperateInstanceResponse.InstanceStatusList["+ i +"].Name"));
			instanceStatus.setDisplayName(_ctx.stringValue("OperateInstanceResponse.InstanceStatusList["+ i +"].DisplayName"));
			instanceStatus.setStatus(_ctx.stringValue("OperateInstanceResponse.InstanceStatusList["+ i +"].Status"));
			instanceStatus.setErrorMessage(_ctx.stringValue("OperateInstanceResponse.InstanceStatusList["+ i +"].ErrorMessage"));
			instanceStatus.setOwnerId(_ctx.stringValue("OperateInstanceResponse.InstanceStatusList["+ i +"].OwnerId"));
			instanceStatus.setOwnerName(_ctx.stringValue("OperateInstanceResponse.InstanceStatusList["+ i +"].OwnerName"));

			instanceStatusList.add(instanceStatus);
		}
		operateInstanceResponse.setInstanceStatusList(instanceStatusList);
	 
	 	return operateInstanceResponse;
	}
}