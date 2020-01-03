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

package com.aliyuncs.ehpc.transform.v20180412;

import com.aliyuncs.ehpc.model.v20180412.DescribeContainerAppResponse;
import com.aliyuncs.ehpc.model.v20180412.DescribeContainerAppResponse.ContainerAppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContainerAppResponseUnmarshaller {

	public static DescribeContainerAppResponse unmarshall(DescribeContainerAppResponse describeContainerAppResponse, UnmarshallerContext _ctx) {
		
		describeContainerAppResponse.setRequestId(_ctx.stringValue("DescribeContainerAppResponse.RequestId"));

		ContainerAppInfo containerAppInfo = new ContainerAppInfo();
		containerAppInfo.setId(_ctx.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Id"));
		containerAppInfo.setName(_ctx.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Name"));
		containerAppInfo.setDescription(_ctx.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Description"));
		containerAppInfo.setRepository(_ctx.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Repository"));
		containerAppInfo.setImageTag(_ctx.stringValue("DescribeContainerAppResponse.ContainerAppInfo.ImageTag"));
		containerAppInfo.setCreateTime(_ctx.stringValue("DescribeContainerAppResponse.ContainerAppInfo.CreateTime"));
		containerAppInfo.setType(_ctx.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Type"));
		describeContainerAppResponse.setContainerAppInfo(containerAppInfo);
	 
	 	return describeContainerAppResponse;
	}
}