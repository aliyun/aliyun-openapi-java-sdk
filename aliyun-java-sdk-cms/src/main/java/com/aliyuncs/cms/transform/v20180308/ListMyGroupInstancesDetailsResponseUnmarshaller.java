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

package com.aliyuncs.cms.transform.v20180308;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20180308.ListMyGroupInstancesDetailsResponse;
import com.aliyuncs.cms.model.v20180308.ListMyGroupInstancesDetailsResponse.Resource;
import com.aliyuncs.cms.model.v20180308.ListMyGroupInstancesDetailsResponse.Resource.Region;
import com.aliyuncs.cms.model.v20180308.ListMyGroupInstancesDetailsResponse.Resource.Tag;
import com.aliyuncs.cms.model.v20180308.ListMyGroupInstancesDetailsResponse.Resource.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMyGroupInstancesDetailsResponseUnmarshaller {

	public static ListMyGroupInstancesDetailsResponse unmarshall(ListMyGroupInstancesDetailsResponse listMyGroupInstancesDetailsResponse, UnmarshallerContext context) {
		
		listMyGroupInstancesDetailsResponse.setRequestId(context.stringValue("ListMyGroupInstancesDetailsResponse.RequestId"));
		listMyGroupInstancesDetailsResponse.setSuccess(context.booleanValue("ListMyGroupInstancesDetailsResponse.Success"));
		listMyGroupInstancesDetailsResponse.setErrorCode(context.integerValue("ListMyGroupInstancesDetailsResponse.ErrorCode"));
		listMyGroupInstancesDetailsResponse.setErrorMessage(context.stringValue("ListMyGroupInstancesDetailsResponse.ErrorMessage"));
		listMyGroupInstancesDetailsResponse.setPageNumber(context.integerValue("ListMyGroupInstancesDetailsResponse.PageNumber"));
		listMyGroupInstancesDetailsResponse.setPageSize(context.integerValue("ListMyGroupInstancesDetailsResponse.PageSize"));
		listMyGroupInstancesDetailsResponse.setTotal(context.integerValue("ListMyGroupInstancesDetailsResponse.Total"));

		List<Resource> resources = new ArrayList<Resource>();
		for (int i = 0; i < context.lengthValue("ListMyGroupInstancesDetailsResponse.Resources.Length"); i++) {
			Resource resource = new Resource();
			resource.setAliUid(context.longValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].AliUid"));
			resource.setInstanceName(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].InstanceName"));
			resource.setInstanceId(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].InstanceId"));
			resource.setDesc(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].Desc"));
			resource.setNetworkType(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].NetworkType"));
			resource.setCategory(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].Category"));

			Region region = new Region();
			region.setRegionId(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].Region.RegionId"));
			region.setAvailabilityZone(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].Region.AvailabilityZone"));
			resource.setRegion(region);

			Vpc vpc = new Vpc();
			vpc.setVpcInstanceId(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].Vpc.VpcInstanceId"));
			vpc.setVswitchInstanceId(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].Vpc.VswitchInstanceId"));
			resource.setVpc(vpc);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(context.stringValue("ListMyGroupInstancesDetailsResponse.Resources["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			resource.setTags(tags);

			resources.add(resource);
		}
		listMyGroupInstancesDetailsResponse.setResources(resources);
	 
	 	return listMyGroupInstancesDetailsResponse;
	}
}