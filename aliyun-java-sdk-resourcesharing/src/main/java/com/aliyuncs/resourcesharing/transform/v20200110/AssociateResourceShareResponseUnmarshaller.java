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

package com.aliyuncs.resourcesharing.transform.v20200110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.resourcesharing.model.v20200110.AssociateResourceShareResponse;
import com.aliyuncs.resourcesharing.model.v20200110.AssociateResourceShareResponse.ResourceShareAssociation;
import com.aliyuncs.transform.UnmarshallerContext;


public class AssociateResourceShareResponseUnmarshaller {

	public static AssociateResourceShareResponse unmarshall(AssociateResourceShareResponse associateResourceShareResponse, UnmarshallerContext _ctx) {
		
		associateResourceShareResponse.setRequestId(_ctx.stringValue("AssociateResourceShareResponse.RequestId"));

		List<ResourceShareAssociation> resourceShareAssociations = new ArrayList<ResourceShareAssociation>();
		for (int i = 0; i < _ctx.lengthValue("AssociateResourceShareResponse.ResourceShareAssociations.Length"); i++) {
			ResourceShareAssociation resourceShareAssociation = new ResourceShareAssociation();
			resourceShareAssociation.setUpdateTime(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].UpdateTime"));
			resourceShareAssociation.setEntityId(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].EntityId"));
			resourceShareAssociation.setResourceShareName(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].ResourceShareName"));
			resourceShareAssociation.setCreateTime(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].CreateTime"));
			resourceShareAssociation.setEntityType(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].EntityType"));
			resourceShareAssociation.setResourceShareId(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].ResourceShareId"));
			resourceShareAssociation.setAssociationStatusMessage(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].AssociationStatusMessage"));
			resourceShareAssociation.setAssociationType(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].AssociationType"));
			resourceShareAssociation.setAssociationStatus(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].AssociationStatus"));
			resourceShareAssociation.setTargetProperty(_ctx.stringValue("AssociateResourceShareResponse.ResourceShareAssociations["+ i +"].TargetProperty"));

			resourceShareAssociations.add(resourceShareAssociation);
		}
		associateResourceShareResponse.setResourceShareAssociations(resourceShareAssociations);
	 
	 	return associateResourceShareResponse;
	}
}