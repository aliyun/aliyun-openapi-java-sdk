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

import com.aliyuncs.resourcesharing.model.v20200110.DisassociateResourceShareResponse;
import com.aliyuncs.resourcesharing.model.v20200110.DisassociateResourceShareResponse.ResourceShareAssociation;
import com.aliyuncs.transform.UnmarshallerContext;


public class DisassociateResourceShareResponseUnmarshaller {

	public static DisassociateResourceShareResponse unmarshall(DisassociateResourceShareResponse disassociateResourceShareResponse, UnmarshallerContext _ctx) {
		
		disassociateResourceShareResponse.setRequestId(_ctx.stringValue("DisassociateResourceShareResponse.RequestId"));

		List<ResourceShareAssociation> resourceShareAssociations = new ArrayList<ResourceShareAssociation>();
		for (int i = 0; i < _ctx.lengthValue("DisassociateResourceShareResponse.ResourceShareAssociations.Length"); i++) {
			ResourceShareAssociation resourceShareAssociation = new ResourceShareAssociation();
			resourceShareAssociation.setUpdateTime(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].UpdateTime"));
			resourceShareAssociation.setEntityId(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].EntityId"));
			resourceShareAssociation.setResourceShareName(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].ResourceShareName"));
			resourceShareAssociation.setCreateTime(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].CreateTime"));
			resourceShareAssociation.setEntityType(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].EntityType"));
			resourceShareAssociation.setResourceShareId(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].ResourceShareId"));
			resourceShareAssociation.setAssociationStatusMessage(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].AssociationStatusMessage"));
			resourceShareAssociation.setAssociationType(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].AssociationType"));
			resourceShareAssociation.setAssociationStatus(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].AssociationStatus"));
			resourceShareAssociation.setTargetProperty(_ctx.stringValue("DisassociateResourceShareResponse.ResourceShareAssociations["+ i +"].TargetProperty"));

			resourceShareAssociations.add(resourceShareAssociation);
		}
		disassociateResourceShareResponse.setResourceShareAssociations(resourceShareAssociations);
	 
	 	return disassociateResourceShareResponse;
	}
}