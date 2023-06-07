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

package com.aliyuncs.swas_open.transform.v20200601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance.Image;
import com.aliyuncs.swas_open.model.v20200601.ListInstancesResponse.Instance.ResourceSpec;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setTotalCount(_ctx.integerValue("ListInstancesResponse.TotalCount"));
		listInstancesResponse.setPageSize(_ctx.integerValue("ListInstancesResponse.PageSize"));
		listInstancesResponse.setPageNumber(_ctx.integerValue("ListInstancesResponse.PageNumber"));

		List<Instance> instances = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			Instance instance = new Instance();
			instance.setStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status"));
			instance.setCreationTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CreationTime"));
			instance.setInnerIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InnerIpAddress"));
			instance.setChargeType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ChargeType"));
			instance.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			instance.setPlanId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PlanId"));
			instance.setPublicIpAddress(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PublicIpAddress"));
			instance.setRegionId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].RegionId"));
			instance.setExpiredTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ExpiredTime"));
			instance.setInstanceName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			instance.setBusinessStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].BusinessStatus"));
			instance.setDdosStatus(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].DdosStatus"));
			instance.setImageId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ImageId"));
			instance.setDisableReason(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].DisableReason"));
			instance.setCombination(_ctx.booleanValue("ListInstancesResponse.Instances["+ i +"].Combination"));
			instance.setCombinationInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].CombinationInstanceId"));
			instance.setUuid(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Uuid"));

			ResourceSpec resourceSpec = new ResourceSpec();
			resourceSpec.setDiskCategory(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.DiskCategory"));
			resourceSpec.setCpu(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.Cpu"));
			resourceSpec.setBandwidth(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.Bandwidth"));
			resourceSpec.setDiskSize(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.DiskSize"));
			resourceSpec.setMemory(_ctx.doubleValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.Memory"));
			resourceSpec.setFlow(_ctx.doubleValue("ListInstancesResponse.Instances["+ i +"].ResourceSpec.Flow"));
			instance.setResourceSpec(resourceSpec);

			Image image = new Image();
			image.setOsType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.OsType"));
			image.setImageName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageName"));
			image.setImageVersion(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageVersion"));
			image.setImageType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageType"));
			image.setImageIconUrl(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageIconUrl"));
			image.setImageContact(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Image.ImageContact"));
			instance.setImage(image);

			instances.add(instance);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}