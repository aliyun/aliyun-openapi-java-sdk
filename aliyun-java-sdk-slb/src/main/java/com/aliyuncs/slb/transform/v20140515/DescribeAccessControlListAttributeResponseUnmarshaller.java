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

package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListAttributeResponse;
import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListAttributeResponse.AclEntry;
import com.aliyuncs.slb.model.v20140515.DescribeAccessControlListAttributeResponse.RelatedListener;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccessControlListAttributeResponseUnmarshaller {

	public static DescribeAccessControlListAttributeResponse unmarshall(DescribeAccessControlListAttributeResponse describeAccessControlListAttributeResponse, UnmarshallerContext context) {
		
		describeAccessControlListAttributeResponse.setRequestId(context.stringValue("DescribeAccessControlListAttributeResponse.RequestId"));
		describeAccessControlListAttributeResponse.setAclId(context.stringValue("DescribeAccessControlListAttributeResponse.AclId"));
		describeAccessControlListAttributeResponse.setAclName(context.stringValue("DescribeAccessControlListAttributeResponse.AclName"));
		describeAccessControlListAttributeResponse.setAddressIPVersion(context.stringValue("DescribeAccessControlListAttributeResponse.AddressIPVersion"));
		describeAccessControlListAttributeResponse.setResourceGroupId(context.stringValue("DescribeAccessControlListAttributeResponse.ResourceGroupId"));

		List<AclEntry> aclEntrys = new ArrayList<AclEntry>();
		for (int i = 0; i < context.lengthValue("DescribeAccessControlListAttributeResponse.AclEntrys.Length"); i++) {
			AclEntry aclEntry = new AclEntry();
			aclEntry.setAclEntryIP(context.stringValue("DescribeAccessControlListAttributeResponse.AclEntrys["+ i +"].AclEntryIP"));
			aclEntry.setAclEntryComment(context.stringValue("DescribeAccessControlListAttributeResponse.AclEntrys["+ i +"].AclEntryComment"));

			aclEntrys.add(aclEntry);
		}
		describeAccessControlListAttributeResponse.setAclEntrys(aclEntrys);

		List<RelatedListener> relatedListeners = new ArrayList<RelatedListener>();
		for (int i = 0; i < context.lengthValue("DescribeAccessControlListAttributeResponse.RelatedListeners.Length"); i++) {
			RelatedListener relatedListener = new RelatedListener();
			relatedListener.setLoadBalancerId(context.stringValue("DescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].LoadBalancerId"));
			relatedListener.setListenerPort(context.integerValue("DescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].ListenerPort"));
			relatedListener.setAclType(context.stringValue("DescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].AclType"));
			relatedListener.setProtocol(context.stringValue("DescribeAccessControlListAttributeResponse.RelatedListeners["+ i +"].Protocol"));

			relatedListeners.add(relatedListener);
		}
		describeAccessControlListAttributeResponse.setRelatedListeners(relatedListeners);
	 
	 	return describeAccessControlListAttributeResponse;
	}
}