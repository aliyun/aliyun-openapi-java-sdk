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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.GetAclResponse;
import com.aliyuncs.ga.model.v20191120.GetAclResponse.AclEntriesItem;
import com.aliyuncs.ga.model.v20191120.GetAclResponse.RelatedListenersItem;
import com.aliyuncs.ga.model.v20191120.GetAclResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAclResponseUnmarshaller {

	public static GetAclResponse unmarshall(GetAclResponse getAclResponse, UnmarshallerContext _ctx) {
		
		getAclResponse.setRequestId(_ctx.stringValue("GetAclResponse.RequestId"));
		getAclResponse.setAclId(_ctx.stringValue("GetAclResponse.AclId"));
		getAclResponse.setAddressIPVersion(_ctx.stringValue("GetAclResponse.AddressIPVersion"));
		getAclResponse.setAclStatus(_ctx.stringValue("GetAclResponse.AclStatus"));
		getAclResponse.setAclName(_ctx.stringValue("GetAclResponse.AclName"));
		getAclResponse.setResourceGroupId(_ctx.stringValue("GetAclResponse.ResourceGroupId"));

		List<AclEntriesItem> aclEntries = new ArrayList<AclEntriesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAclResponse.AclEntries.Length"); i++) {
			AclEntriesItem aclEntriesItem = new AclEntriesItem();
			aclEntriesItem.setEntry(_ctx.stringValue("GetAclResponse.AclEntries["+ i +"].Entry"));
			aclEntriesItem.setEntryDescription(_ctx.stringValue("GetAclResponse.AclEntries["+ i +"].EntryDescription"));

			aclEntries.add(aclEntriesItem);
		}
		getAclResponse.setAclEntries(aclEntries);

		List<RelatedListenersItem> relatedListeners = new ArrayList<RelatedListenersItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAclResponse.RelatedListeners.Length"); i++) {
			RelatedListenersItem relatedListenersItem = new RelatedListenersItem();
			relatedListenersItem.setListenerId(_ctx.stringValue("GetAclResponse.RelatedListeners["+ i +"].ListenerId"));
			relatedListenersItem.setAclType(_ctx.stringValue("GetAclResponse.RelatedListeners["+ i +"].AclType"));
			relatedListenersItem.setAcceleratorId(_ctx.stringValue("GetAclResponse.RelatedListeners["+ i +"].AcceleratorId"));

			relatedListeners.add(relatedListenersItem);
		}
		getAclResponse.setRelatedListeners(relatedListeners);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAclResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("GetAclResponse.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("GetAclResponse.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		getAclResponse.setTags(tags);
	 
	 	return getAclResponse;
	}
}