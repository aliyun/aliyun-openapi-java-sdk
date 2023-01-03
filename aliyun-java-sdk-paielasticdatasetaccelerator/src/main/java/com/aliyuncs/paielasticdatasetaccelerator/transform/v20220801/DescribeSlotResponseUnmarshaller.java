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

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeSlotResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeSlotResponse.LifeCycle;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeSlotResponse.Status;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeSlotResponse.Status.Detail;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeSlotResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSlotResponseUnmarshaller {

	public static DescribeSlotResponse unmarshall(DescribeSlotResponse describeSlotResponse, UnmarshallerContext _ctx) {
		
		describeSlotResponse.setRequestId(_ctx.stringValue("DescribeSlotResponse.RequestId"));
		describeSlotResponse.setUserId(_ctx.stringValue("DescribeSlotResponse.UserId"));
		describeSlotResponse.setOwnerId(_ctx.stringValue("DescribeSlotResponse.OwnerId"));
		describeSlotResponse.setGmtCreateTime(_ctx.stringValue("DescribeSlotResponse.GmtCreateTime"));
		describeSlotResponse.setGmtModifiedTime(_ctx.stringValue("DescribeSlotResponse.GmtModifiedTime"));
		describeSlotResponse.setUuid(_ctx.stringValue("DescribeSlotResponse.Uuid"));
		describeSlotResponse.setInstanceId(_ctx.stringValue("DescribeSlotResponse.InstanceId"));
		describeSlotResponse.setName(_ctx.stringValue("DescribeSlotResponse.Name"));
		describeSlotResponse.setDescription(_ctx.stringValue("DescribeSlotResponse.Description"));
		describeSlotResponse.setStorageType(_ctx.stringValue("DescribeSlotResponse.StorageType"));
		describeSlotResponse.setStorageUri(_ctx.stringValue("DescribeSlotResponse.StorageUri"));
		describeSlotResponse.setCapacity(_ctx.stringValue("DescribeSlotResponse.Capacity"));

		LifeCycle lifeCycle = new LifeCycle();
		lifeCycle.setType(_ctx.stringValue("DescribeSlotResponse.LifeCycle.Type"));
		lifeCycle.setConfig(_ctx.stringValue("DescribeSlotResponse.LifeCycle.Config"));
		describeSlotResponse.setLifeCycle(lifeCycle);

		Status status = new Status();
		status.setPhase(_ctx.stringValue("DescribeSlotResponse.Status.Phase"));
		status.setCode(_ctx.stringValue("DescribeSlotResponse.Status.Code"));
		status.setMessage(_ctx.stringValue("DescribeSlotResponse.Status.Message"));

		Detail detail = new Detail();
		detail.setLoadedFileNum(_ctx.longValue("DescribeSlotResponse.Status.Detail.LoadedFileNum"));
		detail.setLoadedFileSize(_ctx.stringValue("DescribeSlotResponse.Status.Detail.LoadedFileSize"));
		detail.setLoadingTimeCost(_ctx.longValue("DescribeSlotResponse.Status.Detail.LoadingTimeCost"));
		status.setDetail(detail);
		describeSlotResponse.setStatus(status);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSlotResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeSlotResponse.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("DescribeSlotResponse.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		describeSlotResponse.setTags(tags);
	 
	 	return describeSlotResponse;
	}
}