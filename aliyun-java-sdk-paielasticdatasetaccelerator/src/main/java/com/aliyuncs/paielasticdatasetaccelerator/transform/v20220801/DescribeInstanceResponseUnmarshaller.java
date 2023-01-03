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

import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeInstanceResponse;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeInstanceResponse.Status;
import com.aliyuncs.paielasticdatasetaccelerator.model.v20220801.DescribeInstanceResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResponseUnmarshaller {

	public static DescribeInstanceResponse unmarshall(DescribeInstanceResponse describeInstanceResponse, UnmarshallerContext _ctx) {
		
		describeInstanceResponse.setRequestId(_ctx.stringValue("DescribeInstanceResponse.RequestId"));
		describeInstanceResponse.setUserId(_ctx.stringValue("DescribeInstanceResponse.UserId"));
		describeInstanceResponse.setOwnerId(_ctx.stringValue("DescribeInstanceResponse.OwnerId"));
		describeInstanceResponse.setGmtCreateTime(_ctx.stringValue("DescribeInstanceResponse.GmtCreateTime"));
		describeInstanceResponse.setGmtModifiedTime(_ctx.stringValue("DescribeInstanceResponse.GmtModifiedTime"));
		describeInstanceResponse.setUuid(_ctx.stringValue("DescribeInstanceResponse.Uuid"));
		describeInstanceResponse.setName(_ctx.stringValue("DescribeInstanceResponse.Name"));
		describeInstanceResponse.setDescription(_ctx.stringValue("DescribeInstanceResponse.Description"));
		describeInstanceResponse.setType(_ctx.stringValue("DescribeInstanceResponse.Type"));
		describeInstanceResponse.setPaymentType(_ctx.stringValue("DescribeInstanceResponse.PaymentType"));
		describeInstanceResponse.setCapacity(_ctx.stringValue("DescribeInstanceResponse.Capacity"));
		describeInstanceResponse.setMaxSlot(_ctx.integerValue("DescribeInstanceResponse.MaxSlot"));

		Status status = new Status();
		status.setPhase(_ctx.stringValue("DescribeInstanceResponse.Status.Phase"));
		status.setCode(_ctx.stringValue("DescribeInstanceResponse.Status.Code"));
		status.setMessage(_ctx.stringValue("DescribeInstanceResponse.Status.Message"));
		status.setUsedCapacity(_ctx.stringValue("DescribeInstanceResponse.Status.UsedCapacity"));
		status.setSlotNum(_ctx.integerValue("DescribeInstanceResponse.Status.SlotNum"));
		describeInstanceResponse.setStatus(status);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeInstanceResponse.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("DescribeInstanceResponse.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		describeInstanceResponse.setTags(tags);
	 
	 	return describeInstanceResponse;
	}
}