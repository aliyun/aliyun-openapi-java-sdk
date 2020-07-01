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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeContactGroupListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeContactGroupListResponse.ContactGroup;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeContactGroupListResponseUnmarshaller {

	public static DescribeContactGroupListResponse unmarshall(DescribeContactGroupListResponse describeContactGroupListResponse, UnmarshallerContext _ctx) {
		
		describeContactGroupListResponse.setRequestId(_ctx.stringValue("DescribeContactGroupListResponse.RequestId"));
		describeContactGroupListResponse.setSuccess(_ctx.booleanValue("DescribeContactGroupListResponse.Success"));
		describeContactGroupListResponse.setCode(_ctx.stringValue("DescribeContactGroupListResponse.Code"));
		describeContactGroupListResponse.setMessage(_ctx.stringValue("DescribeContactGroupListResponse.Message"));
		describeContactGroupListResponse.setTotal(_ctx.integerValue("DescribeContactGroupListResponse.Total"));

		List<String> contactGroups = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContactGroupListResponse.ContactGroups.Length"); i++) {
			contactGroups.add(_ctx.stringValue("DescribeContactGroupListResponse.ContactGroups["+ i +"]"));
		}
		describeContactGroupListResponse.setContactGroups(contactGroups);

		List<ContactGroup> contactGroupList = new ArrayList<ContactGroup>();
		for (int i = 0; i < _ctx.lengthValue("DescribeContactGroupListResponse.ContactGroupList.Length"); i++) {
			ContactGroup contactGroup = new ContactGroup();
			contactGroup.setName(_ctx.stringValue("DescribeContactGroupListResponse.ContactGroupList["+ i +"].Name"));
			contactGroup.setDescribe(_ctx.stringValue("DescribeContactGroupListResponse.ContactGroupList["+ i +"].Describe"));
			contactGroup.setCreateTime(_ctx.longValue("DescribeContactGroupListResponse.ContactGroupList["+ i +"].CreateTime"));
			contactGroup.setUpdateTime(_ctx.longValue("DescribeContactGroupListResponse.ContactGroupList["+ i +"].UpdateTime"));
			contactGroup.setEnabledWeeklyReport(_ctx.booleanValue("DescribeContactGroupListResponse.ContactGroupList["+ i +"].EnabledWeeklyReport"));
			contactGroup.setEnableSubscribed(_ctx.booleanValue("DescribeContactGroupListResponse.ContactGroupList["+ i +"].EnableSubscribed"));

			List<String> contacts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeContactGroupListResponse.ContactGroupList["+ i +"].Contacts.Length"); j++) {
				contacts.add(_ctx.stringValue("DescribeContactGroupListResponse.ContactGroupList["+ i +"].Contacts["+ j +"]"));
			}
			contactGroup.setContacts(contacts);

			contactGroupList.add(contactGroup);
		}
		describeContactGroupListResponse.setContactGroupList(contactGroupList);
	 
	 	return describeContactGroupListResponse;
	}
}