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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.ListUsageForResourceGroupResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListUsageForResourceGroupResponse.PopUsageForResourceGroupDto;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListUsageForResourceGroupResponseUnmarshaller {

	public static ListUsageForResourceGroupResponse unmarshall(ListUsageForResourceGroupResponse listUsageForResourceGroupResponse, UnmarshallerContext _ctx) {
		
		listUsageForResourceGroupResponse.setRequestId(_ctx.stringValue("ListUsageForResourceGroupResponse.RequestId"));
		listUsageForResourceGroupResponse.setHttpStatusCode(_ctx.integerValue("ListUsageForResourceGroupResponse.HttpStatusCode"));
		listUsageForResourceGroupResponse.setErrorMessage(_ctx.stringValue("ListUsageForResourceGroupResponse.ErrorMessage"));
		listUsageForResourceGroupResponse.setErrorCode(_ctx.stringValue("ListUsageForResourceGroupResponse.ErrorCode"));
		listUsageForResourceGroupResponse.setSuccess(_ctx.booleanValue("ListUsageForResourceGroupResponse.Success"));

		List<PopUsageForResourceGroupDto> data = new ArrayList<PopUsageForResourceGroupDto>();
		for (int i = 0; i < _ctx.lengthValue("ListUsageForResourceGroupResponse.Data.Length"); i++) {
			PopUsageForResourceGroupDto popUsageForResourceGroupDto = new PopUsageForResourceGroupDto();
			popUsageForResourceGroupDto.setUsage(_ctx.doubleValue("ListUsageForResourceGroupResponse.Data["+ i +"].Usage"));
			popUsageForResourceGroupDto.setRecodeTime(_ctx.longValue("ListUsageForResourceGroupResponse.Data["+ i +"].RecodeTime"));

			data.add(popUsageForResourceGroupDto);
		}
		listUsageForResourceGroupResponse.setData(data);
	 
	 	return listUsageForResourceGroupResponse;
	}
}