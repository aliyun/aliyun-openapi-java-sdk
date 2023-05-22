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

package com.aliyuncs.paielasticdatasetaccelerator.transform.v20220801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListInstancesResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListInstancesResponse.InstancesItem;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListInstancesResponse.InstancesItem.Status;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListInstancesResponse.InstancesItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setTotalCount(_ctx.integerValue("ListInstancesResponse.TotalCount"));

		List<InstancesItem> instances = new ArrayList<InstancesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			InstancesItem instancesItem = new InstancesItem();
			instancesItem.setUserId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].UserId"));
			instancesItem.setOwnerId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].OwnerId"));
			instancesItem.setGmtCreateTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].GmtCreateTime"));
			instancesItem.setGmtModifiedTime(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].GmtModifiedTime"));
			instancesItem.setUuid(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Uuid"));
			instancesItem.setName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Name"));
			instancesItem.setDescription(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Description"));
			instancesItem.setType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Type"));
			instancesItem.setPaymentType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].PaymentType"));
			instancesItem.setCapacity(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Capacity"));
			instancesItem.setMaxSlot(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].MaxSlot"));
			instancesItem.setMaxEndpoint(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].MaxEndpoint"));
			instancesItem.setStorageType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].StorageType"));
			instancesItem.setProviderType(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].ProviderType"));

			Status status = new Status();
			status.setPhase(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status.Phase"));
			status.setCode(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status.Code"));
			status.setMessage(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status.Message"));
			status.setUsedCapacity(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Status.UsedCapacity"));
			status.setSlotNum(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].Status.SlotNum"));
			instancesItem.setStatus(status);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			instancesItem.setTags(tags);

			instances.add(instancesItem);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}