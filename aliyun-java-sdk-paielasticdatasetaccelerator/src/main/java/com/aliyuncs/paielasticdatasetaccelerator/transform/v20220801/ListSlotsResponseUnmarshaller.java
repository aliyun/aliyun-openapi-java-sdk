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

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListSlotsResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListSlotsResponse.SlotsItem;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListSlotsResponse.SlotsItem.EndpointsItem;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListSlotsResponse.SlotsItem.EndpointsItem.Status1;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListSlotsResponse.SlotsItem.EndpointsItem.Status1.Detail;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListSlotsResponse.SlotsItem.LifeCycle;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListSlotsResponse.SlotsItem.Status;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListSlotsResponse.SlotsItem.Status.Detail2;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.ListSlotsResponse.SlotsItem.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSlotsResponseUnmarshaller {

	public static ListSlotsResponse unmarshall(ListSlotsResponse listSlotsResponse, UnmarshallerContext _ctx) {
		
		listSlotsResponse.setRequestId(_ctx.stringValue("ListSlotsResponse.RequestId"));
		listSlotsResponse.setTotalCount(_ctx.integerValue("ListSlotsResponse.TotalCount"));

		List<SlotsItem> slots = new ArrayList<SlotsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSlotsResponse.Slots.Length"); i++) {
			SlotsItem slotsItem = new SlotsItem();
			slotsItem.setUserId(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].UserId"));
			slotsItem.setOwnerId(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].OwnerId"));
			slotsItem.setGmtCreateTime(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].GmtCreateTime"));
			slotsItem.setGmtModifiedTime(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].GmtModifiedTime"));
			slotsItem.setUuid(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Uuid"));
			slotsItem.setInstanceId(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].InstanceId"));
			slotsItem.setName(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Name"));
			slotsItem.setDescription(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Description"));
			slotsItem.setStorageType(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].StorageType"));
			slotsItem.setStorageUri(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].StorageUri"));
			slotsItem.setCapacity(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Capacity"));
			slotsItem.setIoType(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].IoType"));

			LifeCycle lifeCycle = new LifeCycle();
			lifeCycle.setType(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].LifeCycle.Type"));
			lifeCycle.setConfig(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].LifeCycle.Config"));
			slotsItem.setLifeCycle(lifeCycle);

			Status status = new Status();
			status.setPhase(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Status.Phase"));
			status.setCode(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Status.Code"));
			status.setMessage(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Status.Message"));

			Detail2 detail2 = new Detail2();
			detail2.setLoadedFileNum(_ctx.longValue("ListSlotsResponse.Slots["+ i +"].Status.Detail.LoadedFileNum"));
			detail2.setLoadedFileSize(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Status.Detail.LoadedFileSize"));
			detail2.setLoadingTimeCost(_ctx.longValue("ListSlotsResponse.Slots["+ i +"].Status.Detail.LoadingTimeCost"));
			status.setDetail2(detail2);
			slotsItem.setStatus(status);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSlotsResponse.Slots["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			slotsItem.setTags(tags);

			List<EndpointsItem> endpoints = new ArrayList<EndpointsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListSlotsResponse.Slots["+ i +"].Endpoints.Length"); j++) {
				EndpointsItem endpointsItem = new EndpointsItem();
				endpointsItem.setUserId(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].UserId"));
				endpointsItem.setOwnerId(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].OwnerId"));
				endpointsItem.setGmtCreateTime(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].GmtCreateTime"));
				endpointsItem.setGmtModifiedTime(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].GmtModifiedTime"));
				endpointsItem.setUuid(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].Uuid"));
				endpointsItem.setName(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].Name"));
				endpointsItem.setType(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].Type"));
				endpointsItem.setVpcId(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].VpcId"));
				endpointsItem.setVswitchId(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].VswitchId"));

				Status1 status1 = new Status1();
				status1.setPhase(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].Status.Phase"));
				status1.setCode(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].Status.Code"));
				status1.setMessage(_ctx.stringValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].Status.Message"));

				Detail detail = new Detail();
				detail.setIpPortMapping(_ctx.mapValue("ListSlotsResponse.Slots["+ i +"].Endpoints["+ j +"].Status.Detail.IpPortMapping"));
				status1.setDetail(detail);
				endpointsItem.setStatus1(status1);

				endpoints.add(endpointsItem);
			}
			slotsItem.setEndpoints(endpoints);

			slots.add(slotsItem);
		}
		listSlotsResponse.setSlots(slots);
	 
	 	return listSlotsResponse;
	}
}