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

package com.aliyuncs.domain.transform.v20180129;

import com.aliyuncs.domain.model.v20180129.SaveDomainGroupResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveDomainGroupResponseUnmarshaller {

	public static SaveDomainGroupResponse unmarshall(SaveDomainGroupResponse saveDomainGroupResponse, UnmarshallerContext context) {
		
		saveDomainGroupResponse.setRequestId(context.stringValue("SaveDomainGroupResponse.RequestId"));
		saveDomainGroupResponse.setDomainGroupId(context.longValue("SaveDomainGroupResponse.DomainGroupId"));
		saveDomainGroupResponse.setDomainGroupName(context.stringValue("SaveDomainGroupResponse.DomainGroupName"));
		saveDomainGroupResponse.setTotalNumber(context.integerValue("SaveDomainGroupResponse.TotalNumber"));
		saveDomainGroupResponse.setCreationDate(context.stringValue("SaveDomainGroupResponse.CreationDate"));
		saveDomainGroupResponse.setModificationDate(context.stringValue("SaveDomainGroupResponse.ModificationDate"));
		saveDomainGroupResponse.setDomainGroupStatus(context.stringValue("SaveDomainGroupResponse.DomainGroupStatus"));
		saveDomainGroupResponse.setBeingDeleted(context.booleanValue("SaveDomainGroupResponse.BeingDeleted"));
	 
	 	return saveDomainGroupResponse;
	}
}