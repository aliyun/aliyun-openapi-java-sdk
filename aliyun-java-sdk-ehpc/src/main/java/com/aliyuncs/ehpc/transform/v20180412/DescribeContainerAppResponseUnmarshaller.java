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

	public static DescribeContainerAppResponse unmarshall(DescribeContainerAppResponse describeContainerAppResponse, UnmarshallerContext context) {
		
		describeContainerAppResponse.setRequestId(context.stringValue("DescribeContainerAppResponse.RequestId"));

		ContainerAppInfo containerAppInfo = new ContainerAppInfo();
		containerAppInfo.setId(context.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Id"));
		containerAppInfo.setName(context.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Name"));
		containerAppInfo.setDescription(context.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Description"));
		containerAppInfo.setRepository(context.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Repository"));
		containerAppInfo.setImageTag(context.stringValue("DescribeContainerAppResponse.ContainerAppInfo.ImageTag"));
		containerAppInfo.setCreateTime(context.stringValue("DescribeContainerAppResponse.ContainerAppInfo.CreateTime"));
		containerAppInfo.setType(context.stringValue("DescribeContainerAppResponse.ContainerAppInfo.Type"));
		describeContainerAppResponse.setContainerAppInfo(containerAppInfo);
	 
	 	return describeContainerAppResponse;
	}
}